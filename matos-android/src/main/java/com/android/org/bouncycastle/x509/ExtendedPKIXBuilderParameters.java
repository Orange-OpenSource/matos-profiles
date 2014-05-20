package com.android.org.bouncycastle.x509;

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


public class ExtendedPKIXBuilderParameters
  extends ExtendedPKIXParameters{
  // Constructors

  public ExtendedPKIXBuilderParameters(java.util.Set arg1, com.android.org.bouncycastle.util.Selector arg2) throws java.security.InvalidAlgorithmParameterException{
    super((java.util.Set) null);
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public static ExtendedPKIXParameters getInstance(java.security.cert.PKIXParameters arg1){
    return (ExtendedPKIXParameters) null;
  }
  protected void setParams(java.security.cert.PKIXParameters arg1){
  }
  public int getMaxPathLength(){
    return 0;
  }
  public void setMaxPathLength(int arg1){
  }
  public java.util.Set getExcludedCerts(){
    return (java.util.Set) null;
  }
  public void setExcludedCerts(java.util.Set arg1){
  }
}
