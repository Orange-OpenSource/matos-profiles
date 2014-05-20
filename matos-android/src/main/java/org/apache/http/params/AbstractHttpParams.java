package org.apache.http.params;

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
public abstract class AbstractHttpParams
  implements HttpParams
{
  // Constructors

  protected AbstractHttpParams(){
  }
  // Methods

  public int getIntParameter(java.lang.String arg1, int arg2){
    return 0;
  }
  public HttpParams setIntParameter(java.lang.String arg1, int arg2){
    return (HttpParams) null;
  }
  public boolean getBooleanParameter(java.lang.String arg1, boolean arg2){
    return false;
  }
  public HttpParams setBooleanParameter(java.lang.String arg1, boolean arg2){
    return (HttpParams) null;
  }
  public long getLongParameter(java.lang.String arg1, long arg2){
    return 0l;
  }
  public HttpParams setLongParameter(java.lang.String arg1, long arg2){
    return (HttpParams) null;
  }
  public double getDoubleParameter(java.lang.String arg1, double arg2){
    return 0.0d;
  }
  public HttpParams setDoubleParameter(java.lang.String arg1, double arg2){
    return (HttpParams) null;
  }
  public boolean isParameterTrue(java.lang.String arg1){
    return false;
  }
  public boolean isParameterFalse(java.lang.String arg1){
    return false;
  }
}
