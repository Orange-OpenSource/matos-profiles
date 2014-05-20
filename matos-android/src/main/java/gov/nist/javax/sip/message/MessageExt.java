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


public interface MessageExt
  extends javax.sip.message.Message
{
  // Methods

  public java.lang.String getFirstLine();
  public void setApplicationData(java.lang.Object arg1);
  public java.lang.Object getApplicationData();
  public MultipartMimeContent getMultipartMimeContent() throws java.text.ParseException;
  public javax.sip.header.ViaHeader getTopmostViaHeader();
  public javax.sip.header.FromHeader getFromHeader();
  public javax.sip.header.ToHeader getToHeader();
  public javax.sip.header.CallIdHeader getCallIdHeader();
  public javax.sip.header.CSeqHeader getCSeqHeader();
  public javax.sip.header.ContentTypeHeader getContentTypeHeader();
  public javax.sip.header.ContentLengthHeader getContentLengthHeader();
}
