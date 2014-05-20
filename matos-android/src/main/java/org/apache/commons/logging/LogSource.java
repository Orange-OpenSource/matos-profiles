package org.apache.commons.logging;

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
public class LogSource
{
  // Fields

  protected static java.util.Hashtable logs;

  protected static boolean log4jIsAvailable;

  protected static boolean jdk14IsAvailable;

  protected static java.lang.reflect.Constructor logImplctor;

  // Constructors

  private LogSource(){
  }
  // Methods

  public static Log getInstance(java.lang.String arg1){
    return (Log) null;
  }
  public static Log getInstance(java.lang.Class arg1){
    return (Log) null;
  }
  public static void setLogImplementation(java.lang.String arg1) throws java.lang.LinkageError, java.lang.ExceptionInInitializerError, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException{
  }
  public static void setLogImplementation(java.lang.Class arg1) throws java.lang.LinkageError, java.lang.ExceptionInInitializerError, java.lang.NoSuchMethodException, java.lang.SecurityException{
  }
  public static Log makeNewLogInstance(java.lang.String arg1){
    return (Log) null;
  }
  public static java.lang.String [] getLogNames(){
    return (java.lang.String []) null;
  }
}
