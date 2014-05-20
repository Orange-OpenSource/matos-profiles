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


public abstract class FrameManager
{
  // Constructors

  public FrameManager(){
  }
  // Methods

  public FilterContext getContext(){
    return (FilterContext) null;
  }
  public void tearDown(){
  }
  public abstract Frame newBoundFrame(FrameFormat arg1, int arg2, long arg3);
  public abstract Frame releaseFrame(Frame arg1);
  public abstract Frame newFrame(FrameFormat arg1);
  public abstract Frame retainFrame(Frame arg1);
  public GLEnvironment getGLEnvironment(){
    return (GLEnvironment) null;
  }
  public Frame duplicateFrameToTarget(Frame arg1, int arg2){
    return (Frame) null;
  }
  public Frame duplicateFrame(Frame arg1){
    return (Frame) null;
  }
}
