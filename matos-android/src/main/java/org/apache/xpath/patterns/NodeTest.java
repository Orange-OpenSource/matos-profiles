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


public class NodeTest
  extends org.apache.xpath.Expression{
  // Fields

  public static final java.lang.String WILD = "*";

  public static final java.lang.String SUPPORTS_PRE_STRIPPING = "http://xml.apache.org/xpath/features/whitespace-pre-stripping";

  protected int m_whatToShow;

  public static final int SHOW_BYFUNCTION = 65536;

  protected java.lang.String m_name;

  public static final org.apache.xpath.objects.XNumber SCORE_NODETEST = null;

  public static final org.apache.xpath.objects.XNumber SCORE_NSWILD = null;

  public static final org.apache.xpath.objects.XNumber SCORE_QNAME = null;

  public static final org.apache.xpath.objects.XNumber SCORE_OTHER = null;

  public static final org.apache.xpath.objects.XNumber SCORE_NONE = null;

  // Constructors

  public NodeTest(int arg1, java.lang.String arg2, java.lang.String arg3){
    super();
  }
  public NodeTest(int arg1){
    super();
  }
  public NodeTest(){
    super();
  }
  // Methods

  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public org.apache.xpath.objects.XObject execute(org.apache.xpath.XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject execute(org.apache.xpath.XPathContext arg1, int arg2, org.apache.xml.dtm.DTM arg3, int arg4) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject execute(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public void callVisitors(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.XPathVisitor arg2){
  }
  public int getWhatToShow(){
    return 0;
  }
  public java.lang.String getLocalName(){
    return (java.lang.String) null;
  }
  public void setWhatToShow(int arg1){
  }
  public java.lang.String getNamespace(){
    return (java.lang.String) null;
  }
  public void setNamespace(java.lang.String arg1){
  }
  public void setLocalName(java.lang.String arg1){
  }
  public void initNodeTest(int arg1){
  }
  public void initNodeTest(int arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public org.apache.xpath.objects.XNumber getStaticScore(){
    return (org.apache.xpath.objects.XNumber) null;
  }
  public void setStaticScore(org.apache.xpath.objects.XNumber arg1){
  }
  protected void calcScore(){
  }
  public double getDefaultScore(){
    return 0.0d;
  }
  public static int getNodeTypeTest(int arg1){
    return 0;
  }
  public static void debugWhatToShow(int arg1){
  }
}
