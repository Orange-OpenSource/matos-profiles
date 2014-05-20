package org.apache.http.impl.io;

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
public abstract class AbstractMessageParser
  implements org.apache.http.io.HttpMessageParser
{
  // Fields

  protected final org.apache.http.message.LineParser lineParser = (org.apache.http.message.LineParser) null;

  // Constructors

  public AbstractMessageParser(org.apache.http.io.SessionInputBuffer arg1, org.apache.http.message.LineParser arg2, org.apache.http.params.HttpParams arg3){
  }
  // Methods

  public org.apache.http.HttpMessage parse() throws java.io.IOException, org.apache.http.HttpException{
    return (org.apache.http.HttpMessage) null;
  }
  public static org.apache.http.Header [] parseHeaders(org.apache.http.io.SessionInputBuffer arg1, int arg2, int arg3, org.apache.http.message.LineParser arg4) throws org.apache.http.HttpException, java.io.IOException{
    return (org.apache.http.Header []) null;
  }
  protected abstract org.apache.http.HttpMessage parseHead(org.apache.http.io.SessionInputBuffer arg1) throws java.io.IOException, org.apache.http.HttpException, org.apache.http.ParseException;
}
