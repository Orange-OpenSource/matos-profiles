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


public final class ByteOrder
{
  // Fields

  public static final ByteOrder BIG_ENDIAN = null;

  public static final ByteOrder LITTLE_ENDIAN = null;

  public final boolean needsSwap = false;

  // Constructors

  private ByteOrder(java.lang.String arg1, boolean arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static ByteOrder nativeOrder(){
    return (ByteOrder) null;
  }
}
