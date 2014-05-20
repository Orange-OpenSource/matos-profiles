package android.util;

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
public class EventLog
{
  // Classes

  public static final class Event
  {
    // Constructors

    Event(byte [] arg1){
    }
    // Methods

    public synchronized java.lang.Object getData(){
      return (java.lang.Object) null;
    }
    public int getTag(){
      return 0;
    }
    public int getThreadId(){
      return 0;
    }
    public int getProcessId(){
      return 0;
    }
    public long getTimeNanos(){
      return 0l;
    }
  }
  // Constructors

  public EventLog(){
  }
  // Methods

  public static java.lang.String getTagName(int arg1){
    return (java.lang.String) null;
  }
  public static int writeEvent(int arg1, int arg2){
    return 0;
  }
  public static int writeEvent(int arg1, long arg2){
    return 0;
  }
  public static int writeEvent(int arg1, java.lang.String arg2){
    return 0;
  }
  public static int writeEvent(int arg1, java.lang.Object [] arg2){
    return 0;
  }
  public static void readEvents(int [] arg1, java.util.Collection<EventLog.Event> arg2) throws java.io.IOException{
  }
  public static int getTagCode(java.lang.String arg1){
    return 0;
  }
}
