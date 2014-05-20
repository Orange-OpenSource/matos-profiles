package gov.nist.javax.sip.header;

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


public class InReplyTo
  extends SIPHeader  implements javax.sip.header.InReplyToHeader
{
  // Fields

  protected CallIdentifier callId;

  // Constructors

  public InReplyTo(){
    super((java.lang.String) null);
  }
  public InReplyTo(CallIdentifier arg1){
    super((java.lang.String) null);
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("callIdName")
  public java.lang.String getCallId(){
    return (java.lang.String) null;
  }
  public void setCallId(@com.francetelecom.rd.stubs.annotation.FieldSet("callIdName") java.lang.String arg1) throws java.text.ParseException{
  }
}
