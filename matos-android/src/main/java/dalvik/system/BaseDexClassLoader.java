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


public class BaseDexClassLoader
  extends java.lang.ClassLoader{
  // Constructors

  public BaseDexClassLoader(java.lang.String arg1, java.io.File arg2, java.lang.String arg3, java.lang.ClassLoader arg4){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  protected synchronized java.lang.Package getPackage(java.lang.String arg1){
    return (java.lang.Package) null;
  }
  protected java.lang.Class<?> findClass(java.lang.String arg1) throws java.lang.ClassNotFoundException{
    return (java.lang.Class) null;
  }
  public java.lang.String findLibrary(java.lang.String arg1){
    return (java.lang.String) null;
  }
  protected java.net.URL findResource(java.lang.String arg1){
    return (java.net.URL) null;
  }
  protected java.util.Enumeration<java.net.URL> findResources(java.lang.String arg1){
    return (java.util.Enumeration) null;
  }
}
