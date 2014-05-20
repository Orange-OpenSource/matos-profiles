package com.google.android.gles_jni;

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


public class EGLImpl
  implements javax.microedition.khronos.egl.EGL10
{
  // Constructors

  public EGLImpl(){
  }
  // Methods

  public javax.microedition.khronos.egl.EGLContext eglCreateContext(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLConfig arg2, javax.microedition.khronos.egl.EGLContext arg3, int [] arg4){
    return (javax.microedition.khronos.egl.EGLContext) null;
  }
  public boolean eglDestroyContext(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLContext arg2){
    return false;
  }
  public int eglGetError(){
    return 0;
  }
  public boolean eglChooseConfig(javax.microedition.khronos.egl.EGLDisplay arg1, int [] arg2, javax.microedition.khronos.egl.EGLConfig [] arg3, int arg4, int [] arg5){
    return false;
  }
  public boolean eglCopyBuffers(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLSurface arg2, java.lang.Object arg3){
    return false;
  }
  public javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLConfig arg2, int [] arg3){
    return (javax.microedition.khronos.egl.EGLSurface) null;
  }
  public javax.microedition.khronos.egl.EGLSurface eglCreatePixmapSurface(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLConfig arg2, java.lang.Object arg3, int [] arg4){
    return (javax.microedition.khronos.egl.EGLSurface) null;
  }
  public javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLConfig arg2, java.lang.Object arg3, int [] arg4){
    return (javax.microedition.khronos.egl.EGLSurface) null;
  }
  public boolean eglDestroySurface(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLSurface arg2){
    return false;
  }
  public boolean eglGetConfigAttrib(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLConfig arg2, int arg3, int [] arg4){
    return false;
  }
  public boolean eglGetConfigs(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLConfig [] arg2, int arg3, int [] arg4){
    return false;
  }
  public synchronized javax.microedition.khronos.egl.EGLContext eglGetCurrentContext(){
    return (javax.microedition.khronos.egl.EGLContext) null;
  }
  public synchronized javax.microedition.khronos.egl.EGLDisplay eglGetCurrentDisplay(){
    return (javax.microedition.khronos.egl.EGLDisplay) null;
  }
  public synchronized javax.microedition.khronos.egl.EGLSurface eglGetCurrentSurface(int arg1){
    return (javax.microedition.khronos.egl.EGLSurface) null;
  }
  public synchronized javax.microedition.khronos.egl.EGLDisplay eglGetDisplay(java.lang.Object arg1){
    return (javax.microedition.khronos.egl.EGLDisplay) null;
  }
  public boolean eglInitialize(javax.microedition.khronos.egl.EGLDisplay arg1, int [] arg2){
    return false;
  }
  public boolean eglMakeCurrent(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLSurface arg2, javax.microedition.khronos.egl.EGLSurface arg3, javax.microedition.khronos.egl.EGLContext arg4){
    return false;
  }
  public boolean eglQueryContext(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLContext arg2, int arg3, int [] arg4){
    return false;
  }
  public java.lang.String eglQueryString(javax.microedition.khronos.egl.EGLDisplay arg1, int arg2){
    return (java.lang.String) null;
  }
  public boolean eglQuerySurface(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLSurface arg2, int arg3, int [] arg4){
    return false;
  }
  public boolean eglSwapBuffers(javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLSurface arg2){
    return false;
  }
  public boolean eglTerminate(javax.microedition.khronos.egl.EGLDisplay arg1){
    return false;
  }
  public boolean eglWaitGL(){
    return false;
  }
  public boolean eglWaitNative(int arg1, java.lang.Object arg2){
    return false;
  }
}
