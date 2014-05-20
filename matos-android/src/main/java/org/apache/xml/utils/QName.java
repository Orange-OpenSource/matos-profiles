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


public class QName
  implements java.io.Serializable
{
  // Fields

  protected java.lang.String _localName;

  protected java.lang.String _namespaceURI;

  protected java.lang.String _prefix;

  public static final java.lang.String S_XMLNAMESPACEURI = "http://www.w3.org/XML/1998/namespace";

  // Constructors

  public QName(){
  }
  public QName(java.lang.String arg1, java.lang.String arg2){
  }
  public QName(java.lang.String arg1, java.lang.String arg2, boolean arg3){
  }
  public QName(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public QName(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4){
  }
  public QName(java.lang.String arg1){
  }
  public QName(java.lang.String arg1, boolean arg2){
  }
  public QName(java.lang.String arg1, java.util.Stack arg2){
  }
  public QName(java.lang.String arg1, java.util.Stack arg2, boolean arg3){
  }
  public QName(java.lang.String arg1, org.w3c.dom.Element arg2, PrefixResolver arg3){
  }
  public QName(java.lang.String arg1, org.w3c.dom.Element arg2, PrefixResolver arg3, boolean arg4){
  }
  public QName(java.lang.String arg1, PrefixResolver arg2){
  }
  public QName(java.lang.String arg1, PrefixResolver arg2, boolean arg3){
  }
  // Methods

  public boolean equals(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.String getLocalName(){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespace(){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespaceURI(){
    return (java.lang.String) null;
  }
  public java.lang.String getPrefix(){
    return (java.lang.String) null;
  }
  public static java.lang.String getPrefixPart(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getLocalPart(){
    return (java.lang.String) null;
  }
  public static java.lang.String getLocalPart(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static QName getQNameFromString(java.lang.String arg1){
    return (QName) null;
  }
  public java.lang.String toNamespacedString(){
    return (java.lang.String) null;
  }
  public static boolean isXMLNSDecl(java.lang.String arg1){
    return false;
  }
  public static java.lang.String getPrefixFromXMLNSDecl(java.lang.String arg1){
    return (java.lang.String) null;
  }
}
