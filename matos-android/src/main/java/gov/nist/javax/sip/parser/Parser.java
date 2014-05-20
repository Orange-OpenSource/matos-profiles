package gov.nist.javax.sip.parser;

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


public abstract class Parser
  extends gov.nist.core.ParserCore  implements TokenTypes
{
  // Constructors

  public Parser(){
    super();
  }
  // Methods

  protected java.lang.String method() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  protected Lexer getLexer(){
    return (Lexer) null;
  }
  protected java.text.ParseException createParseException(java.lang.String arg1){
    return (java.text.ParseException) null;
  }
  protected java.lang.String sipVersion() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  public static final void checkToken(java.lang.String arg1) throws java.text.ParseException{
  }
}
