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


public final class AccessibilityInteractionClient
  extends IAccessibilityInteractionConnectionCallback.Stub{
  // Constructors

  public AccessibilityInteractionClient(){
    super();
  }
  // Methods

  public static AccessibilityInteractionClient getInstance(){
    return (AccessibilityInteractionClient) null;
  }
  public AccessibilityNodeInfo findAccessibilityNodeInfoByAccessibilityId(android.accessibilityservice.IAccessibilityServiceConnection arg1, int arg2, int arg3){
    return (AccessibilityNodeInfo) null;
  }
  public java.util.List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewText(android.accessibilityservice.IAccessibilityServiceConnection arg1, java.lang.String arg2, int arg3, int arg4){
    return (java.util.List) null;
  }
  public java.util.List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewTextInActiveWindow(android.accessibilityservice.IAccessibilityServiceConnection arg1, java.lang.String arg2){
    return (java.util.List) null;
  }
  public AccessibilityNodeInfo findAccessibilityNodeInfoByViewIdInActiveWindow(android.accessibilityservice.IAccessibilityServiceConnection arg1, int arg2){
    return (AccessibilityNodeInfo) null;
  }
  public boolean performAccessibilityAction(android.accessibilityservice.IAccessibilityServiceConnection arg1, int arg2, int arg3, int arg4){
    return false;
  }
  public void setSameThreadMessage(android.os.Message arg1){
  }
  public void setFindAccessibilityNodeInfoResult(AccessibilityNodeInfo arg1, int arg2){
  }
  public void setFindAccessibilityNodeInfosResult(java.util.List<AccessibilityNodeInfo> arg1, int arg2){
  }
  public void setPerformAccessibilityActionResult(boolean arg1, int arg2){
  }
}
