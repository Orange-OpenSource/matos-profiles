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


public interface ObexTransport
{
  // Methods

  public void close() throws java.io.IOException;
  public void create() throws java.io.IOException;
  public void connect() throws java.io.IOException;
  public void listen() throws java.io.IOException;
  public java.io.InputStream openInputStream() throws java.io.IOException;
  public java.io.DataInputStream openDataInputStream() throws java.io.IOException;
  public java.io.OutputStream openOutputStream() throws java.io.IOException;
  public java.io.DataOutputStream openDataOutputStream() throws java.io.IOException;
  public void disconnect() throws java.io.IOException;
}
