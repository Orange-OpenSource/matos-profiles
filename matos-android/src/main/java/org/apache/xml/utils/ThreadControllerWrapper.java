package org.apache.xml.utils;

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


public class ThreadControllerWrapper
{
  // Classes

  public static class ThreadController
  {
    // Constructors

    public ThreadController(){
    }
    // Methods

    public java.lang.Thread run(java.lang.Runnable arg1, int arg2){
      return (java.lang.Thread) null;
    }
    public void waitThread(java.lang.Thread arg1, java.lang.Runnable arg2) throws java.lang.InterruptedException{
    }
  }
  // Constructors

  public ThreadControllerWrapper(){
  }
  // Methods

  public static void waitThread(java.lang.Thread arg1, java.lang.Runnable arg2) throws java.lang.InterruptedException{
  }
  public static java.lang.Thread runThread(java.lang.Runnable arg1, int arg2){
    return (java.lang.Thread) null;
  }
}
