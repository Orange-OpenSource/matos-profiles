package android.os;

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
public class Looper
{
  // Classes

  public static interface Profiler
  {
    // Methods

    public void profile(Message arg1, long arg2, long arg3, long arg4, long arg5);
  }
  // Constructors

  private Looper(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static void loop(){
  }
  public static void prepare(){
  }
  public void dump(android.util.Printer arg1, java.lang.String arg2){
  }
  public static synchronized Looper getMainLooper(){
    return (Looper) null;
  }
  public void quit(){
  }
  public static Looper myLooper(){
    return (Looper) null;
  }
  public MessageQueue getQueue(){
    return (MessageQueue) null;
  }
  public java.lang.Thread getThread(){
    return (java.lang.Thread) null;
  }
  public static MessageQueue myQueue(){
    return (MessageQueue) null;
  }
  public static void prepareMainLooper(){
  }
  public void setMessageLogging(android.util.Printer arg1){
  }
}
