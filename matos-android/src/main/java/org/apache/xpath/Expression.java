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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.XpathExpressionImplem", superClass = "")
public abstract class Expression
  implements ExpressionNode, XPathVisitable, java.io.Serializable
{
  // Constructors

  public Expression(){
  }
  // Methods

  public int getLineNumber(){
    return 0;
  }
  public abstract boolean deepEquals(Expression arg1);
  public void error(XPathContext arg1, java.lang.String arg2, java.lang.Object [] arg3) throws javax.xml.transform.TransformerException{
  }
  public org.apache.xpath.objects.XObject execute(XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject execute(XPathContext arg1, int arg2, org.apache.xml.dtm.DTM arg3, int arg4) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public abstract org.apache.xpath.objects.XObject execute(XPathContext arg1) throws javax.xml.transform.TransformerException;
  public org.apache.xpath.objects.XObject execute(XPathContext arg1, boolean arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public void executeCharsToContentHandler(XPathContext arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg2) throws javax.xml.transform.TransformerException, org.xml.sax.SAXException{
  }
  public boolean canTraverseOutsideSubtree(){
    return false;
  }
  public abstract void fixupVariables(java.util.Vector arg1, int arg2);
  public int asNode(XPathContext arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public boolean isNodesetExpr(){
    return false;
  }
  public org.apache.xml.utils.XMLString xstr(XPathContext arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xml.utils.XMLString) null;
  }
  public double num(XPathContext arg1) throws javax.xml.transform.TransformerException{
    return 0.0d;
  }
  public void exprSetParent(ExpressionNode arg1){
  }
  protected final boolean isSameClass(Expression arg1){
    return false;
  }
  public boolean bool(XPathContext arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  public org.apache.xml.dtm.DTMIterator asIterator(XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public org.apache.xml.dtm.DTMIterator asIteratorRaw(XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public boolean isStableNumber(){
    return false;
  }
  public void warn(XPathContext arg1, java.lang.String arg2, java.lang.Object [] arg3) throws javax.xml.transform.TransformerException{
  }
  public void assertion(boolean arg1, java.lang.String arg2){
  }
  public ExpressionNode getExpressionOwner(){
    return (ExpressionNode) null;
  }
  public ExpressionNode exprGetParent(){
    return (ExpressionNode) null;
  }
  public void exprAddChild(ExpressionNode arg1, int arg2){
  }
  public ExpressionNode exprGetChild(int arg1){
    return (ExpressionNode) null;
  }
  public int exprGetNumChildren(){
    return 0;
  }
  public java.lang.String getPublicId(){
    return (java.lang.String) null;
  }
  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public int getColumnNumber(){
    return 0;
  }
}
