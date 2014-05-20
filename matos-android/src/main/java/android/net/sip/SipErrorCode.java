package android.net.sip;

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


public class SipErrorCode
{
  // Fields

  public static final int NO_ERROR = 0;

  public static final int SOCKET_ERROR = -1;

  public static final int SERVER_ERROR = -2;

  public static final int TRANSACTION_TERMINTED = -3;

  public static final int CLIENT_ERROR = -4;

  public static final int TIME_OUT = -5;

  public static final int INVALID_REMOTE_URI = -6;

  public static final int PEER_NOT_REACHABLE = -7;

  public static final int INVALID_CREDENTIALS = -8;

  public static final int IN_PROGRESS = -9;

  public static final int DATA_CONNECTION_LOST = -10;

  public static final int CROSS_DOMAIN_AUTHENTICATION = -11;

  public static final int SERVER_UNREACHABLE = -12;

  // Constructors

  private SipErrorCode(){
  }
  // Methods

  public static java.lang.String toString(int arg1){
    return (java.lang.String) null;
  }
}
