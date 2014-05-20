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


public class XPath
  implements java.io.Serializable, ExpressionOwner
{
  // Fields

  public static final int SELECT = 0;

  public static final int MATCH = 1;

  public static final double MATCH_SCORE_NONE = -1d/0d;

  public static final double MATCH_SCORE_QNAME = 0.0d;

  public static final double MATCH_SCORE_NSWILD = -0.25d;

  public static final double MATCH_SCORE_NODETEST = -0.5d;

  public static final double MATCH_SCORE_OTHER = 0.5d;

  // Constructors

  public XPath(java.lang.String arg1, javax.xml.transform.SourceLocator arg2, org.apache.xml.utils.PrefixResolver arg3, int arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg5) throws javax.xml.transform.TransformerException{
  }
  public XPath(java.lang.String arg1, javax.xml.transform.SourceLocator arg2, org.apache.xml.utils.PrefixResolver arg3, int arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg5, org.apache.xpath.compiler.FunctionTable arg6) throws javax.xml.transform.TransformerException{
  }
  public XPath(java.lang.String arg1, javax.xml.transform.SourceLocator arg2, org.apache.xml.utils.PrefixResolver arg3, int arg4) throws javax.xml.transform.TransformerException{
  }
  public XPath(Expression arg1){
  }
  // Methods

  public void error(XPathContext arg1, int arg2, java.lang.String arg3, java.lang.Object [] arg4) throws javax.xml.transform.TransformerException{
  }
  public org.apache.xpath.objects.XObject execute(XPathContext arg1, org.w3c.dom.Node arg2, org.apache.xml.utils.PrefixResolver arg3) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject execute(XPathContext arg1, int arg2, org.apache.xml.utils.PrefixResolver arg3) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public Expression getExpression(){
    return (Expression) null;
  }
  public void setExpression(Expression arg1){
  }
  public void callVisitors(ExpressionOwner arg1, XPathVisitor arg2){
  }
  public boolean bool(XPathContext arg1, int arg2, org.apache.xml.utils.PrefixResolver arg3) throws javax.xml.transform.TransformerException{
    return false;
  }
  public void warn(XPathContext arg1, int arg2, java.lang.String arg3, java.lang.Object [] arg4) throws javax.xml.transform.TransformerException{
  }
  public void assertion(boolean arg1, java.lang.String arg2){
  }
  public double getMatchScore(XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return 0.0d;
  }
  public javax.xml.transform.SourceLocator getLocator(){
    return (javax.xml.transform.SourceLocator) null;
  }
  public java.lang.String getPatternString(){
    return (java.lang.String) null;
  }
}
