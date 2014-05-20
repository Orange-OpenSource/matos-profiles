package gov.nist.core;

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


public interface ServerLogger
  extends LogLevels
{
  // Methods

  public void logMessage(gov.nist.javax.sip.message.SIPMessage arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, long arg5);
  public void logMessage(gov.nist.javax.sip.message.SIPMessage arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, long arg6);
  public void logMessage(gov.nist.javax.sip.message.SIPMessage arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5);
  public void logException(java.lang.Exception arg1);
  public void setStackProperties(java.util.Properties arg1);
  public void setSipStack(javax.sip.SipStack arg1);
  public void closeLogFile();
}
