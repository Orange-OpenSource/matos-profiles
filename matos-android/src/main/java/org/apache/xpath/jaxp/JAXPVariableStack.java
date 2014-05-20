package org.apache.xpath.jaxp;

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


public class JAXPVariableStack
  extends org.apache.xpath.VariableStack{
  // Constructors

  public JAXPVariableStack(javax.xml.xpath.XPathVariableResolver arg1){
    super();
  }
  // Methods

  public org.apache.xpath.objects.XObject getVariableOrParam(org.apache.xpath.XPathContext arg1, org.apache.xml.utils.QName arg2) throws javax.xml.transform.TransformerException, java.lang.IllegalArgumentException{
    return (org.apache.xpath.objects.XObject) null;
  }
}
