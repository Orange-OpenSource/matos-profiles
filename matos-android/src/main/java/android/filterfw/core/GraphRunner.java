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
public abstract class GraphRunner
{
  // Classes

  public static interface OnRunnerDoneListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnRunnerDoneListener")
    public void onRunnerDone(int arg1);
  }
  // Fields

  protected FilterContext mFilterContext;

  public static final int RESULT_UNKNOWN = 0;

  public static final int RESULT_RUNNING = 1;

  public static final int RESULT_FINISHED = 2;

  public static final int RESULT_SLEEPING = 3;

  public static final int RESULT_BLOCKED = 4;

  public static final int RESULT_STOPPED = 5;

  public static final int RESULT_ERROR = 6;

  // Constructors

  public GraphRunner(FilterContext arg1){
  }
  // Methods

  public abstract void run();
  public FilterContext getContext(){
    return (FilterContext) null;
  }
  public abstract void stop();
  public abstract void close();
  public abstract boolean isRunning();
  public abstract java.lang.Exception getError();
  public abstract FilterGraph getGraph();
  public abstract void setDoneCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnRunnerDoneListener") GraphRunner.OnRunnerDoneListener arg1);
  protected boolean activateGlContext(){
    return false;
  }
  protected void deactivateGlContext(){
  }
}
