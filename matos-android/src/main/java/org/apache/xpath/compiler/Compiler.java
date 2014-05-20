package org.apache.xpath.compiler;

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


public class Compiler
  extends OpMap{
  // Constructors

  public Compiler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg1, javax.xml.transform.SourceLocator arg2, FunctionTable arg3){
    super();
  }
  public Compiler(){
    super();
  }
  // Methods

  protected org.apache.xpath.Expression group(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression equals(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  public org.apache.xpath.Expression compile(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression lt(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  public void error(java.lang.String arg1, java.lang.Object [] arg2) throws javax.xml.transform.TransformerException{
  }
  protected org.apache.xpath.Expression number(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression and(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression or(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression arg(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression mod(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression union(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  public void setNamespaceContext(org.apache.xml.utils.PrefixResolver arg1){
  }
  public org.apache.xml.utils.PrefixResolver getNamespaceContext(){
    return (org.apache.xml.utils.PrefixResolver) null;
  }
  protected org.apache.xpath.Expression bool(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  public void warn(java.lang.String arg1, java.lang.Object [] arg2) throws javax.xml.transform.TransformerException{
  }
  public void assertion(boolean arg1, java.lang.String arg2){
  }
  public int getWhatToShow(int arg1){
    return 0;
  }
  protected org.apache.xpath.Expression string(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression mult(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression plus(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression minus(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression variable(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression div(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  public org.apache.xpath.Expression predicate(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  public org.apache.xpath.Expression [] getCompiledPredicates(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression []) null;
  }
  protected org.apache.xpath.Expression matchPattern(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression literal(int arg1){
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression gt(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  public int countPredicates(int arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  protected org.apache.xpath.Expression neg(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression lte(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  public int getLocationPathDepth(){
    return 0;
  }
  protected org.apache.xpath.Expression notequals(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression gte(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.Expression numberlit(int arg1){
    return (org.apache.xpath.Expression) null;
  }
  public org.apache.xpath.Expression locationPath(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  public org.apache.xpath.Expression locationPathPattern(int arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.Expression) null;
  }
  protected org.apache.xpath.patterns.StepPattern stepPattern(int arg1, int arg2, org.apache.xpath.patterns.StepPattern arg3) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.patterns.StepPattern) null;
  }
}
