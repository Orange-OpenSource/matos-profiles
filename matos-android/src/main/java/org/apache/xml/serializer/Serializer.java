package org.apache.xml.serializer;

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


public interface Serializer
{
  // Methods

  public boolean reset();
  public java.io.OutputStream getOutputStream();
  public void setOutputStream(java.io.OutputStream arg1);
  public java.io.Writer getWriter();
  public java.util.Properties getOutputFormat();
  public org.xml.sax.ContentHandler asContentHandler() throws java.io.IOException;
  public DOMSerializer asDOMSerializer() throws java.io.IOException;
  public java.lang.Object asDOM3Serializer() throws java.io.IOException;
  public void setWriter(java.io.Writer arg1);
  public void setOutputFormat(java.util.Properties arg1);
}
