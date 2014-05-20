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


public class Proxy
{
  // Classes

  public static enum Type
  {
    // Enum Constants

    DIRECT()
, HTTP()
, SOCKS()
;
    // Fields

    // Constructors

    private Type(){
    }
    // Methods

  }
  // Fields

  public static final Proxy NO_PROXY = null;

  // Constructors

  public Proxy(Proxy.Type arg1, SocketAddress arg2){
  }
  private Proxy(){
  }
  // Methods

  public Proxy.Type type(){
    return (Proxy.Type) null;
  }
  public final boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final int hashCode(){
    return 0;
  }
  public SocketAddress address(){
    return (SocketAddress) null;
  }
}
