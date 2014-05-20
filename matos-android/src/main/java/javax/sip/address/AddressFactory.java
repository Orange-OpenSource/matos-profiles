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


public interface AddressFactory
{
  // Methods

  public URI createURI(java.lang.String arg1) throws java.text.ParseException;
  public SipURI createSipURI(java.lang.String arg1) throws java.text.ParseException;
  public SipURI createSipURI(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException;
  public Address createAddress();
  public Address createAddress(java.lang.String arg1) throws java.text.ParseException;
  public Address createAddress(URI arg1);
  public Address createAddress(java.lang.String arg1, URI arg2) throws java.text.ParseException;
  public TelURL createTelURL(java.lang.String arg1) throws java.text.ParseException;
}
