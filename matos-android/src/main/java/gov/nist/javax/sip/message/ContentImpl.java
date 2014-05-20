package gov.nist.javax.sip.message;

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


public class ContentImpl
  implements Content
{
  // Constructors

  public ContentImpl(@com.francetelecom.rd.stubs.annotation.FieldSet(value="content", type="Object") java.lang.String arg1, java.lang.String arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public java.lang.Object getContent(){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("contentTypeHeader")
  public javax.sip.header.ContentTypeHeader getContentTypeHeader(){
    return (javax.sip.header.ContentTypeHeader) null;
  }
  public void setContent(@com.francetelecom.rd.stubs.annotation.FieldSet("content") java.lang.Object arg1){
  }
  public void setContentDispositionHeader(@com.francetelecom.rd.stubs.annotation.FieldSet("contentDispositionHeader") @com.francetelecom.rd.stubs.annotation.CallBackRegister("contentDispositionHeader") javax.sip.header.ContentDispositionHeader arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("contentDispositionHeader")
  public javax.sip.header.ContentDispositionHeader getContentDispositionHeader(){
    return (javax.sip.header.ContentDispositionHeader) null;
  }
  public void setContentTypeHeader(@com.francetelecom.rd.stubs.annotation.FieldSet("contentTypeHeader") javax.sip.header.ContentTypeHeader arg1){
  }
}
