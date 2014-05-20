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


public class DeflaterOutputStream
  extends java.io.FilterOutputStream{
  // Fields

  protected byte [] buf;

  protected Deflater def;

  // Constructors

  public DeflaterOutputStream(java.io.OutputStream arg1, Deflater arg2){
    super((java.io.OutputStream) null);
  }
  public DeflaterOutputStream(java.io.OutputStream arg1){
    super((java.io.OutputStream) null);
  }
  public DeflaterOutputStream(java.io.OutputStream arg1, Deflater arg2, int arg3){
    super((java.io.OutputStream) null);
  }
  public DeflaterOutputStream(java.io.OutputStream arg1, boolean arg2){
    super((java.io.OutputStream) null);
  }
  public DeflaterOutputStream(java.io.OutputStream arg1, Deflater arg2, boolean arg3){
    super((java.io.OutputStream) null);
  }
  public DeflaterOutputStream(java.io.OutputStream arg1, Deflater arg2, int arg3, boolean arg4){
    super((java.io.OutputStream) null);
  }
  // Methods

  public void write(int arg1) throws java.io.IOException{
  }
  public void write(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
  }
  public void close() throws java.io.IOException{
  }
  public void flush() throws java.io.IOException{
  }
  public void finish() throws java.io.IOException{
  }
  protected void deflate() throws java.io.IOException{
  }
}
