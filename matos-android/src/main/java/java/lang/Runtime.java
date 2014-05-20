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


public class Runtime
{
  // Constructors

  private Runtime(){
  }
  // Methods

  public void exit(int arg1){
  }
  public static void runFinalizersOnExit(boolean arg1){
  }
  public void load(String arg1){
  }
  public void loadLibrary(String arg1){
  }
  public void gc(){
  }
  public static Runtime getRuntime(){
    return (Runtime) null;
  }
  public void runFinalization(){
  }
  public long freeMemory(){
    return 0l;
  }
  public long maxMemory(){
    return 0l;
  }
  public void addShutdownHook(Thread arg1){
  }
  public int availableProcessors(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Runtime.exec-1", pos = 1, report = "-")
  public Process exec(String [] arg1) throws java.io.IOException{
    return (Process) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Runtime.exec-2", pos = {1, 2}, report = "-")
  public Process exec(String [] arg1, String [] arg2) throws java.io.IOException{
    return (Process) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Runtime.exec-3", pos = {1, 2}, report = "-")
  public Process exec(String [] arg1, String [] arg2, java.io.File arg3) throws java.io.IOException{
    return (Process) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Runtime.exec-4", pos = 1, report = "-")
  public Process exec(String arg1) throws java.io.IOException{
    return (Process) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Runtime.exec-5", pos = {1, 2}, report = "-")
  public Process exec(String arg1, String [] arg2) throws java.io.IOException{
    return (Process) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Runtime.exec-6", pos = {1, 2}, report = "-")
  public Process exec(String arg1, String [] arg2, java.io.File arg3) throws java.io.IOException{
    return (Process) null;
  }
  public java.io.InputStream getLocalizedInputStream(java.io.InputStream arg1){
    return (java.io.InputStream) null;
  }
  public java.io.OutputStream getLocalizedOutputStream(java.io.OutputStream arg1){
    return (java.io.OutputStream) null;
  }
  public void halt(int arg1){
  }
  public boolean removeShutdownHook(Thread arg1){
    return false;
  }
  public long totalMemory(){
    return 0l;
  }
  public void traceInstructions(boolean arg1){
  }
  public void traceMethodCalls(boolean arg1){
  }
}
