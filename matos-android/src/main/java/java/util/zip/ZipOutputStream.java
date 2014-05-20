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


public class ZipOutputStream
  extends DeflaterOutputStream{
  // Fields

  public static final int DEFLATED = 8;

  public static final int STORED = 0;

  // Constructors

  public ZipOutputStream(java.io.OutputStream arg1){
    super((java.io.OutputStream) null, (Deflater) null);
  }
  // Methods

  public void write(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
  }
  public void close() throws java.io.IOException{
  }
  public void setComment(java.lang.String arg1){
  }
  public void setMethod(int arg1){
  }
  public void finish() throws java.io.IOException{
  }
  public void setLevel(int arg1){
  }
  public void closeEntry() throws java.io.IOException{
  }
  public void putNextEntry(ZipEntry arg1) throws java.io.IOException{
  }
}
