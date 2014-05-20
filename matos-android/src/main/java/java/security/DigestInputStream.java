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
public class DigestInputStream
  extends java.io.FilterInputStream{
  // Fields

  protected MessageDigest digest;

  // Constructors

  public DigestInputStream(java.io.InputStream arg1, MessageDigest arg2){
    super((java.io.InputStream) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int read() throws java.io.IOException{
    return 0;
  }
  public int read(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
    return 0;
  }
  public void on(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("messageDigest")
  public MessageDigest getMessageDigest(){
    return (MessageDigest) null;
  }
  public void setMessageDigest(@com.francetelecom.rd.stubs.annotation.FieldSet("messageDigest") MessageDigest arg1){
  }
}
