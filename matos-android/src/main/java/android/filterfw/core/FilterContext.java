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


public class FilterContext
{
  // Classes

  public static interface OnFrameReceivedListener
  {
    // Methods

    public void onFrameReceived(Filter arg1, Frame arg2, java.lang.Object arg3);
  }
  // Constructors

  public FilterContext(){
  }
  // Methods

  public synchronized void tearDown(){
  }
  public GLEnvironment getGLEnvironment(){
    return (GLEnvironment) null;
  }
  public FrameManager getFrameManager(){
    return (FrameManager) null;
  }
  public synchronized void storeFrame(java.lang.String arg1, Frame arg2){
  }
  public void setFrameManager(FrameManager arg1){
  }
  public void initGLEnvironment(GLEnvironment arg1){
  }
  public synchronized Frame fetchFrame(java.lang.String arg1){
    return (Frame) null;
  }
  public synchronized void removeFrame(java.lang.String arg1){
  }
}
