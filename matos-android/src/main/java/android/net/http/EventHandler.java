package android.net.http;

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
public interface EventHandler
{
  // Fields

  public static final int OK = 0;

  public static final int ERROR = -1;

  public static final int ERROR_LOOKUP = -2;

  public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;

  public static final int ERROR_AUTH = -4;

  public static final int ERROR_PROXYAUTH = -5;

  public static final int ERROR_CONNECT = -6;

  public static final int ERROR_IO = -7;

  public static final int ERROR_TIMEOUT = -8;

  public static final int ERROR_REDIRECT_LOOP = -9;

  public static final int ERROR_UNSUPPORTED_SCHEME = -10;

  public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;

  public static final int ERROR_BAD_URL = -12;

  public static final int FILE_ERROR = -13;

  public static final int FILE_NOT_FOUND_ERROR = -14;

  public static final int TOO_MANY_REQUESTS_ERROR = -15;

  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("eventHandler")
  public void error(int arg1, java.lang.String arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("eventHandler")
  public void status(int arg1, int arg2, int arg3, java.lang.String arg4);
  @com.francetelecom.rd.stubs.annotation.CallBack("eventHandler")
  public void data(byte [] arg1, int arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("eventHandler")
  public void headers(Headers arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("eventHandler")
  public void certificate(SslCertificate arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("eventHandler")
  public void endData();
  @com.francetelecom.rd.stubs.annotation.CallBack("eventHandler")
  public boolean handleSslErrorRequest(SslError arg1);
}
