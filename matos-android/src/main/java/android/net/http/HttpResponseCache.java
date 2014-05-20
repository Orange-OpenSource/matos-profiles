package android.net.http;

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

import com.francetelecom.rd.stubs.annotation.UseRule;


public final class HttpResponseCache
  extends java.net.ResponseCache  implements java.io.Closeable
{
  // Constructors

  private HttpResponseCache(java.io.File arg1, long arg2) throws java.io.IOException{
    super();
  }
  // Methods

  public java.net.CacheResponse get(java.net.URI arg1, java.lang.String arg2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> arg3) throws java.io.IOException{
    return (java.net.CacheResponse) null;
  }
  public java.net.CacheRequest put(java.net.URI arg1, java.net.URLConnection arg2) throws java.io.IOException{
    return (java.net.CacheRequest) null;
  }
  public long size(){
    return 0l;
  }
  public void close() throws java.io.IOException{
  }
  public void flush(){
  }
  public void delete() throws java.io.IOException{
  }
  @UseRule("HttpResponseCache.install")
  public static HttpResponseCache install(java.io.File arg1, long arg2) throws java.io.IOException{
    return (HttpResponseCache) null;
  }
  public long maxSize(){
    return 0l;
  }
  @UseRule("HttpResponseCache.getInstalled")
  public static HttpResponseCache getInstalled(){
    return (HttpResponseCache) null;
  }
  public int getNetworkCount(){
    return 0;
  }
  public int getHitCount(){
    return 0;
  }
  public int getRequestCount(){
    return 0;
  }
}
