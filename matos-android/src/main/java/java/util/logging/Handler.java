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


public abstract class Handler
{
  // Constructors

  protected Handler(){
  }
  // Methods

  public abstract void close();
  public abstract void flush();
  public java.lang.String getEncoding(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("filter")
  public Filter getFilter(){
    return (Filter) null;
  }
  public abstract void publish(LogRecord arg1);
  public void setEncoding(java.lang.String arg1) throws java.io.UnsupportedEncodingException{
  }
  public boolean isLoggable(LogRecord arg1){
    return false;
  }
  public ErrorManager getErrorManager(){
    return (ErrorManager) null;
  }
  public Formatter getFormatter(){
    return (Formatter) null;
  }
  public Level getLevel(){
    return (Level) null;
  }
  protected void reportError(java.lang.String arg1, java.lang.Exception arg2, int arg3){
  }
  public void setErrorManager(ErrorManager arg1){
  }
  public void setFilter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("Filter") @com.francetelecom.rd.stubs.annotation.FieldSet("filter") Filter arg1){
  }
  public void setFormatter(Formatter arg1){
  }
  public void setLevel(Level arg1){
  }
}
