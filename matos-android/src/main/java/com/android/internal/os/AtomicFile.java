package com.android.internal.os;

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


public class AtomicFile
{
  // Constructors

  public AtomicFile(java.io.File arg1){
  }
  // Methods

  public java.io.FileOutputStream openAppend() throws java.io.IOException{
    return (java.io.FileOutputStream) null;
  }
  public byte [] readFully() throws java.io.IOException{
    return (byte []) null;
  }
  public void truncate() throws java.io.IOException{
  }
  public java.io.File getBaseFile(){
    return (java.io.File) null;
  }
  public java.io.FileOutputStream startWrite() throws java.io.IOException{
    return (java.io.FileOutputStream) null;
  }
  public void finishWrite(java.io.FileOutputStream arg1){
  }
  public void failWrite(java.io.FileOutputStream arg1){
  }
  public java.io.FileInputStream openRead() throws java.io.FileNotFoundException{
    return (java.io.FileInputStream) null;
  }
}
