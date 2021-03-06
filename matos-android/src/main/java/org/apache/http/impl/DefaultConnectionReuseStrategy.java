package org.apache.http.impl;

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
public class DefaultConnectionReuseStrategy
  implements org.apache.http.ConnectionReuseStrategy
{
  // Constructors

  public DefaultConnectionReuseStrategy(){
  }
  // Methods

  public boolean keepAlive(org.apache.http.HttpResponse arg1, org.apache.http.protocol.HttpContext arg2){
    return false;
  }
  protected org.apache.http.TokenIterator createTokenIterator(org.apache.http.HeaderIterator arg1){
    return (org.apache.http.TokenIterator) null;
  }
}
