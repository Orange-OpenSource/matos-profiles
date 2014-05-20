package dalvik.system;

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


public final class VMRuntime
{
  // Constructors

  private VMRuntime(){
  }
  // Methods

  public static VMRuntime getRuntime(){
    return (VMRuntime) null;
  }
  public java.lang.String [] properties(){
    return (java.lang.String []) null;
  }
  public java.lang.String classPath(){
    return (java.lang.String) null;
  }
  public java.lang.String bootClassPath(){
    return (java.lang.String) null;
  }
  public java.lang.String vmVersion(){
    return (java.lang.String) null;
  }
  public void clearGrowthLimit(){
  }
  public float setTargetHeapUtilization(float arg1){
    return 0.0f;
  }
  public java.lang.Object newNonMovableArray(java.lang.Class<?> arg1, int arg2){
    return (java.lang.Object) null;
  }
  public long addressOf(java.lang.Object arg1){
    return 0l;
  }
  public float getTargetHeapUtilization(){
    return 0.0f;
  }
  public void setTargetSdkVersion(int arg1){
  }
  public long getMinimumHeapSize(){
    return 0l;
  }
  @java.lang.Deprecated
  public long setMinimumHeapSize(long arg1){
    return 0l;
  }
  public void gcSoftReferences(){
  }
  public void runFinalizationSync(){
  }
  public boolean trackExternalAllocation(long arg1){
    return false;
  }
  public void trackExternalFree(long arg1){
  }
  public long getExternalBytesAllocated(){
    return 0l;
  }
  public void startJitCompilation(){
  }
  public void disableJitCompilation(){
  }
  public boolean isDebuggerActive(){
    return false;
  }
}
