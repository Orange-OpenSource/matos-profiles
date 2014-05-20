package gov.nist.javax.sip.stack;

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


public class DefaultRouter
  implements javax.sip.address.Router
{
  // Constructors

  private DefaultRouter(){
  }
  public DefaultRouter(javax.sip.SipStack arg1, java.lang.String arg2){
  }
  // Methods

  public javax.sip.address.Hop getNextHop(javax.sip.message.Request arg1) throws javax.sip.SipException{
    return (javax.sip.address.Hop) null;
  }
  public javax.sip.address.Hop getOutboundProxy(){
    return (javax.sip.address.Hop) null;
  }
  public java.util.ListIterator getNextHops(javax.sip.message.Request arg1){
    return (java.util.ListIterator) null;
  }
  public void fixStrictRouting(gov.nist.javax.sip.message.SIPRequest arg1){
  }
}
