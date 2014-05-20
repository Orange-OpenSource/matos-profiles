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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface IAccessibilityServiceConnection
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IAccessibilityServiceConnectionStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IAccessibilityServiceConnection
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IAccessibilityServiceConnection asInterface(android.os.IBinder arg1){
      return (IAccessibilityServiceConnection) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onTransact")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public void setServiceInfo(AccessibilityServiceInfo arg1) throws android.os.RemoteException;
  public float findAccessibilityNodeInfoByAccessibilityId(int arg1, int arg2, int arg3,  android.view.accessibility.IAccessibilityInteractionConnectionCallback arg4, long arg5) throws android.os.RemoteException;
  public float findAccessibilityNodeInfosByViewText(java.lang.String arg1, int arg2, int arg3, int arg4,  android.view.accessibility.IAccessibilityInteractionConnectionCallback arg5, long arg6) throws android.os.RemoteException;
  public float findAccessibilityNodeInfosByViewTextInActiveWindow(java.lang.String arg1, int arg2,  android.view.accessibility.IAccessibilityInteractionConnectionCallback arg3, long arg4) throws android.os.RemoteException;
  public float findAccessibilityNodeInfoByViewIdInActiveWindow(int arg1, int arg2,  android.view.accessibility.IAccessibilityInteractionConnectionCallback arg3, long arg4) throws android.os.RemoteException;
  public boolean performAccessibilityAction(int arg1, int arg2, int arg3, int arg4,  android.view.accessibility.IAccessibilityInteractionConnectionCallback arg5, long arg6) throws android.os.RemoteException;
}
