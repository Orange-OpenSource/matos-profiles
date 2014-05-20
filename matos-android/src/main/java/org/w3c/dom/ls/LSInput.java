package org.w3c.dom.ls;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.LSInputImplem", superClass = "")
public interface LSInput
{
  // Methods

  public java.lang.String getEncoding();
  public java.lang.String getPublicId();
  public java.lang.String getSystemId();
  public void setEncoding(java.lang.String arg1);
  public java.lang.String getBaseURI();
  public java.io.Reader getCharacterStream();
  public void setCharacterStream(java.io.Reader arg1);
  public void setSystemId(java.lang.String arg1);
  public void setPublicId(java.lang.String arg1);
  public java.io.InputStream getByteStream();
  public void setByteStream(java.io.InputStream arg1);
  public java.lang.String getStringData();
  public void setStringData(java.lang.String arg1);
  public void setBaseURI(java.lang.String arg1);
  public boolean getCertifiedText();
  public void setCertifiedText(boolean arg1);
}
