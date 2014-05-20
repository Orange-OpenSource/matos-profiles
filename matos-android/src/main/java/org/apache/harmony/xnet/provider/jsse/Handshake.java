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


public class Handshake
{
  // Fields

  public static final byte HELLO_REQUEST = 0;

  public static final byte CLIENT_HELLO = 1;

  public static final byte SERVER_HELLO = 2;

  public static final byte CERTIFICATE = 11;

  public static final byte SERVER_KEY_EXCHANGE = 12;

  public static final byte CERTIFICATE_REQUEST = 13;

  public static final byte SERVER_HELLO_DONE = 14;

  public static final byte CERTIFICATE_VERIFY = 15;

  public static final byte CLIENT_KEY_EXCHANGE = 16;

  public static final byte FINISHED = 20;

  // Constructors

  public Handshake(){
  }
}
