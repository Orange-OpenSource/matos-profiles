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


public interface IAccessibilityInteractionConnection
  extends android.os.IInterface
{
  // Classes
	@Real("com.francetelecom.rd.fakeandroid.IAccessibilityInteractionConnectionStubImpl")
  public abstract static class Stub
    extends android.os.Binder    implements IAccessibilityInteractionConnection
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IAccessibilityInteractionConnection asInterface(android.os.IBinder arg1){
      return (IAccessibilityInteractionConnection) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IAccessibilityInteractionConnection")
    @com.francetelecom.rd.stubs.annotation.CallBack("onTransact")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IAccessibilityInteractionConnection")
  public void findAccessibilityNodeInfoByAccessibilityId(int arg1, int arg2, IAccessibilityInteractionConnectionCallback arg3, int arg4, long arg5) throws android.os.RemoteException;
  public void findAccessibilityNodeInfosByViewText(java.lang.String arg1, int arg2, int arg3, IAccessibilityInteractionConnectionCallback arg4, int arg5, long arg6) throws android.os.RemoteException;
  public void performAccessibilityAction(int arg1, int arg2, int arg3, IAccessibilityInteractionConnectionCallback arg4, int arg5, long arg6) throws android.os.RemoteException;
  public void findAccessibilityNodeInfoByViewId(int arg1, int arg2, IAccessibilityInteractionConnectionCallback arg3, int arg4, long arg5) throws android.os.RemoteException;
}
