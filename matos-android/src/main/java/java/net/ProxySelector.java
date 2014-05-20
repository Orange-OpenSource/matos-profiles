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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ProxySelectorImpl", superClass = "")
public abstract class ProxySelector
{
  // Constructors

  public ProxySelector(){
  }
  // Methods

  public static ProxySelector getDefault(){
    return (ProxySelector) null;
  }
  public static void setDefault(ProxySelector arg1){
  }
  public abstract java.util.List<Proxy> select(URI arg1);
  public abstract void connectFailed(URI arg1, SocketAddress arg2, java.io.IOException arg3);
}
