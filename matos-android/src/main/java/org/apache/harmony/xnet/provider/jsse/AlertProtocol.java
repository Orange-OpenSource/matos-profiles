package org.apache.harmony.xnet.provider.jsse;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class AlertProtocol
{
  // Fields

  protected static final byte WARNING = (byte) 0;

  protected static final byte FATAL = (byte) 0;

  protected static final byte CLOSE_NOTIFY = (byte) 0;

  protected static final byte UNEXPECTED_MESSAGE = (byte) 0;

  protected static final byte BAD_RECORD_MAC = (byte) 0;

  protected static final byte DECRYPTION_FAILED = (byte) 0;

  protected static final byte RECORD_OVERFLOW = (byte) 0;

  protected static final byte DECOMPRESSION_FAILURE = (byte) 0;

  protected static final byte HANDSHAKE_FAILURE = (byte) 0;

  protected static final byte BAD_CERTIFICATE = (byte) 0;

  protected static final byte UNSUPPORTED_CERTIFICATE = (byte) 0;

  protected static final byte CERTIFICATE_REVOKED = (byte) 0;

  protected static final byte CERTIFICATE_EXPIRED = (byte) 0;

  protected static final byte CERTIFICATE_UNKNOWN = (byte) 0;

  protected static final byte ILLEGAL_PARAMETER = (byte) 0;

  protected static final byte UNKNOWN_CA = (byte) 0;

  protected static final byte ACCESS_DENIED = (byte) 0;

  protected static final byte DECODE_ERROR = (byte) 0;

  protected static final byte DECRYPT_ERROR = (byte) 0;

  protected static final byte EXPORT_RESTRICTION = (byte) 0;

  protected static final byte PROTOCOL_VERSION = (byte) 0;

  protected static final byte INSUFFICIENT_SECURITY = (byte) 0;

  protected static final byte INTERNAL_ERROR = (byte) 0;

  protected static final byte USER_CANCELED = (byte) 0;

  protected static final byte NO_RENEGOTIATION = (byte) 0;

  // Constructors

  protected AlertProtocol(){
  }
  // Methods

  protected void shutdown(){
  }
  protected byte [] wrap(){
    return (byte []) null;
  }
  protected void alert(byte arg1, byte arg2){
  }
  protected void setRecordProtocol(SSLRecordProtocol arg1){
  }
  protected byte getDescriptionCode(){
    return (byte) 0;
  }
  protected void setProcessed(){
  }
  protected boolean hasAlert(){
    return false;
  }
  protected boolean isFatalAlert(){
    return false;
  }
  protected java.lang.String getAlertDescription(){
    return (java.lang.String) null;
  }
}
