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


@com.francetelecom.rd.stubs.annotation.Real(value = "java.util.concurrent.ScheduledFutureImpl", superClass = "")
public abstract class IntBuffer
  extends Buffer  implements java.lang.Comparable<IntBuffer>
{
  // Constructors

  IntBuffer(int arg1){
    super();
  }
  // Methods

  public abstract int get();
  public IntBuffer get(int [] arg1){
    return (IntBuffer) null;
  }
  public IntBuffer get(int [] arg1, int arg2, int arg3){
    return (IntBuffer) null;
  }
  public abstract int get(int arg1);
  public abstract IntBuffer put(int arg1);
  public final IntBuffer put(int [] arg1){
    return (IntBuffer) null;
  }
  public IntBuffer put(int [] arg1, int arg2, int arg3){
    return (IntBuffer) null;
  }
  public IntBuffer put(IntBuffer arg1){
    return (IntBuffer) null;
  }
  public abstract IntBuffer put(int arg1, int arg2);
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int compareTo(IntBuffer arg1){
    return 0;
  }
  public final int [] array(){
    return (int []) null;
  }
  public final int arrayOffset(){
    return 0;
  }
  public final boolean hasArray(){
    return false;
  }
  public abstract boolean isDirect();
  public static IntBuffer wrap(int [] arg1){
    return (IntBuffer) null;
  }
  public static IntBuffer wrap(int [] arg1, int arg2, int arg3){
    return (IntBuffer) null;
  }
  public static IntBuffer allocate(int arg1){
    return (IntBuffer) null;
  }
  public abstract IntBuffer asReadOnlyBuffer();
  public abstract IntBuffer compact();
  public abstract IntBuffer duplicate();
  public abstract ByteOrder order();
  public abstract IntBuffer slice();
}
