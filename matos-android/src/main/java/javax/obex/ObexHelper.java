package javax.obex;

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


public final class ObexHelper
{
  // Fields

  public static final int BASE_PACKET_LENGTH = 3;

  public static final int MAX_PACKET_SIZE_INT = 65534;

  public static final int MAX_CLIENT_PACKET_SIZE = 64512;

  public static final int OBEX_OPCODE_CONNECT = 128;

  public static final int OBEX_OPCODE_DISCONNECT = 129;

  public static final int OBEX_OPCODE_PUT = 2;

  public static final int OBEX_OPCODE_PUT_FINAL = 130;

  public static final int OBEX_OPCODE_GET = 3;

  public static final int OBEX_OPCODE_GET_FINAL = 131;

  public static final int OBEX_OPCODE_RESERVED = 4;

  public static final int OBEX_OPCODE_RESERVED_FINAL = 132;

  public static final int OBEX_OPCODE_SETPATH = 133;

  public static final int OBEX_OPCODE_ABORT = 255;

  public static final int OBEX_AUTH_REALM_CHARSET_ASCII = 0;

  public static final int OBEX_AUTH_REALM_CHARSET_ISO_8859_1 = 1;

  public static final int OBEX_AUTH_REALM_CHARSET_ISO_8859_2 = 2;

  public static final int OBEX_AUTH_REALM_CHARSET_ISO_8859_3 = 3;

  public static final int OBEX_AUTH_REALM_CHARSET_ISO_8859_4 = 4;

  public static final int OBEX_AUTH_REALM_CHARSET_ISO_8859_5 = 5;

  public static final int OBEX_AUTH_REALM_CHARSET_ISO_8859_6 = 6;

  public static final int OBEX_AUTH_REALM_CHARSET_ISO_8859_7 = 7;

  public static final int OBEX_AUTH_REALM_CHARSET_ISO_8859_8 = 8;

  public static final int OBEX_AUTH_REALM_CHARSET_ISO_8859_9 = 9;

  public static final int OBEX_AUTH_REALM_CHARSET_UNICODE = 255;

  // Constructors

  private ObexHelper(){
  }
  // Methods

  public static byte [] createHeader(HeaderSet arg1, boolean arg2){
    return (byte []) null;
  }
  public static byte [] updateHeaderSet(HeaderSet arg1, byte [] arg2) throws java.io.IOException{
    return (byte []) null;
  }
  public static long convertToLong(byte [] arg1){
    return 0l;
  }
  public static byte [] convertToByteArray(long arg1){
    return (byte []) null;
  }
  public static int findHeaderEnd(byte [] arg1, int arg2, int arg3){
    return 0;
  }
  public static byte [] getTagValue(byte arg1, byte [] arg2){
    return (byte []) null;
  }
  public static java.lang.String convertToUnicode(byte [] arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public static byte [] computeMd5Hash(byte [] arg1){
    return (byte []) null;
  }
  public static byte [] convertToUnicodeByteArray(java.lang.String arg1){
    return (byte []) null;
  }
  public static int findTag(byte arg1, byte [] arg2){
    return 0;
  }
  public static byte [] computeAuthenticationChallenge(byte [] arg1, java.lang.String arg2, boolean arg3, boolean arg4) throws java.io.IOException{
    return (byte []) null;
  }
}
