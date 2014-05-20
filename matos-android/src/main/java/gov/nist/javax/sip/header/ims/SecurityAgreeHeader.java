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


public interface SecurityAgreeHeader
  extends javax.sip.header.Header, javax.sip.header.Parameters
{
  // Methods

  public java.lang.String getProtocol();
  public java.lang.String getAlgorithm();
  public void setAlgorithm(java.lang.String arg1) throws java.text.ParseException;
  public java.lang.String getMode();
  public void setPreference(float arg1) throws javax.sip.InvalidArgumentException;
  public float getPreference();
  public void setMode(java.lang.String arg1) throws java.text.ParseException;
  public void setProtocol(java.lang.String arg1) throws java.text.ParseException;
  public void setSecurityMechanism(java.lang.String arg1) throws java.text.ParseException;
  public void setEncryptionAlgorithm(java.lang.String arg1) throws java.text.ParseException;
  public void setSPIClient(int arg1) throws javax.sip.InvalidArgumentException;
  public void setSPIServer(int arg1) throws javax.sip.InvalidArgumentException;
  public void setPortClient(int arg1) throws javax.sip.InvalidArgumentException;
  public void setPortServer(int arg1) throws javax.sip.InvalidArgumentException;
  public java.lang.String getSecurityMechanism();
  public java.lang.String getEncryptionAlgorithm();
  public int getSPIClient();
  public int getSPIServer();
  public int getPortClient();
  public int getPortServer();
}
