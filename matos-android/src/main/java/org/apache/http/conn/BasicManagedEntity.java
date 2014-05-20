package org.apache.http.conn;

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
public class BasicManagedEntity
  extends org.apache.http.entity.HttpEntityWrapper  implements EofSensorWatcher, ConnectionReleaseTrigger
{
  // Fields

  protected ManagedClientConnection managedConn;

  protected final boolean attemptReuse = false;

  // Constructors

  public BasicManagedEntity(org.apache.http.HttpEntity arg1, ManagedClientConnection arg2, boolean arg3){
    super((org.apache.http.HttpEntity) null);
  }
  // Methods

  public java.io.InputStream getContent() throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public void writeTo(java.io.OutputStream arg1) throws java.io.IOException{
  }
  public boolean streamClosed(java.io.InputStream arg1) throws java.io.IOException{
    return false;
  }
  public boolean isRepeatable(){
    return false;
  }
  public void consumeContent() throws java.io.IOException{
  }
  public void releaseConnection() throws java.io.IOException{
  }
  public void abortConnection() throws java.io.IOException{
  }
  public boolean eofDetected(java.io.InputStream arg1) throws java.io.IOException{
    return false;
  }
  public boolean streamAbort(java.io.InputStream arg1) throws java.io.IOException{
    return false;
  }
  protected void releaseManagedConnection() throws java.io.IOException{
  }
}
