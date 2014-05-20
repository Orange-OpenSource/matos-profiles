package java.net;

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


public interface SocketOptions
{
  // Fields

  public static final int SO_LINGER = 128;

  public static final int SO_TIMEOUT = 4102;

  public static final int TCP_NODELAY = 1;

  public static final int IP_MULTICAST_IF = 16;

  public static final int SO_BINDADDR = 15;

  public static final int SO_REUSEADDR = 4;

  public static final int SO_SNDBUF = 4097;

  public static final int SO_RCVBUF = 4098;

  public static final int SO_KEEPALIVE = 8;

  public static final int IP_TOS = 3;

  public static final int IP_MULTICAST_LOOP = 18;

  public static final int SO_BROADCAST = 32;

  public static final int SO_OOBINLINE = 4099;

  public static final int IP_MULTICAST_IF2 = 31;

  // Methods

  public java.lang.Object getOption(int arg1) throws SocketException;
  public void setOption(int arg1, java.lang.Object arg2) throws SocketException;
}
