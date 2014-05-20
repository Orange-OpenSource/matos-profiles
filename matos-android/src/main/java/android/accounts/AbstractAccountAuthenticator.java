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
public abstract class AbstractAccountAuthenticator
{
  // Constructors

  public AbstractAccountAuthenticator(android.content.Context arg1){
  }
  // Methods

  public abstract android.os.Bundle hasFeatures(AccountAuthenticatorResponse arg1, Account arg2, java.lang.String [] arg3) throws NetworkErrorException;
  public abstract android.os.Bundle confirmCredentials(AccountAuthenticatorResponse arg1, Account arg2, android.os.Bundle arg3) throws NetworkErrorException;
  public abstract android.os.Bundle addAccount(AccountAuthenticatorResponse arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String [] arg4, android.os.Bundle arg5) throws NetworkErrorException;
  public abstract android.os.Bundle getAuthToken(AccountAuthenticatorResponse arg1, Account arg2, java.lang.String arg3, android.os.Bundle arg4) throws NetworkErrorException;
  public abstract java.lang.String getAuthTokenLabel(java.lang.String arg1);
  public abstract android.os.Bundle updateCredentials(AccountAuthenticatorResponse arg1, Account arg2, java.lang.String arg3, android.os.Bundle arg4) throws NetworkErrorException;
  public abstract android.os.Bundle editProperties(AccountAuthenticatorResponse arg1, java.lang.String arg2);
  public android.os.Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse arg1, Account arg2) throws NetworkErrorException{
    return (android.os.Bundle) null;
  }
  public final android.os.IBinder getIBinder(){
    return (android.os.IBinder) null;
  }
}
