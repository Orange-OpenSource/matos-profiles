package javax.xml.xpath;

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


public interface XPathExpression
{
  // Methods

  public java.lang.Object evaluate(java.lang.Object arg1, javax.xml.namespace.QName arg2) throws XPathExpressionException;
  public java.lang.String evaluate(java.lang.Object arg1) throws XPathExpressionException;
  public java.lang.Object evaluate(org.xml.sax.InputSource arg1, javax.xml.namespace.QName arg2) throws XPathExpressionException;
  public java.lang.String evaluate(org.xml.sax.InputSource arg1) throws XPathExpressionException;
}
