package libcore.io;

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
public abstract class BufferIterator
{
  // Constructors

  public BufferIterator(){
  }
  // Methods

  public abstract int readInt();
  public abstract void skip(int arg1);
  public abstract byte readByte();
  public abstract short readShort();
  public abstract void readIntArray(int [] arg1, int arg2, int arg3);
  public abstract void seek(int arg1);
  public abstract void readByteArray(byte [] arg1, int arg2, int arg3);
}
