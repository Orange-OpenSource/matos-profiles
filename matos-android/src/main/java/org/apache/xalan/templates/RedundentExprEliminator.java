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


public class RedundentExprEliminator
  extends XSLTVisitor{
  // Fields

  public static final boolean DEBUG = false;

  public static final boolean DIAGNOSE_NUM_PATHS_REDUCED = false;

  public static final boolean DIAGNOSE_MULTISTEPLIST = false;

  // Constructors

  public RedundentExprEliminator(){
    super();
  }
  // Methods

  public boolean isAbsolute(org.apache.xpath.axes.LocPathIterator arg1){
    return false;
  }
  protected static void assertion(boolean arg1, java.lang.String arg2){
  }
  public boolean visitLocationPath(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.axes.LocPathIterator arg2){
    return false;
  }
  public boolean visitPredicate(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.Expression arg2){
    return false;
  }
  public boolean visitInstruction(ElemTemplateElement arg1){
    return false;
  }
  public boolean visitTopLevelInstruction(ElemTemplateElement arg1){
    return false;
  }
  public void eleminateRedundentLocals(ElemTemplateElement arg1){
  }
  public void eleminateRedundentGlobals(StylesheetRoot arg1){
  }
  protected void eleminateRedundent(ElemTemplateElement arg1, java.util.Vector arg2){
  }
  protected void eleminateSharedPartialPaths(ElemTemplateElement arg1, java.util.Vector arg2){
  }
  protected void diagnoseLineNumber(org.apache.xpath.Expression arg1){
  }
  protected int countAncestors(ElemTemplateElement arg1){
    return 0;
  }
  protected void diagnoseMultistepList(int arg1, int arg2, boolean arg3){
  }
  protected org.apache.xpath.axes.LocPathIterator changePartToRef(org.apache.xml.utils.QName arg1, org.apache.xpath.axes.WalkingIterator arg2, int arg3, boolean arg4){
    return (org.apache.xpath.axes.LocPathIterator) null;
  }
  protected org.apache.xpath.axes.WalkingIterator createIteratorFromSteps(org.apache.xpath.axes.WalkingIterator arg1, int arg2){
    return (org.apache.xpath.axes.WalkingIterator) null;
  }
  protected boolean stepsEqual(org.apache.xpath.axes.WalkingIterator arg1, org.apache.xpath.axes.WalkingIterator arg2, int arg3){
    return false;
  }
  protected int findAndEliminateRedundant(int arg1, int arg2, org.apache.xpath.ExpressionOwner arg3, ElemTemplateElement arg4, java.util.Vector arg5) throws org.w3c.dom.DOMException{
    return 0;
  }
  protected int oldFindAndEliminateRedundant(int arg1, int arg2, org.apache.xpath.ExpressionOwner arg3, ElemTemplateElement arg4, java.util.Vector arg5) throws org.w3c.dom.DOMException{
    return 0;
  }
  protected int countSteps(org.apache.xpath.axes.LocPathIterator arg1){
    return 0;
  }
  protected void changeToVarRef(org.apache.xml.utils.QName arg1, org.apache.xpath.ExpressionOwner arg2, java.util.Vector arg3, ElemTemplateElement arg4){
  }
  protected ElemVariable createPseudoVarDecl(ElemTemplateElement arg1, org.apache.xpath.axes.LocPathIterator arg2, boolean arg3) throws org.w3c.dom.DOMException{
    return (ElemVariable) null;
  }
  protected ElemVariable createGlobalPseudoVarDecl(org.apache.xml.utils.QName arg1, StylesheetRoot arg2, org.apache.xpath.axes.LocPathIterator arg3) throws org.w3c.dom.DOMException{
    return (ElemVariable) null;
  }
  protected ElemVariable createLocalPseudoVarDecl(org.apache.xml.utils.QName arg1, ElemTemplateElement arg2, org.apache.xpath.axes.LocPathIterator arg3) throws org.w3c.dom.DOMException{
    return (ElemVariable) null;
  }
  protected ElemVariable addVarDeclToElem(ElemTemplateElement arg1, org.apache.xpath.axes.LocPathIterator arg2, ElemVariable arg3) throws org.w3c.dom.DOMException{
    return (ElemVariable) null;
  }
  protected boolean isParam(org.apache.xpath.ExpressionNode arg1){
    return false;
  }
  protected ElemVariable getPrevVariableElem(ElemTemplateElement arg1){
    return (ElemVariable) null;
  }
  protected ElemTemplateElement getPrevElementWithinContext(ElemTemplateElement arg1){
    return (ElemTemplateElement) null;
  }
  protected ElemTemplateElement getElemFromExpression(org.apache.xpath.Expression arg1){
    return (ElemTemplateElement) null;
  }
  protected void diagnoseNumPaths(java.util.Vector arg1, int arg2, int arg3){
  }
}
