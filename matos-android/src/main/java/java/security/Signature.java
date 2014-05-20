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
import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.SignatureImpl")
public abstract class Signature
  extends SignatureSpi{
  // Fields

  protected static final int UNINITIALIZED = 0;

  protected static final int SIGN = 0;

  protected static final int VERIFY = 0;

  protected int state;

  // Constructors

  protected Signature(@com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg1){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  
  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  @Code("return new com.francetelecom.rd.fakeandroid.SignatureImpl(arg1);")
  public static Signature getInstance( java.lang.String arg1) throws NoSuchAlgorithmException{
    return (Signature) null;
  }
  @Code("return new com.francetelecom.rd.fakeandroid.SignatureImpl(arg1);")
  public static Signature getInstance( java.lang.String arg1, java.lang.String arg2) throws NoSuchAlgorithmException, NoSuchProviderException{
    return (Signature) null;
  }
  @Code("return new com.francetelecom.rd.fakeandroid.SignatureImpl(arg1);")
  public static Signature getInstance(java.lang.String arg1,  Provider arg2) throws NoSuchAlgorithmException{
    return (Signature) null;
  }
  public final boolean verify(byte [] arg1) throws SignatureException{
    return false;
  }
  public final boolean verify(byte [] arg1, int arg2, int arg3) throws SignatureException{
    return false;
  }
  public final void update(byte arg1) throws SignatureException{
  }
  public final void update(byte [] arg1) throws SignatureException{
  }
  public final void update(byte [] arg1, int arg2, int arg3) throws SignatureException{
  }
  public final void update(java.nio.ByteBuffer arg1) throws SignatureException{
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public final AlgorithmParameters getParameters(){
    return (AlgorithmParameters) null;
  }
  
  public final Provider getProvider(){
    return (Provider) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mParameter")
  public final java.lang.Object getParameter(java.lang.String arg1) throws InvalidParameterException{
    return (java.lang.Object) null;
  }
  public final void setParameter(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mParameter") java.lang.Object arg2) throws InvalidParameterException{
  }
  public final void setParameter(java.security.spec.AlgorithmParameterSpec arg1) throws InvalidAlgorithmParameterException{
  }
  public final byte [] sign() throws SignatureException{
    return (byte []) null;
  }
  public final int sign(byte [] arg1, int arg2, int arg3) throws SignatureException{
    return 0;
  }
  public final void initVerify(PublicKey arg1) throws InvalidKeyException{
  }
  public final void initVerify(java.security.cert.Certificate arg1) throws InvalidKeyException{
  }
  public final void initSign(PrivateKey arg1) throws InvalidKeyException{
  }
  public final void initSign(PrivateKey arg1, SecureRandom arg2) throws InvalidKeyException{
  }
}
