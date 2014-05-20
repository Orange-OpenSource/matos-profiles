package gov.nist.javax.sip;

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


public interface SIPConstants
  extends gov.nist.javax.sip.address.ParameterNames, gov.nist.javax.sip.header.SIPHeaderNames, gov.nist.javax.sip.header.ParameterNames
{
  // Fields

  public static final int DEFAULT_PORT = 5060;

  public static final int DEFAULT_TLS_PORT = 5061;

  public static final java.lang.String BRANCH_MAGIC_COOKIE = "z9hG4bK";

  public static final java.lang.String BRANCH_MAGIC_COOKIE_LOWER_CASE = "z9hg4bk";

  public static final java.lang.String BRANCH_MAGIC_COOKIE_UPPER_CASE = "Z9HG4BK";

  public static final java.lang.String SIP_VERSION_STRING = "SIP/2.0";

}
