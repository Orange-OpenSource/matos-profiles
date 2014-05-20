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
public class FilterSurfaceView
  extends android.view.SurfaceView  implements android.view.SurfaceHolder.Callback
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("surfaceChange")
  public FilterSurfaceView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("surfaceChange")
  public FilterSurfaceView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("surfaceChange")
  public synchronized void surfaceChanged(android.view.SurfaceHolder arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("surfaceChange")
  public synchronized void surfaceCreated(android.view.SurfaceHolder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("surfaceChange")
  public synchronized void surfaceDestroyed(android.view.SurfaceHolder arg1){
  }
  public synchronized void unbind(){
  }
  public synchronized void bindToListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("surfaceChange") android.view.SurfaceHolder.Callback arg1, GLEnvironment arg2){
  }
  public synchronized int getSurfaceId(){
    return 0;
  }
  public synchronized GLEnvironment getGLEnv(){
    return (GLEnvironment) null;
  }
}
