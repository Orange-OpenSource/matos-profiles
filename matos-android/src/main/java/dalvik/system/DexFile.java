package dalvik.system;

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


public final class DexFile
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DexFile-1", pos = 1, report = "-")
  public DexFile(java.io.File arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DexFile-2", pos = 1, report = "-")
  public DexFile(java.lang.String arg1) throws java.io.IOException{
  }
  
  private DexFile(java.lang.String arg1, java.lang.String arg2, int arg3) throws java.io.IOException{
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public java.lang.Class loadClass(java.lang.String arg1, java.lang.ClassLoader arg2){
    return (java.lang.Class) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void close() throws java.io.IOException{
  }
  public java.util.Enumeration<java.lang.String> entries(){
    return (java.util.Enumeration) null;
  }
  public static boolean isDexOptNeeded(java.lang.String arg1) throws java.io.FileNotFoundException, java.io.IOException{
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DexFile.loadDex", pos = {1, 2, 3}, report = "-")
  public static DexFile loadDex(java.lang.String arg1, java.lang.String arg2, int arg3) throws java.io.IOException{
    return (DexFile) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DexFile.loadClassBinaryName", pos = {1, 2}, report = "-")
  public java.lang.Class loadClassBinaryName(java.lang.String arg1, java.lang.ClassLoader arg2){
    return (java.lang.Class) null;
  }
}
