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


public abstract class Transformer
{
  // Constructors

  protected Transformer(){
  }
  // Methods

  public abstract void transform(Source arg1, Result arg2) throws TransformerException;
  public void reset(){
  }
  public abstract java.lang.Object getParameter(java.lang.String arg1);
  public abstract void setParameter(java.lang.String arg1, java.lang.Object arg2);
  public abstract java.lang.String getOutputProperty(java.lang.String arg1) throws java.lang.IllegalArgumentException;
  public abstract void setOutputProperty(java.lang.String arg1, java.lang.String arg2) throws java.lang.IllegalArgumentException;
  public abstract ErrorListener getErrorListener();
  public abstract void setURIResolver(URIResolver arg1);
  public abstract URIResolver getURIResolver();
  public abstract void setErrorListener(ErrorListener arg1) throws java.lang.IllegalArgumentException;
  public abstract void clearParameters();
  public abstract java.util.Properties getOutputProperties();
  public abstract void setOutputProperties(java.util.Properties arg1);
}
