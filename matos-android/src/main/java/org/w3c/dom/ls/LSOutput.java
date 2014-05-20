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


public interface LSOutput
{
  // Methods

  public java.lang.String getEncoding();
  public java.lang.String getSystemId();
  public void setEncoding(java.lang.String arg1);
  public java.io.Writer getCharacterStream();
  public void setCharacterStream(java.io.Writer arg1);
  public void setSystemId(java.lang.String arg1);
  public java.io.OutputStream getByteStream();
  public void setByteStream(java.io.OutputStream arg1);
}
