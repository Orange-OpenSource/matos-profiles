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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.longBufferImpl", superClass = "")
public abstract class LongBuffer
  extends Buffer  implements java.lang.Comparable<LongBuffer>
{
  // Constructors

  LongBuffer(int arg1){
    super();
  }
  // Methods

  public abstract long get();
  public LongBuffer get(long [] arg1){
    return (LongBuffer) null;
  }
  public LongBuffer get(long [] arg1, int arg2, int arg3){
    return (LongBuffer) null;
  }
  public abstract long get(int arg1);
  public abstract LongBuffer put(long arg1);
  public final LongBuffer put(long [] arg1){
    return (LongBuffer) null;
  }
  public LongBuffer put(long [] arg1, int arg2, int arg3){
    return (LongBuffer) null;
  }
  public LongBuffer put(LongBuffer arg1){
    return (LongBuffer) null;
  }
  public abstract LongBuffer put(int arg1, long arg2);
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int compareTo(LongBuffer arg1){
    return 0;
  }
  public final long [] array(){
    return (long []) null;
  }
  public final int arrayOffset(){
    return 0;
  }
  public final boolean hasArray(){
    return false;
  }
  public abstract boolean isDirect();
  public static LongBuffer wrap(long [] arg1){
    return (LongBuffer) null;
  }
  public static LongBuffer wrap(long [] arg1, int arg2, int arg3){
    return (LongBuffer) null;
  }
  public static LongBuffer allocate(int arg1){
    return (LongBuffer) null;
  }
  public abstract LongBuffer asReadOnlyBuffer();
  public abstract LongBuffer compact();
  public abstract LongBuffer duplicate();
  public abstract ByteOrder order();
  public abstract LongBuffer slice();
}
