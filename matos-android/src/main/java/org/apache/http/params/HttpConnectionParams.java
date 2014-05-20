package org.apache.http.params;

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
public final class HttpConnectionParams
  implements CoreConnectionPNames
{
  // Constructors

  private HttpConnectionParams(){
  }
  // Methods

  public static int getSoTimeout(HttpParams arg1){
    return 0;
  }
  public static void setSoTimeout(HttpParams arg1, int arg2){
  }
  public static boolean getTcpNoDelay(HttpParams arg1){
    return false;
  }
  public static void setTcpNoDelay(HttpParams arg1, boolean arg2){
  }
  public static int getSocketBufferSize(HttpParams arg1){
    return 0;
  }
  public static void setSocketBufferSize(HttpParams arg1, int arg2){
  }
  public static int getLinger(HttpParams arg1){
    return 0;
  }
  public static void setLinger(HttpParams arg1, int arg2){
  }
  public static int getConnectionTimeout(HttpParams arg1){
    return 0;
  }
  public static void setConnectionTimeout(HttpParams arg1, int arg2){
  }
  public static boolean isStaleCheckingEnabled(HttpParams arg1){
    return false;
  }
  public static void setStaleCheckingEnabled(HttpParams arg1, boolean arg2){
  }
}
