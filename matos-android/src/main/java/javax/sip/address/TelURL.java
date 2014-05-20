package javax.sip.address;

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


public interface TelURL
  extends javax.sip.header.Parameters, URI
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("isdnSubAddress")
  public java.lang.String getIsdnSubAddress();
  @com.francetelecom.rd.stubs.annotation.FieldGet("postDial")
  public java.lang.String getPostDial();
  public boolean isGlobal();
  public void setGlobal(boolean arg1);
  public void setIsdnSubAddress(@com.francetelecom.rd.stubs.annotation.FieldSet("isdnSubAddress") java.lang.String arg1) throws java.text.ParseException;
  public void setPostDial(@com.francetelecom.rd.stubs.annotation.FieldSet("postDial") java.lang.String arg1) throws java.text.ParseException;
  public void setPhoneNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("phoneNumber") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldSet("phoneNumber")
  public java.lang.String getPhoneNumber();
  public void setPhoneContext(@com.francetelecom.rd.stubs.annotation.FieldSet("phoneContext") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("phoneContext")
  public java.lang.String getPhoneContext();
}
