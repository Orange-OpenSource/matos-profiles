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


public class Warning
  extends SIPHeader  implements javax.sip.header.WarningHeader
{
  // Fields

  protected int code;

  protected java.lang.String agent;

  protected java.lang.String text;

  // Constructors

  public Warning(){
    super((java.lang.String) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("text")
  public java.lang.String getText(){
    return (java.lang.String) null;
  }
  public void setText(@com.francetelecom.rd.stubs.annotation.FieldSet("this.text") java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("agent")
  public java.lang.String getAgent(){
    return (java.lang.String) null;
  }
  public void setAgent(@com.francetelecom.rd.stubs.annotation.FieldSet("this.agent") java.lang.String arg1) throws java.text.ParseException{
  }
  public int getCode(){
    return 0;
  }
  public void setCode(int arg1) throws javax.sip.InvalidArgumentException{
  }
}
