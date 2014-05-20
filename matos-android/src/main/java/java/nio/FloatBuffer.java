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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.floatBufferImpl", superClass = "")
public abstract class FloatBuffer
  extends Buffer  implements java.lang.Comparable<FloatBuffer>
{
  // Constructors

  FloatBuffer(int arg1){
    super();
  }
  // Methods

  public abstract float get();
  public FloatBuffer get(float [] arg1){
    return (FloatBuffer) null;
  }
  public FloatBuffer get(float [] arg1, int arg2, int arg3){
    return (FloatBuffer) null;
  }
  public abstract float get(int arg1);
  public abstract FloatBuffer put(float arg1);
  public final FloatBuffer put(float [] arg1){
    return (FloatBuffer) null;
  }
  public FloatBuffer put(float [] arg1, int arg2, int arg3){
    return (FloatBuffer) null;
  }
  public FloatBuffer put(FloatBuffer arg1){
    return (FloatBuffer) null;
  }
  public abstract FloatBuffer put(int arg1, float arg2);
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int compareTo(FloatBuffer arg1){
    return 0;
  }
  public final float [] array(){
    return (float []) null;
  }
  public final int arrayOffset(){
    return 0;
  }
  public final boolean hasArray(){
    return false;
  }
  public abstract boolean isDirect();
  public static FloatBuffer wrap(float [] arg1){
    return (FloatBuffer) null;
  }
  public static FloatBuffer wrap(float [] arg1, int arg2, int arg3){
    return (FloatBuffer) null;
  }
  public static FloatBuffer allocate(int arg1){
    return (FloatBuffer) null;
  }
  public abstract FloatBuffer asReadOnlyBuffer();
  public abstract FloatBuffer compact();
  public abstract FloatBuffer duplicate();
  public abstract ByteOrder order();
  public abstract FloatBuffer slice();
}
