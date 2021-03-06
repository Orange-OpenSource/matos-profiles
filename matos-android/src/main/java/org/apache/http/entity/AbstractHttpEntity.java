package org.apache.http.entity;

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
public abstract class AbstractHttpEntity
  implements org.apache.http.HttpEntity
{
  // Fields

  protected org.apache.http.Header contentType;

  protected org.apache.http.Header contentEncoding;

  protected boolean chunked;

  // Constructors

  protected AbstractHttpEntity(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("contentType")
  public org.apache.http.Header getContentType(){
    return (org.apache.http.Header) null;
  }
  public void setContentType(org.apache.http.Header arg1){
  }
  public void setContentType(@com.francetelecom.rd.stubs.annotation.FieldSet("entity") java.lang.String arg1){
  }
  public org.apache.http.Header getContentEncoding(){
    return (org.apache.http.Header) null;
  }
  public boolean isChunked(){
    return false;
  }
  public void setContentEncoding(org.apache.http.Header arg1){
  }
  public void setContentEncoding(java.lang.String arg1){
  }
  public void setChunked(boolean arg1){
  }
  public void consumeContent() throws java.io.IOException, java.lang.UnsupportedOperationException{
  }
}
