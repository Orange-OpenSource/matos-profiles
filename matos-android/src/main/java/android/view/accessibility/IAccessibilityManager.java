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

import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface IAccessibilityManager
  extends android.os.IInterface
{
  // Classes
	@Real("com.francetelecom.rd.fakeandroid.IAccessibilityManagerStubImpl")
  public abstract static class Stub
    extends android.os.Binder    implements IAccessibilityManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IAccessibilityManager asInterface(android.os.IBinder arg1){
      return (IAccessibilityManager) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IAccessibilityManager")
    @com.francetelecom.rd.stubs.annotation.CallBack("onTransact")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IAccessibilityManager")
  public void interrupt() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAccessibilityManager")
  public boolean sendAccessibilityEvent(AccessibilityEvent arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAccessibilityManager")
  public int addClient(IAccessibilityManagerClient arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAccessibilityManager")
  public int addAccessibilityInteractionConnection(android.view.IWindow arg1, IAccessibilityInteractionConnection arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAccessibilityManager")
  public void removeAccessibilityInteractionConnection(android.view.IWindow arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAccessibilityManager")
  public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAccessibilityManager")
  public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAccessibilityManager")
  public android.accessibilityservice.IAccessibilityServiceConnection registerEventListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IEventListener") android.accessibilityservice.IEventListener arg1) throws android.os.RemoteException;
}
