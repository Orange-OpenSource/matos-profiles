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


public class StatusLineParser
  extends Parser{
  // Constructors

  public StatusLineParser(java.lang.String arg1){
    super();
  }
  public StatusLineParser(Lexer arg1){
    super();
  }
  // Methods

  public gov.nist.javax.sip.header.StatusLine parse() throws java.text.ParseException{
    return (gov.nist.javax.sip.header.StatusLine) null;
  }
  protected int statusCode() throws java.text.ParseException{
    return 0;
  }
  protected java.lang.String reasonPhrase() throws java.text.ParseException{
    return (java.lang.String) null;
  }
}
