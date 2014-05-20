package junit.runner;

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


public class TestCaseClassLoader
  extends java.lang.ClassLoader{
  // Constructors

  public TestCaseClassLoader(){
    super();
  }
  public TestCaseClassLoader(java.lang.String arg1){
    super();
  }
  // Methods

  public synchronized java.lang.Class loadClass(java.lang.String arg1, boolean arg2) throws java.lang.ClassNotFoundException{
    return (java.lang.Class) null;
  }
  public java.net.URL getResource(java.lang.String arg1){
    return (java.net.URL) null;
  }
  public java.io.InputStream getResourceAsStream(java.lang.String arg1){
    return (java.io.InputStream) null;
  }
  public boolean isExcluded(java.lang.String arg1){
    return false;
  }
}
