package dalvik.system.profiler;

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


public final class BinaryHprof
{
  // Classes

  public static enum ControlSettings
  {
    // Enum Constants

    ALLOC_TRACES()
, CPU_SAMPLING()
;
    // Fields

    public final int bitmask = 0;

    // Constructors

    private ControlSettings(){
    }
    // Methods

  }
  public static enum Tag
  {
    // Enum Constants

    STRING_IN_UTF8()
, LOAD_CLASS()
, UNLOAD_CLASS()
, STACK_FRAME()
, STACK_TRACE()
, ALLOC_SITES()
, HEAP_SUMMARY()
, START_THREAD()
, END_THREAD()
, HEAP_DUMP()
, HEAP_DUMP_SEGMENT()
, HEAP_DUMP_END()
, CPU_SAMPLES()
, CONTROL_SETTINGS()
;
    // Fields

    public final byte tag = (byte) 0;

    public final int minimumSize = 0;

    public final int maximumSize = 0;

    // Constructors

    private Tag(){
    }
    // Methods

    public static BinaryHprof.Tag get(byte arg1){
      return (BinaryHprof.Tag) null;
    }
    public java.lang.String checkSize(int arg1){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final int ID_SIZE = 0;

  // Constructors

  public BinaryHprof(){
  }
  // Methods

  public static final java.lang.String readMagic(java.io.DataInputStream arg1){
    return (java.lang.String) null;
  }
}
