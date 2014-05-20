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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.doubleBufferImpl", superClass = "")
public abstract class DoubleBuffer
  extends Buffer  implements java.lang.Comparable<DoubleBuffer>
{
  // Constructors

  public DoubleBuffer(){
    super();
  }
  // Methods

  public abstract double get();
  public DoubleBuffer get(double [] arg1){
    return (DoubleBuffer) null;
  }
  public DoubleBuffer get(double [] arg1, int arg2, int arg3){
    return (DoubleBuffer) null;
  }
  public abstract double get(int arg1);
  public abstract DoubleBuffer put(double arg1);
  public final DoubleBuffer put(double [] arg1){
    return (DoubleBuffer) null;
  }
  public DoubleBuffer put(double [] arg1, int arg2, int arg3){
    return (DoubleBuffer) null;
  }
  public DoubleBuffer put(DoubleBuffer arg1){
    return (DoubleBuffer) null;
  }
  public abstract DoubleBuffer put(int arg1, double arg2);
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int compareTo(DoubleBuffer arg1){
    return 0;
  }
  public final double [] array(){
    return (double []) null;
  }
  public final int arrayOffset(){
    return 0;
  }
  public final boolean hasArray(){
    return false;
  }
  public abstract boolean isDirect();
  public static DoubleBuffer wrap(double [] arg1){
    return (DoubleBuffer) null;
  }
  public static DoubleBuffer wrap(double [] arg1, int arg2, int arg3){
    return (DoubleBuffer) null;
  }
  public static DoubleBuffer allocate(int arg1){
    return (DoubleBuffer) null;
  }
  public abstract DoubleBuffer asReadOnlyBuffer();
  public abstract DoubleBuffer compact();
  public abstract DoubleBuffer duplicate();
  public abstract ByteOrder order();
  public abstract DoubleBuffer slice();
}
