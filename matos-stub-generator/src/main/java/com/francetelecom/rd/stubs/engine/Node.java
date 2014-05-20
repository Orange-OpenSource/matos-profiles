/**
 * 
 */
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

import java.awt.Color;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.tree.TreeNode;

class Node implements TreeNode, Comparable<Node> {

	public final static int NO_ANNOTATION = 0;
	public final static int ANNOTATED = 1;
	public final static int CLASS_DONE = 2;
	public final static int IS_CLASS_DONE = 3;
	public final static int IS_ANNOTATED = 4;

	/**
	 * The path in the midlet where the folder with all the icons is.
	 */
	private static final String ICON_PATH = "icons/";

	/**
	 * Icon for the root.
	 */
	public final static ImageIcon rootIcon = createIcon("root");

	/**
	 * Icon for a class
	 */
	public final static ImageIcon classIcon = createIcon("class");

	/**
	 * Icon for an interface
	 */
	public final static ImageIcon interfaceIcon = createIcon("interface");

	/**
	 * Icon for a method
	 */
	public final static ImageIcon methodIcon = createIcon("method");

	/**
	 * Icon for a field
	 */
	public final static ImageIcon fieldIcon = createIcon("field");

	/**
	 * Icon for a constructor
	 */
	public final static ImageIcon constructorIcon = createIcon("constructor");

	/**
	 * Icon for a package
	 */
	public final static ImageIcon packageIcon = createIcon("package");

	/**
	 * Icon for a annotation
	 */
	public final static ImageIcon annotationIcon = createIcon("annotation");

	/**
	 * Icon for an argument
	 */
	public final static ImageIcon argIcon = createIcon("arg");

	public final static Object [][] IconMap = {
		{ EngineConstant.ARG_RULE_ANNOT, createIcon("annot-rule-args"), 2 },
		{ EngineConstant.CALLBACK_ANNOT, createIcon("annot-callback"), 1 },
		{ EngineConstant.CALLBACK_REGISTER_ANNOT, createIcon("annot-callback-register"), 1 },
		{ EngineConstant.FIELD_ANNOT, createIcon("annot-field"), 3 },
		{ EngineConstant.FIELD_ARRAY_ANNOT, createIcon("annot-field"), 3 },
		{ EngineConstant.FIELD_GET_ANNOT,createIcon("annot-getfield"), 3 }, 
		{ EngineConstant.FIELD_SET_ANNOT, createIcon("annot-setfield"), 3 },
		{ EngineConstant.FIELD_RULE_ANNOT, createIcon("annot-rule-field"), 3 },
		{ EngineConstant.RETURN_RULE_ANNOT, createIcon("annot-rule-return"), 3 },
		{ EngineConstant.SUPER_ANNOT, createIcon("annot-use-super"), 0 },
		{ EngineConstant.USE_RULE_ANNOT, createIcon("annot-rule-use"), 3 },
		{ EngineConstant.CODE_ANNOT, createIcon("annot-code"), 0 },
		
		{ EngineConstant.ACCUMULATOR_ANNOT, createIcon("annot-accumulator"), 0 },
		{ EngineConstant.DUMP_HIERARCHY_ANNOT, createIcon("annot-dump-hierarchy"), 0 },
		{ EngineConstant.REAL_ANNOT, createIcon("annot-real"), 3 },
		{ EngineConstant.MAY_BE_ANNOT, createIcon("annot-maybe"), 1 },
		{ EngineConstant.FIELD_NO_VALUE_ANNOT, createIcon("annot-no-value"), 0 },
		{ EngineConstant.FIELD_VALUE_IMPL_ANNOT, createIcon("annot-value-impl"), 3 }
	};
	private static final Color CLASS_ANNOTATED_COLOR = Color.BLUE;
	private static final Color CLASS_DONE_COLOR = new Color(20,180,20);

	public static class ELEMENT_VERSION_COLORS {
		public static final Color notPresent = Color.white;
		public static final Color hidden = new Color(0x00d51818);
		public static final Color visible = new Color(0x0044cd1f);
	}
	public static class PACKAGE_VERSION_COLORS {
		public static final Color allPresentandVisible = new Color(0x0044cd1f); // green
		public static final Color allPresentAndHidden = new Color(0x00d51818); // red
		public static final Color allPresentSomeHidden = new Color(0x00ff9e13); // orange

		public static final Color someElementsNotPresentButAllVisible = new Color(0x00c7f3bb); // pale green
		public static final Color someElementsNotPresentButAllHidden = new Color(0x00f89898); // pale red
		public static final Color someElementsNotPresent = new Color(0x00ffddac); // pale orange

		public static final Color noElementsPresent = Color.white;
	}
	private static Color DEPTH_COLORS[] = {
		Color.white,
		new Color(0x00f4f6f9),
		new Color(0x00e7ebf1),
		new Color(0x00d9dfe8),
		new Color(0x00c9cfd7),
		new Color(0x00b7bcc3)
	};

	/**
	 * The parent node in the tree 
	 */
	private Node parent = null;

	/**
	 * All the children. 
	 */
	private Vector<Node> children = new Vector<Node>();
	/**
	 * Arbitrary content (in fact one of string, reflexive element or integer.)
	 */
	private Object content;


	private Vector<Node> subChilds = new Vector<Node>();
	/**
	 * For sorting
	 */
	private String shortName = null;
	/**
	 * For printing
	 */
	private String prettyName;
	private HashSet<Icon> icons = new HashSet<Icon>();

	final int annotationLevel;

	/**
	 * Information about in which versions this element/package is.
	 * If the Node is a package: a Map<String,Integer> with totals of occurences in each version.
	 * If the Node is an element: a List<String> with the versions in which the element is missing.
	 */
	private VersionInfo versionsInfo;

	/**
	 * Depth of a Node in the tree (used to change background color depending on depth)
	 */
	private final int depth;

	/**
	 * Constructor for an annotation.
	 * @param jcv
	 * @param a
	 * @param d depth of the node in the tree
	 */
	Node(JClassView jcv, Annotation a, int d) {
		content = a;
		depth = d;

		children = null;
		String shortName = a.annotationType().getSimpleName();
		for (int i = 0; i < IconMap.length; i ++) {
			if (shortName.equals(IconMap[i][0])) {
				icons.add((Icon) IconMap[i][1]);
				switch ((Integer) IconMap[i][2]) {
				case 0: 
					prettyName = shortName;
					break;
				case 1:
					prettyName = shortName + "(" + Arrays.toString(ReflexUtil.getStringValues(a)) + ")";
					break;
				case 2:
					prettyName = shortName + "(" + ReflexUtil.getStringValue(a) + "," + 
					Arrays.toString((int []) ReflexUtil.getAnnotationField(a, EngineConstant.ARGS_FIELD)) + ")";
					break;
				case 3:
					prettyName = shortName + "(" + ReflexUtil.getStringValue(a) + ")";
					break;
				default:
					prettyName = shortName;
				}
				break;
			}
		}
		if (prettyName == null) { 
			prettyName = shortName;
		}
		annotationLevel = (shortName.equals(EngineConstant.CLASSDONE_ANNOT)) ? IS_CLASS_DONE
				: IS_ANNOTATED;
	}

	/**
	 * Constructor for a field
	 * @param jcv
	 * @param f
	 * @param d depth of the node in the tree
	 */
	Node(JClassView jcv, Field f, int d) {
		content = f;
		depth = d;

		Annotation[] as = f.getAnnotations();
		setAnnotations(jcv, children, as, d);
		setChildrenParent();
		prettyName = name(jcv.rf, f);
		annotationLevel = levelFromChildren(children, true);
		setIconsFromChildren();

		versionsInfo = new VersionInfo.ElementVersionInfo(f);
	}

	/**
	 * Constructor for a constructor
	 * @param jcv
	 * @param co
	 * @param d depth of the node in the tree
	 */
	Node(JClassView jcv, Constructor<?> co, int d) {
		content = co;
		depth = d;

		Annotation[] as = co.getAnnotations();
		Annotation[][] argAs = co.getParameterAnnotations();
		setAnnotations(jcv, children, as, d);
		setArgAnnotation(jcv, children, argAs, d);
		setChildrenParent();
		setIconsFromChildren();
		prettyName = name(jcv.rf, co);
		annotationLevel = levelFromChildren(children, true);

		versionsInfo = new VersionInfo.ElementVersionInfo(co);
	}

	/**
	 * Constructor for a method
	 * @param jcv
	 * @param me
	 * @param d depth of the node in the tree
	 */
	Node(JClassView jcv, Method me, int d) {
		content = me;
		depth = d;

		Annotation[] as = me.getAnnotations();
		Annotation[][] argAs = me.getParameterAnnotations();
		setAnnotations(jcv, children, as, d);
		setArgAnnotation(jcv, children, argAs, d);
		setChildrenParent();
		setIconsFromChildren();
		prettyName = name(jcv.rf, me);
		annotationLevel = levelFromChildren(children, true);

		versionsInfo = new VersionInfo.ElementVersionInfo(me);
	}

	/**
	 * Constructor for a class
	 * @param jcv
	 * @param c
	 * @param d depth of the node in the tree
	 */
	Node(JClassView jcv, Class<?> c, int d) {
		content = c;
		depth = d;


		Annotation[] as = c.getAnnotations();
		setAnnotations(jcv, children, as, d);
		for (Constructor<?> co : c.getDeclaredConstructors()) {
			children.add(new Node(jcv, co, d+1));
		}
		for (Class<?> cl : c.getDeclaredClasses()) {
			children.add(new Node(jcv, cl, d+1));
		}
		for (Field f : c.getDeclaredFields()) {
			children.add(new Node(jcv, f, d+1));
		}
		for (Method m : c.getDeclaredMethods()) {
			children.add(new Node(jcv, m, d+1));
		}
		setChildrenParent();
		setIconsFromChildren();
		prettyName = c.getSimpleName();
		annotationLevel = levelFromChildren(children, true);

		versionsInfo = new VersionInfo.ElementVersionInfo(c); 
	}

	/**
	 * Constructor from a method/constructor argument 
	 * @param jcv
	 * @param pos position of the argument.
	 * @param children
	 * @param d depth of the node in the tree
	 */
	Node(JClassView jcv, Integer pos, Vector<Node> children, int d) {
		content = pos;
		depth = d;

		this.children = children;
		setChildrenParent();
		prettyName = Integer.toString(pos);
		annotationLevel = levelFromChildren(children, false);
		setIconsFromChildren();
	}

	/**
	 * Constructor from a package
	 * @param jcv
	 * @param pkg
	 * @param d depth of the node in the tree
	 */
	Node(JClassView jcv, String pkg, int d) {

		VersionInfo.PackageVersionInfo pkgVersionInfo = new VersionInfo.PackageVersionInfo();
		content = pkg;
		depth = d;

		HashSet<String> subPkgs = jcv.subPackages.get(pkg);
		if (subPkgs != null) {
			for (String subPackage : subPkgs) {
				Node subNode = new Node(jcv, subPackage, d+1);
				children.add(subNode);
				pkgVersionInfo.add(subNode.versionsInfo.getPackageVersionsInfo());
			}
		}

		HashSet<Class<?>> classes = jcv.packageContents.get(pkg);
		if (classes != null) {
			for (Class<?> clazz : classes) {
				children.add(new Node(jcv, clazz, d+1));
			}
		}
		setChildrenParent();
		prettyName = pkg.substring(pkg.lastIndexOf('.') + 1);
		annotationLevel = levelFromChildren(children, false);
		pkgVersionInfo.add(JClassView.database.getVersionStats(pkg));
		versionsInfo = pkgVersionInfo;
	}




	private void setIconsFromChildren() {
		for(Node n : children) icons.addAll(n.icons);
	}

	private void setChildrenParent() {
		for (Node n : children) {
			n.parent = this;
		}
		Collections.sort(children);
	}

	private int levelFromChildren(Vector<Node> children2, boolean isAnnotated) {
		int[] counts = new int[5];
		for (Node node : children) {
			counts[node.annotationLevel]++;
		}
		if (counts[IS_CLASS_DONE] > 0)
			return CLASS_DONE;
		if (isAnnotated) {
			if (counts[IS_ANNOTATED] > 0)
				counts[ANNOTATED]++;
			else
				counts[NO_ANNOTATION]++;
		}
		if (counts[NO_ANNOTATION] > 0) {
			return (counts[ANNOTATED] > 0 || counts[CLASS_DONE] > 0) ? ANNOTATED
					: NO_ANNOTATION;
		} else {
			return (counts[CLASS_DONE] > 0 || counts[ANNOTATED] == 0) ? CLASS_DONE
					: ANNOTATED;
		}
	}

	private void setAnnotations(JClassView jcv, Vector<Node> children,
			Annotation[] as, int d) {
		for (Annotation a : as) {
			if (jcv.rf.isStubAnnotation(a))
				children.add(new Node(jcv, a, d+1));
		}
	}

	private void setArgAnnotation(JClassView jcv, Vector<Node> children,
			Annotation[][] argAs, int d) {
		for (int i = 0; i < argAs.length; i++) {
			setAnnotations(jcv, subChilds, argAs[i], d);
			if (subChilds.size() > 0) {
				children.add(new Node(jcv, i, subChilds, d+1));
				subChilds = new Vector<Node>();
			}
		}
	}

	private String getShortName() {
		if (shortName == null) {
			if (getContent() instanceof String)
				shortName = "P" + getContent();
			else if (getContent() instanceof Annotation) {
				shortName = "A"
					+ ((Annotation) getContent()).annotationType()
					.getSimpleName();
			} else if (getContent() instanceof Constructor<?>) {
				shortName = "D" + ((Constructor<?>) getContent()).getName();
			} else if (getContent() instanceof Class<?>) {
				shortName = "D" + ((Class<?>) getContent()).getSimpleName();
			} else if (getContent() instanceof Field) {
				shortName = "F" + ((Field) getContent()).getName();
			} else if (getContent() instanceof Method) {
				shortName = "M" + ((Method) getContent()).getName();
			} else
				shortName = "Z" + getContent();
		}
		return shortName;
	}

	@Override
	public Enumeration<?> children() {
		return children.elements();
	}

	@Override
	public boolean getAllowsChildren() {
		return true;
	}

	@Override
	public TreeNode getChildAt(int i) {
		return children.elementAt(i);
	}

	@Override
	public int getChildCount() {
		return children.size();
	}

	@Override
	public int getIndex(TreeNode arg0) {
		return children.indexOf(arg0);
	}

	@Override
	public TreeNode getParent() {
		return parent;
	}

	@Override
	public boolean isLeaf() {
		return children == null || children.size() == 0;
	}

	@Override
	public String toString() {
		return prettyName;
	}

	@Override
	public int compareTo(Node arg0) {
		return getShortName().compareTo(arg0.getShortName());
	}

	@Override
	public boolean equals(Object arg0) {		
		return arg0 instanceof Node && getShortName().equals(((Node) arg0).getShortName());
	}

	@Override
	public int hashCode() {
		return getShortName().hashCode();
	}
	
	/**
	 * Gives back the color of the node in the tree.
	 * @return
	 */
	public Color getColor() {
		switch (annotationLevel) {
		case CLASS_DONE:
			return CLASS_DONE_COLOR;
		case ANNOTATED:
			return CLASS_ANNOTATED_COLOR;
		default:
			return Color.BLACK;
		}
	}

	/**
	 * Gives back the icon
	 * @return
	 */
	public Icon getIcon() {
		if (getContent() instanceof String) {
			if (getContent().equals(""))
				return rootIcon;
			return packageIcon;
		}
		if (getContent() instanceof Class<?>) {
			if (((Class<?>) getContent()).isInterface())
				return interfaceIcon;
			return classIcon;
		}
		if (getContent() instanceof Constructor<?>)
			return constructorIcon;
		if (getContent() instanceof Method)
			return methodIcon;
		if (getContent() instanceof Field)
			return fieldIcon;
		if (getContent() instanceof Annotation)
			return annotationIcon;
		if (getContent() instanceof Integer)
			return argIcon;
		return null;
	}

	/**
	 * Creates an icon from a path of a resource in the JAR.
	 * 
	 * @param s
	 *            the local path excluding the prefix .
	 * @return
	 */
	private static ImageIcon createIcon(String s) {
		String pathname = ICON_PATH + s + ".png";
		java.net.URL imgURL = Node.class.getResource(pathname);
		if (imgURL != null)
			return new ImageIcon(imgURL);
		else {
			return null;
		}
	}

	/**
	 * The node content
	 * @return
	 */
	public Object getContent() {
		return content;
	}

	public HashSet<Icon> getIcons() {
		return icons;
	}
	/**
	 * Computes a readable description for a method
	 * @param rf
	 * @param m
	 * @return
	 */
	static String name(ReflexUtil rf, Method m) {
		Class <?> here = m.getDeclaringClass();
		StringBuilder result = new StringBuilder();
		result.append(rf.prettyName(m.getReturnType(), here));
		result.append(" ");
		result.append(m.getName());
		result.append("(");
		boolean first = true;
		for(Class<?> arg : m.getParameterTypes()) {
			if(first) first = false;
			else result.append(",");
			result.append(rf.prettyName(arg,here));
		}
		result.append(")");
		return result.toString();
	}

	/**
	 * A readable description for a constructor
	 * @param rf
	 * @param co
	 * @return
	 */
	static String name(ReflexUtil rf, Constructor<?> co) {
		Class <?> here = co.getDeclaringClass();
		StringBuilder result = new StringBuilder();
		result.append(here.getSimpleName());
		result.append("(");
		boolean first = true;
		for(Class<?> arg : co.getParameterTypes()) {
			if(first) first = false;
			else result.append(",");
			result.append(rf.prettyName(arg,here));
		}
		result.append(")");
		return result.toString();
	}

	/**
	 * A readable description for a field.
	 * @param rf
	 * @param f
	 * @return
	 */
	static String name(ReflexUtil rf, Field f) {
		Class <?> here = f.getDeclaringClass();
		StringBuilder result = new StringBuilder();
		result.append(rf.prettyName(f.getType(), here));
		result.append(" ");
		result.append(f.getName());
		return result.toString();
	}

	/**
	 * Gets the color to display for a version presence
	 * @param v
	 * @return a Color
	 */
	public Color getColorForVersion(String v) {
		return versionsInfo==null ? Color.BLACK : versionsInfo.getColor(v);
	}

	/**
	 * Gets the depth of the Node in the tree
	 * @return
	 */
	public int getDepth() {
		return depth;
	}

	public Color getDepthColor() {
		if(depth>=DEPTH_COLORS.length) {
			return DEPTH_COLORS[DEPTH_COLORS.length-1];
		} else if (depth<0) {
			return DEPTH_COLORS[0];
		}
		return DEPTH_COLORS[depth];
	}

}