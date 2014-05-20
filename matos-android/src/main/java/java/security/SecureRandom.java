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
public class SecureRandom
  extends java.util.Random{
  // Constructors

  public SecureRandom(){
    super();
  }
  public SecureRandom(byte [] arg1){
    super();
  }
  protected SecureRandom(SecureRandomSpi arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mProvider") Provider arg2){
    super();
  }
  private SecureRandom(SecureRandomSpi arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mProvider") Provider arg2, java.lang.String arg3){
    super();
  }
  // Methods

  public static SecureRandom getInstance(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1) throws NoSuchAlgorithmException{
    return (SecureRandom) null;
  }
  public static SecureRandom getInstance(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1, java.lang.String arg2) throws NoSuchAlgorithmException, NoSuchProviderException{
    return (SecureRandom) null;
  }
  public static SecureRandom getInstance(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mProvider") Provider arg2) throws NoSuchAlgorithmException{
    return (SecureRandom) null;
  }
  protected final int next(int arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAlgorithm")
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mProvider")
  public final Provider getProvider(){
    return (Provider) null;
  }
  public synchronized void nextBytes(byte [] arg1){
  }

  public static byte [] getSeed(int arg1){
    return (byte []) null;
  }
  public synchronized void setSeed(byte [] arg1){
  }
  public void setSeed(long arg1){
  }

  public byte [] generateSeed(int arg1){
    return (byte []) null;
  }
}
