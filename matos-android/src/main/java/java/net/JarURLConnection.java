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


public abstract class JarURLConnection
  extends URLConnection{
  // Fields

  protected URLConnection jarFileURLConnection;

  // Constructors

  protected JarURLConnection(URL arg1) throws MalformedURLException{
    super((URL) null);
  }
  // Methods

  public java.security.cert.Certificate [] getCertificates() throws java.io.IOException{
    return (java.security.cert.Certificate []) null;
  }
  public java.util.jar.Attributes getAttributes() throws java.io.IOException{
    return (java.util.jar.Attributes) null;
  }
  public URL getJarFileURL(){
    return (URL) null;
  }
  public java.util.jar.Attributes getMainAttributes() throws java.io.IOException{
    return (java.util.jar.Attributes) null;
  }
  public java.util.jar.Manifest getManifest() throws java.io.IOException{
    return (java.util.jar.Manifest) null;
  }
  public java.util.jar.JarEntry getJarEntry() throws java.io.IOException{
    return (java.util.jar.JarEntry) null;
  }
  public abstract java.util.jar.JarFile getJarFile() throws java.io.IOException;
  public java.lang.String getEntryName(){
    return (java.lang.String) null;
  }
}
