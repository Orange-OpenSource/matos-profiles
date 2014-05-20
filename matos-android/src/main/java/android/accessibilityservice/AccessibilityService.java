package android.accessibilityservice;

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

import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.AccessibilityServiceReal")
public abstract class AccessibilityService
  extends android.app.Service{
  // Fields

  public static final java.lang.String SERVICE_INTERFACE = "android.accessibilityservice.AccessibilityService";

  public static final java.lang.String SERVICE_META_DATA = "android.accessibilityservice";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AccessibilityService(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onServiceConnected(){
  }
  public final void setServiceInfo(AccessibilityServiceInfo arg1){
  }
  public final android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract void onInterrupt();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1);
}
