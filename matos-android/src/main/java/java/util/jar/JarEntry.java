package java.util.jar;

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


public class JarEntry
  extends java.util.zip.ZipEntry{
  // Constructors

  public JarEntry(java.lang.String arg1){
    super((java.lang.String) null);
  }
  public JarEntry(java.util.zip.ZipEntry arg1){
    super((java.lang.String) null);
  }
  public JarEntry(JarEntry arg1){
    super((java.lang.String) null);
  }
  // Methods

  public java.security.cert.Certificate [] getCertificates(){
    return (java.security.cert.Certificate []) null;
  }
  public Attributes getAttributes() throws java.io.IOException{
    return (Attributes) null;
  }
  public java.security.CodeSigner [] getCodeSigners(){
    return (java.security.CodeSigner []) null;
  }
}
