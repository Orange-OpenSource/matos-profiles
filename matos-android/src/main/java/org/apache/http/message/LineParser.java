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
public interface LineParser
{
  // Methods

  public org.apache.http.Header parseHeader(org.apache.http.util.CharArrayBuffer arg1) throws org.apache.http.ParseException;
  public org.apache.http.ProtocolVersion parseProtocolVersion(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2) throws org.apache.http.ParseException;
  public boolean hasProtocolVersion(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2);
  public org.apache.http.RequestLine parseRequestLine(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2) throws org.apache.http.ParseException;
  public org.apache.http.StatusLine parseStatusLine(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2) throws org.apache.http.ParseException;
}
