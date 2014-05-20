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


public class GLEnvironment
{
  // Constructors

  public GLEnvironment(){
  }
  private GLEnvironment(NativeAllocatorTag arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public synchronized void tearDown(){
  }
  public boolean isActive(){
    return false;
  }
  public void deactivate(){
  }
  public int registerSurfaceTexture(android.graphics.SurfaceTexture arg1, int arg2, int arg3){
    return 0;
  }
  public void activateSurfaceWithId(int arg1){
  }
  public void setSurfaceTimestamp(long arg1){
  }
  public void swapBuffers(){
  }
  public void activate(){
  }
  public void initWithNewContext(){
  }
  public void initWithCurrentContext(){
  }
  public boolean isContextActive(){
    return false;
  }
  public static boolean isAnyContextActive(){
    return false;
  }
  public int registerSurface(android.view.Surface arg1){
    return 0;
  }
  public int registerSurfaceFromMediaRecorder(android.media.MediaRecorder arg1){
    return 0;
  }
  public void unregisterSurfaceId(int arg1){
  }
}
