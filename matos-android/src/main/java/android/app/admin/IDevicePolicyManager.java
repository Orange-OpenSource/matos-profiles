package android.app.admin;

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


public interface IDevicePolicyManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IDevicePolicyManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IDevicePolicyManager asInterface(android.os.IBinder arg1){
      return (IDevicePolicyManager) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IDevicePolicyManager")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void getRemoveWarning(android.content.ComponentName arg1, android.os.RemoteCallback arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public boolean isAdminActive(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public java.util.List<android.content.ComponentName> getActiveAdmins() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public boolean packageHasActiveAdmins(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void removeActiveAdmin(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public boolean hasGrantedPolicy(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setPasswordQuality(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getPasswordQuality(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setPasswordMinimumLength(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getPasswordMinimumLength(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setPasswordMinimumUpperCase(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getPasswordMinimumUpperCase(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setPasswordMinimumLowerCase(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getPasswordMinimumLowerCase(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setPasswordMinimumLetters(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getPasswordMinimumLetters(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setPasswordMinimumNumeric(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getPasswordMinimumNumeric(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setPasswordMinimumSymbols(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getPasswordMinimumSymbols(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setPasswordMinimumNonLetter(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getPasswordMinimumNonLetter(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setPasswordHistoryLength(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setPasswordExpirationTimeout(android.content.ComponentName arg1, long arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public long getPasswordExpirationTimeout(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public long getPasswordExpiration(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getPasswordHistoryLength(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public boolean isActivePasswordSufficient() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getCurrentFailedPasswordAttempts() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setMaximumFailedPasswordsForWipe(android.content.ComponentName arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getMaximumFailedPasswordsForWipe(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public boolean resetPassword(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setMaximumTimeToLock(android.content.ComponentName arg1, long arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public long getMaximumTimeToLock(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void lockNow() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void wipeData(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public android.content.ComponentName setGlobalProxy(android.content.ComponentName arg1, java.lang.String arg2, java.lang.String arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public android.content.ComponentName getGlobalProxyAdmin() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int setStorageEncryption(android.content.ComponentName arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public boolean getStorageEncryption(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public int getStorageEncryptionStatus() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setCameraDisabled(android.content.ComponentName arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public boolean getCameraDisabled(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setActiveAdmin(android.content.ComponentName arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void setActivePasswordState(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void reportFailedPasswordAttempt() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IDevicePolicyManager")
  public void reportSuccessfulPasswordAttempt() throws android.os.RemoteException;
}
