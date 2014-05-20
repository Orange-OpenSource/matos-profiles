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


public class JarInputStream
  extends java.util.zip.ZipInputStream{
  // Constructors

  public JarInputStream(java.io.InputStream arg1, boolean arg2) throws java.io.IOException{
    super((java.io.InputStream) null);
  }
  public JarInputStream(java.io.InputStream arg1) throws java.io.IOException{
    super((java.io.InputStream) null);
  }
  // Methods

  public int read(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
    return 0;
  }
  public Manifest getManifest(){
    return (Manifest) null;
  }
  public java.util.zip.ZipEntry getNextEntry() throws java.io.IOException{
    return (java.util.zip.ZipEntry) null;
  }
  protected java.util.zip.ZipEntry createZipEntry(java.lang.String arg1){
    return (java.util.zip.ZipEntry) null;
  }
  public JarEntry getNextJarEntry() throws java.io.IOException{
    return (JarEntry) null;
  }
}
