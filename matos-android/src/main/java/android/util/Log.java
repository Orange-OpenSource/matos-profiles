package android.util;

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
public final class Log
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.LogTerribleFailureHandlerImplem", superClass = "")
  public static interface TerribleFailureHandler
  {
  }
  // Fields

  public static final int VERBOSE = 2;

  public static final int DEBUG = 3;

  public static final int INFO = 4;

  public static final int WARN = 5;

  public static final int ERROR = 6;

  public static final int ASSERT = 7;

  public static final int LOG_ID_MAIN = 0;

  public static final int LOG_ID_RADIO = 1;

  public static final int LOG_ID_EVENTS = 2;

  public static final int LOG_ID_SYSTEM = 3;

  // Constructors

  private Log(){
  }
  // Methods

  public static int println(int arg1, java.lang.String arg2, java.lang.String arg3){
    return 0;
  }
  public static int i(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public static int i(java.lang.String arg1, java.lang.String arg2, java.lang.Throwable arg3){
    return 0;
  }
  public static int e(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public static int e(java.lang.String arg1, java.lang.String arg2, java.lang.Throwable arg3){
    return 0;
  }
  public static int v(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public static int v(java.lang.String arg1, java.lang.String arg2, java.lang.Throwable arg3){
    return 0;
  }
  public static boolean isLoggable(java.lang.String arg1, int arg2){
    return false;
  }
  public static int w(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public static int w(java.lang.String arg1, java.lang.String arg2, java.lang.Throwable arg3){
    return 0;
  }
  public static int w(java.lang.String arg1, java.lang.Throwable arg2){
    return 0;
  }
  public static int d(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public static int d(java.lang.String arg1, java.lang.String arg2, java.lang.Throwable arg3){
    return 0;
  }
  public static java.lang.String getStackTraceString(java.lang.Throwable arg1){
    return (java.lang.String) null;
  }
  public static int wtf(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public static int wtf(java.lang.String arg1, java.lang.Throwable arg2){
    return 0;
  }
  public static int wtf(java.lang.String arg1, java.lang.String arg2, java.lang.Throwable arg3){
    return 0;
  }
  public static int println_native(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4){
    return 0;
  }
  public static Log.TerribleFailureHandler setWtfHandler(Log.TerribleFailureHandler arg1){
    return (Log.TerribleFailureHandler) null;
  }
}
