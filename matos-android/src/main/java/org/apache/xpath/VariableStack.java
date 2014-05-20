package org.apache.xpath;

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


public class VariableStack
  implements java.lang.Cloneable
{
  // Fields

  public static final int CLEARLIMITATION = 1024;

  // Constructors

  public VariableStack(){
  }
  public VariableStack(int arg1){
  }
  // Methods

  public synchronized java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public int size(){
    return 0;
  }
  public org.apache.xpath.objects.XObject elementAt(int arg1){
    return (org.apache.xpath.objects.XObject) null;
  }
  public void reset(){
  }
  protected void reset(int arg1, int arg2){
  }
  public org.apache.xpath.objects.XObject getVariableOrParam(XPathContext arg1, org.apache.xml.utils.QName arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public int link(int arg1){
    return 0;
  }
  public void unlink(){
  }
  public void unlink(int arg1){
  }
  public int getStackFrame(){
    return 0;
  }
  public void clearLocalSlots(int arg1, int arg2){
  }
  public void setStackFrame(int arg1){
  }
  public void setLocalVariable(int arg1, org.apache.xpath.objects.XObject arg2){
  }
  public void setLocalVariable(int arg1, org.apache.xpath.objects.XObject arg2, int arg3){
  }
  public org.apache.xpath.objects.XObject getLocalVariable(XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject getLocalVariable(int arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject getLocalVariable(XPathContext arg1, int arg2, boolean arg3) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public boolean isLocalSet(int arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  public void setGlobalVariable(int arg1, org.apache.xpath.objects.XObject arg2){
  }
  public org.apache.xpath.objects.XObject getGlobalVariable(XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject getGlobalVariable(XPathContext arg1, int arg2, boolean arg3) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
}
