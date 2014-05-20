package gov.nist.core;

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


public class LogWriter
  implements StackLogger
{
  // Constructors

  public LogWriter(){
  }
  // Methods

  public int getLineCount(){
    return 0;
  }
  public boolean isLoggingEnabled(){
    return false;
  }
  public boolean isLoggingEnabled(int arg1){
    return false;
  }
  public void disableLogging(){
  }
  public void enableLogging(){
  }
  public void logError(java.lang.String arg1){
  }
  public void logError(java.lang.String arg1, java.lang.Exception arg2){
  }
  public void logException(java.lang.Throwable arg1){
  }
  public void setStackProperties(java.util.Properties arg1){
  }
  public java.lang.String getLoggerName(){
    return (java.lang.String) null;
  }
  public void logDebug(java.lang.String arg1){
  }
  public void logStackTrace(){
  }
  public void logStackTrace(int arg1){
  }
  public void logWarning(java.lang.String arg1){
  }
  public void logFatalError(java.lang.String arg1){
  }
  public void setBuildTimeStamp(java.lang.String arg1){
  }
  public void logInfo(java.lang.String arg1){
  }
  public void logTrace(java.lang.String arg1){
  }
}
