package com.google.android.mms.util;

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


public final class PduCache
  extends AbstractCache<android.net.Uri, PduCacheEntry>{
  // Constructors

  private PduCache(){
    super();
  }
  // Methods

  public synchronized boolean put(android.net.Uri arg1, PduCacheEntry arg2){
    return false;
  }
  public static final synchronized PduCache getInstance(){
    return (PduCache) null;
  }
  public synchronized PduCacheEntry purge(android.net.Uri arg1){
    return (PduCacheEntry) null;
  }
  public synchronized void purgeAll(){
  }
}
