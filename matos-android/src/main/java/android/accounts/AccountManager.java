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
public class AccountManager
{
  // Fields

  public static final int ERROR_CODE_REMOTE_EXCEPTION = 1;

  public static final int ERROR_CODE_NETWORK_ERROR = 3;

  public static final int ERROR_CODE_CANCELED = 4;

  public static final int ERROR_CODE_INVALID_RESPONSE = 5;

  public static final int ERROR_CODE_UNSUPPORTED_OPERATION = 6;

  public static final int ERROR_CODE_BAD_ARGUMENTS = 7;

  public static final int ERROR_CODE_BAD_REQUEST = 8;

  public static final java.lang.String KEY_ACCOUNT_NAME = "authAccount";

  public static final java.lang.String KEY_ACCOUNT_TYPE = "accountType";

  public static final java.lang.String KEY_AUTHTOKEN = "authtoken";

  public static final java.lang.String KEY_INTENT = "intent";

  public static final java.lang.String KEY_PASSWORD = "password";

  public static final java.lang.String KEY_ACCOUNTS = "accounts";

  public static final java.lang.String KEY_ACCOUNT_AUTHENTICATOR_RESPONSE = "accountAuthenticatorResponse";

  public static final java.lang.String KEY_ACCOUNT_MANAGER_RESPONSE = "accountManagerResponse";

  public static final java.lang.String KEY_AUTHENTICATOR_TYPES = "authenticator_types";

  public static final java.lang.String KEY_AUTH_FAILED_MESSAGE = "authFailedMessage";

  public static final java.lang.String KEY_AUTH_TOKEN_LABEL = "authTokenLabelKey";

  public static final java.lang.String KEY_BOOLEAN_RESULT = "booleanResult";

  public static final java.lang.String KEY_ERROR_CODE = "errorCode";

  public static final java.lang.String KEY_ERROR_MESSAGE = "errorMessage";

  public static final java.lang.String KEY_USERDATA = "userdata";

  public static final java.lang.String KEY_CALLER_UID = "callerUid";

  public static final java.lang.String KEY_CALLER_PID = "callerPid";

  public static final java.lang.String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";

  public static final java.lang.String KEY_NOTIFY_ON_FAILURE = "notifyOnAuthFailure";

  public static final java.lang.String ACTION_AUTHENTICATOR_INTENT = "android.accounts.AccountAuthenticator";

  public static final java.lang.String AUTHENTICATOR_META_DATA_NAME = "android.accounts.AccountAuthenticator";

  public static final java.lang.String AUTHENTICATOR_ATTRIBUTES_NAME = "account-authenticator";

  public static final java.lang.String LOGIN_ACCOUNTS_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_CHANGED";

  // Constructors

  public AccountManager(android.content.Context arg1, IAccountManager arg2){
  }
  public AccountManager(android.content.Context arg1, IAccountManager arg2, android.os.Handler arg3){
  }
  // Methods

  public static AccountManager get(android.content.Context arg1){
    return (AccountManager) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AccountManager.getUserData", pos = {1, 2}, report = "-")
  public java.lang.String getUserData(Account arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AccountManager.setUserData", pos = {1, 2}, report = "-")
  public void setUserData(Account arg1, java.lang.String arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AccountManager.setPassword", pos = {1, 2}, report = "-")
  public void setPassword(Account arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AccountManager.getPassword", pos = 1, report = "-")
  public java.lang.String getPassword(Account arg1){
    return (java.lang.String) null;
  }
  public AccountManagerFuture<java.lang.Boolean> hasFeatures(Account arg1, java.lang.String [] arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("run")AccountManagerCallback<java.lang.Boolean> arg3, android.os.Handler arg4){
    return (AccountManagerFuture) null;
  }
  public AccountManagerFuture<android.os.Bundle> confirmCredentials(Account arg1, android.os.Bundle arg2, android.app.Activity arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("run") AccountManagerCallback<android.os.Bundle> arg4, android.os.Handler arg5){
    return (AccountManagerFuture) null;
  }
  public AccountManagerFuture<android.os.Bundle> addAccount(java.lang.String arg1, java.lang.String arg2, java.lang.String [] arg3, android.os.Bundle arg4, android.app.Activity arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("run") AccountManagerCallback<android.os.Bundle> arg6, android.os.Handler arg7){
    return (AccountManagerFuture) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AccountManager.GetAuthToken", pos = {1, 2}, report = "-")
  public AccountManagerFuture<android.os.Bundle> getAuthToken(Account arg1, java.lang.String arg2, android.os.Bundle arg3, android.app.Activity arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("run") AccountManagerCallback<android.os.Bundle> arg5, android.os.Handler arg6){
    return (AccountManagerFuture) null;
  }
  public AccountManagerFuture<android.os.Bundle> getAuthToken(Account arg1, java.lang.String arg2, boolean arg3,@com.francetelecom.rd.stubs.annotation.CallBackRegister("run")  AccountManagerCallback<android.os.Bundle> arg4, android.os.Handler arg5){
    return (AccountManagerFuture) null;
  }
  public AccountManagerFuture<android.os.Bundle> getAuthToken(Account arg1, java.lang.String arg2, android.os.Bundle arg3, boolean arg4, AccountManagerCallback<android.os.Bundle> arg5, android.os.Handler arg6){
    return (AccountManagerFuture) null;
  }
  public AccountManagerFuture<android.os.Bundle> updateCredentials(Account arg1, java.lang.String arg2, android.os.Bundle arg3, android.app.Activity arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("run") AccountManagerCallback<android.os.Bundle> arg5, android.os.Handler arg6){
    return (AccountManagerFuture) null;
  }
  public AccountManagerFuture<android.os.Bundle> editProperties(java.lang.String arg1, android.app.Activity arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("run") AccountManagerCallback<android.os.Bundle> arg3, android.os.Handler arg4){
    return (AccountManagerFuture) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AccountManager.clearPassword", pos = 1, report = "-")
  public void clearPassword(Account arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AccountManager.getAccountsByType", pos = 1, report = "-")
  public Account [] getAccountsByType(java.lang.String arg1){
    return (Account []) null;
  }
  public AuthenticatorDescription [] getAuthenticatorTypes(){
    return (AuthenticatorDescription []) null;
  }
  public void addOnAccountsUpdatedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.accounts.OnAccountsUpdateListener.onAccountsUpdated") OnAccountsUpdateListener arg1, android.os.Handler arg2, boolean arg3){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "AccountManager.getAccounts", report = "-")
  public Account [] getAccounts(){
    return (Account []) null;
  }
  public static android.os.Bundle sanitizeResult(android.os.Bundle arg1){
    return (android.os.Bundle) null;
  }
  public AccountManagerFuture<Account []> getAccountsByTypeAndFeatures(java.lang.String arg1, java.lang.String [] arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("run") AccountManagerCallback<Account []> arg3, android.os.Handler arg4){
    return (AccountManagerFuture) null;
  }
  public boolean addAccountExplicitly(Account arg1, java.lang.String arg2, android.os.Bundle arg3){
    return false;
  }
  public AccountManagerFuture<java.lang.Boolean> removeAccount(Account arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("run") AccountManagerCallback<java.lang.Boolean> arg2, android.os.Handler arg3){
    return (AccountManagerFuture) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AccountManager.invalidateAuthToken", pos = {1, 2}, report = "-")
  public void invalidateAuthToken(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String peekAuthToken(Account arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AccountManager.setAuthToken", pos = {1, 2, 3}, report = "-")
  public void setAuthToken(Account arg1, java.lang.String arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AccountManager.blockingGetAuthToken", pos = {1, 2}, report = "-")
  public java.lang.String blockingGetAuthToken(Account arg1, java.lang.String arg2, boolean arg3) throws OperationCanceledException, java.io.IOException, AuthenticatorException{
    return (java.lang.String) null;
  }
  public AccountManagerFuture<android.os.Bundle> getAuthTokenByFeatures(java.lang.String arg1, java.lang.String arg2, java.lang.String [] arg3, android.app.Activity arg4, android.os.Bundle arg5, android.os.Bundle arg6, @com.francetelecom.rd.stubs.annotation.CallBackRegister("run") AccountManagerCallback<android.os.Bundle> arg7, android.os.Handler arg8){
    return (AccountManagerFuture) null;
  }
  public static android.content.Intent newChooseAccountIntent(Account arg1, java.util.ArrayList<Account> arg2, java.lang.String [] arg3, boolean arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String [] arg7, android.os.Bundle arg8){
    return (android.content.Intent) null;
  }
  public void removeOnAccountsUpdatedListener(OnAccountsUpdateListener arg1){
  }
}
