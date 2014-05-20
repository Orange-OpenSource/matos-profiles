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
public class HttpConnectionMetricsImpl
  implements org.apache.http.HttpConnectionMetrics
{
  // Fields

  public static final java.lang.String REQUEST_COUNT = "http.request-count";

  public static final java.lang.String RESPONSE_COUNT = "http.response-count";

  public static final java.lang.String SENT_BYTES_COUNT = "http.sent-bytes-count";

  public static final java.lang.String RECEIVED_BYTES_COUNT = "http.received-bytes-count";

  // Constructors

  public HttpConnectionMetricsImpl(org.apache.http.io.HttpTransportMetrics arg1, org.apache.http.io.HttpTransportMetrics arg2){
  }
  // Methods

  public void reset(){
  }
  public long getRequestCount(){
    return 0l;
  }
  public void incrementRequestCount(){
  }
  public void incrementResponseCount(){
  }
  public long getReceivedBytesCount(){
    return 0l;
  }
  public long getSentBytesCount(){
    return 0l;
  }
  public long getResponseCount(){
    return 0l;
  }
  public java.lang.Object getMetric(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public void setMetric(java.lang.String arg1, java.lang.Object arg2){
  }
}
