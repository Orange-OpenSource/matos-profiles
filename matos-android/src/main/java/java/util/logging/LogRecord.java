package java.util.logging;

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


public class LogRecord
  implements java.io.Serializable
{
  // Constructors

  public LogRecord(Level arg1, java.lang.String arg2){
  }
  // Methods

  public java.lang.String getMessage(){
    return (java.lang.String) null;
  }
  public java.lang.Object [] getParameters(){
    return (java.lang.Object []) null;
  }
  public Level getLevel(){
    return (Level) null;
  }
  public void setLevel(Level arg1){
  }
  public long getSequenceNumber(){
    return 0l;
  }
  public void setSequenceNumber(long arg1){
  }
  public void setParameters(java.lang.Object [] arg1){
  }
  public void setMessage(java.lang.String arg1){
  }
  public long getMillis(){
    return 0l;
  }
  public java.lang.String getSourceClassName(){
    return (java.lang.String) null;
  }
  public java.lang.String getSourceMethodName(){
    return (java.lang.String) null;
  }
  public java.lang.Throwable getThrown(){
    return (java.lang.Throwable) null;
  }
  public java.util.ResourceBundle getResourceBundle(){
    return (java.util.ResourceBundle) null;
  }
  public void setLoggerName(java.lang.String arg1){
  }
  public java.lang.String getLoggerName(){
    return (java.lang.String) null;
  }
  public void setMillis(long arg1){
  }
  public void setResourceBundle(java.util.ResourceBundle arg1){
  }
  public java.lang.String getResourceBundleName(){
    return (java.lang.String) null;
  }
  public void setResourceBundleName(java.lang.String arg1){
  }
  public void setSourceClassName(java.lang.String arg1){
  }
  public void setSourceMethodName(java.lang.String arg1){
  }
  public int getThreadID(){
    return 0;
  }
  public void setThreadID(int arg1){
  }
  public void setThrown(java.lang.Throwable arg1){
  }
}
