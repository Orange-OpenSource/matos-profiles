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


public class DataInputStream
  extends FilterInputStream  implements DataInput
{
  // Constructors

  public DataInputStream(InputStream arg1){
    super((InputStream) null);
  }
  // Methods

  public final java.lang.String readLine() throws IOException{
    return (java.lang.String) null;
  }
  public final int readInt() throws IOException{
    return 0;
  }
  public final int read(byte [] arg1) throws IOException{
    return 0;
  }
  public final int read(byte [] arg1, int arg2, int arg3) throws IOException{
    return 0;
  }
  public final char readChar() throws IOException{
    return '\u0000';
  }
  public final void readFully(byte [] arg1) throws IOException{
  }
  public final void readFully(byte [] arg1, int arg2, int arg3) throws IOException{
  }
  public final java.lang.String readUTF() throws IOException{
    return (java.lang.String) null;
  }
  public static final java.lang.String readUTF(DataInput arg1) throws IOException{
    return (java.lang.String) null;
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
  public final float readFloat() throws IOException{
    return 0.0f;
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
  public final int skipBytes(int arg1) throws IOException{
    return 0;
  }
}
