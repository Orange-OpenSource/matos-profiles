package org.apache.xpath.patterns;

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


public class StepPattern
  extends NodeTest  implements org.apache.xpath.axes.SubContextList, org.apache.xpath.ExpressionOwner
{
  // Fields

  protected int m_axis;

  // Constructors

  public StepPattern(int arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5){
    super(0, (java.lang.String) null, (java.lang.String) null);
  }
  public StepPattern(int arg1, int arg2, int arg3){
    super(0, (java.lang.String) null, (java.lang.String) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public org.apache.xpath.objects.XObject execute(org.apache.xpath.XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject execute(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject execute(org.apache.xpath.XPathContext arg1, int arg2, org.apache.xml.dtm.DTM arg3, int arg4) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public boolean canTraverseOutsideSubtree(){
    return false;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public org.apache.xpath.Expression getExpression(){
    return (org.apache.xpath.Expression) null;
  }
  public void setExpression(org.apache.xpath.Expression arg1){
  }
  public void callVisitors(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.XPathVisitor arg2){
  }
  public int getLastPos(org.apache.xpath.XPathContext arg1){
    return 0;
  }
  public int getAxis(){
    return 0;
  }
  public final int getPredicateCount(){
    return 0;
  }
  public int getProximityPosition(org.apache.xpath.XPathContext arg1){
    return 0;
  }
  public org.apache.xpath.Expression getPredicate(int arg1){
    return (org.apache.xpath.Expression) null;
  }
  public void calcScore(){
  }
  protected final boolean executePredicates(org.apache.xpath.XPathContext arg1, org.apache.xml.dtm.DTM arg2, int arg3) throws javax.xml.transform.TransformerException{
    return false;
  }
  public void calcTargetString(){
  }
  public java.lang.String getTargetString(){
    return (java.lang.String) null;
  }
  public void setRelativePathPattern(StepPattern arg1){
  }
  public StepPattern getRelativePathPattern(){
    return (StepPattern) null;
  }
  public org.apache.xpath.Expression [] getPredicates(){
    return (org.apache.xpath.Expression []) null;
  }
  public void setPredicates(org.apache.xpath.Expression [] arg1){
  }
  protected final org.apache.xpath.objects.XObject executeRelativePathPattern(org.apache.xpath.XPathContext arg1, org.apache.xml.dtm.DTM arg2, int arg3) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public double getMatchScore(org.apache.xpath.XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return 0.0d;
  }
  public void setAxis(int arg1){
  }
  protected void callSubtreeVisitors(org.apache.xpath.XPathVisitor arg1){
  }
}
