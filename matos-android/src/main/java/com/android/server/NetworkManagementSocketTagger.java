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


public final class NetworkManagementSocketTagger
  extends dalvik.system.SocketTagger{
  // Classes

  public static class SocketTags
  {
    // Fields

    public int statsTag;

    public int statsUid;

    // Constructors

    public SocketTags(){
    }
  }
  // Fields

  public static final java.lang.String PROP_QTAGUID_ENABLED = "net.qtaguid_enabled";

  // Constructors

  public NetworkManagementSocketTagger(){
    super();
  }
  // Methods

  public static void install(){
  }
  public void tag(java.io.FileDescriptor arg1) throws java.net.SocketException{
  }
  public void untag(java.io.FileDescriptor arg1) throws java.net.SocketException{
  }
  public static void setThreadSocketStatsTag(int arg1){
  }
  public static int getThreadSocketStatsTag(){
    return 0;
  }
  public static void setThreadSocketStatsUid(int arg1){
  }
  public static void setKernelCounterSet(int arg1, int arg2){
  }
  public static void resetKernelUidStats(int arg1){
  }
  public static int kernelToTag(java.lang.String arg1){
    return 0;
  }
}
