package java.security;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AuthProviderImpl", superClass = "")
public abstract class AuthProvider
  extends Provider{
  // Constructors

  protected AuthProvider(java.lang.String arg1, double arg2, java.lang.String arg3){
    super((java.lang.String) null, 0.0d, (java.lang.String) null);
  }
  // Methods

  public abstract void login(javax.security.auth.Subject arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") javax.security.auth.callback.CallbackHandler arg2) throws javax.security.auth.login.LoginException;
  public abstract void logout() throws javax.security.auth.login.LoginException;
  public abstract void setCallbackHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") javax.security.auth.callback.CallbackHandler arg1);
}
