package java.util.zip;

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


public class ZipFile
{
  // Fields

  public static final int OPEN_READ = 1;

  public static final int OPEN_DELETE = 4;

  // Constructors

  public ZipFile(java.io.File arg1) throws ZipException, java.io.IOException{
  }
  public ZipFile(java.io.File arg1, int arg2) throws java.io.IOException{
  }
  public ZipFile(java.lang.String arg1) throws java.io.IOException{
  }
  // Methods

  protected void finalize() throws java.io.IOException{
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public int size(){
    return 0;
  }
  public void close() throws java.io.IOException{
  }
  public ZipEntry getEntry(java.lang.String arg1){
    return (ZipEntry) null;
  }
  public java.util.Enumeration<? extends ZipEntry> entries(){
    return (java.util.Enumeration) null;
  }
  public java.io.InputStream getInputStream(ZipEntry arg1) throws java.io.IOException{
    return (java.io.InputStream) null;
  }
}
