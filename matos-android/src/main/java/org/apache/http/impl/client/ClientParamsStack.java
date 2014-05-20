package org.apache.http.impl.client;

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
public class ClientParamsStack
  extends org.apache.http.params.AbstractHttpParams{
  // Fields

  protected final org.apache.http.params.HttpParams applicationParams = (org.apache.http.params.HttpParams) null;

  protected final org.apache.http.params.HttpParams clientParams = (org.apache.http.params.HttpParams) null;

  protected final org.apache.http.params.HttpParams requestParams = (org.apache.http.params.HttpParams) null;

  protected final org.apache.http.params.HttpParams overrideParams = (org.apache.http.params.HttpParams) null;

  // Constructors

  public ClientParamsStack(org.apache.http.params.HttpParams arg1, org.apache.http.params.HttpParams arg2, org.apache.http.params.HttpParams arg3, org.apache.http.params.HttpParams arg4){
    super();
  }
  public ClientParamsStack(ClientParamsStack arg1){
    super();
  }
  public ClientParamsStack(ClientParamsStack arg1, org.apache.http.params.HttpParams arg2, org.apache.http.params.HttpParams arg3, org.apache.http.params.HttpParams arg4, org.apache.http.params.HttpParams arg5){
    super();
  }
  // Methods

  public org.apache.http.params.HttpParams copy(){
    return (org.apache.http.params.HttpParams) null;
  }
  public java.lang.Object getParameter(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public org.apache.http.params.HttpParams setParameter(java.lang.String arg1, java.lang.Object arg2) throws java.lang.UnsupportedOperationException{
    return (org.apache.http.params.HttpParams) null;
  }
  public boolean removeParameter(java.lang.String arg1){
    return false;
  }
  public final org.apache.http.params.HttpParams getApplicationParams(){
    return (org.apache.http.params.HttpParams) null;
  }
  public final org.apache.http.params.HttpParams getClientParams(){
    return (org.apache.http.params.HttpParams) null;
  }
  public final org.apache.http.params.HttpParams getRequestParams(){
    return (org.apache.http.params.HttpParams) null;
  }
  public final org.apache.http.params.HttpParams getOverrideParams(){
    return (org.apache.http.params.HttpParams) null;
  }
}
