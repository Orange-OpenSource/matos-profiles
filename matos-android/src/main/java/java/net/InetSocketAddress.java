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


public class InetSocketAddress
  extends SocketAddress{
  // Constructors

  public InetSocketAddress(){
    super();
  }
  public InetSocketAddress(int arg1){
    super();
  }
  public InetSocketAddress(InetAddress arg1, int arg2){
    super();
  }
  public InetSocketAddress(java.lang.String arg1, int arg2){
    super();
  }
  InetSocketAddress(java.lang.String arg1, int arg2, boolean arg3){
    super();
  }
  // Methods

  public final boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final int hashCode(){
    return 0;
  }
  public final InetAddress getAddress(){
    return (InetAddress) null;
  }
  public final java.lang.String getHostName(){
    return (java.lang.String) null;
  }
  public final int getPort(){
    return 0;
  }
  public final boolean isUnresolved(){
    return false;
  }
  public static InetSocketAddress createUnresolved(java.lang.String arg1, int arg2){
    return (InetSocketAddress) null;
  }
  public final java.lang.String getHostString(){
    return (java.lang.String) null;
  }
}
