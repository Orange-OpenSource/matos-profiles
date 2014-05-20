package gov.nist.core;

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


public class ThreadAuditor
{
  // Classes

  public class ThreadHandle
  {
    // Fields

    // Constructors

    public ThreadHandle(){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public java.lang.Thread getThread(){
      return (java.lang.Thread) null;
    }
    public void ping(){
    }
    public long getPingIntervalInMillisecs(){
      return 0l;
    }
    protected void setThreadActive(boolean arg1){
    }
    public boolean isThreadActive(){
      return false;
    }
  }
  // Constructors

  public ThreadAuditor(){
  }
  // Methods

  public synchronized java.lang.String toString(){
    return (java.lang.String) null;
  }
  public synchronized void reset(){
  }
  public boolean isEnabled(){
    return false;
  }
  public synchronized void ping(ThreadAuditor.ThreadHandle arg1){
  }
  public synchronized ThreadAuditor.ThreadHandle addCurrentThread(){
    return (ThreadAuditor.ThreadHandle) null;
  }
  public long getPingIntervalInMillisecs(){
    return 0l;
  }
  public synchronized void removeThread(java.lang.Thread arg1){
  }
  public void setPingIntervalInMillisecs(long arg1){
  }
  public synchronized java.lang.String auditThreads(){
    return (java.lang.String) null;
  }
}
