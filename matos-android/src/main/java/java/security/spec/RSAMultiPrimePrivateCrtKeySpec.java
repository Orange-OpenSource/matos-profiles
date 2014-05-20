package java.security.spec;

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


public class RSAMultiPrimePrivateCrtKeySpec
  extends RSAPrivateKeySpec{
  // Constructors

  public RSAMultiPrimePrivateCrtKeySpec(java.math.BigInteger arg1, java.math.BigInteger arg2, java.math.BigInteger arg3, java.math.BigInteger arg4, java.math.BigInteger arg5, java.math.BigInteger arg6, java.math.BigInteger arg7, java.math.BigInteger arg8, RSAOtherPrimeInfo [] arg9){
    super((java.math.BigInteger) null, (java.math.BigInteger) null);
  }
  // Methods

  public java.math.BigInteger getPublicExponent(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getPrimeP(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getPrimeQ(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getPrimeExponentP(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getPrimeExponentQ(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getCrtCoefficient(){
    return (java.math.BigInteger) null;
  }
  public RSAOtherPrimeInfo [] getOtherPrimeInfo(){
    return (RSAOtherPrimeInfo []) null;
  }
}
