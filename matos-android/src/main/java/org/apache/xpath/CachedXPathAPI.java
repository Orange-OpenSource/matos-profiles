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


public class CachedXPathAPI
{
  // Fields

  protected XPathContext xpathSupport;

  // Constructors

  public CachedXPathAPI(){
  }
  public CachedXPathAPI(CachedXPathAPI arg1){
  }
  // Methods

  public XPathContext getXPathContext(){
    return (XPathContext) null;
  }
  public org.apache.xpath.objects.XObject eval(org.w3c.dom.Node arg1, java.lang.String arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject eval(org.w3c.dom.Node arg1, java.lang.String arg2, org.w3c.dom.Node arg3) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject eval(org.w3c.dom.Node arg1, java.lang.String arg2, org.apache.xml.utils.PrefixResolver arg3) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.w3c.dom.NodeList selectNodeList(org.w3c.dom.Node arg1, java.lang.String arg2) throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.NodeList) null;
  }
  public org.w3c.dom.NodeList selectNodeList(org.w3c.dom.Node arg1, java.lang.String arg2, org.w3c.dom.Node arg3) throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.NodeList) null;
  }
  public org.w3c.dom.Node selectSingleNode(org.w3c.dom.Node arg1, java.lang.String arg2) throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node selectSingleNode(org.w3c.dom.Node arg1, java.lang.String arg2, org.w3c.dom.Node arg3) throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.traversal.NodeIterator selectNodeIterator(org.w3c.dom.Node arg1, java.lang.String arg2) throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.traversal.NodeIterator) null;
  }
  public org.w3c.dom.traversal.NodeIterator selectNodeIterator(org.w3c.dom.Node arg1, java.lang.String arg2, org.w3c.dom.Node arg3) throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.traversal.NodeIterator) null;
  }
}
