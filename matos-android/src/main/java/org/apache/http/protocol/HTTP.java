package org.apache.http.protocol;

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
public final class HTTP
{
  // Fields

  public static final int CR = 13;

  public static final int LF = 10;

  public static final int SP = 32;

  public static final int HT = 9;

  public static final java.lang.String TRANSFER_ENCODING = "Transfer-Encoding";

  public static final java.lang.String CONTENT_LEN = "Content-Length";

  public static final java.lang.String CONTENT_TYPE = "Content-Type";

  public static final java.lang.String CONTENT_ENCODING = "Content-Encoding";

  public static final java.lang.String EXPECT_DIRECTIVE = "Expect";

  public static final java.lang.String CONN_DIRECTIVE = "Connection";

  public static final java.lang.String TARGET_HOST = "Host";

  public static final java.lang.String USER_AGENT = "User-Agent";

  public static final java.lang.String DATE_HEADER = "Date";

  public static final java.lang.String SERVER_HEADER = "Server";

  public static final java.lang.String EXPECT_CONTINUE = "100-continue";

  public static final java.lang.String CONN_CLOSE = "Close";

  public static final java.lang.String CONN_KEEP_ALIVE = "Keep-Alive";

  public static final java.lang.String CHUNK_CODING = "chunked";

  public static final java.lang.String IDENTITY_CODING = "identity";

  public static final java.lang.String UTF_8 = "UTF-8";

  public static final java.lang.String UTF_16 = "UTF-16";

  public static final java.lang.String US_ASCII = "US-ASCII";

  public static final java.lang.String ASCII = "ASCII";

  public static final java.lang.String ISO_8859_1 = "ISO-8859-1";

  public static final java.lang.String DEFAULT_CONTENT_CHARSET = "ISO-8859-1";

  public static final java.lang.String DEFAULT_PROTOCOL_CHARSET = "US-ASCII";

  public static final java.lang.String OCTET_STREAM_TYPE = "application/octet-stream";

  public static final java.lang.String PLAIN_TEXT_TYPE = "text/plain";

  public static final java.lang.String CHARSET_PARAM = "; charset=";

  public static final java.lang.String DEFAULT_CONTENT_TYPE = "application/octet-stream";

  // Constructors

  private HTTP(){
  }
  // Methods

  public static boolean isWhitespace(char arg1){
    return false;
  }
}
