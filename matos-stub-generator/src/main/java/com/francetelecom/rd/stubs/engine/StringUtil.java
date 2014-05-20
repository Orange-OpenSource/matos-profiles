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


/**
 * String utility methods.
 * @author piac6784
 *
 */
public class StringUtil {
	/**
	 * Escape the characters in a string so that it becomes a valid java litteral 
	 * representing the string itself.
	 * @param s the string to escape
	 * @return the equivalent litteral.
	 */
	public static String escape(String s) {
		int length = s.length();
		StringBuilder sb = new StringBuilder(length);
		for (int i=0; i<length; i++){
			char c = s.charAt(i);
			switch(c){
			case '\\':
				sb.append("\\\\");
				break;
			case '\"':
				sb.append("\\\"");
				break;
			case '\'':
				sb.append("\\\'");
				break;
			case '\n':
				sb.append("\\n");
				break;
			case '\r':
				sb.append("\\r");
				break;
			case '\t':
				sb.append("\\t");
				break;
			default:
				if (c > 0xff) {
					sb.append((c > 0xfff ? "\\u" : "\\u0") + Integer.toHexString(c));
				} else if (c < 32) {
					 sb.append((c > 0xf ? "\\u00" : "\\u000") + Integer.toHexString(c));
				} else sb.append(c);
			}
		}
		return sb.toString();
	}

	/**
	 * Prints out a float so that it can be a Java litteral
	 * @param v
	 * @return
	 */
	public static String escapeDouble(double v) {
		if (v == Double.POSITIVE_INFINITY) {
			return "1d/0d";
		} else if (v == Double.NEGATIVE_INFINITY) {
			return "-1d/0d";
		} else if (String.valueOf(v).equals("NaN")) {
			return "0d/0d";
		} else return (v + "d");
	}

	/**
	 * Prints out a double so that it can be a Java litteral
	 * @param v
	 * @return
	 */
	public static String escapeFloat(float v) {
		if (v == Float.POSITIVE_INFINITY) {
			return "1f/0f";
		} else if (v == Float.NEGATIVE_INFINITY) {
			return "-1f/0f";
		} else if (String.valueOf(v).equals("NaN")) { // NaN != NaN
			return "0f/0f";
		} else return (v + "f");		
	}

}
