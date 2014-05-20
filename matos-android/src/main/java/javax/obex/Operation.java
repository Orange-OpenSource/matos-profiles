package javax.obex;

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


public interface Operation
{
  // Methods

  public long getLength();
  public void close() throws java.io.IOException;
  public java.lang.String getType();
  public java.lang.String getEncoding();
  public int getResponseCode() throws java.io.IOException;
  public void abort() throws java.io.IOException;
  public HeaderSet getReceivedHeader() throws java.io.IOException;
  public void sendHeaders(HeaderSet arg1) throws java.io.IOException;
  public int getMaxPacketSize();
  public int getHeaderLength();
  public java.io.InputStream openInputStream() throws java.io.IOException;
  public java.io.DataInputStream openDataInputStream() throws java.io.IOException;
  public java.io.OutputStream openOutputStream() throws java.io.IOException;
  public java.io.DataOutputStream openDataOutputStream() throws java.io.IOException;
}
