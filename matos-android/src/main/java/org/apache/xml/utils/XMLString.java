package org.apache.xml.utils;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
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


public interface XMLString
{
  // Methods

  public boolean equals(XMLString arg1);
  public boolean equals(java.lang.String arg1);
  public boolean equals(java.lang.Object arg1);
  public java.lang.String toString();
  public int hashCode();
  public int compareTo(XMLString arg1);
  public int indexOf(int arg1);
  public int indexOf(int arg1, int arg2);
  public int indexOf(java.lang.String arg1);
  public int indexOf(XMLString arg1);
  public int indexOf(java.lang.String arg1, int arg2);
  public char charAt(int arg1);
  public int compareToIgnoreCase(XMLString arg1);
  public XMLString concat(java.lang.String arg1);
  public boolean endsWith(java.lang.String arg1);
  public boolean equalsIgnoreCase(java.lang.String arg1);
  public void getChars(int arg1, int arg2, char [] arg3, int arg4);
  public int lastIndexOf(int arg1);
  public int lastIndexOf(int arg1, int arg2);
  public int lastIndexOf(java.lang.String arg1);
  public int lastIndexOf(java.lang.String arg1, int arg2);
  public int length();
  public boolean startsWith(java.lang.String arg1, int arg2);
  public boolean startsWith(XMLString arg1, int arg2);
  public boolean startsWith(java.lang.String arg1);
  public boolean startsWith(XMLString arg1);
  public XMLString substring(int arg1);
  public XMLString substring(int arg1, int arg2);
  public XMLString toLowerCase(java.util.Locale arg1);
  public XMLString toLowerCase();
  public XMLString toUpperCase(java.util.Locale arg1);
  public XMLString toUpperCase();
  public XMLString trim();
  public void dispatchCharactersEvents(org.xml.sax.ContentHandler arg1) throws org.xml.sax.SAXException;
  public XMLString fixWhiteSpace(boolean arg1, boolean arg2, boolean arg3);
  public double toDouble();
  public boolean hasString();
  public void dispatchAsComment(org.xml.sax.ext.LexicalHandler arg1) throws org.xml.sax.SAXException;
}
