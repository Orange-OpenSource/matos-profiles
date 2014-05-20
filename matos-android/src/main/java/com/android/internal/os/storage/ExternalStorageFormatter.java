package com.android.internal.os.storage;

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


public class ExternalStorageFormatter
  extends android.app.Service  implements android.content.DialogInterface.OnCancelListener
{
  // Fields

  public static final java.lang.String FORMAT_ONLY = "com.android.internal.os.storage.FORMAT_ONLY";

  public static final java.lang.String FORMAT_AND_FACTORY_RESET = "com.android.internal.os.storage.FORMAT_AND_FACTORY_RESET";

  public static final java.lang.String EXTRA_ALWAYS_RESET = "always_reset";

  public static final android.content.ComponentName COMPONENT_NAME = null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ExternalStorageFormatter(){
    super();
  }
  // Methods

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
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCancel(android.content.DialogInterface arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void updateProgressDialog(int arg1){
  }
}
