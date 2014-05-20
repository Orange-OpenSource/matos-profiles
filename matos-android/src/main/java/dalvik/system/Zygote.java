package dalvik.system;

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


public class Zygote
{
  // Fields

  public static final int DEBUG_ENABLE_DEBUGGER = 1;

  public static final int DEBUG_ENABLE_CHECKJNI = 2;

  public static final int DEBUG_ENABLE_ASSERT = 4;

  public static final int DEBUG_ENABLE_SAFEMODE = 8;

  public static final int DEBUG_ENABLE_JNI_LOGGING = 16;

  public static boolean systemInSafeMode;

  // Constructors

  private Zygote(){
  }
  // Methods

  public static int fork(){
    return 0;
  }
  public static int nativeFork(){
    return 0;
  }
  public static int forkAndSpecialize(int arg1, int arg2, int [] arg3, int arg4, int [] [] arg5){
    return 0;
  }
  public static int forkAndSpecialize(int arg1, int arg2, int [] arg3, boolean arg4, int [] [] arg5){
    return 0;
  }
  public static int nativeForkAndSpecialize(int arg1, int arg2, int [] arg3, int arg4, int [] [] arg5){
    return 0;
  }
  public static int forkSystemServer(int arg1, int arg2, int [] arg3, int arg4, int [] [] arg5, long arg6, long arg7){
    return 0;
  }
  public static int forkSystemServer(int arg1, int arg2, int [] arg3, boolean arg4, int [] [] arg5){
    return 0;
  }
  public static int nativeForkSystemServer(int arg1, int arg2, int [] arg3, int arg4, int [] [] arg5, long arg6, long arg7){
    return 0;
  }
  public static void execShell(java.lang.String arg1){
  }
  public static void appendQuotedShellArgs(java.lang.StringBuilder arg1, java.lang.String [] arg2){
  }
}
