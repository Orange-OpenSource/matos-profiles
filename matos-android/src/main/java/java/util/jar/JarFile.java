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


public class JarFile
  extends java.util.zip.ZipFile{
  // Fields

  public static final java.lang.String MANIFEST_NAME = "META-INF/MANIFEST.MF";

  // Constructors

  public JarFile(java.io.File arg1) throws java.io.IOException{
    super((java.io.File) null);
  }
  public JarFile(java.io.File arg1, boolean arg2) throws java.io.IOException{
    super((java.io.File) null);
  }
  public JarFile(java.io.File arg1, boolean arg2, int arg3) throws java.io.IOException{
    super((java.io.File) null);
  }
  public JarFile(java.lang.String arg1) throws java.io.IOException{
    super((java.io.File) null);
  }
  public JarFile(java.lang.String arg1, boolean arg2) throws java.io.IOException{
    super((java.io.File) null);
  }
  // Methods

  public void close() throws java.io.IOException{
  }
  public java.util.zip.ZipEntry getEntry(java.lang.String arg1){
    return (java.util.zip.ZipEntry) null;
  }
  public java.util.Enumeration<JarEntry> entries(){
    return (java.util.Enumeration) null;
  }
  public Manifest getManifest() throws java.io.IOException{
    return (Manifest) null;
  }
  public java.io.InputStream getInputStream(java.util.zip.ZipEntry arg1) throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public JarEntry getJarEntry(java.lang.String arg1){
    return (JarEntry) null;
  }
}
