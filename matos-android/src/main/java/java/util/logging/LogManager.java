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


public class LogManager
{
  // Fields

  public static final java.lang.String LOGGING_MXBEAN_NAME = "java.util.logging:type=Logging";

  // Constructors

  protected LogManager(){
  }
  // Methods

  public java.lang.String getProperty(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void checkAccess(){
  }
  public synchronized void reset(){
  }
  public synchronized Logger getLogger(java.lang.String arg1){
    return (Logger) null;
  }
  public synchronized java.util.Enumeration<java.lang.String> getLoggerNames(){
    return (java.util.Enumeration) null;
  }
  public void addPropertyChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("propertyChange") java.beans.PropertyChangeListener arg1){
  }
  public void removePropertyChangeListener(java.beans.PropertyChangeListener arg1){
  }
  public static LogManager getLogManager(){
    return (LogManager) null;
  }
  public static LoggingMXBean getLoggingMXBean(){
    return (LoggingMXBean) null;
  }
  public synchronized boolean addLogger(Logger arg1){
    return false;
  }
  public void readConfiguration() throws java.io.IOException{
  }
  public void readConfiguration(java.io.InputStream arg1) throws java.io.IOException{
  }
}
