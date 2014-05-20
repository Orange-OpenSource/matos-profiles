package com.android.server.accessibility;

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
public class AccessibilityManagerService
  extends android.view.accessibility.IAccessibilityManager.Stub  implements com.android.internal.os.HandlerCaller.Callback
{
  // Constructors

  public AccessibilityManagerService(android.content.Context arg1){
    super();
  }
  // Methods

  public void interrupt(){
  }
  public boolean sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
    return false;
  }
  public int addClient(android.view.accessibility.IAccessibilityManagerClient arg1) throws android.os.RemoteException{
    return 0;
  }
  public int addAccessibilityInteractionConnection(android.view.IWindow arg1, android.view.accessibility.IAccessibilityInteractionConnection arg2) throws android.os.RemoteException{
    return 0;
  }
  public void removeAccessibilityInteractionConnection(android.view.IWindow arg1){
  }
  public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(){
    return (java.util.List) null;
  }
  public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int arg1){
    return (java.util.List) null;
  }
  public android.accessibilityservice.IAccessibilityServiceConnection registerEventListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IEventListener") android.accessibilityservice.IEventListener arg1){
    return (android.accessibilityservice.IAccessibilityServiceConnection) null;
  }
  public void executeMessage(android.os.Message arg1){
  }
}
