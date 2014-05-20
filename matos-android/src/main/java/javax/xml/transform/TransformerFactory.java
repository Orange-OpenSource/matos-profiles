package javax.xml.transform;

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


public abstract class TransformerFactory
{
  // Constructors

  protected TransformerFactory(){
  }
  // Methods

  public static TransformerFactory newInstance() throws TransformerFactoryConfigurationError{
    return (TransformerFactory) null;
  }
  public static TransformerFactory newInstance(java.lang.String arg1, java.lang.ClassLoader arg2) throws TransformerFactoryConfigurationError{
    return (TransformerFactory) null;
  }
  public abstract java.lang.Object getAttribute(java.lang.String arg1);
  public abstract void setAttribute(java.lang.String arg1, java.lang.Object arg2);
  public abstract boolean getFeature(java.lang.String arg1);
  public abstract void setFeature(java.lang.String arg1, boolean arg2) throws TransformerConfigurationException;
  public abstract ErrorListener getErrorListener();
  public abstract Source getAssociatedStylesheet(Source arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws TransformerConfigurationException;
  public abstract Transformer newTransformer(Source arg1) throws TransformerConfigurationException;
  public abstract Transformer newTransformer() throws TransformerConfigurationException;
  public abstract Templates newTemplates(Source arg1) throws TransformerConfigurationException;
  public abstract void setURIResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolve") URIResolver arg1);
  public abstract URIResolver getURIResolver();
  public abstract void setErrorListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") ErrorListener arg1);
}
