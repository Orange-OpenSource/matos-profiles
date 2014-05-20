package android.accounts;

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
public interface IAccountManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IAccountManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IAccountManager asInterface(android.os.IBinder arg1){
      return (IAccountManager) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public java.lang.String getUserData(Account arg1, java.lang.String arg2) throws android.os.RemoteException;
  public void setUserData(Account arg1, java.lang.String arg2, java.lang.String arg3) throws android.os.RemoteException;
  public void setPassword(Account arg1, java.lang.String arg2) throws android.os.RemoteException;
  public java.lang.String getPassword(Account arg1) throws android.os.RemoteException;
  public void hasFeatures(IAccountManagerResponse arg1, Account arg2, java.lang.String [] arg3) throws android.os.RemoteException;
  public void confirmCredentials(IAccountManagerResponse arg1, Account arg2, android.os.Bundle arg3, boolean arg4) throws android.os.RemoteException;
  public boolean addAccount(Account arg1, java.lang.String arg2, android.os.Bundle arg3) throws android.os.RemoteException;
  public void getAuthToken(IAccountManagerResponse arg1, Account arg2, java.lang.String arg3, boolean arg4, boolean arg5, android.os.Bundle arg6) throws android.os.RemoteException;
  public void updateCredentials(IAccountManagerResponse arg1, Account arg2, java.lang.String arg3, boolean arg4, android.os.Bundle arg5) throws android.os.RemoteException;
  public void editProperties(IAccountManagerResponse arg1, java.lang.String arg2, boolean arg3) throws android.os.RemoteException;
  public void clearPassword(Account arg1) throws android.os.RemoteException;
  public AuthenticatorDescription [] getAuthenticatorTypes() throws android.os.RemoteException;
  public Account [] getAccounts(java.lang.String arg1) throws android.os.RemoteException;
  public void removeAccount(IAccountManagerResponse arg1, Account arg2) throws android.os.RemoteException;
  public void invalidateAuthToken(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  public java.lang.String peekAuthToken(Account arg1, java.lang.String arg2) throws android.os.RemoteException;
  public void setAuthToken(Account arg1, java.lang.String arg2, java.lang.String arg3) throws android.os.RemoteException;
  public void getAccountsByFeatures(IAccountManagerResponse arg1, java.lang.String arg2, java.lang.String [] arg3) throws android.os.RemoteException;
  public void addAcount(IAccountManagerResponse arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String [] arg4, boolean arg5, android.os.Bundle arg6) throws android.os.RemoteException;
}
