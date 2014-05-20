package android.webkit;

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
public final class CacheManager
{
  // Classes

  public static class CacheResult
  {
    // Constructors

    public CacheResult(){
    }
    // Methods

    public java.lang.String getLocation(){
      return (java.lang.String) null;
    }
    public java.lang.String getLocalPath(){
      return (java.lang.String) null;
    }
    public java.lang.String getEncoding(){
      return (java.lang.String) null;
    }
    public java.io.InputStream getInputStream(){
      return (java.io.InputStream) null;
    }
    public long getContentLength(){
      return 0l;
    }
    public java.lang.String getLastModified(){
      return (java.lang.String) null;
    }
    public void setContentLength(long arg1){
    }
    public java.io.OutputStream getOutputStream(){
      return (java.io.OutputStream) null;
    }
    public void setEncoding(java.lang.String arg1){
    }
    public long getExpires(){
      return 0l;
    }
    public java.lang.String getContentDisposition(){
      return (java.lang.String) null;
    }
    public java.lang.String getMimeType(){
      return (java.lang.String) null;
    }
    public java.lang.String getETag(){
      return (java.lang.String) null;
    }
    public void setInputStream(java.io.InputStream arg1){
    }
    public int getHttpStatusCode(){
      return 0;
    }
    public java.lang.String getExpiresString(){
      return (java.lang.String) null;
    }
  }
  // Constructors

  public CacheManager(){
  }
  // Methods

  public static CacheManager.CacheResult createCacheFile(java.lang.String arg1, int arg2, android.net.http.Headers arg3, java.lang.String arg4, boolean arg5){
    return (CacheManager.CacheResult) null;
  }
  public static void saveCacheFile(java.lang.String arg1, CacheManager.CacheResult arg2){
  }
  public static boolean cacheDisabled(){
    return false;
  }
  public static CacheManager.CacheResult getCacheFile(java.lang.String arg1, java.util.Map<java.lang.String, java.lang.String> arg2){
    return (CacheManager.CacheResult) null;
  }
  public static boolean startCacheTransaction(){
    return false;
  }
  public static boolean endCacheTransaction(){
    return false;
  }
  public static java.io.File getCacheFileBaseDir(){
    return (java.io.File) null;
  }
}
