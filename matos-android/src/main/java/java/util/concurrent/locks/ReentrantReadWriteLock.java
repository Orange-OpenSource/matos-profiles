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


public class ReentrantReadWriteLock
  implements ReadWriteLock, java.io.Serializable
{
  // Classes

  public static class ReadLock
    implements java.io.Serializable, Lock
  {
    // Constructors

    protected ReadLock(ReentrantReadWriteLock arg1){
    }
    // Methods

    public void lock(){
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void unlock(){
    }
    public void lockInterruptibly() throws java.lang.InterruptedException{
    }
    public Condition newCondition(){
      return (Condition) null;
    }
    public boolean tryLock(){
      return false;
    }
    public boolean tryLock(long arg1, java.util.concurrent.TimeUnit arg2) throws java.lang.InterruptedException{
      return false;
    }
  }
  public static class WriteLock
    implements java.io.Serializable, Lock
  {
    // Constructors

    protected WriteLock(ReentrantReadWriteLock arg1){
    }
    // Methods

    public void lock(){
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public void unlock(){
    }
    public int getHoldCount(){
      return 0;
    }
    public boolean isHeldByCurrentThread(){
      return false;
    }
    public void lockInterruptibly() throws java.lang.InterruptedException{
    }
    public Condition newCondition(){
      return (Condition) null;
    }
    public boolean tryLock(){
      return false;
    }
    public boolean tryLock(long arg1, java.util.concurrent.TimeUnit arg2) throws java.lang.InterruptedException{
      return false;
    }
  }
  // Constructors

  public ReentrantReadWriteLock(){
  }
  public ReentrantReadWriteLock(boolean arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  protected java.lang.Thread getOwner(){
    return (java.lang.Thread) null;
  }
  public final int getQueueLength(){
    return 0;
  }
  protected java.util.Collection<java.lang.Thread> getQueuedThreads(){
    return (java.util.Collection) null;
  }
  public int getWaitQueueLength(Condition arg1){
    return 0;
  }
  protected java.util.Collection<java.lang.Thread> getWaitingThreads(Condition arg1){
    return (java.util.Collection) null;
  }
  public final boolean hasQueuedThread(java.lang.Thread arg1){
    return false;
  }
  public final boolean hasQueuedThreads(){
    return false;
  }
  public boolean hasWaiters(Condition arg1){
    return false;
  }
  public final boolean isFair(){
    return false;
  }
  public ReentrantReadWriteLock.ReadLock readLock(){
    return (ReentrantReadWriteLock.ReadLock) null;
  }
  public ReentrantReadWriteLock.WriteLock writeLock(){
    return (ReentrantReadWriteLock.WriteLock) null;
  }
  public int getReadLockCount(){
    return 0;
  }
  public int getWriteHoldCount(){
    return 0;
  }
  public boolean isWriteLocked(){
    return false;
  }
  public boolean isWriteLockedByCurrentThread(){
    return false;
  }
  public int getReadHoldCount(){
    return 0;
  }
  protected java.util.Collection<java.lang.Thread> getQueuedWriterThreads(){
    return (java.util.Collection) null;
  }
  protected java.util.Collection<java.lang.Thread> getQueuedReaderThreads(){
    return (java.util.Collection) null;
  }
}
