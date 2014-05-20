package com.android.server;

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


public class NativeDaemonConnectorException
  extends java.lang.RuntimeException{
  // Constructors

  public NativeDaemonConnectorException(){
    super();
  }
  public NativeDaemonConnectorException(java.lang.String arg1){
    super();
  }
  public NativeDaemonConnectorException(int arg1, java.lang.String arg2, java.lang.String arg3){
    super();
  }
  // Methods

  public int getCode(){
    return 0;
  }
  public java.lang.String getCmd(){
    return (java.lang.String) null;
  }
}
