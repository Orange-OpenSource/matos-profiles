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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class KeyStore
{
  // Classes

  public static enum State
  {
    // Enum Constants

    UNLOCKED()
, LOCKED()
, UNINITIALIZED()
;
    // Fields

    // Constructors

    private State(){
    }
    // Methods

  }
  // Fields

  public static final int NO_ERROR = 1;

  public static final int LOCKED = 2;

  public static final int UNINITIALIZED = 3;

  public static final int SYSTEM_ERROR = 4;

  public static final int PROTOCOL_ERROR = 5;

  public static final int PERMISSION_DENIED = 6;

  public static final int KEY_NOT_FOUND = 7;

  public static final int VALUE_CORRUPTED = 8;

  public static final int UNDEFINED_ACTION = 9;

  public static final int WRONG_PASSWORD = 10;

  // Constructors

  private KeyStore(){
  }
  // Methods

  public boolean lock(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value="android.KeyStore.get",pos=1)
  public byte [] get(java.lang.String arg1){
    return (byte []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value="android.KeyStore.put",pos=1)
  public boolean put(java.lang.String arg1, byte [] arg2){
    return false;
  }
  public boolean contains(java.lang.String arg1){
    return false;
  }
  public boolean isEmpty(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "android.KeyStore.getInstance", report = "-")
  public static KeyStore getInstance(){
    return (KeyStore) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "android.KeyStore.delete", pos=1)
  public boolean delete(java.lang.String arg1){
    return false;
  }
  public boolean reset(){
    return false;
  }
  public KeyStore.State state(){
    return (KeyStore.State) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "android.KeyStore.unlock", pos=1)
  public boolean unlock(java.lang.String arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "android.KeyStore.password-test", report = "-")
  public boolean password(java.lang.String arg1){
    return false;
  }
  public int getLastError(){
    return 0;
  }
  public byte [] [] saw(byte [] arg1){
    return (byte [] []) null;
  }
  public java.lang.String [] saw(java.lang.String arg1){
    return (java.lang.String []) null;
  }
}
