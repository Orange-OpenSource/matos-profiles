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


public abstract class ParserCore
{
  // Fields

  public static final boolean debug = false;

  protected LexerCore lexer;

  // Constructors

  public ParserCore(){
  }
  // Methods

  protected void dbg_enter(java.lang.String arg1){
  }
  protected void dbg_leave(java.lang.String arg1){
  }
  protected NameValue nameValue(char arg1) throws java.text.ParseException{
    return (NameValue) null;
  }
  protected NameValue nameValue() throws java.text.ParseException{
    return (NameValue) null;
  }
  protected void peekLine(java.lang.String arg1){
  }
}
