package org.apache.commons.logging.impl;

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
public class NoOpLog
  implements org.apache.commons.logging.Log, java.io.Serializable
{
  // Constructors

  public NoOpLog(){
  }
  public NoOpLog(java.lang.String arg1){
  }
  // Methods

  public void debug(java.lang.Object arg1){
  }
  public void debug(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public void error(java.lang.Object arg1){
  }
  public void error(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public void warn(java.lang.Object arg1){
  }
  public void warn(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public void info(java.lang.Object arg1){
  }
  public void info(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public final boolean isDebugEnabled(){
    return false;
  }
  public final boolean isInfoEnabled(){
    return false;
  }
  public final boolean isErrorEnabled(){
    return false;
  }
  public final boolean isWarnEnabled(){
    return false;
  }
  public void trace(java.lang.Object arg1){
  }
  public void trace(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public void fatal(java.lang.Object arg1){
  }
  public void fatal(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public final boolean isFatalEnabled(){
    return false;
  }
  public final boolean isTraceEnabled(){
    return false;
  }
}
