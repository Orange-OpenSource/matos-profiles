package org.apache.xalan.templates;

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


public class OutputProperties
  extends ElemTemplateElement  implements java.lang.Cloneable
{
  // Constructors

  public OutputProperties(){
    super();
  }
  public OutputProperties(java.util.Properties arg1){
    super();
  }
  public OutputProperties(java.lang.String arg1){
    super();
  }
  // Methods

  public void setProperty(org.apache.xml.utils.QName arg1, java.lang.String arg2){
  }
  public void setProperty(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String getProperty(org.apache.xml.utils.QName arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getProperty(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.util.Properties getProperties(){
    return (java.util.Properties) null;
  }
  public boolean getBooleanProperty(org.apache.xml.utils.QName arg1){
    return false;
  }
  public boolean getBooleanProperty(java.lang.String arg1){
    return false;
  }
  public void recompose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public void compose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public static java.util.Properties getDefaultMethodProperties(java.lang.String arg1){
    return (java.util.Properties) null;
  }
  public void copyFrom(java.util.Properties arg1){
  }
  public void copyFrom(java.util.Properties arg1, boolean arg2){
  }
  public void copyFrom(OutputProperties arg1) throws javax.xml.transform.TransformerException{
  }
  public int getIntProperty(org.apache.xml.utils.QName arg1){
    return 0;
  }
  public int getIntProperty(java.lang.String arg1){
    return 0;
  }
  public void setBooleanProperty(org.apache.xml.utils.QName arg1, boolean arg2){
  }
  public void setBooleanProperty(java.lang.String arg1, boolean arg2){
  }
  public static boolean isLegalPropertyKey(java.lang.String arg1){
    return false;
  }
  public void setQNameProperties(org.apache.xml.utils.QName arg1, java.util.Vector arg2){
  }
  public void setQNameProperties(java.lang.String arg1, java.util.Vector arg2){
  }
  public void setQNameProperty(org.apache.xml.utils.QName arg1, org.apache.xml.utils.QName arg2){
  }
  public void setQNameProperty(java.lang.String arg1, org.apache.xml.utils.QName arg2){
  }
  public void setIntProperty(org.apache.xml.utils.QName arg1, int arg2){
  }
  public void setIntProperty(java.lang.String arg1, int arg2){
  }
  public void setMethodDefaults(java.lang.String arg1){
  }
  public org.apache.xml.utils.QName getQNameProperty(org.apache.xml.utils.QName arg1){
    return (org.apache.xml.utils.QName) null;
  }
  public org.apache.xml.utils.QName getQNameProperty(java.lang.String arg1){
    return (org.apache.xml.utils.QName) null;
  }
  public static org.apache.xml.utils.QName getQNameProperty(java.lang.String arg1, java.util.Properties arg2){
    return (org.apache.xml.utils.QName) null;
  }
  public java.util.Vector getQNameProperties(org.apache.xml.utils.QName arg1){
    return (java.util.Vector) null;
  }
  public java.util.Vector getQNameProperties(java.lang.String arg1){
    return (java.util.Vector) null;
  }
  public static java.util.Vector getQNameProperties(java.lang.String arg1, java.util.Properties arg2){
    return (java.util.Vector) null;
  }
}
