package android.view;

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
public interface SurfaceHolder
{
  // Classes

  public static class BadSurfaceTypeException
    extends java.lang.RuntimeException  {
    // Constructors

    public BadSurfaceTypeException(){
      super();
    }
    public BadSurfaceTypeException(java.lang.String arg1){
      super();
    }
  }
  public static interface Callback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("surfaceChange")
    public void surfaceChanged(SurfaceHolder arg1, int arg2, int arg3, int arg4);
    @com.francetelecom.rd.stubs.annotation.CallBack("surfaceChange")
    public void surfaceCreated(SurfaceHolder arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("surfaceChange")
    public void surfaceDestroyed(SurfaceHolder arg1);
  }
  public static interface Callback2
    extends SurfaceHolder.Callback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("surfaceChange2")
    public void surfaceRedrawNeeded(SurfaceHolder arg1);
  }
  // Fields

  public static final int SURFACE_TYPE_NORMAL = 0;

  public static final int SURFACE_TYPE_HARDWARE = 1;

  public static final int SURFACE_TYPE_GPU = 2;

  public static final int SURFACE_TYPE_PUSH_BUFFERS = 3;

  // Methods

  public void setKeepScreenOn(boolean arg1);
  public android.graphics.Canvas lockCanvas();
  public android.graphics.Canvas lockCanvas(android.graphics.Rect arg1);
  public void unlockCanvasAndPost(android.graphics.Canvas arg1);
  public void setFormat(int arg1);
  public void setType(int arg1);
  public boolean isCreating();
  public void setFixedSize(int arg1, int arg2);
  public void addCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.SurfaceHolder.Callback.surfaceChange") SurfaceHolder.Callback arg1);
  public void removeCallback(SurfaceHolder.Callback arg1);
  public void setSizeFromLayout();
  public Surface getSurface();
  public android.graphics.Rect getSurfaceFrame();
}
