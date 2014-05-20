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


public class XPathParser
{
  // Fields

  public static final java.lang.String CONTINUE_AFTER_FATAL_ERROR = "CONTINUE_AFTER_FATAL_ERROR";

  protected static final int FILTER_MATCH_FAILED = 0;

  protected static final int FILTER_MATCH_PRIMARY = 0;

  protected static final int FILTER_MATCH_PREDICATES = 0;

  // Constructors

  public XPathParser(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg1, javax.xml.transform.SourceLocator arg2){
  }
  // Methods

  public void setErrorHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg1){
  }
  public javax.xml.transform.ErrorListener getErrorListener(){
    return (javax.xml.transform.ErrorListener) null;
  }
  public void initXPath(Compiler arg1, java.lang.String arg2, org.apache.xml.utils.PrefixResolver arg3) throws javax.xml.transform.TransformerException{
  }
  public void initMatchPattern(Compiler arg1, java.lang.String arg2, org.apache.xml.utils.PrefixResolver arg3) throws javax.xml.transform.TransformerException{
  }
  protected java.lang.String dumpRemainingTokenQueue(){
    return (java.lang.String) null;
  }
  protected void Expr() throws javax.xml.transform.TransformerException{
  }
  protected void OrExpr() throws javax.xml.transform.TransformerException{
  }
  protected void AndExpr() throws javax.xml.transform.TransformerException{
  }
  protected int EqualityExpr(int arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  protected int RelationalExpr(int arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  protected int AdditiveExpr(int arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  protected int MultiplicativeExpr(int arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  protected void UnaryExpr() throws javax.xml.transform.TransformerException{
  }
  protected void StringExpr() throws javax.xml.transform.TransformerException{
  }
  protected void BooleanExpr() throws javax.xml.transform.TransformerException{
  }
  protected void NumberExpr() throws javax.xml.transform.TransformerException{
  }
  protected void UnionExpr() throws javax.xml.transform.TransformerException{
  }
  protected void PathExpr() throws javax.xml.transform.TransformerException{
  }
  protected int FilterExpr() throws javax.xml.transform.TransformerException{
    return 0;
  }
  protected boolean PrimaryExpr() throws javax.xml.transform.TransformerException{
    return false;
  }
  protected void Argument() throws javax.xml.transform.TransformerException{
  }
  protected boolean FunctionCall() throws javax.xml.transform.TransformerException{
    return false;
  }
  protected void LocationPath() throws javax.xml.transform.TransformerException{
  }
  protected boolean RelativeLocationPath() throws javax.xml.transform.TransformerException{
    return false;
  }
  protected boolean Step() throws javax.xml.transform.TransformerException{
    return false;
  }
  protected void Basis() throws javax.xml.transform.TransformerException{
  }
  protected int AxisName() throws javax.xml.transform.TransformerException{
    return 0;
  }
  protected void NodeTest(int arg1) throws javax.xml.transform.TransformerException{
  }
  protected void Predicate() throws javax.xml.transform.TransformerException{
  }
  protected void PredicateExpr() throws javax.xml.transform.TransformerException{
  }
  protected void QName() throws javax.xml.transform.TransformerException{
  }
  protected void NCName(){
  }
  protected void Literal() throws javax.xml.transform.TransformerException{
  }
  protected void Number() throws javax.xml.transform.TransformerException{
  }
  protected void Pattern() throws javax.xml.transform.TransformerException{
  }
  protected void LocationPathPattern() throws javax.xml.transform.TransformerException{
  }
  protected void IdKeyPattern() throws javax.xml.transform.TransformerException{
  }
  protected void RelativePathPattern() throws javax.xml.transform.TransformerException{
  }
  protected boolean StepPattern(boolean arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  protected boolean AbbreviatedNodeTestStep(boolean arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
}
