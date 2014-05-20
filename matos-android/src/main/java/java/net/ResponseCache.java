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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ResponseCache", superClass = "")
public abstract class ResponseCache
{
  // Constructors

  public ResponseCache(){
  }
  // Methods

  public abstract CacheResponse get(URI arg1, java.lang.String arg2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> arg3) throws java.io.IOException;
  public abstract CacheRequest put(URI arg1, URLConnection arg2) throws java.io.IOException;
  public static ResponseCache getDefault(){
    return (ResponseCache) null;
  }
  public static void setDefault(ResponseCache arg1){
  }
}
