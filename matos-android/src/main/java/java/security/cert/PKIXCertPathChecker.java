package java.security.cert;

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


public abstract class PKIXCertPathChecker
  implements java.lang.Cloneable
{
  // Constructors

  protected PKIXCertPathChecker(){
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public abstract void init(boolean arg1) throws CertPathValidatorException;
  public abstract void check(Certificate arg1, java.util.Collection<java.lang.String> arg2) throws CertPathValidatorException;
  public abstract boolean isForwardCheckingSupported();
  public abstract java.util.Set<java.lang.String> getSupportedExtensions();
}
