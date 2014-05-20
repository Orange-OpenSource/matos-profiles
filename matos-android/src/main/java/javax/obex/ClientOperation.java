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


public final class ClientOperation
  implements BaseStream, Operation
{
  // Constructors

  public ClientOperation(int arg1, ClientSession arg2, HeaderSet arg3, boolean arg4) throws java.io.IOException{
  }
  // Methods

  public long getLength(){
    return 0l;
  }
  public void close() throws java.io.IOException{
  }
  public java.lang.String getType(){
    return (java.lang.String) null;
  }
  public void ensureOpen() throws java.io.IOException{
  }
  public java.lang.String getEncoding(){
    return (java.lang.String) null;
  }
  public synchronized int getResponseCode() throws java.io.IOException{
    return 0;
  }
  public synchronized boolean continueOperation(boolean arg1, boolean arg2) throws java.io.IOException{
    return false;
  }
  public synchronized void abort() throws java.io.IOException{
  }
  public HeaderSet getReceivedHeader() throws java.io.IOException{
    return (HeaderSet) null;
  }
  public void sendHeaders(HeaderSet arg1) throws java.io.IOException{
  }
  public int getMaxPacketSize(){
    return 0;
  }
  public int getHeaderLength(){
    return 0;
  }
  public java.io.InputStream openInputStream() throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public java.io.DataInputStream openDataInputStream() throws java.io.IOException{
    return (java.io.DataInputStream) null;
  }
  public java.io.OutputStream openOutputStream() throws java.io.IOException{
    return (java.io.OutputStream) null;
  }
  public java.io.DataOutputStream openDataOutputStream() throws java.io.IOException{
    return (java.io.DataOutputStream) null;
  }
  public void ensureNotDone() throws java.io.IOException{
  }
  public void streamClosed(boolean arg1) throws java.io.IOException{
  }
}
