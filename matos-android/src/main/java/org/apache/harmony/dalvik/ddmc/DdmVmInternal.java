package org.apache.harmony.dalvik.ddmc;

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
public class DdmVmInternal
{
  // Constructors

  private DdmVmInternal(){
  }
  // Methods

  public static void threadNotify(boolean arg1){
  }
  public static byte [] getThreadStats(){
    return (byte []) null;
  }
  public static java.lang.StackTraceElement [] getStackTraceById(int arg1){
    return (java.lang.StackTraceElement []) null;
  }
  public static boolean heapInfoNotify(int arg1){
    return false;
  }
  public static boolean heapSegmentNotify(int arg1, int arg2, boolean arg3){
    return false;
  }
  public static void enableRecentAllocations(boolean arg1){
  }
  public static boolean getRecentAllocationStatus(){
    return false;
  }
  public static byte [] getRecentAllocations(){
    return (byte []) null;
  }
}
