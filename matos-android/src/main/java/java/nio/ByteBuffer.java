package java.nio;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.byteBufferImpl", superClass = "")
public abstract class ByteBuffer
  extends Buffer  implements java.lang.Comparable<ByteBuffer>
{
  // Constructors

  public ByteBuffer(){
    super();
  }
  // Methods

  public abstract byte get();
  public ByteBuffer get(byte [] arg1){
    return (ByteBuffer) null;
  }
  public ByteBuffer get(byte [] arg1, int arg2, int arg3){
    return (ByteBuffer) null;
  }
  public abstract byte get(int arg1);
  public abstract ByteBuffer put(byte arg1);
  public final ByteBuffer put(byte [] arg1){
    return (ByteBuffer) null;
  }
  public ByteBuffer put(byte [] arg1, int arg2, int arg3){
    return (ByteBuffer) null;
  }
  public ByteBuffer put(ByteBuffer arg1){
    return (ByteBuffer) null;
  }
  public abstract ByteBuffer put(int arg1, byte arg2);
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int compareTo(ByteBuffer arg1){
    return 0;
  }
  public abstract short getShort();
  public abstract short getShort(int arg1);
  public abstract ByteBuffer putShort(short arg1);
  public abstract ByteBuffer putShort(int arg1, short arg2);
  public abstract char getChar();
  public abstract char getChar(int arg1);
  public abstract ByteBuffer putChar(char arg1);
  public abstract ByteBuffer putChar(int arg1, char arg2);
  public abstract int getInt();
  public abstract int getInt(int arg1);
  public abstract ByteBuffer putInt(int arg1);
  public abstract ByteBuffer putInt(int arg1, int arg2);
  public abstract long getLong();
  public abstract long getLong(int arg1);
  public abstract ByteBuffer putLong(long arg1);
  public abstract ByteBuffer putLong(int arg1, long arg2);
  public abstract float getFloat();
  public abstract float getFloat(int arg1);
  public abstract ByteBuffer putFloat(float arg1);
  public abstract ByteBuffer putFloat(int arg1, float arg2);
  public abstract double getDouble();
  public abstract double getDouble(int arg1);
  public abstract ByteBuffer putDouble(double arg1);
  public abstract ByteBuffer putDouble(int arg1, double arg2);
  public final byte [] array(){
    return (byte []) null;
  }
  public final int arrayOffset(){
    return 0;
  }
  public final boolean hasArray(){
    return false;
  }
  public abstract boolean isDirect();
  public static ByteBuffer wrap(byte [] arg1){
    return (ByteBuffer) null;
  }
  public static ByteBuffer wrap(byte [] arg1, int arg2, int arg3){
    return (ByteBuffer) null;
  }
  public static ByteBuffer allocate(int arg1){
    return (ByteBuffer) null;
  }
  public static ByteBuffer allocateDirect(int arg1){
    return (ByteBuffer) null;
  }
  public abstract CharBuffer asCharBuffer();
  public abstract DoubleBuffer asDoubleBuffer();
  public abstract FloatBuffer asFloatBuffer();
  public abstract IntBuffer asIntBuffer();
  public abstract LongBuffer asLongBuffer();
  public abstract ByteBuffer asReadOnlyBuffer();
  public abstract ShortBuffer asShortBuffer();
  public abstract ByteBuffer compact();
  public abstract ByteBuffer duplicate();
  public final ByteOrder order(){
    return (ByteOrder) null;
  }
  public final ByteBuffer order(ByteOrder arg1){
    return (ByteBuffer) null;
  }
  public abstract ByteBuffer slice();
}
