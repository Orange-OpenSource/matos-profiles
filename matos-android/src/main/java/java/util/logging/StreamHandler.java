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


public class StreamHandler
  extends Handler{
  // Constructors

  public StreamHandler(){
    super();
  }
  StreamHandler(java.io.OutputStream arg1){
    super();
  }
  StreamHandler(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
    super();
  }
  public StreamHandler(java.io.OutputStream arg1, Formatter arg2){
    super();
  }
  // Methods

  public void close(){
  }
  public void flush(){
  }
  public synchronized void publish(LogRecord arg1){
  }
  protected void setOutputStream(java.io.OutputStream arg1){
  }
  public void setEncoding(java.lang.String arg1) throws java.io.UnsupportedEncodingException{
  }
  public boolean isLoggable(LogRecord arg1){
    return false;
  }
}
