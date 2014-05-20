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


public class Logger
{
  // Fields

  public static final java.lang.String GLOBAL_LOGGER_NAME = "global";

  public static final Logger global = null;

  // Constructors

  protected Logger(java.lang.String arg1, java.lang.String arg2){
  }
  // Methods

  public void log(Level arg1, java.lang.String arg2){
  }
  public void log(Level arg1, java.lang.String arg2, java.lang.Object arg3){
  }
  public void log(Level arg1, java.lang.String arg2, java.lang.Object [] arg3){
  }
  public void log(Level arg1, java.lang.String arg2, java.lang.Throwable arg3){
  }
  public void log(LogRecord arg1){
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public Logger getParent(){
    return (Logger) null;
  }
  public void setParent(Logger arg1){
  }
  public static Logger getLogger(java.lang.String arg1){
    return (Logger) null;
  }
  public static Logger getLogger(java.lang.String arg1, java.lang.String arg2){
    return (Logger) null;
  }
  public void warning(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("filter")
  public Filter getFilter(){
    return (Filter) null;
  }
  public boolean isLoggable(Level arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("level")
  public Level getLevel(){
    return (Level) null;
  }
  public void setFilter(@com.francetelecom.rd.stubs.annotation.FieldSet("filter") @com.francetelecom.rd.stubs.annotation.CallBackRegister("Filter") Filter arg1){
  }
  public void setLevel(@com.francetelecom.rd.stubs.annotation.FieldSet("level") Level arg1){
  }
  public void info(java.lang.String arg1){
  }
  public void entering(java.lang.String arg1, java.lang.String arg2){
  }
  public void entering(java.lang.String arg1, java.lang.String arg2, java.lang.Object arg3){
  }
  public void entering(java.lang.String arg1, java.lang.String arg2, java.lang.Object [] arg3){
  }
  public java.util.ResourceBundle getResourceBundle(){
    return (java.util.ResourceBundle) null;
  }
  public java.lang.String getResourceBundleName(){
    return (java.lang.String) null;
  }
  public void config(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new Handler[]{handler}; ")
  public Handler [] getHandlers(){
    return (Handler []) null;
  }
  public void addHandler(@com.francetelecom.rd.stubs.annotation.FieldSet("handler") Handler arg1){
  }
  public void logp(Level arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public void logp(Level arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.Object arg5){
  }
  public void logp(Level arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.Object [] arg5){
  }
  public void logp(Level arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.Throwable arg5){
  }
  public static Logger getAnonymousLogger(){
    return (Logger) null;
  }
  public static Logger getAnonymousLogger(java.lang.String arg1){
    return (Logger) null;
  }
  public static Logger getGlobal(){
    return (Logger) null;
  }
  public void removeHandler(Handler arg1){
  }
  public boolean getUseParentHandlers(){
    return false;
  }
  public void setUseParentHandlers(boolean arg1){
  }
  public void exiting(java.lang.String arg1, java.lang.String arg2){
  }
  public void exiting(java.lang.String arg1, java.lang.String arg2, java.lang.Object arg3){
  }
  public void throwing(java.lang.String arg1, java.lang.String arg2, java.lang.Throwable arg3){
  }
  public void severe(java.lang.String arg1){
  }
  public void fine(java.lang.String arg1){
  }
  public void finer(java.lang.String arg1){
  }
  public void finest(java.lang.String arg1){
  }
  public void logrb(Level arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5){
  }
  public void logrb(Level arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.Object arg6){
  }
  public void logrb(Level arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.Object [] arg6){
  }
  public void logrb(Level arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.Throwable arg6){
  }
}
