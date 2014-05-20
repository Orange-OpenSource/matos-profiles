package org.apache.harmony.xnet.provider.jsse;

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


public class Logger
{
  // Classes

  public static class Stream
    extends java.io.PrintStream  {
    // Constructors

    public Stream(java.lang.String arg1){
      super((java.io.OutputStream) null);
    }
    // Methods

    public void println(java.lang.String arg1){
    }
    public void print(java.lang.String arg1){
    }
    public void print(byte [] arg1){
    }
    public void print(byte [] arg1, int arg2, int arg3){
    }
    public void endIndent(){
    }
    public void newIndent(){
    }
    public void printAsHex(int arg1, java.lang.String arg2, java.lang.String arg3, byte [] arg4){
    }
    public void printAsHex(int arg1, java.lang.String arg2, java.lang.String arg3, byte [] arg4, int arg5, int arg6){
    }
  }
  // Constructors

  public Logger(){
  }
  // Methods

  public static Logger.Stream getStream(java.lang.String arg1){
    return (Logger.Stream) null;
  }
}
