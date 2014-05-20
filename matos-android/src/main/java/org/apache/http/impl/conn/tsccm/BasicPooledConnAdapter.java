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
public class BasicPooledConnAdapter
  extends org.apache.http.impl.conn.AbstractPooledConnAdapter{
  // Constructors

  protected BasicPooledConnAdapter(ThreadSafeClientConnManager arg1, org.apache.http.impl.conn.AbstractPoolEntry arg2){
    super((org.apache.http.conn.ClientConnectionManager) null, (org.apache.http.impl.conn.AbstractPoolEntry) null);
  }
  // Methods

  protected void detach(){
  }
  protected org.apache.http.conn.ClientConnectionManager getManager(){
    return (org.apache.http.conn.ClientConnectionManager) null;
  }
  protected org.apache.http.impl.conn.AbstractPoolEntry getPoolEntry(){
    return (org.apache.http.impl.conn.AbstractPoolEntry) null;
  }
}
