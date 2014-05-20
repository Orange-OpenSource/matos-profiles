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
public class ChooseTypeAndAccountActivity
  extends android.app.Activity  implements AccountManagerCallback<android.os.Bundle>
{
  // Fields

  public static final java.lang.String EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST = "allowableAccounts";

  public static final java.lang.String EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY = "allowableAccountTypes";

  public static final java.lang.String EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE = "addAccountOptions";

  public static final java.lang.String EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY = "addAccountRequiredFeatures";

  public static final java.lang.String EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING = "authTokenType";

  public static final java.lang.String EXTRA_SELECTED_ACCOUNT = "selectedAccount";

  public static final java.lang.String EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT = "alwaysPromptForAccount";

  public static final java.lang.String EXTRA_DESCRIPTION_TEXT_OVERRIDE = "descriptionTextOverride";

  public static final int REQUEST_NULL = 0;

  public static final int REQUEST_CHOOSE_TYPE = 1;

  public static final int REQUEST_ADD_ACCOUNT = 2;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ChooseTypeAndAccountActivity(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onActivityResult")
  public void run(AccountManagerFuture<android.os.Bundle> arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDestroy(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSaveInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onActivityResult")
  protected void onActivityResult(int arg1, int arg2, android.content.Intent arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onListItemClick(android.widget.ListView arg1, android.view.View arg2, int arg3, long arg4){
  }
  protected void runAddAccountForAuthenticator(java.lang.String arg1){
  }
}
