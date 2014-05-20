package com.francetelecom.rd.stubs.engine;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2008 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

/**
 * Handle the generation of XML rule files.
 * @author piac6784
 *
 */
public class RuleGenerator {

	final static String ARGS_KIND = "args";
	final static String USE_KIND = "use";
	final static String RETURN_KIND = "return";
	final static String FIELD_KIND = "field";

	final private PrintStream out;
	final private PrintStream side;
	final private ReflexUtil rf;
	final private Hierarchy hierarchy;

	RuleGenerator(PrintStream out, PrintStream side, ReflexUtil rf, Hierarchy hierarchy) {
		this.rf = rf;
		this.out = out;
		this.side = side;
		this.hierarchy = hierarchy;
	}

	void generateForClass(Class<?> clazz) {
		String className = rf.restoreString(clazz.getName());
		Annotation [] annots = clazz.getAnnotations();
		Annotation dump_annot = rf.findAnnotation(EngineConstant.DUMP_HIERARCHY_ANNOT, annots);
		if (dump_annot != null) {
			Boolean onlyReal = (Boolean) ReflexUtil.getAnnotationField(dump_annot, EngineConstant.NO_ABSTRACT_FIELD);
			List <Class <?>> implementers = hierarchy.getRecursiveSubclasses(clazz);
			out.print("<option name=\"");
			out.print(ReflexUtil.getStringValue(dump_annot));
			out.print("\" value=\"");
			boolean first = true;
			for(Class <?> imp: implementers) {
				int mod = imp.getModifiers();
				if(onlyReal && Modifier.isAbstract(mod)) continue;
				if(first) first = false;
				else out.print(",");
				out.print(type(imp));
			}
			out.print("\"/>");
		}
		for(Method m : clazz.getDeclaredMethods()) {
			boolean isStatic = Modifier.isStatic(m.getModifiers()); 
			generateForMethod(className, m.getName(), m.getReturnType(), m.getParameterTypes(), m.getAnnotations(),isStatic);
		}

		for(Constructor <? > co : clazz.getConstructors()) {
			generateForMethod(className, "<init>", void.class, co.getParameterTypes(), co.getAnnotations(), false);
		}

		for(Field field : clazz.getDeclaredFields()) {
			generateForField(className, field.getName(), field.getType(), field.getAnnotations());
		}
/* Should be done as part of direct subclass treatment (declared in hierarchy).
		for(Class <?> c : clazz.getDeclaredClasses()) {
			generateForClass(c);
		}
 */
	}

	private void generateForMethod(String className, String methName, Class<?> returnType,
			Class<?>[] parameterTypes, Annotation[] annotations, boolean isStatic) {
		List <Annotation> listAnnot = rf.findAnnotations(EngineConstant.ARG_RULE_ANNOT, EngineConstant.ARG_RULE_ARRAY_ANNOT, annotations);
		for(Annotation annot : listAnnot) {
			dumpReportRule(annot, className, methName, returnType, parameterTypes);
			dumpRule(annot, ARGS_KIND, className, methName, returnType, parameterTypes, isStatic);
		}
		Annotation annot = rf.findAnnotation(EngineConstant.USE_RULE_ANNOT, annotations);
		if (annot != null) {
			dumpUseReportRule(annot, className, methName, returnType, parameterTypes);
			dumpRule(annot, USE_KIND, className, methName, returnType, parameterTypes, isStatic);
		}
		
		annot = rf.findAnnotation(EngineConstant.RETURN_RULE_ANNOT, annotations);
		if (annot != null) {
			dumpRule(annot, RETURN_KIND, className, methName, returnType, parameterTypes, isStatic);
		}
	}

	private void dumpRule(Annotation annot,  String ruleKind,  String className, String methName, 
			Class <?> returnType, Class <?> [] parameterTypes, boolean isStatic) {
		String ruleName = ReflexUtil.getStringValue(annot);
		String reportName = (String) ReflexUtil.getAnnotationField(annot, EngineConstant.REPORT_FIELD);
		if (side != null) {
			String ref = ruleKind.equals(RETURN_KIND) ? "returnRef" : "callRef";
			side.println("<" +  ref + " name=\"" + ruleName + "\"/>");
		}
		if (reportName.equals("-")) {
			reportName = "R-" + ruleName;
		}
		out.println("<rule name=\"" + ruleName + "\">");
		out.println("  <" + ruleKind + " class=\"" + className + "\"");
		out.print("        signature=\"");
		signature(methName, returnType, parameterTypes);
		out.println("\"");
		out.println("        report=\""+ reportName + "\">");


		if (ruleKind.equals(ARGS_KIND)) {
			int [] args = (int []) ReflexUtil.getAnnotationField(annot, EngineConstant.ARGS_FIELD);
			for (int arg : args) {
				if (arg == -1) {
					if (returnType.equals(void.class)) 
						System.err.println("Rule " + ruleName + " is on a method without result.");
				} else if (arg == 0) {
					if (isStatic) 
						System.err.println("Rule " + ruleName + " is on a static method.");
				} else if (arg < 0 || arg > parameterTypes.length) {
					System.err.println("Rule " + ruleName + " has no argument " + arg + ".");
				}
				out.println("    <argument position=\"" + arg + "\"/>");
			}
		}
		out.println("  </" + ruleKind + ">");
		out.println("</rule>");

	}

	private void dumpUseReportRule(Annotation annot, String className, String methName, 
			Class <?> returnType, Class <?> [] parameterTypes) {
		String ruleName = ReflexUtil.getStringValue(annot);
		out.println("<report name=\"R-" + ruleName + "\">");
		out.println("  <forbiddenMethod silent=\"true\"><h4>%nA - " + ruleName + "</h4>%p</forbiddenMethod>");
		out.println("</report>");
	}
	
	private void dumpReportRule(Annotation annot, String className, String methName, 
			Class <?> returnType, Class <?> [] parameterTypes) {
		String ruleName = ReflexUtil.getStringValue(annot);
		String reportName = (String) ReflexUtil.getAnnotationField(annot, EngineConstant.REPORT_FIELD);

		int [] args = null;
		args = (int []) ReflexUtil.getAnnotationField(annot, EngineConstant.ARGS_FIELD);
		if (args != null) {
			for(int i = 0; i < args.length; i++) {
				out.println("<report name=\"" + ruleName + "-" + i + "\">");
				String argName = (args[i] < 1) ? (args[i] == 0 ? "Base" : "Result") : ("Argument " + args[i]);
				out.println("  <message><tr><td class=\"head\">" + argName + ":</td><td class=\"result\">%r</td></tr>&#13;</message>");
				out.println("</report>");
			}
		}
		out.println("<report name=\"H1-" + ruleName + "\">");
		out.println("  <message unique=\"title\"><h4>" + ruleName + "</h4>&#13;</message>");
		out.println("</report>");

		out.println("<report name=\"H2-" + ruleName + "\">");
		out.println("  <message><tr><td colspan=\"2\" class=\"result\">%nA</td></tr>&#13;<tr><td class=\"head\">Caller:</td><td class=\"result\"> %c.%m</td></tr>&#13;</message>");
		out.println("</report>");


		if (reportName.equals("-")) {
			reportName = "R-" + ruleName;
		}

		out.println("<report name=\"" + reportName + "\">");
		out.println("  <conjunction>");
		out.println("     <ref name=\"H1-" + ruleName + "\"/>");
		out.println("     <ref name=\"H-SEP\"/>");
		out.println("     <ref name=\"OTABLE\"/>");
		out.println("     <ref name=\"H2-" + ruleName + "\"/>");
		if (args != null) {
			for(int i = 0; i < args.length; i++) {
				out.println("     <ref name=\"" + ruleName + "-" 
						+ i + "\" pos=\"" + i + "\"/>");
			}
		}
		out.println("     <ref name=\"CTABLE\"/>");
		out.println("  </conjunction>");
		out.println("</report>");
	}

	private String type(Class<?> c) {
		return escape(rf.restoreString(ReflexUtil.readableSootName(c)));
	}

	private void signature(String methName, Class<?> returnType,
			Class<?>[] parameterTypes) {
		out.print(type(returnType));
		out.print(" ");
		out.print(escape(methName));
		boolean first = true;
		out.print("(");
		for(Class<?> paramType : parameterTypes) {
			if (first) first = false;
			else out.print(",");
			out.print(type(paramType));
		}
		out.print(")");		
	}

	private void generateForField(String className, String fieldName, Class<?> type,
			Annotation[] annotations) {
		Annotation annot = rf.findAnnotation(EngineConstant.FIELD_RULE_ANNOT, annotations);
		if (annot == null) return;
		String ruleName = ReflexUtil.getStringValue(annot);
		String reportName = (String) ReflexUtil.getAnnotationField(annot, EngineConstant.REPORT_FIELD);
		if (side != null) {
			side.println("<fieldRef name=\"" + ruleName + "\"/>");
		}
		if (reportName == null || reportName.equals("-")) { reportName = "R-" + ruleName;	}
		out.println("<report name=\"" + reportName + "\">");
		out.println("  <message>");
		out.println("  <h4>Field " + ruleName + "</h4>");
		out.println("  <table class=\"result\"><tr><td colspan=\"2\" class=\"result\">%nA</td></tr>&#13;<tr><td class=\"head\">Values:</td><td class=\"result\">%r</td></tr></table>&#13;");
		out.println("  </message>");
		out.println("</report>");
		out.println("<rule name=\"" + ruleName + "\">");
		out.println("  <field class=\"" + className + "\"");
		out.print("        type=\"");
		out.print(type(type));
		out.print(" ");
		out.print(escape(fieldName));
		out.println("\"");
		out.println("        report=\""+ reportName + "\">");
		out.println("  </field>");
		out.println("</rule>");
	}

	/**
	 * Generate the xml rule file.
	 * @param file the name of the file
	 * @param rf the context utility
	 * @param hierarchy a hierarchy of observed classes
	 * @throws IOException
	 */
	public static void generate(String file, String fileStruct, ReflexUtil rf,
			Hierarchy hierarchy) throws IOException {
		PrintStream out = new PrintStream(new FileOutputStream(file));
		out.println("<matos>");
		PrintStream side = (fileStruct == null) ? null : new PrintStream(new FileOutputStream(fileStruct));
		if (side != null) side.println("<matos>");
		RuleGenerator generator = new RuleGenerator(out, side, rf,hierarchy);
		// out.println("<?xml version='1.0' encoding='utf-8'?>");
		out.println("<report name=\"H-SEP\">");
		out.println("  <message unique=\"-title\">&#60;p>&#60;/p></message>");
		out.println("</report>");
		out.println("<report name=\"OTABLE\">");
		out.println("  <message>&#60;table class=\"result\"></message>");
		out.println("</report>");
		out.println("<report name=\"CTABLE\">");
		out.println("  <message>&#60;/table></message>");
		out.println("</report>");
		for(Class <?> clazz : hierarchy.getContents()) {
			generator.generateForClass(clazz);
		}
		out.println("</matos>");
		out.close();
		if (side != null) {
		    side.println("</matos>");
		    side.close();
		}
	}

	/**
	 * Make all dangerous characters in a string inert.
	 * @param s
	 * @return
	 */
	public static String escape(String s) {
		if (s==null) return "";
		if (needsEscape(s))
			return s.replaceAll("&","&amp;").replaceAll("<","&lt;").replaceAll(">","&gt;")
			.replaceAll("\"","&quot;").replaceAll("\n","<br>");
		else return s;
	}

	/**
	 * Check if it contains any of the characters to replace.
	 * @param s
	 * @return
	 */
	public static boolean needsEscape(String s) {
		int l = s.length();
		for(int i=0; i< l; i++) {
			switch(s.charAt(i)) {
			case '<': case '>':	case '&': case '"':	case '\'': case '\n': return true;	
			}
		}
		return false;
	}

}
