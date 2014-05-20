package dalvik.system.profiler;

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


public final class HprofData
{
  // Classes

  public static enum ThreadEventType
  {
    // Enum Constants

    START()
, END()
;
    // Fields

    // Constructors

    private ThreadEventType(){
    }
    // Methods

  }
  public static final class ThreadEvent
  {
    // Fields

    public final HprofData.ThreadEventType type = (HprofData.ThreadEventType) null;

    public final int objectId = 0;

    public final int threadId = 0;

    public final java.lang.String threadName = (java.lang.String) null;

    public final java.lang.String groupName = (java.lang.String) null;

    public final java.lang.String parentGroupName = (java.lang.String) null;

    // Constructors

    private ThreadEvent(HprofData.ThreadEventType arg1, int arg2, int arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6){
    }
    private ThreadEvent(HprofData.ThreadEventType arg1, int arg2){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public int hashCode(){
      return 0;
    }
    public static HprofData.ThreadEvent start(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5){
      return (HprofData.ThreadEvent) null;
    }
    public static HprofData.ThreadEvent end(int arg1){
      return (HprofData.ThreadEvent) null;
    }
  }
  public static final class StackTrace
  {
    // Fields

    public final int stackTraceId = 0;

    // Constructors

    StackTrace(){
    }
    public StackTrace(int arg1, int arg2, java.lang.StackTraceElement [] arg3){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public int hashCode(){
      return 0;
    }
    public int getThreadId(){
      return 0;
    }
    public java.lang.StackTraceElement [] getStackFrames(){
      return (java.lang.StackTraceElement []) null;
    }
  }
  public static final class Sample
  {
    // Fields

    public final HprofData.StackTrace stackTrace = (HprofData.StackTrace) null;

    public final int count = 0;

    // Constructors

    private Sample(HprofData.StackTrace arg1, int arg2){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public int hashCode(){
      return 0;
    }
  }
  // Constructors

  public HprofData(java.util.Map<HprofData.StackTrace, int []> arg1){
  }
  // Methods

  public void setFlags(int arg1){
  }
  public int getFlags(){
    return 0;
  }
  public long getStartMillis(){
    return 0l;
  }
  public void setStartMillis(long arg1){
  }
  public int getDepth(){
    return 0;
  }
  public void setDepth(int arg1){
  }
  public java.util.List<HprofData.ThreadEvent> getThreadHistory(){
    return (java.util.List) null;
  }
  public java.util.Set<HprofData.Sample> getSamples(){
    return (java.util.Set) null;
  }
  public void addThreadEvent(HprofData.ThreadEvent arg1){
  }
  public void addStackTrace(HprofData.StackTrace arg1, int [] arg2){
  }
}
