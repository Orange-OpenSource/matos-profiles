package libcore.net.http;

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
public final class HttpResponseCache
  extends java.net.ResponseCache{
  // Constructors

  public HttpResponseCache(java.io.File arg1, long arg2) throws java.io.IOException{
    super();
  }
  // Methods

  public java.net.CacheResponse get(java.net.URI arg1, java.lang.String arg2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> arg3){
    return (java.net.CacheResponse) null;
  }
  public java.net.CacheRequest put(java.net.URI arg1, java.net.URLConnection arg2) throws java.io.IOException{
    return (java.net.CacheRequest) null;
  }
  public synchronized int getNetworkCount(){
    return 0;
  }
  public synchronized int getHitCount(){
    return 0;
  }
  public synchronized int getRequestCount(){
    return 0;
  }
  public libcore.io.DiskLruCache getCache(){
    return (libcore.io.DiskLruCache) null;
  }
  public synchronized int getWriteAbortCount(){
    return 0;
  }
  public synchronized int getWriteSuccessCount(){
    return 0;
  }
}
