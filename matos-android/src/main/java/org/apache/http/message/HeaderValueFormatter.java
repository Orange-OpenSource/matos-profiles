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
public interface HeaderValueFormatter
{
  // Methods

  public org.apache.http.util.CharArrayBuffer formatElements(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.HeaderElement [] arg2, boolean arg3);
  public org.apache.http.util.CharArrayBuffer formatHeaderElement(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.HeaderElement arg2, boolean arg3);
  public org.apache.http.util.CharArrayBuffer formatParameters(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.NameValuePair [] arg2, boolean arg3);
  public org.apache.http.util.CharArrayBuffer formatNameValuePair(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.NameValuePair arg2, boolean arg3);
}
