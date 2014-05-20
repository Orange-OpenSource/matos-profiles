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


public interface DataOutput
{
  // Methods

  public void write(byte [] arg1) throws IOException;
  public void write(byte [] arg1, int arg2, int arg3) throws IOException;
  public void write(int arg1) throws IOException;
  public void writeInt(int arg1) throws IOException;
  public void writeChar(int arg1) throws IOException;
  public void writeBytes(java.lang.String arg1) throws IOException;
  public void writeUTF(java.lang.String arg1) throws IOException;
  public void writeByte(int arg1) throws IOException;
  public void writeLong(long arg1) throws IOException;
  public void writeShort(int arg1) throws IOException;
  public void writeFloat(float arg1) throws IOException;
  public void writeBoolean(boolean arg1) throws IOException;
  public void writeChars(java.lang.String arg1) throws IOException;
  public void writeDouble(double arg1) throws IOException;
}
