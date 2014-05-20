package javax.crypto.spec;

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


public class OAEPParameterSpec
  implements java.security.spec.AlgorithmParameterSpec
{
  // Fields

  public static final OAEPParameterSpec DEFAULT = null;

  // Constructors

  private OAEPParameterSpec(){
  }
  public OAEPParameterSpec(java.lang.String arg1, java.lang.String arg2, java.security.spec.AlgorithmParameterSpec arg3, PSource arg4){
  }
  // Methods

  public java.lang.String getDigestAlgorithm(){
    return (java.lang.String) null;
  }
  public java.lang.String getMGFAlgorithm(){
    return (java.lang.String) null;
  }
  public java.security.spec.AlgorithmParameterSpec getMGFParameters(){
    return (java.security.spec.AlgorithmParameterSpec) null;
  }
  public PSource getPSource(){
    return (PSource) null;
  }
}
