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


public class TemplateList
  implements java.io.Serializable
{
  // Classes

  public class TemplateWalker
  {
    // Fields

    // Constructors

    private TemplateWalker(){
    }
    // Methods

    public ElemTemplate next(){
      return (ElemTemplate) null;
    }
  }
  // Constructors

  public TemplateList(){
  }
  // Methods

  public void compose(StylesheetRoot arg1){
  }
  public void setTemplate(ElemTemplate arg1){
  }
  public ElemTemplate getTemplate(org.apache.xml.utils.QName arg1){
    return (ElemTemplate) null;
  }
  public ElemTemplate getTemplate(org.apache.xpath.XPathContext arg1, int arg2, org.apache.xml.utils.QName arg3, boolean arg4, org.apache.xml.dtm.DTM arg5) throws javax.xml.transform.TransformerException{
    return (ElemTemplate) null;
  }
  public ElemTemplate getTemplate(org.apache.xpath.XPathContext arg1, int arg2, org.apache.xml.utils.QName arg3, int arg4, int arg5, boolean arg6, org.apache.xml.dtm.DTM arg7) throws javax.xml.transform.TransformerException{
    return (ElemTemplate) null;
  }
  public ElemTemplate getTemplateFast(org.apache.xpath.XPathContext arg1, int arg2, int arg3, org.apache.xml.utils.QName arg4, int arg5, boolean arg6, org.apache.xml.dtm.DTM arg7) throws javax.xml.transform.TransformerException{
    return (ElemTemplate) null;
  }
  public TemplateList.TemplateWalker getWalker(){
    return (TemplateList.TemplateWalker) null;
  }
}
