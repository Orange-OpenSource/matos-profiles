package gov.nist.javax.sip.parser;

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


public interface ParseExceptionListener
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("handleException")
  public void handleException(java.text.ParseException arg1, gov.nist.javax.sip.message.SIPMessage arg2, java.lang.Class arg3, java.lang.String arg4, java.lang.String arg5) throws java.text.ParseException;
}
