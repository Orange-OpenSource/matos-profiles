package java.io;

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


public final class Console
  implements Flushable
{
  // Constructors

  private Console(InputStream arg1, OutputStream arg2) throws IOException{
  }
  // Methods

  public Console format(java.lang.String arg1, java.lang.Object [] arg2){
    return (Console) null;
  }
  public void flush(){
  }
  public java.lang.String readLine(){
    return (java.lang.String) null;
  }
  public java.lang.String readLine(java.lang.String arg1, java.lang.Object [] arg2){
    return (java.lang.String) null;
  }
  public Console printf(java.lang.String arg1, java.lang.Object [] arg2){
    return (Console) null;
  }
  public PrintWriter writer(){
    return (PrintWriter) null;
  }
  public Reader reader(){
    return (Reader) null;
  }
  public static Console getConsole(){
    return (Console) null;
  }
  public char [] readPassword(){
    return (char []) null;
  }
  public char [] readPassword(java.lang.String arg1, java.lang.Object [] arg2){
    return (char []) null;
  }
}
