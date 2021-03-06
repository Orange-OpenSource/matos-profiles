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
public class DigestOutputStream
  extends java.io.FilterOutputStream{
  // Fields

  protected MessageDigest digest;

  // Constructors

  public DigestOutputStream(java.io.OutputStream arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.digest") MessageDigest arg2){
    super((java.io.OutputStream) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void write(int arg1) throws java.io.IOException{
  }
  public void write(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
  }
  public void on(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("digest")
  public MessageDigest getMessageDigest(){
    return (MessageDigest) null;
  }
  public void setMessageDigest(@com.francetelecom.rd.stubs.annotation.FieldSet("this.digest") MessageDigest arg1){
  }
}
