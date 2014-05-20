package org.apache.http.impl.conn.tsccm;

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
public class BasicPoolEntryRef
  extends java.lang.ref.WeakReference<BasicPoolEntry>{
  // Constructors

  public BasicPoolEntryRef(BasicPoolEntry arg1, java.lang.ref.ReferenceQueue<java.lang.Object> arg2){
    super((BasicPoolEntry) null);
  }
  // Methods

  public final org.apache.http.conn.routing.HttpRoute getRoute(){
    return (org.apache.http.conn.routing.HttpRoute) null;
  }
}
