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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ByteArrayDataOutputImplem", superClass = "")
public interface ByteArrayDataOutput
  extends java.io.DataOutput
{
  // Methods

  public void write(int arg1);
  public void write(byte [] arg1);
  public void write(byte [] arg1, int arg2, int arg3);
  public void writeInt(int arg1);
  public void writeChar(int arg1);
  public byte [] toByteArray();
  public void writeBytes(java.lang.String arg1);
  public void writeUTF(java.lang.String arg1);
  public void writeByte(int arg1);
  public void writeLong(long arg1);
  public void writeShort(int arg1);
  public void writeFloat(float arg1);
  public void writeBoolean(boolean arg1);
  public void writeChars(java.lang.String arg1);
  public void writeDouble(double arg1);
}
