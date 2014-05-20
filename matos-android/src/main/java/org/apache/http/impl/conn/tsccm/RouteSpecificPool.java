package org.apache.http.impl.conn.tsccm;

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


public class RouteSpecificPool
{
  // Fields

  protected final org.apache.http.conn.routing.HttpRoute route = (org.apache.http.conn.routing.HttpRoute) null;

  protected final int maxEntries = 0;

  protected final java.util.LinkedList<BasicPoolEntry> freeEntries = (java.util.LinkedList) null;

  protected final java.util.Queue<WaitingThread> waitingThreads = (java.util.Queue) null;

  protected int numEntries;

  // Constructors

  public RouteSpecificPool(org.apache.http.conn.routing.HttpRoute arg1, int arg2){
  }
  // Methods

  public void freeEntry(BasicPoolEntry arg1){
  }
  public boolean deleteEntry(BasicPoolEntry arg1){
    return false;
  }
  public final org.apache.http.conn.routing.HttpRoute getRoute(){
    return (org.apache.http.conn.routing.HttpRoute) null;
  }
  public void removeThread(WaitingThread arg1){
  }
  public int getCapacity(){
    return 0;
  }
  public final int getEntryCount(){
    return 0;
  }
  public final int getMaxEntries(){
    return 0;
  }
  public void queueThread(WaitingThread arg1){
  }
  public void dropEntry(){
  }
  public BasicPoolEntry allocEntry(java.lang.Object arg1){
    return (BasicPoolEntry) null;
  }
  public void createdEntry(BasicPoolEntry arg1){
  }
  public boolean isUnused(){
    return false;
  }
  public boolean hasThread(){
    return false;
  }
  public WaitingThread nextThread(){
    return (WaitingThread) null;
  }
}
