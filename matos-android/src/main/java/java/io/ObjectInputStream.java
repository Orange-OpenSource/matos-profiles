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


public class ObjectInputStream
  extends InputStream  implements ObjectStreamConstants, ObjectInput
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ObjectInputStreamGetFieldImplem", superClass = "")
  public abstract static class GetField
  {
    // Constructors

    public GetField(){
    }
    // Methods

    public abstract boolean get(java.lang.String arg1, boolean arg2) throws IOException, java.lang.IllegalArgumentException;
    public abstract char get(java.lang.String arg1, char arg2) throws IOException, java.lang.IllegalArgumentException;
    public abstract byte get(java.lang.String arg1, byte arg2) throws IOException, java.lang.IllegalArgumentException;
    public abstract short get(java.lang.String arg1, short arg2) throws IOException, java.lang.IllegalArgumentException;
    public abstract int get(java.lang.String arg1, int arg2) throws IOException, java.lang.IllegalArgumentException;
    public abstract long get(java.lang.String arg1, long arg2) throws IOException, java.lang.IllegalArgumentException;
    public abstract float get(java.lang.String arg1, float arg2) throws IOException, java.lang.IllegalArgumentException;
    public abstract double get(java.lang.String arg1, double arg2) throws IOException, java.lang.IllegalArgumentException;
    public abstract java.lang.Object get(java.lang.String arg1, java.lang.Object arg2) throws IOException, java.lang.IllegalArgumentException;
    public abstract boolean defaulted(java.lang.String arg1) throws IOException, java.lang.IllegalArgumentException;
    public abstract ObjectStreamClass getObjectStreamClass();
  }
  // Constructors

  protected ObjectInputStream() throws IOException{
    super();
  }
  public ObjectInputStream(InputStream arg1) throws StreamCorruptedException, IOException{
    super();
  }
  // Methods

  protected java.lang.Class<?> resolveClass(ObjectStreamClass arg1) throws IOException, java.lang.ClassNotFoundException{
    return (java.lang.Class) null;
  }
  public void close() throws IOException{
  }
  public java.lang.String readLine() throws IOException{
    return (java.lang.String) null;
  }
  public void defaultReadObject() throws IOException, java.lang.ClassNotFoundException, NotActiveException{
  }
  public int readInt() throws IOException{
    return 0;
  }
  public final java.lang.Object readObject() throws OptionalDataException, java.lang.ClassNotFoundException, IOException{
    return (java.lang.Object) null;
  }
  public ObjectInputStream.GetField readFields() throws IOException, java.lang.ClassNotFoundException, NotActiveException{
    return (ObjectInputStream.GetField) null;
  }
  public int read() throws IOException{
    return 0;
  }
  public int read(byte [] arg1, int arg2, int arg3) throws IOException{
    return 0;
  }
  public char readChar() throws IOException{
    return '\u0000';
  }
  public int available() throws IOException{
    return 0;
  }
  public void readFully(byte [] arg1) throws IOException{
  }
  public void readFully(byte [] arg1, int arg2, int arg3) throws IOException{
  }
  public java.lang.String readUTF() throws IOException{
    return (java.lang.String) null;
  }
  public byte readByte() throws IOException{
    return (byte) 0;
  }
  public long readLong() throws IOException{
    return 0l;
  }
  public short readShort() throws IOException{
    return (short) 0;
  }
  public float readFloat() throws IOException{
    return 0.0f;
  }
  public boolean readBoolean() throws IOException{
    return false;
  }
  public double readDouble() throws IOException{
    return 0.0d;
  }
  public int readUnsignedByte() throws IOException{
    return 0;
  }
  public int readUnsignedShort() throws IOException{
    return 0;
  }
  public int skipBytes(int arg1) throws IOException{
    return 0;
  }
  public java.lang.Object readUnshared() throws IOException, java.lang.ClassNotFoundException{
    return (java.lang.Object) null;
  }
  protected boolean enableResolveObject(boolean arg1){
    return false;
  }
  protected ObjectStreamClass readClassDescriptor() throws IOException, java.lang.ClassNotFoundException{
    return (ObjectStreamClass) null;
  }
  protected java.lang.Class<?> resolveProxyClass(java.lang.String [] arg1) throws IOException, java.lang.ClassNotFoundException{
    return (java.lang.Class) null;
  }
  protected java.lang.Object readObjectOverride() throws OptionalDataException, java.lang.ClassNotFoundException, IOException{
    return (java.lang.Object) null;
  }
  protected void readStreamHeader() throws IOException, StreamCorruptedException{
  }
  public synchronized void registerValidation(ObjectInputValidation arg1, int arg2) throws NotActiveException, InvalidObjectException{
  }
  protected java.lang.Object resolveObject(java.lang.Object arg1) throws IOException{
    return (java.lang.Object) null;
  }
}
