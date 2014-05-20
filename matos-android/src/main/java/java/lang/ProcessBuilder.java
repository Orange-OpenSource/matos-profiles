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


public final class ProcessBuilder
{
  // Constructors

  public ProcessBuilder(String [] arg1){
  }
  public ProcessBuilder(java.util.List<String> arg1){
  }
  // Methods

  public Process start() throws java.io.IOException{
    return (Process) null;
  }
  public java.io.File directory(){
    return (java.io.File) null;
  }
  public ProcessBuilder directory(java.io.File arg1){
    return (ProcessBuilder) null;
  }
  public java.util.Map<String, String> environment(){
    return (java.util.Map) null;
  }
  public java.util.List<String> command(){
    return (java.util.List) null;
  }
  public ProcessBuilder command(String [] arg1){
    return (ProcessBuilder) null;
  }
  public ProcessBuilder command(java.util.List<String> arg1){
    return (ProcessBuilder) null;
  }
  public boolean redirectErrorStream(){
    return false;
  }
  public ProcessBuilder redirectErrorStream(boolean arg1){
    return (ProcessBuilder) null;
  }
}
