package android.os;

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
public class ParcelFileDescriptor
  implements Parcelable
{
  // Classes

  public static class AutoCloseInputStream
    extends java.io.FileInputStream  {
    // Constructors

    public AutoCloseInputStream(ParcelFileDescriptor arg1){
      super((java.io.FileDescriptor) null);
    }
    // Methods

    public void close() throws java.io.IOException{
    }
  }
  public static class AutoCloseOutputStream
    extends java.io.FileOutputStream  {
    // Constructors

    public AutoCloseOutputStream(ParcelFileDescriptor arg1){
      super((java.io.FileDescriptor) null);
    }
    // Methods

    public void close() throws java.io.IOException{
    }
  }
  // Fields

  public static final int MODE_WORLD_READABLE = 1;

  public static final int MODE_WORLD_WRITEABLE = 2;

  public static final int MODE_READ_ONLY = 268435456;

  public static final int MODE_WRITE_ONLY = 536870912;

  public static final int MODE_READ_WRITE = 805306368;

  public static final int MODE_CREATE = 134217728;

  public static final int MODE_TRUNCATE = 67108864;

  public static final int MODE_APPEND = 33554432;

  public static final Parcelable.Creator<ParcelFileDescriptor> CREATOR = null;

  // Constructors

  public ParcelFileDescriptor(ParcelFileDescriptor arg1){
  }
  ParcelFileDescriptor(java.io.FileDescriptor arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void close() throws java.io.IOException{
  }
  public static ParcelFileDescriptor open(java.io.File arg1, int arg2) throws java.io.FileNotFoundException{
    return (ParcelFileDescriptor) null;
  }
  public static ParcelFileDescriptor dup(java.io.FileDescriptor arg1) throws java.io.IOException{
    return (ParcelFileDescriptor) null;
  }
  public ParcelFileDescriptor dup() throws java.io.IOException{
    return (ParcelFileDescriptor) null;
  }
  public java.io.FileDescriptor getFileDescriptor(){
    return (java.io.FileDescriptor) null;
  }
  public void writeToParcel(Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public long seekTo(long arg1){
    return 0l;
  }
  public static ParcelFileDescriptor fromFd(int arg1) throws java.io.IOException{
    return (ParcelFileDescriptor) null;
  }
  public static ParcelFileDescriptor adoptFd(int arg1){
    return (ParcelFileDescriptor) null;
  }
  public static ParcelFileDescriptor fromSocket(java.net.Socket arg1){
    return (ParcelFileDescriptor) null;
  }
  public static ParcelFileDescriptor fromDatagramSocket(java.net.DatagramSocket arg1){
    return (ParcelFileDescriptor) null;
  }
  public static ParcelFileDescriptor [] createPipe() throws java.io.IOException{
    return (ParcelFileDescriptor []) null;
  }
  @java.lang.Deprecated
  public static ParcelFileDescriptor fromData(byte [] arg1, java.lang.String arg2) throws java.io.IOException{
    return (ParcelFileDescriptor) null;
  }
  public long getStatSize(){
    return 0l;
  }
  public int getFd(){
    return 0;
  }
  public int detachFd(){
    return 0;
  }
}
