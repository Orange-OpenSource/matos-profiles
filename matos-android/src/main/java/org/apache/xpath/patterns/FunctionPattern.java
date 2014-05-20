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


public class FunctionPattern
  extends StepPattern{
  // Constructors

  public FunctionPattern(org.apache.xpath.Expression arg1, int arg2, int arg3){
    super(0, (java.lang.String) null, (java.lang.String) null, 0, 0);
  }
  // Methods

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
  public final void calcScore(){
  }
  protected void callSubtreeVisitors(org.apache.xpath.XPathVisitor arg1){
  }
}
