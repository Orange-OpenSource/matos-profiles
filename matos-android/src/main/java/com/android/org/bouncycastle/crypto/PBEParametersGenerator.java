package com.android.org.bouncycastle.crypto;

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
public abstract class PBEParametersGenerator
{
  // Fields

  protected byte [] password;

  protected byte [] salt;

  protected int iterationCount;

  // Constructors

  protected PBEParametersGenerator(){
  }
  // Methods

  public void init(byte [] arg1, byte [] arg2, int arg3){
  }
  public byte [] getPassword(){
    return (byte []) null;
  }
  public byte [] getSalt(){
    return (byte []) null;
  }
  public int getIterationCount(){
    return 0;
  }
  public abstract CipherParameters generateDerivedMacParameters(int arg1);
  public abstract CipherParameters generateDerivedParameters(int arg1);
  public abstract CipherParameters generateDerivedParameters(int arg1, int arg2);
  public static byte [] PKCS12PasswordToBytes(char [] arg1){
    return (byte []) null;
  }
  public static byte [] PKCS5PasswordToBytes(char [] arg1){
    return (byte []) null;
  }
  public static byte [] PKCS5PasswordToUTF8Bytes(char [] arg1){
    return (byte []) null;
  }
}
