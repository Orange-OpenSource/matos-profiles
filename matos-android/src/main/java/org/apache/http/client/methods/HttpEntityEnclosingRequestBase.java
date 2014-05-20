package org.apache.http.client.methods;

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
public abstract class HttpEntityEnclosingRequestBase
  extends HttpRequestBase  implements org.apache.http.HttpEntityEnclosingRequest
{
  // Constructors

  public HttpEntityEnclosingRequestBase(){
    super();
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("entity")
  public org.apache.http.HttpEntity getEntity(){
    return (org.apache.http.HttpEntity) null;
  }
  public void setEntity(@com.francetelecom.rd.stubs.annotation.FieldSet("entity") org.apache.http.HttpEntity arg1){
  }
  public boolean expectContinue(){
    return false;
  }
}
