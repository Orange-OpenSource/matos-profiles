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


public class ObjectOutputStream
  extends OutputStream  implements ObjectOutput, ObjectStreamConstants
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ObjectOutputStreamPutFieldImplem", superClass = "")
  public abstract static class PutField
  {
    // Constructors

    public PutField(){
    }
    // Methods

    public abstract void put(java.lang.String arg1, boolean arg2);
    public abstract void put(java.lang.String arg1, char arg2);
    public abstract void put(java.lang.String arg1, byte arg2);
    public abstract void put(java.lang.String arg1, short arg2);
    public abstract void put(java.lang.String arg1, int arg2);
    public abstract void put(java.lang.String arg1, long arg2);
    public abstract void put(java.lang.String arg1, float arg2);
    public abstract void put(java.lang.String arg1, double arg2);
    public abstract void put(java.lang.String arg1, java.lang.Object arg2);
    public abstract void write(ObjectOutput arg1) throws IOException;
  }
  // Constructors

  protected ObjectOutputStream() throws IOException{
    super();
  }
  public ObjectOutputStream(OutputStream arg1) throws IOException{
    super();
  }
  // Methods

  public void write(byte [] arg1, int arg2, int arg3) throws IOException{
  }
  public void write(int arg1) throws IOException{
  }
  public final void writeObject(java.lang.Object arg1) throws IOException{
  }
  public void defaultWriteObject() throws IOException{
  }
  public void close() throws IOException{
  }
  public void flush() throws IOException{
  }
  public void writeInt(int arg1) throws IOException{
  }
  public ObjectOutputStream.PutField putFields() throws IOException{
    return (ObjectOutputStream.PutField) null;
  }
  public void writeFields() throws IOException{
  }
  public void reset() throws IOException{
  }
  public void writeChar(int arg1) throws IOException{
  }
  public void writeBytes(java.lang.String arg1) throws IOException{
  }
  public void writeUTF(java.lang.String arg1) throws IOException{
  }
  public void writeByte(int arg1) throws IOException{
  }
  public void writeLong(long arg1) throws IOException{
  }
  public void writeShort(int arg1) throws IOException{
  }
  public void writeFloat(float arg1) throws IOException{
  }
  public void writeBoolean(boolean arg1) throws IOException{
  }
  public void writeChars(java.lang.String arg1) throws IOException{
  }
  public void writeDouble(double arg1) throws IOException{
  }
  protected void drain() throws IOException{
  }
  protected void annotateClass(java.lang.Class<?> arg1) throws IOException{
  }
  protected void annotateProxyClass(java.lang.Class<?> arg1) throws IOException{
  }
  protected boolean enableReplaceObject(boolean arg1){
    return false;
  }
  protected java.lang.Object replaceObject(java.lang.Object arg1) throws IOException{
    return (java.lang.Object) null;
  }
  public void useProtocolVersion(int arg1) throws IOException{
  }
  protected void writeClassDescriptor(ObjectStreamClass arg1) throws IOException{
  }
  public void writeUnshared(java.lang.Object arg1) throws IOException{
  }
  protected void writeObjectOverride(java.lang.Object arg1) throws IOException{
  }
  protected void writeStreamHeader() throws IOException{
  }
}
