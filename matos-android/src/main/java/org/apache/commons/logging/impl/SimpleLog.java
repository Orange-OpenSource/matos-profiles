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
public class SimpleLog
  implements org.apache.commons.logging.Log, java.io.Serializable
{
  // Fields

  protected static final java.lang.String systemPrefix = (java.lang.String) null;

  protected static final java.util.Properties simpleLogProps = null;

  protected static final java.lang.String DEFAULT_DATE_TIME_FORMAT = (java.lang.String) null;

  protected static boolean showLogName;

  protected static boolean showShortName;

  protected static boolean showDateTime;

  protected static java.lang.String dateTimeFormat;

  protected static java.text.DateFormat dateFormatter;

  public static final int LOG_LEVEL_TRACE = 1;

  public static final int LOG_LEVEL_DEBUG = 2;

  public static final int LOG_LEVEL_INFO = 3;

  public static final int LOG_LEVEL_WARN = 4;

  public static final int LOG_LEVEL_ERROR = 5;

  public static final int LOG_LEVEL_FATAL = 6;

  public static final int LOG_LEVEL_ALL = 0;

  public static final int LOG_LEVEL_OFF = 7;

  protected java.lang.String logName;

  protected int currentLogLevel;

  // Constructors

  public SimpleLog(java.lang.String arg1){
  }
  // Methods

  protected void log(int arg1, java.lang.Object arg2, java.lang.Throwable arg3){
  }
  protected void write(java.lang.StringBuffer arg1){
  }
  public final void debug(java.lang.Object arg1){
  }
  public final void debug(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public final void error(java.lang.Object arg1){
  }
  public final void error(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public final void warn(java.lang.Object arg1){
  }
  public final void warn(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public int getLevel(){
    return 0;
  }
  public void setLevel(int arg1){
  }
  public final void info(java.lang.Object arg1){
  }
  public final void info(java.lang.Object arg1, java.lang.Throwable arg2){
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
  public final void trace(java.lang.Object arg1){
  }
  public final void trace(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public final void fatal(java.lang.Object arg1){
  }
  public final void fatal(java.lang.Object arg1, java.lang.Throwable arg2){
  }
  public final boolean isFatalEnabled(){
    return false;
  }
  public final boolean isTraceEnabled(){
    return false;
  }
  protected boolean isLevelEnabled(int arg1){
    return false;
  }
}
