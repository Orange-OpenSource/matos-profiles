package android.content.res;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class AssetFileDescriptor
  implements android.os.Parcelable
{
  // Classes

  public static class AutoCloseInputStream
    extends android.os.ParcelFileDescriptor.AutoCloseInputStream  {
    // Constructors

    public AutoCloseInputStream(AssetFileDescriptor arg1) throws java.io.IOException{
      super((android.os.ParcelFileDescriptor) null);
    }
    // Methods

    public void mark(int arg1){
    }
    public synchronized void reset() throws java.io.IOException{
    }
    public int read() throws java.io.IOException{
      return 0;
    }
    public int read(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
      return 0;
    }
    public int read(byte [] arg1) throws java.io.IOException{
      return 0;
    }
    public int available() throws java.io.IOException{
      return 0;
    }
    public long skip(long arg1) throws java.io.IOException{
      return 0l;
    }
    public boolean markSupported(){
      return false;
    }
  }
  public static class AutoCloseOutputStream
    extends android.os.ParcelFileDescriptor.AutoCloseOutputStream  {
    // Constructors

    public AutoCloseOutputStream(AssetFileDescriptor arg1) throws java.io.IOException{
      super((android.os.ParcelFileDescriptor) null);
    }
    // Methods

    public void write(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
    }
    public void write(byte [] arg1) throws java.io.IOException{
    }
    public void write(int arg1) throws java.io.IOException{
    }
  }
  // Fields

  public static final long UNKNOWN_LENGTH = -1l;

  public static final android.os.Parcelable.Creator<AssetFileDescriptor> CREATOR = null;

  // Constructors

  public AssetFileDescriptor(android.os.ParcelFileDescriptor arg1, long arg2, long arg3){
  }
  AssetFileDescriptor(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public long getLength(){
    return 0l;
  }
  public void close() throws java.io.IOException{
  }
  public java.io.FileDescriptor getFileDescriptor(){
    return (java.io.FileDescriptor) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public long getStartOffset(){
    return 0l;
  }
  public java.io.FileInputStream createInputStream() throws java.io.IOException{
    return (java.io.FileInputStream) null;
  }
  public java.io.FileOutputStream createOutputStream() throws java.io.IOException{
    return (java.io.FileOutputStream) null;
  }
  public long getDeclaredLength(){
    return 0l;
  }
  public android.os.ParcelFileDescriptor getParcelFileDescriptor(){
    return (android.os.ParcelFileDescriptor) null;
  }
}
