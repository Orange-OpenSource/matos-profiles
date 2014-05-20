package com.android.internal.util;

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
public abstract class AsyncService
  extends android.app.Service{
  // Classes

  public static final class AsyncServiceInfo
  {
    // Fields

    public android.os.Handler mHandler;

    public int mRestartFlags;

    // Constructors

    public AsyncServiceInfo(){
    }
  }
  // Fields

  protected static final boolean DBG = false;

  public static final int CMD_ASYNC_SERVICE_ON_START_INTENT = 16777215;

  public static final int CMD_ASYNC_SERVICE_DESTROY = 16777216;

  protected android.os.Messenger mMessenger;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AsyncService(){
    super();
  }
  // Methods

  public android.os.Handler getHandler(){
    return (android.os.Handler) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroy(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public int onStartCommand(android.content.Intent arg1, int arg2, int arg3){
    return 0;
  }
  public abstract AsyncService.AsyncServiceInfo createHandler();
}
