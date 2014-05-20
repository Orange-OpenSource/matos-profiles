package org.apache.harmony.security.provider.crypto;

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
public class SHA1withDSA_SignatureImpl
  extends java.security.Signature{
  // Constructors

  public SHA1withDSA_SignatureImpl() throws java.security.NoSuchAlgorithmException{
    super((java.lang.String) null);
  }
  // Methods

  protected void engineUpdate(byte arg1) throws java.security.SignatureException{
  }
  protected void engineUpdate(byte [] arg1, int arg2, int arg3) throws java.security.SignatureException{
  }
  protected void engineInitSign(java.security.PrivateKey arg1) throws java.security.InvalidKeyException{
  }
  protected void engineInitVerify(java.security.PublicKey arg1) throws java.security.InvalidKeyException{
  }
  protected byte [] engineSign() throws java.security.SignatureException{
    return (byte []) null;
  }
  protected boolean engineVerify(byte [] arg1) throws java.security.SignatureException{
    return false;
  }
  protected boolean engineVerify(byte [] arg1, int arg2, int arg3) throws java.security.SignatureException{
    return false;
  }
  protected java.lang.Object engineGetParameter(java.lang.String arg1) throws java.security.InvalidParameterException{
    return (java.lang.Object) null;
  }
  protected void engineSetParameter(java.lang.String arg1, java.lang.Object arg2) throws java.security.InvalidParameterException{
  }
}
