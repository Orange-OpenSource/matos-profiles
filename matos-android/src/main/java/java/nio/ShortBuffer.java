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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.shortBufferImpl", superClass = "")
public abstract class ShortBuffer
  extends Buffer  implements java.lang.Comparable<ShortBuffer>
{
  // Constructors

  ShortBuffer(int arg1){
    super();
  }
  // Methods

  public abstract short get();
  public ShortBuffer get(short [] arg1){
    return (ShortBuffer) null;
  }
  public ShortBuffer get(short [] arg1, int arg2, int arg3){
    return (ShortBuffer) null;
  }
  public abstract short get(int arg1);
  public abstract ShortBuffer put(short arg1);
  public final ShortBuffer put(short [] arg1){
    return (ShortBuffer) null;
  }
  public ShortBuffer put(short [] arg1, int arg2, int arg3){
    return (ShortBuffer) null;
  }
  public ShortBuffer put(ShortBuffer arg1){
    return (ShortBuffer) null;
  }
  public abstract ShortBuffer put(int arg1, short arg2);
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int compareTo(ShortBuffer arg1){
    return 0;
  }
  public final short [] array(){
    return (short []) null;
  }
  public final int arrayOffset(){
    return 0;
  }
  public final boolean hasArray(){
    return false;
  }
  public abstract boolean isDirect();
  public static ShortBuffer wrap(short [] arg1){
    return (ShortBuffer) null;
  }
  public static ShortBuffer wrap(short [] arg1, int arg2, int arg3){
    return (ShortBuffer) null;
  }
  public static ShortBuffer allocate(int arg1){
    return (ShortBuffer) null;
  }
  public abstract ShortBuffer asReadOnlyBuffer();
  public abstract ShortBuffer compact();
  public abstract ShortBuffer duplicate();
  public abstract ByteOrder order();
  public abstract ShortBuffer slice();
}
