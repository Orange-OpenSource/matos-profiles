package android.opengl;

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


public class GLSurfaceView
  extends android.view.SurfaceView  implements android.view.SurfaceHolder.Callback
{
  // Classes

  public static interface GLWrapper
  {
    // Methods

    public javax.microedition.khronos.opengles.GL wrap(javax.microedition.khronos.opengles.GL arg1);
  }
  public static interface Renderer
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onRender")
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 arg1, javax.microedition.khronos.egl.EGLConfig arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onRender")
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 arg1, int arg2, int arg3);
    @com.francetelecom.rd.stubs.annotation.CallBack("onRender")
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 arg1);
  }
  public static interface EGLContextFactory
  {
    // Methods

    public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 arg1, javax.microedition.khronos.egl.EGLDisplay arg2, javax.microedition.khronos.egl.EGLConfig arg3);
    public void destroyContext(javax.microedition.khronos.egl.EGL10 arg1, javax.microedition.khronos.egl.EGLDisplay arg2, javax.microedition.khronos.egl.EGLContext arg3);
  }
  public static interface EGLWindowSurfaceFactory
  {
    // Methods

    public void destroySurface(javax.microedition.khronos.egl.EGL10 arg1, javax.microedition.khronos.egl.EGLDisplay arg2, javax.microedition.khronos.egl.EGLSurface arg3);
    public javax.microedition.khronos.egl.EGLSurface createWindowSurface(javax.microedition.khronos.egl.EGL10 arg1, javax.microedition.khronos.egl.EGLDisplay arg2, javax.microedition.khronos.egl.EGLConfig arg3, java.lang.Object arg4);
  }
  public static interface EGLConfigChooser
  {
    // Methods

    public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 arg1, javax.microedition.khronos.egl.EGLDisplay arg2);
  }
  // Fields

  public static final int RENDERMODE_WHEN_DIRTY = 0;

  public static final int RENDERMODE_CONTINUOUSLY = 1;

  public static final int DEBUG_CHECK_GL_ERROR = 1;

  public static final int DEBUG_LOG_GL_CALLS = 2;

  // Constructors

  public GLSurfaceView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public GLSurfaceView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  public void onResume(){
  }
  public void onPause(){
  }
  protected void onAttachedToWindow(){
  }
  protected void onDetachedFromWindow(){
  }
  public void surfaceChanged(android.view.SurfaceHolder arg1, int arg2, int arg3, int arg4){
  }
  public void surfaceCreated(android.view.SurfaceHolder arg1){
  }
  public void surfaceDestroyed(android.view.SurfaceHolder arg1){
  }
  public void setRenderMode(int arg1){
  }
  public int getRenderMode(){
    return 0;
  }
  public void requestRender(){
  }
  public void queueEvent(@com.francetelecom.rd.stubs.annotation.CallBackRegister("java.lang.Runnable.run") java.lang.Runnable arg1){
  }
  public void setGLWrapper(GLSurfaceView.GLWrapper arg1){
  }
  public void setDebugFlags(int arg1){
  }
  public int getDebugFlags(){
    return 0;
  }
  public void setPreserveEGLContextOnPause(boolean arg1){
  }
  public boolean getPreserveEGLContextOnPause(){
    return false;
  }
  public void setRenderer(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.opengl.GLSurfaceView.Renderer.onRender") GLSurfaceView.Renderer arg1){
  }
  public void setEGLContextFactory(GLSurfaceView.EGLContextFactory arg1){
  }
  public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory arg1){
  }
  public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser arg1){
  }
  public void setEGLConfigChooser(boolean arg1){
  }
  public void setEGLConfigChooser(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public void setEGLContextClientVersion(int arg1){
  }
}
