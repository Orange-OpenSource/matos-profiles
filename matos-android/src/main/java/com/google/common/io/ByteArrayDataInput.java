package com.google.common.io;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ByteArrayDataInputImplem", superClass = "")
public interface ByteArrayDataInput
  extends java.io.DataInput
{
  // Methods

  public java.lang.String readLine();
  public int readInt();
  public char readChar();
  public void readFully(byte [] arg1);
  public void readFully(byte [] arg1, int arg2, int arg3);
  public java.lang.String readUTF();
  public byte readByte();
  public long readLong();
  public short readShort();
  public float readFloat();
  public boolean readBoolean();
  public double readDouble();
  public int readUnsignedByte();
  public int readUnsignedShort();
  public int skipBytes(int arg1);
}
