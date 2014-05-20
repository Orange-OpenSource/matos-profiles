package gov.nist.javax.sip.header.ims;

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


public interface PChargingVectorHeader
  extends javax.sip.header.Header, javax.sip.header.Parameters
{
  // Fields

  public static final java.lang.String NAME = "P-Charging-Vector";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("ICID")
  public java.lang.String getICID();
  public void setICID(@com.francetelecom.rd.stubs.annotation.FieldSet("ICID") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("ICIDGeneratedAt")
  public java.lang.String getICIDGeneratedAt();
  public void setICIDGeneratedAt(@com.francetelecom.rd.stubs.annotation.FieldSet("ICIDGeneratedAt") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("originatingIOI")
  public java.lang.String getOriginatingIOI();
  public void setOriginatingIOI(@com.francetelecom.rd.stubs.annotation.FieldSet("originatingIOI") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("terminatingIOI")
  public java.lang.String getTerminatingIOI();
  public void setTerminatingIOI(@com.francetelecom.rd.stubs.annotation.FieldSet("terminatingIOI") java.lang.String arg1) throws java.text.ParseException;
}
