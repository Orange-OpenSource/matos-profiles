package com.android.internal.view;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.BaseSurfaceHolderImplem", superClass = "")
public abstract class BaseSurfaceHolder
  implements android.view.SurfaceHolder
{
  // Fields

  public final java.util.ArrayList<android.view.SurfaceHolder.Callback> mCallbacks = (java.util.ArrayList) null;

  public final java.util.concurrent.locks.ReentrantLock mSurfaceLock = (java.util.concurrent.locks.ReentrantLock) null;

  public android.view.Surface mSurface;

  protected int mRequestedFormat;

  // Constructors

  public BaseSurfaceHolder(){
  }
  // Methods

  public android.graphics.Canvas lockCanvas(){
    return (android.graphics.Canvas) null;
  }
  public android.graphics.Canvas lockCanvas(android.graphics.Rect arg1){
    return (android.graphics.Canvas) null;
  }
  public void unlockCanvasAndPost(android.graphics.Canvas arg1){
  }
  public void setFormat(int arg1){
  }
  public void setType(int arg1){
  }
  public void setFixedSize(int arg1, int arg2){
  }
  public void addCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("surfaceChange") android.view.SurfaceHolder.Callback arg1){
  }
  public void removeCallback(android.view.SurfaceHolder.Callback arg1){
  }
  public void setSizeFromLayout(){
  }
  public android.view.Surface getSurface(){
    return (android.view.Surface) null;
  }
  public android.graphics.Rect getSurfaceFrame(){
    return (android.graphics.Rect) null;
  }
  public abstract boolean onAllowLockCanvas();
  public abstract void onRelayoutContainer();
  public abstract void onUpdateSurface();
  public int getRequestedWidth(){
    return 0;
  }
  public int getRequestedHeight(){
    return 0;
  }
  public int getRequestedFormat(){
    return 0;
  }
  public int getRequestedType(){
    return 0;
  }
  public android.view.SurfaceHolder.Callback [] getCallbacks(){
    return (android.view.SurfaceHolder.Callback []) null;
  }
  public void ungetCallbacks(){
  }
  public void setSurfaceFrameSize(int arg1, int arg2){
  }
}
