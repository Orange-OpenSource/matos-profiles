package java.lang;

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


public final class System
{
  // Fields

  public static final java.io.InputStream in = null;

  public static final java.io.PrintStream out = null;

  public static final java.io.PrintStream err = null;

  // Constructors

  private System(){
  }
  // Methods

  public static void exit(int arg1){
  }
  public static void runFinalizersOnExit(boolean arg1){
  }
  public static String setProperty(String arg1, String arg2){
    return (String) null;
  }
  public static String getProperty(String arg1){
    return (String) null;
  }
  public static String getProperty(String arg1, String arg2){
    return (String) null;
  }
  public static int identityHashCode(Object arg1){
    return 0;
  }
  public static long currentTimeMillis(){
    return 0l;
  }
  public static long nanoTime(){
    return 0l;
  }
  public static void arraycopy(Object arg1, int arg2, Object arg3, int arg4, int arg5){
  }
  public static SecurityManager getSecurityManager(){
    return (SecurityManager) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "System.load", pos = 1, report = "-")
  public static void load(String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "System.loadLibrary", pos = 1, report = "-")
  public static void loadLibrary(String arg1){
  }
  public static String mapLibraryName(String arg1){
    return (String) null;
  }
  public static String clearProperty(String arg1){
    return (String) null;
  }
  public static java.io.Console console(){
    return (java.io.Console) null;
  }
  public static void gc(){
  }
  public static java.util.Properties getProperties(){
    return (java.util.Properties) null;
  }
  public static String getenv(String arg1){
    return (String) null;
  }
  public static java.util.Map<String, String> getenv(){
    return (java.util.Map) null;
  }
  public static java.nio.channels.Channel inheritedChannel() throws java.io.IOException{
    return (java.nio.channels.Channel) null;
  }
  public static void runFinalization(){
  }
  public static void setErr(java.io.PrintStream arg1){
  }
  public static void setIn(java.io.InputStream arg1){
  }
  public static void setOut(java.io.PrintStream arg1){
  }
  public static void setProperties(java.util.Properties arg1){
  }
  public static void setSecurityManager(SecurityManager arg1){
  }
  public static String lineSeparator(){
    return (String) null;
  }
  public static void logE(String arg1){
  }
  public static void logE(String arg1, Throwable arg2){
  }
  public static void logI(String arg1){
  }
  public static void logI(String arg1, Throwable arg2){
  }
  public static void logW(String arg1){
  }
  public static void logW(String arg1, Throwable arg2){
  }
}
