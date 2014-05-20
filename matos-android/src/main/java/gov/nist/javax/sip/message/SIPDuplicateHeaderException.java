package gov.nist.javax.sip.message;

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


public class SIPDuplicateHeaderException
  extends java.text.ParseException{
  // Fields

  protected gov.nist.javax.sip.header.SIPHeader sipHeader;

  protected SIPMessage sipMessage;

  // Constructors

  public SIPDuplicateHeaderException(java.lang.String arg1){
    super((java.lang.String) null, 0);
  }
  // Methods

  public SIPMessage getSIPMessage(){
    return (SIPMessage) null;
  }
  public gov.nist.javax.sip.header.SIPHeader getSIPHeader(){
    return (gov.nist.javax.sip.header.SIPHeader) null;
  }
  public void setSIPHeader(gov.nist.javax.sip.header.SIPHeader arg1){
  }
  public void setSIPMessage(SIPMessage arg1){
  }
}
