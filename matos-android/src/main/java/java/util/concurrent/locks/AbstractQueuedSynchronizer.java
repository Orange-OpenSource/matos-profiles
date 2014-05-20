package java.util.concurrent.locks;

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


public abstract class AbstractQueuedSynchronizer
  extends AbstractOwnableSynchronizer  implements java.io.Serializable
{
  // Classes

  public class ConditionObject
    implements java.io.Serializable, Condition
  {
    // Fields

    // Constructors

    public ConditionObject(){
    }
    // Methods

    protected final int getWaitQueueLength(){
      return 0;
    }
    protected final java.util.Collection<java.lang.Thread> getWaitingThreads(){
      return (java.util.Collection) null;
    }
    protected final boolean hasWaiters(){
      return false;
    }
    public final void signal(){
    }
    public final void await() throws java.lang.InterruptedException{
    }
    public final boolean await(long arg1, java.util.concurrent.TimeUnit arg2) throws java.lang.InterruptedException{
      return false;
    }
    public final void signalAll(){
    }
    public final long awaitNanos(long arg1) throws java.lang.InterruptedException{
      return 0l;
    }
    public final void awaitUninterruptibly(){
    }
    public final boolean awaitUntil(java.util.Date arg1) throws java.lang.InterruptedException{
      return false;
    }
  }
  // Constructors

  protected AbstractQueuedSynchronizer(){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  protected final int getState(){
    return 0;
  }
  public final void acquire(int arg1){
  }
  public final boolean release(int arg1){
    return false;
  }
  protected final void setState(int arg1){
  }
  public final void acquireInterruptibly(int arg1) throws java.lang.InterruptedException{
  }
  public final int getQueueLength(){
    return 0;
  }
  public final java.util.Collection<java.lang.Thread> getQueuedThreads(){
    return (java.util.Collection) null;
  }
  public final int getWaitQueueLength(AbstractQueuedSynchronizer.ConditionObject arg1){
    return 0;
  }
  public final java.util.Collection<java.lang.Thread> getWaitingThreads(AbstractQueuedSynchronizer.ConditionObject arg1){
    return (java.util.Collection) null;
  }
  public final boolean hasQueuedThreads(){
    return false;
  }
  public final boolean hasWaiters(AbstractQueuedSynchronizer.ConditionObject arg1){
    return false;
  }
  protected boolean isHeldExclusively(){
    return false;
  }
  public final boolean isQueued(java.lang.Thread arg1){
    return false;
  }
  public final boolean tryAcquireNanos(int arg1, long arg2) throws java.lang.InterruptedException{
    return false;
  }
  protected final boolean compareAndSetState(int arg1, int arg2){
    return false;
  }
  protected boolean tryAcquire(int arg1){
    return false;
  }
  protected boolean tryRelease(int arg1){
    return false;
  }
  public final void acquireShared(int arg1){
  }
  public final void acquireSharedInterruptibly(int arg1) throws java.lang.InterruptedException{
  }
  public final java.util.Collection<java.lang.Thread> getExclusiveQueuedThreads(){
    return (java.util.Collection) null;
  }
  public final java.lang.Thread getFirstQueuedThread(){
    return (java.lang.Thread) null;
  }
  public final java.util.Collection<java.lang.Thread> getSharedQueuedThreads(){
    return (java.util.Collection) null;
  }
  public final boolean hasContended(){
    return false;
  }
  public final boolean owns(AbstractQueuedSynchronizer.ConditionObject arg1){
    return false;
  }
  public final boolean releaseShared(int arg1){
    return false;
  }
  protected int tryAcquireShared(int arg1){
    return 0;
  }
  public final boolean tryAcquireSharedNanos(int arg1, long arg2) throws java.lang.InterruptedException{
    return false;
  }
  protected boolean tryReleaseShared(int arg1){
    return false;
  }
  public final boolean hasQueuedPredecessors(){
    return false;
  }
}
