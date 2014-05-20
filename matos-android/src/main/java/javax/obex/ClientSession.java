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


public final class ClientSession
  extends ObexSession{
  // Constructors

  public ClientSession(ObexTransport arg1) throws java.io.IOException{
    super();
  }
  // Methods

  public Operation get(HeaderSet arg1) throws java.io.IOException{
    return (Operation) null;
  }
  public Operation put(HeaderSet arg1) throws java.io.IOException{
    return (Operation) null;
  }
  public void close() throws java.io.IOException{
  }
  public HeaderSet delete(HeaderSet arg1) throws java.io.IOException{
    return (HeaderSet) null;
  }
  public synchronized void ensureOpen() throws java.io.IOException{
  }
  public HeaderSet connect(HeaderSet arg1) throws java.io.IOException{
    return (HeaderSet) null;
  }
  public HeaderSet setPath(HeaderSet arg1, boolean arg2, boolean arg3) throws java.io.IOException{
    return (HeaderSet) null;
  }
  public HeaderSet disconnect(HeaderSet arg1) throws java.io.IOException{
    return (HeaderSet) null;
  }
  public boolean sendRequest(int arg1, byte [] arg2, HeaderSet arg3, PrivateInputStream arg4) throws java.io.IOException{
    return false;
  }
  public void setConnectionID(long arg1){
  }
  public long getConnectionID(){
    return 0l;
  }
  public void setAuthenticator(Authenticator arg1) throws java.io.IOException{
  }
}
