package android.filterfw.core;

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


public class NativeBuffer
{
  // Constructors

  public NativeBuffer(){
  }
  public NativeBuffer(int arg1){
  }
  // Methods

  public int count(){
    return 0;
  }
  public int size(){
    return 0;
  }
  public boolean isReadOnly(){
    return false;
  }
  public NativeBuffer release(){
    return (NativeBuffer) null;
  }
  public NativeBuffer mutableCopy(){
    return (NativeBuffer) null;
  }
  public NativeBuffer retain(){
    return (NativeBuffer) null;
  }
  public int getElementSize(){
    return 0;
  }
  protected void assertReadable(){
  }
  protected void assertWritable(){
  }
}
