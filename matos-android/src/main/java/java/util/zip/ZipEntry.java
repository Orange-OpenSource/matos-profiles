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


public class ZipEntry
  implements java.lang.Cloneable
{
  // Fields

  public static final int DEFLATED = 8;

  public static final int STORED = 0;

  // Constructors

  public ZipEntry(java.lang.String arg1){
  }
  public ZipEntry(ZipEntry arg1){
  }
  ZipEntry(byte [] arg1, java.io.InputStream arg2) throws java.io.IOException{
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public int getMethod(){
    return 0;
  }
  public long getSize(){
    return 0l;
  }
  public void setSize(long arg1){
  }
  public boolean isDirectory(){
    return false;
  }
  public java.lang.String getComment(){
    return (java.lang.String) null;
  }
  public long getCompressedSize(){
    return 0l;
  }
  public long getCrc(){
    return 0l;
  }
  public byte [] getExtra(){
    return (byte []) null;
  }
  public long getTime(){
    return 0l;
  }
  public void setComment(java.lang.String arg1){
  }
  public void setCompressedSize(long arg1){
  }
  public void setCrc(long arg1){
  }
  public void setExtra(byte [] arg1){
  }
  public void setMethod(int arg1){
  }
  public void setTime(long arg1){
  }
}
