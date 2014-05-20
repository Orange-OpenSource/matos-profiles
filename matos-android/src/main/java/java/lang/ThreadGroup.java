package java.lang;

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


public class ThreadGroup
  implements Thread.UncaughtExceptionHandler
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ThreadGroup(String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ThreadGroup(ThreadGroup arg1, String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  private ThreadGroup(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void uncaughtException(Thread arg1, Throwable arg2){
  }
  public String toString(){
    return (String) null;
  }
  public final String getName(){
    return (String) null;
  }
  public final ThreadGroup getParent(){
    return (ThreadGroup) null;
  }
  public final void setDaemon(boolean arg1){
  }
  public int activeCount(){
    return 0;
  }
  public final void checkAccess(){
  }
  public final void destroy(){
  }
  public int enumerate(Thread [] arg1){
    return 0;
  }
  public int enumerate(Thread [] arg1, boolean arg2){
    return 0;
  }
  public int enumerate(ThreadGroup [] arg1){
    return 0;
  }
  public int enumerate(ThreadGroup [] arg1, boolean arg2){
    return 0;
  }
  public final int getMaxPriority(){
    return 0;
  }
  public final void interrupt(){
  }
  public final boolean isDaemon(){
    return false;
  }
  public final void resume(){
  }
  public final void stop(){
  }
  public final void suspend(){
  }
  public int activeGroupCount(){
    return 0;
  }
  public boolean allowThreadSuspension(boolean arg1){
    return false;
  }
  public synchronized boolean isDestroyed(){
    return false;
  }
  public void list(){
  }
  public final boolean parentOf(ThreadGroup arg1){
    return false;
  }
  public final void setMaxPriority(int arg1){
  }
}
