package android.net;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class LocalSocket
{
  // Constructors

  public LocalSocket(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void close() throws java.io.IOException{
  }
  public java.io.InputStream getInputStream() throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public void connect(LocalSocketAddress arg1) throws java.io.IOException{
  }
  public void connect(LocalSocketAddress arg1, int arg2) throws java.io.IOException{
  }
  public boolean isClosed(){
    return false;
  }
  public java.io.OutputStream getOutputStream() throws java.io.IOException{
    return (java.io.OutputStream) null;
  }
  public void bind(LocalSocketAddress arg1) throws java.io.IOException{
  }
  public int getSoTimeout() throws java.io.IOException{
    return 0;
  }
  public void setSoTimeout(int arg1) throws java.io.IOException{
  }
  public java.io.FileDescriptor getFileDescriptor(){
    return (java.io.FileDescriptor) null;
  }
  public void shutdownInput() throws java.io.IOException{
  }
  public void shutdownOutput() throws java.io.IOException{
  }
  public synchronized boolean isConnected(){
    return false;
  }
  public LocalSocketAddress getLocalSocketAddress(){
    return (LocalSocketAddress) null;
  }
  public synchronized boolean isBound(){
    return false;
  }
  public void setReceiveBufferSize(int arg1) throws java.io.IOException{
  }
  public int getReceiveBufferSize() throws java.io.IOException{
    return 0;
  }
  public LocalSocketAddress getRemoteSocketAddress(){
    return (LocalSocketAddress) null;
  }
  public void setSendBufferSize(int arg1) throws java.io.IOException{
  }
  public int getSendBufferSize() throws java.io.IOException{
    return 0;
  }
  public boolean isOutputShutdown(){
    return false;
  }
  public boolean isInputShutdown(){
    return false;
  }
  public void setFileDescriptorsForSend(java.io.FileDescriptor [] arg1){
  }
  public java.io.FileDescriptor [] getAncillaryFileDescriptors() throws java.io.IOException{
    return (java.io.FileDescriptor []) null;
  }
  public Credentials getPeerCredentials() throws java.io.IOException{
    return (Credentials) null;
  }
}
