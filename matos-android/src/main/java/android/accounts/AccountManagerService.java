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
public class AccountManagerService
  extends IAccountManager.Stub  implements android.content.pm.RegisteredServicesCacheListener<AuthenticatorDescription>
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AccountManagerService(android.content.Context arg1){
    super();
  }
  public AccountManagerService(android.content.Context arg1, android.content.pm.PackageManager arg2, IAccountAuthenticatorCache arg3){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public java.lang.String getUserData(Account arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public void setUserData(Account arg1, java.lang.String arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onServiceChanged(AuthenticatorDescription arg1, boolean arg2){
  }
  public static AccountManagerService getSingleton(){
    return (AccountManagerService) null;
  }
  public void setPassword(Account arg1, java.lang.String arg2){
  }
  public android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  public java.lang.String getPassword(Account arg1){
    return (java.lang.String) null;
  }
  public void hasFeatures(IAccountManagerResponse arg1, Account arg2, java.lang.String [] arg3){
  }
  public void confirmCredentials(IAccountManagerResponse arg1, Account arg2, android.os.Bundle arg3, boolean arg4){
  }
  public boolean addAccount(Account arg1, java.lang.String arg2, android.os.Bundle arg3){
    return false;
  }
  public void getAuthToken(IAccountManagerResponse arg1, Account arg2, java.lang.String arg3, boolean arg4, boolean arg5, android.os.Bundle arg6){
  }
  public void updateCredentials(IAccountManagerResponse arg1, Account arg2, java.lang.String arg3, boolean arg4, android.os.Bundle arg5){
  }
  public void editProperties(IAccountManagerResponse arg1, java.lang.String arg2, boolean arg3){
  }
  protected void cancelNotification(int arg1){
  }
  public void clearPassword(Account arg1){
  }
  public AuthenticatorDescription [] getAuthenticatorTypes(){
    return (AuthenticatorDescription []) null;
  }
  public Account [] getAccounts(java.lang.String arg1){
    return (Account []) null;
  }
  public void removeAccount(IAccountManagerResponse arg1, Account arg2){
  }
  public void invalidateAuthToken(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String peekAuthToken(Account arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public void setAuthToken(Account arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void getAccountsByFeatures(IAccountManagerResponse arg1, java.lang.String arg2, java.lang.String [] arg3){
  }
  public void addAcount(IAccountManagerResponse arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String [] arg4, boolean arg5, android.os.Bundle arg6){
  }
  protected Account [] getAccountsFromCacheLocked(java.lang.String arg1){
    return (Account []) null;
  }
  protected void removeAccountInternal(Account arg1){
  }
  protected void installNotification(int arg1, android.app.Notification arg2){
  }
  public void grantAppPermission(Account arg1, java.lang.String arg2, int arg3){
  }
  public void revokeAppPermission(Account arg1, java.lang.String arg2, int arg3){
  }
  protected void writeUserDataIntoCacheLocked(android.database.sqlite.SQLiteDatabase arg1, Account arg2, java.lang.String arg3, java.lang.String arg4){
  }
  protected void writeAuthTokenIntoCacheLocked(android.database.sqlite.SQLiteDatabase arg1, Account arg2, java.lang.String arg3, java.lang.String arg4){
  }
  protected java.lang.String readAuthTokenInternal(Account arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  protected java.lang.String readUserDataInternal(Account arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  protected java.util.HashMap<java.lang.String, java.lang.String> readUserDataForAccountFromDatabaseLocked(android.database.sqlite.SQLiteDatabase arg1, Account arg2){
    return (java.util.HashMap) null;
  }
  protected java.util.HashMap<java.lang.String, java.lang.String> readAuthTokensForAccountFromDatabaseLocked(android.database.sqlite.SQLiteDatabase arg1, Account arg2){
    return (java.util.HashMap) null;
  }
}
