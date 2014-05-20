package com.android.internal.app;

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


public final class ShutdownThread
  extends java.lang.Thread{
  // Fields

  public static final java.lang.String SHUTDOWN_ACTION_PROPERTY = "sys.shutdown.requested";

  // Constructors

  private ShutdownThread(){
    super();
  }
  // Methods

  public void run(){
  }
  public static void shutdown(android.content.Context arg1, boolean arg2){
  }
  public static void reboot(android.content.Context arg1, java.lang.String arg2, boolean arg3){
  }
  public static void rebootOrShutdown(boolean arg1, java.lang.String arg2){
  }
}
