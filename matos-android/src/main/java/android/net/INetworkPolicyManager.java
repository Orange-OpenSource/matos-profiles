package android.net;

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
public interface INetworkPolicyManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements INetworkPolicyManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static INetworkPolicyManager asInterface(android.os.IBinder arg1){
      return (INetworkPolicyManager) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("INetworkPolicyManager")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public void registerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("INetworkPolicyListener") INetworkPolicyListener arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public void unregisterListener(INetworkPolicyListener arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public void setUidPolicy(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public int getUidPolicy(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public boolean isUidForeground(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public void setNetworkPolicies(NetworkPolicy [] arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public NetworkPolicy [] getNetworkPolicies() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public void snoozePolicy(NetworkTemplate arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public void setRestrictBackground(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public boolean getRestrictBackground() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkPolicyManager")
  public NetworkQuotaInfo getNetworkQuotaInfo(NetworkState arg1) throws android.os.RemoteException;
}
