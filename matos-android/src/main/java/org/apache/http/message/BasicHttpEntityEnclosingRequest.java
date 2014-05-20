package org.apache.http.message;

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
public class BasicHttpEntityEnclosingRequest
  extends BasicHttpRequest  implements org.apache.http.HttpEntityEnclosingRequest
{
  // Constructors

  public BasicHttpEntityEnclosingRequest(java.lang.String arg1, java.lang.String arg2){
    super((java.lang.String) null, (java.lang.String) null);
  }
  public BasicHttpEntityEnclosingRequest(java.lang.String arg1, java.lang.String arg2, org.apache.http.ProtocolVersion arg3){
    super((java.lang.String) null, (java.lang.String) null);
  }
  public BasicHttpEntityEnclosingRequest(org.apache.http.RequestLine arg1){
    super((java.lang.String) null, (java.lang.String) null);
  }
  // Methods

  public org.apache.http.HttpEntity getEntity(){
    return (org.apache.http.HttpEntity) null;
  }
  public void setEntity(org.apache.http.HttpEntity arg1){
  }
  public boolean expectContinue(){
    return false;
  }
}
