package org.apache.http.io;

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
public interface SessionOutputBuffer
{
  // Methods

  public void write(byte [] arg1, int arg2, int arg3) throws java.io.IOException;
  public void write(byte [] arg1) throws java.io.IOException;
  public void write(int arg1) throws java.io.IOException;
  public void flush() throws java.io.IOException;
  public HttpTransportMetrics getMetrics();
  public void writeLine(java.lang.String arg1) throws java.io.IOException;
  public void writeLine(org.apache.http.util.CharArrayBuffer arg1) throws java.io.IOException;
}
