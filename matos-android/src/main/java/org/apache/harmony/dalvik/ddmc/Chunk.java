package org.apache.harmony.dalvik.ddmc;

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
public class Chunk
{
  // Fields

  public int type;

  public byte [] data;

  public int offset;

  public int length;

  // Constructors

  public Chunk(){
  }
  public Chunk(int arg1, byte [] arg2, int arg3, int arg4){
  }
  public Chunk(int arg1, java.nio.ByteBuffer arg2){
  }
}
