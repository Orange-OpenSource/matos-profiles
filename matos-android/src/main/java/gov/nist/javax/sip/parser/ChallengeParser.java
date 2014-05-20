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


public abstract class ChallengeParser
  extends HeaderParser{
  // Constructors

  protected ChallengeParser(java.lang.String arg1){
    super((java.lang.String) null);
  }
  protected ChallengeParser(Lexer arg1){
    super((java.lang.String) null);
  }
  // Methods

  public void parse(gov.nist.javax.sip.header.AuthenticationHeader arg1) throws java.text.ParseException{
  }
  protected void parseParameter(gov.nist.javax.sip.header.AuthenticationHeader arg1) throws java.text.ParseException{
  }
}
