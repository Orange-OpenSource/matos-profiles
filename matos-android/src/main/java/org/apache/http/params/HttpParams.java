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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ParamsImplem", superClass = "")
public interface HttpParams
{
  // Methods

  public HttpParams copy();
  public java.lang.Object getParameter(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "HttpParams.setParameter", pos = {0, 1}, report = "-")
  public HttpParams setParameter(java.lang.String arg1, java.lang.Object arg2);
  public boolean removeParameter(java.lang.String arg1);
  public int getIntParameter(java.lang.String arg1, int arg2);
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "HttpParams.setIntParameter", pos = {0, 1}, report = "-")
  public HttpParams setIntParameter(java.lang.String arg1, int arg2);
  public boolean getBooleanParameter(java.lang.String arg1, boolean arg2);
  public HttpParams setBooleanParameter(java.lang.String arg1, boolean arg2);
  public long getLongParameter(java.lang.String arg1, long arg2);
  public HttpParams setLongParameter(java.lang.String arg1, long arg2);
  public double getDoubleParameter(java.lang.String arg1, double arg2);
  public HttpParams setDoubleParameter(java.lang.String arg1, double arg2);
  public boolean isParameterTrue(java.lang.String arg1);
  public boolean isParameterFalse(java.lang.String arg1);
}
