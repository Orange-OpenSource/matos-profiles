package android.filterfw.core;

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
public class SyncRunner
  extends GraphRunner{
  // Constructors

  public SyncRunner(FilterContext arg1, FilterGraph arg2, java.lang.Class arg3){
    super((FilterContext) null);
  }
  // Methods

  public void run(){
  }
  public void stop(){
  }
  public void close(){
  }
  public boolean isRunning(){
    return false;
  }
  public synchronized java.lang.Exception getError(){
    return (java.lang.Exception) null;
  }
  public int step(){
    return 0;
  }
  public FilterGraph getGraph(){
    return (FilterGraph) null;
  }
  public void beginProcessing(){
  }
  protected int determinePostRunState(){
    return 0;
  }
  protected void waitUntilWake(){
  }
  protected void scheduleFilterWake(Filter arg1, int arg2){
  }
  public void setDoneCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnRunnerDoneListener") GraphRunner.OnRunnerDoneListener arg1){
  }
  protected void processFilterNode(Filter arg1){
  }
}
