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


public class JarOutputStream
  extends java.util.zip.ZipOutputStream{
  // Constructors

  public JarOutputStream(java.io.OutputStream arg1, Manifest arg2) throws java.io.IOException{
    super((java.io.OutputStream) null);
  }
  public JarOutputStream(java.io.OutputStream arg1) throws java.io.IOException{
    super((java.io.OutputStream) null);
  }
  // Methods

  public void putNextEntry(java.util.zip.ZipEntry arg1) throws java.io.IOException{
  }
}
