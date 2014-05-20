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


public abstract class AddressHeaderIms
  extends gov.nist.javax.sip.header.SIPHeader{
  // Fields

  protected gov.nist.javax.sip.address.AddressImpl address;

  // Constructors

  public AddressHeaderIms(java.lang.String arg1){
    super((java.lang.String) null);
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("theaddress")
  public javax.sip.address.Address getAddress(){
    return (javax.sip.address.Address) null;
  }
  public void setAddress(@com.francetelecom.rd.stubs.annotation.FieldSet("theaddress") javax.sip.address.Address arg1){
  }
  public abstract java.lang.String encodeBody();
}
