package android.security;

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


public class SystemKeyStore
{
  // Constructors

  private SystemKeyStore(){
  }
  // Methods

  public static java.lang.String toHexString(byte [] arg1){
    return (java.lang.String) null;
  }
  public static SystemKeyStore getInstance(){
    return (SystemKeyStore) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SystemKeyStore.retrieveKeyHexString", pos = 1, report = "-")
  public java.lang.String retrieveKeyHexString(java.lang.String arg1) throws java.io.IOException{
    return (java.lang.String) null;
  }
  public java.lang.String generateNewKeyHexString(int arg1, java.lang.String arg2, java.lang.String arg3) throws java.security.NoSuchAlgorithmException{
    return (java.lang.String) null;
  }
  public byte [] generateNewKey(int arg1, java.lang.String arg2, java.lang.String arg3) throws java.security.NoSuchAlgorithmException{
    return (byte []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SystemKeyStore.retrieveKey", pos = 1, report = "-")
  public byte [] retrieveKey(java.lang.String arg1) throws java.io.IOException{
    return (byte []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SystemKeyStore.deleteKey", pos = 1, report = "-")
  public void deleteKey(java.lang.String arg1){
  }
}
