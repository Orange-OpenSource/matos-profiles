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
public abstract class SignatureSpi
{
  // Fields

  protected SecureRandom appRandom;

  // Constructors

  public SignatureSpi(){
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  protected AlgorithmParameters engineGetParameters(){
    return (AlgorithmParameters) null;
  }
  protected abstract void engineUpdate(byte arg1) throws SignatureException;
  protected abstract void engineUpdate(byte [] arg1, int arg2, int arg3) throws SignatureException;
  protected void engineUpdate(java.nio.ByteBuffer arg1){
  }
  protected abstract void engineInitSign(PrivateKey arg1) throws InvalidKeyException;
  protected void engineInitSign(PrivateKey arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.appRandom") SecureRandom arg2) throws InvalidKeyException{
  }
  protected abstract void engineInitVerify(PublicKey arg1) throws InvalidKeyException;
  protected abstract byte [] engineSign() throws SignatureException;
  protected int engineSign(byte [] arg1, int arg2, int arg3) throws SignatureException{
    return 0;
  }
  protected abstract boolean engineVerify(byte [] arg1) throws SignatureException;
  protected boolean engineVerify(byte [] arg1, int arg2, int arg3) throws SignatureException{
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mParameter")
  protected abstract java.lang.Object engineGetParameter(java.lang.String arg1) throws InvalidParameterException;
  protected abstract void engineSetParameter(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mParameter") java.lang.Object arg2) throws InvalidParameterException;
  protected void engineSetParameter(java.security.spec.AlgorithmParameterSpec arg1) throws InvalidAlgorithmParameterException{
  }
}
