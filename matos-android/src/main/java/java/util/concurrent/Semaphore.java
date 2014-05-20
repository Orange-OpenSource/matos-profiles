package java.util.concurrent;

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


public class Semaphore
  implements java.io.Serializable
{
  // Constructors

  public Semaphore(int arg1){
  }
  public Semaphore(int arg1, boolean arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void acquire() throws java.lang.InterruptedException{
  }
  public void acquire(int arg1) throws java.lang.InterruptedException{
  }
  public void release(){
  }
  public void release(int arg1){
  }
  public final int getQueueLength(){
    return 0;
  }
  protected java.util.Collection<java.lang.Thread> getQueuedThreads(){
    return (java.util.Collection) null;
  }
  public final boolean hasQueuedThreads(){
    return false;
  }
  public boolean isFair(){
    return false;
  }
  public boolean tryAcquire(){
    return false;
  }
  public boolean tryAcquire(long arg1, TimeUnit arg2) throws java.lang.InterruptedException{
    return false;
  }
  public boolean tryAcquire(int arg1){
    return false;
  }
  public boolean tryAcquire(int arg1, long arg2, TimeUnit arg3) throws java.lang.InterruptedException{
    return false;
  }
  protected void reducePermits(int arg1){
  }
  public int drainPermits(){
    return 0;
  }
  public void acquireUninterruptibly(){
  }
  public void acquireUninterruptibly(int arg1){
  }
  public int availablePermits(){
    return 0;
  }
}
