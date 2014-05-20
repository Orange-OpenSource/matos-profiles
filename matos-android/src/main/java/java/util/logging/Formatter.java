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


public abstract class Formatter
{
  // Constructors

  protected Formatter(){
  }
  // Methods

  public abstract java.lang.String format(LogRecord arg1);
  public java.lang.String getHead(Handler arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getTail(Handler arg1){
    return (java.lang.String) null;
  }
  public java.lang.String formatMessage(LogRecord arg1){
    return (java.lang.String) null;
  }
}
