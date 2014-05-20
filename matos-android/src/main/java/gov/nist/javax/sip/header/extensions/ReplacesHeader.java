package gov.nist.javax.sip.header.extensions;

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


public interface ReplacesHeader
  extends javax.sip.header.Header, javax.sip.header.Parameters
{
  // Fields

  public static final java.lang.String NAME = "Replaces";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("callId")
  public java.lang.String getCallId();
  public void setCallId(@com.francetelecom.rd.stubs.annotation.FieldSet("callId") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("toTag")
  public java.lang.String getToTag();
  @com.francetelecom.rd.stubs.annotation.FieldGet("fromTag")
  public java.lang.String getFromTag();
  public void setFromTag(@com.francetelecom.rd.stubs.annotation.FieldSet("fromTag") java.lang.String arg1) throws java.text.ParseException;
  public void setToTag(@com.francetelecom.rd.stubs.annotation.FieldSet("toTag") java.lang.String arg1) throws java.text.ParseException;
}
