package gov.nist.javax.sip.message;

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


public interface MessageFactoryExt
  extends javax.sip.message.MessageFactory
{
  // Methods

  public void setDefaultUserAgentHeader(@com.francetelecom.rd.stubs.annotation.CallBackRegister("userAgentHeader") javax.sip.header.UserAgentHeader arg1);
  public void setDefaultServerHeader(@com.francetelecom.rd.stubs.annotation.CallBackRegister("serverHeader") javax.sip.header.ServerHeader arg1);
  public void setDefaultContentEncodingCharset(java.lang.String arg1) throws java.lang.NullPointerException, java.lang.IllegalArgumentException;
  public MultipartMimeContent createMultipartMimeContent(javax.sip.header.ContentTypeHeader arg1, java.lang.String [] arg2, java.lang.String [] arg3, java.lang.String [] arg4);
}
