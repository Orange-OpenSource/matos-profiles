package com.android.server;

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


public class ThrottleService
  extends android.net.IThrottleManager.Stub{
  // Constructors

  public ThrottleService(android.content.Context arg1){
    super();
  }
  public ThrottleService(android.content.Context arg1, android.os.INetworkManagementService arg2, android.util.TrustedTime arg3, java.lang.String arg4){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public long getResetTime(java.lang.String arg1){
    return 0l;
  }
  public long getPeriodStartTime(java.lang.String arg1){
    return 0l;
  }
  public long getCliffThreshold(java.lang.String arg1, int arg2){
    return 0l;
  }
  public int getCliffLevel(java.lang.String arg1, int arg2){
    return 0;
  }
  public java.lang.String getHelpUri(){
    return (java.lang.String) null;
  }
  public long getByteCount(java.lang.String arg1, int arg2, int arg3, int arg4){
    return 0l;
  }
  public int getThrottle(java.lang.String arg1){
    return 0;
  }
}
