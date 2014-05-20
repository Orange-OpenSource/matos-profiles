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


public final class ServerSession
  extends ObexSession  implements java.lang.Runnable
{
  // Constructors

  public ServerSession(ObexTransport arg1, ServerRequestHandler arg2, Authenticator arg3) throws java.io.IOException{
    super();
  }
  // Methods

  public void run(){
  }
  public synchronized void close(){
  }
  public void sendResponse(int arg1, byte [] arg2) throws java.io.IOException{
  }
}
