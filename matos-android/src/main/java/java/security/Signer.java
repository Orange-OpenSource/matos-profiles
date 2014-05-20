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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SignerImpl", superClass = "")
public abstract class Signer
  extends Identity{
  // Constructors

  protected Signer(){
    super();
  }
  public Signer(java.lang.String arg1){
    super();
  }
  public Signer(java.lang.String arg1, IdentityScope arg2) throws KeyManagementException{
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return mKeyPair.getPrivate();")
  public PrivateKey getPrivateKey(){
    return (PrivateKey) null;
  }
  public final void setKeyPair(@com.francetelecom.rd.stubs.annotation.FieldSet("mKeyPair") KeyPair arg1) throws InvalidParameterException, KeyException{
  }
}
