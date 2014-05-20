package org.apache.http.conn.scheme;

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
public final class SchemeRegistry
{
  // Constructors

  public SchemeRegistry(){
  }
  // Methods

  public final synchronized Scheme get(java.lang.String arg1){
    return (Scheme) null;
  }
  public final synchronized Scheme register(Scheme arg1){
    return (Scheme) null;
  }
  public final synchronized Scheme getScheme(java.lang.String arg1){
    return (Scheme) null;
  }
  public final synchronized Scheme getScheme(org.apache.http.HttpHost arg1){
    return (Scheme) null;
  }
  public final synchronized Scheme unregister(java.lang.String arg1){
    return (Scheme) null;
  }
  public synchronized void setItems(java.util.Map<java.lang.String, Scheme> arg1){
  }
  public final synchronized java.util.List<java.lang.String> getSchemeNames(){
    return (java.util.List) null;
  }
}
