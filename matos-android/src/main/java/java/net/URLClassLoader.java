package java.net;

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


public class URLClassLoader
  extends java.security.SecureClassLoader{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URLClassLoader-1", pos = {0, 1}, report = "-")
  public URLClassLoader(URL [] arg1){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URLClassLoader-2", pos = {0, 1}, report = "-")
  public URLClassLoader(URL [] arg1, java.lang.ClassLoader arg2){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URLClassLoader-3", pos = {0, 1}, report = "-")
  public URLClassLoader(URL [] arg1, java.lang.ClassLoader arg2, URLStreamHandlerFactory arg3){
    super();
  }
  // Methods

  public static URLClassLoader newInstance(URL [] arg1){
    return (URLClassLoader) null;
  }
  public static URLClassLoader newInstance(URL [] arg1, java.lang.ClassLoader arg2){
    return (URLClassLoader) null;
  }
  protected java.lang.Package definePackage(java.lang.String arg1, java.util.jar.Manifest arg2, URL arg3) throws java.lang.IllegalArgumentException{
    return (java.lang.Package) null;
  }
  protected java.lang.Class<?> findClass(java.lang.String arg1) throws java.lang.ClassNotFoundException{
    return (java.lang.Class) null;
  }
  public URL findResource(java.lang.String arg1){
    return (URL) null;
  }
  public java.util.Enumeration<URL> findResources(java.lang.String arg1) throws java.io.IOException{
    return (java.util.Enumeration) null;
  }
  protected java.security.PermissionCollection getPermissions(java.security.CodeSource arg1){
    return (java.security.PermissionCollection) null;
  }
  protected void addURL(URL arg1){
  }
  public URL [] getURLs(){
    return (URL []) null;
  }
}
