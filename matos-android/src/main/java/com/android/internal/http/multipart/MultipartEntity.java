package com.android.internal.http.multipart;

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


public class MultipartEntity
  extends org.apache.http.entity.AbstractHttpEntity{
  // Fields

  public static final java.lang.String MULTIPART_BOUNDARY = "http.method.multipart.boundary";

  protected Part [] parts;

  // Constructors

  public MultipartEntity(Part [] arg1, org.apache.http.params.HttpParams arg2){
    super();
  }
  public MultipartEntity(Part [] arg1){
    super();
  }
  // Methods

  public java.io.InputStream getContent() throws java.io.IOException, java.lang.IllegalStateException{
    return (java.io.InputStream) null;
  }
  public void writeTo(java.io.OutputStream arg1) throws java.io.IOException{
  }
  public long getContentLength(){
    return 0l;
  }
  public org.apache.http.Header getContentType(){
    return (org.apache.http.Header) null;
  }
  public boolean isRepeatable(){
    return false;
  }
  public boolean isStreaming(){
    return false;
  }
  protected byte [] getMultipartBoundary(){
    return (byte []) null;
  }
}
