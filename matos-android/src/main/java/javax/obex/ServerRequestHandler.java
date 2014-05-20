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


public class ServerRequestHandler
{
  // Constructors

  protected ServerRequestHandler(){
  }
  // Methods

  public int onConnect(HeaderSet arg1, HeaderSet arg2){
    return 0;
  }
  public long getConnectionId(){
    return 0l;
  }
  public void setConnectionId(long arg1){
  }
  public void onDisconnect(HeaderSet arg1, HeaderSet arg2){
  }
  public int onSetPath(HeaderSet arg1, HeaderSet arg2, boolean arg3, boolean arg4){
    return 0;
  }
  public int onDelete(HeaderSet arg1, HeaderSet arg2){
    return 0;
  }
  public int onAbort(HeaderSet arg1, HeaderSet arg2){
    return 0;
  }
  public int onPut(Operation arg1){
    return 0;
  }
  public int onGet(Operation arg1){
    return 0;
  }
  public void onAuthenticationFailure(byte [] arg1){
  }
  public void updateStatus(java.lang.String arg1){
  }
  public void onClose(){
  }
}
