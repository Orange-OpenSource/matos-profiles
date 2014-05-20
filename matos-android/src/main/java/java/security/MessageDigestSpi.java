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
public abstract class MessageDigestSpi
{
  // Constructors

  public MessageDigestSpi(){
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  protected abstract void engineUpdate(byte arg1);
  protected abstract void engineUpdate(byte [] arg1, int arg2, int arg3);
  protected void engineUpdate(java.nio.ByteBuffer arg1){
  }
  protected abstract void engineReset();
  protected int engineGetDigestLength(){
    return 0;
  }
  protected abstract byte [] engineDigest();
  protected int engineDigest(byte [] arg1, int arg2, int arg3) throws DigestException{
    return 0;
  }
}
