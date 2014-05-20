package javax.sip;

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


public interface SipStack
{
  // Methods

  public void start() throws ProviderDoesNotExistException, SipException;
  public void stop();
  public java.lang.String getIPAddress();
  public ListeningPoint createListeningPoint(int arg1, java.lang.String arg2) throws TransportNotSupportedException, InvalidArgumentException;
  public ListeningPoint createListeningPoint(java.lang.String arg1, int arg2, java.lang.String arg3) throws TransportNotSupportedException, InvalidArgumentException;
  public SipProvider createSipProvider(ListeningPoint arg1) throws ObjectInUseException;
  public void deleteListeningPoint(ListeningPoint arg1) throws ObjectInUseException;
  public void deleteSipProvider(SipProvider arg1) throws ObjectInUseException;
  public java.util.Iterator getListeningPoints();
  public boolean isRetransmissionFilterActive();
  public java.util.Iterator getSipProviders();
  public java.lang.String getStackName();
  public javax.sip.address.Router getRouter();
  public java.util.Collection getDialogs();
}
