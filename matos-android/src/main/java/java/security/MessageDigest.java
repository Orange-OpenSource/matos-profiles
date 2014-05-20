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

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldSet;
import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.MessageDigestImpl")
public abstract class MessageDigest
  extends MessageDigestSpi{
  // Constructors

  protected MessageDigest(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1){
    super();
  }
  
  protected MessageDigest(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1, @FieldSet("mProvider")Provider arg2){
	    super();
	  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  @Code("return new com.francetelecom.rd.fakeandroid.MessageDigestImpl(arg1);")
  public static MessageDigest getInstance(java.lang.String arg1) throws NoSuchAlgorithmException{
    return (MessageDigest) null;
  }
  @Code("return new com.francetelecom.rd.fakeandroid.MessageDigestImpl(arg1);")
  public static MessageDigest getInstance(java.lang.String arg1, java.lang.String arg2) throws NoSuchAlgorithmException, NoSuchProviderException{
    return (MessageDigest) null;
  }
  @Code("return new com.francetelecom.rd.fakeandroid.MessageDigestImpl(arg1,arg2);")
  public static MessageDigest getInstance(java.lang.String arg1,  Provider arg2) throws NoSuchAlgorithmException{
    return (MessageDigest) null;
  }
  public void reset(){
  }
  public byte [] digest(){
    return (byte []) null;
  }
  public int digest(byte [] arg1, int arg2, int arg3) throws DigestException{
    return 0;
  }
  public byte [] digest(byte [] arg1){
    return (byte []) null;
  }
  public void update(byte arg1){
  }
  public void update(byte [] arg1, int arg2, int arg3){
  }
  public void update(byte [] arg1){
  }
  public final void update(java.nio.ByteBuffer arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAlgorithm")
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public static boolean isEqual(byte [] arg1, byte [] arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mProvider")
  public final Provider getProvider(){
    return (Provider) null;
  }
  public final int getDigestLength(){
    return 0;
  }
}
