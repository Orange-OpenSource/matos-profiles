package com.android.server.am;

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


public final class UsageStatsService
  extends com.android.internal.app.IUsageStats.Stub{
  // Fields

  public static final java.lang.String SERVICE_NAME = "usagestats";

  // Constructors

  UsageStatsService(java.lang.String arg1){
    super();
  }
  // Methods

  public void shutdown(){
  }
  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void enforceCallingPermission(){
  }
  public void publish(android.content.Context arg1){
  }
  public static com.android.internal.app.IUsageStats getService(){
    return (com.android.internal.app.IUsageStats) null;
  }
  public void noteLaunchTime(android.content.ComponentName arg1, int arg2){
  }
  public void noteResumeComponent(android.content.ComponentName arg1){
  }
  public void notePauseComponent(android.content.ComponentName arg1){
  }
  public com.android.internal.os.PkgUsageStats getPkgUsageStats(android.content.ComponentName arg1){
    return (com.android.internal.os.PkgUsageStats) null;
  }
  public com.android.internal.os.PkgUsageStats [] getAllPkgUsageStats(){
    return (com.android.internal.os.PkgUsageStats []) null;
  }
  public void monitorPackages(){
  }
}
