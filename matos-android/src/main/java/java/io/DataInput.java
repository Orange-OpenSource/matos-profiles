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


public interface DataInput
{
  // Methods

  public java.lang.String readLine() throws IOException;
  public int readInt() throws IOException;
  public char readChar() throws IOException;
  public void readFully(byte [] arg1) throws IOException;
  public void readFully(byte [] arg1, int arg2, int arg3) throws IOException;
  public java.lang.String readUTF() throws IOException;
  public byte readByte() throws IOException;
  public long readLong() throws IOException;
  public short readShort() throws IOException;
  public float readFloat() throws IOException;
  public boolean readBoolean() throws IOException;
  public double readDouble() throws IOException;
  public int readUnsignedByte() throws IOException;
  public int readUnsignedShort() throws IOException;
  public int skipBytes(int arg1) throws IOException;
}
