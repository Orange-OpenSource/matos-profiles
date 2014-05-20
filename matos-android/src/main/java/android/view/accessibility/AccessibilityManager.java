package android.view.accessibility;

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
public final class AccessibilityManager
{
  // Classes

  public static interface AccessibilityStateChangeListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("AccessibilityStateChangeListener")
    public void onAccessibilityStateChanged(boolean arg1);
  }
  // Fields

  public static final int STATE_FLAG_ACCESSIBILITY_ENABLED = 1;

  public static final int STATE_FLAG_TOUCH_EXPLORATION_ENABLED = 2;

  // Constructors

  public AccessibilityManager(android.content.Context arg1, IAccessibilityManager arg2){
  }
  // Methods

  public static AccessibilityManager getInstance(android.content.Context arg1){
    return (AccessibilityManager) null;
  }
  public void interrupt(){
  }
  public boolean isEnabled(){
    return false;
  }
  public void sendAccessibilityEvent(AccessibilityEvent arg1){
  }
  public int addAccessibilityInteractionConnection(android.view.IWindow arg1, IAccessibilityInteractionConnection arg2){
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
  public IAccessibilityManagerClient getClient(){
    return (IAccessibilityManagerClient) null;
  }
  public boolean addAccessibilityStateChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("AccessibilityStateChangeListener") AccessibilityManager.AccessibilityStateChangeListener arg1){
    return false;
  }
  public boolean removeAccessibilityStateChangeListener(AccessibilityManager.AccessibilityStateChangeListener arg1){
    return false;
  }
  public boolean isTouchExplorationEnabled(){
    return false;
  }
  public java.util.List<android.content.pm.ServiceInfo> getAccessibilityServiceList(){
    return (java.util.List) null;
  }
}
