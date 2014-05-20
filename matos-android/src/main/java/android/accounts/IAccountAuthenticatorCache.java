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

import com.francetelecom.rd.stubs.annotation.Code;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IAccountAuthenticatorCacheImpl", superClass = "")
public interface IAccountAuthenticatorCache
{
  // Methods

  public void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3);
  public android.content.pm.RegisteredServicesCache.ServiceInfo<AuthenticatorDescription> getServiceInfo(AuthenticatorDescription arg1);
  @Code("arg1.onServiceChanged(new android.accounts.AuthenticatorDescription(\"\", \"\", 0, 0, 0, 0),true);")
  public void setListener( android.content.pm.RegisteredServicesCacheListener<AuthenticatorDescription> arg1, android.os.Handler arg2);
  public java.util.Collection<android.content.pm.RegisteredServicesCache.ServiceInfo<AuthenticatorDescription>> getAllServices();
}
