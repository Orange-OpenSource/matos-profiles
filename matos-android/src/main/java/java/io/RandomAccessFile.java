package java.io;

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


public class RandomAccessFile
  implements DataInput, Closeable, DataOutput
{
  // Constructors

  public RandomAccessFile(File arg1, java.lang.String arg2) throws FileNotFoundException{
  }
  public RandomAccessFile(java.lang.String arg1, java.lang.String arg2) throws FileNotFoundException{
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public long length() throws IOException{
    return 0l;
  }
  public void write(byte [] arg1) throws IOException{
  }
  public void write(byte [] arg1, int arg2, int arg3) throws IOException{
  }
  public void write(int arg1) throws IOException{
  }
  public void close() throws IOException{
  }
  public final java.lang.String readLine() throws IOException{
    return (java.lang.String) null;
  }
  public final int readInt() throws IOException{
    return 0;
  }
  public final void writeInt(int arg1) throws IOException{
  }
  public void setLength(long arg1) throws IOException{
  }
  public int read() throws IOException{
    return 0;
  }
  public int read(byte [] arg1) throws IOException{
    return 0;
  }
  public int read(byte [] arg1, int arg2, int arg3) throws IOException{
    return 0;
  }
  public final char readChar() throws IOException{
    return '\u0000';
  }
  public final void writeChar(int arg1) throws IOException{
  }
  public final synchronized java.nio.channels.FileChannel getChannel(){
    return (java.nio.channels.FileChannel) null;
  }
  public final FileDescriptor getFD() throws IOException{
    return (FileDescriptor) null;
  }
  public final void writeBytes(java.lang.String arg1) throws IOException{
  }
  public final void readFully(byte [] arg1) throws IOException{
  }
  public final void readFully(byte [] arg1, int arg2, int arg3) throws IOException{
  }
  public final java.lang.String readUTF() throws IOException{
    return (java.lang.String) null;
  }
  public final void writeUTF(java.lang.String arg1) throws IOException{
  }
  public final byte readByte() throws IOException{
    return (byte) 0;
  }
  public final long readLong() throws IOException{
    return 0l;
  }
  public final short readShort() throws IOException{
    return (short) 0;
  }
  public final void writeByte(int arg1) throws IOException{
  }
  public final void writeLong(long arg1) throws IOException{
  }
  public final void writeShort(int arg1) throws IOException{
  }
  public final float readFloat() throws IOException{
    return 0.0f;
  }
  public final void writeFloat(float arg1) throws IOException{
  }
  public final boolean readBoolean() throws IOException{
    return false;
  }
  public final double readDouble() throws IOException{
    return 0.0d;
  }
  public final int readUnsignedByte() throws IOException{
    return 0;
  }
  public final int readUnsignedShort() throws IOException{
    return 0;
  }
  public int skipBytes(int arg1) throws IOException{
    return 0;
  }
  public final void writeBoolean(boolean arg1) throws IOException{
  }
  public final void writeChars(java.lang.String arg1) throws IOException{
  }
  public final void writeDouble(double arg1) throws IOException{
  }
  public void seek(long arg1) throws IOException{
  }
  public long getFilePointer() throws IOException{
    return 0l;
  }
}
