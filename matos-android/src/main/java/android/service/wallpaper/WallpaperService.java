package android.service.wallpaper;

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
public abstract class WallpaperService
  extends android.app.Service{
  // Classes

  public class Engine
  {
    // Fields

    // Constructors

    @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public Engine(){
    }
    // Methods

    public boolean isVisible(){
      return false;
    }
    protected void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onCreate(android.view.SurfaceHolder arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onDestroy(){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onTouchEvent(android.view.MotionEvent arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onVisibilityChanged(boolean arg1){
    }
    public boolean isPreview(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onSurfaceCreated(android.view.SurfaceHolder arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onSurfaceChanged(android.view.SurfaceHolder arg1, int arg2, int arg3, int arg4){
    }
    public android.view.SurfaceHolder getSurfaceHolder(){
      return (android.view.SurfaceHolder) null;
    }
    public int getDesiredMinimumWidth(){
      return 0;
    }
    public int getDesiredMinimumHeight(){
      return 0;
    }
    public void setTouchEventsEnabled(boolean arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onOffsetsChanged(float arg1, float arg2, float arg3, float arg4, int arg5, int arg6){
    }
    public android.os.Bundle onCommand(java.lang.String arg1, int arg2, int arg3, int arg4, android.os.Bundle arg5, boolean arg6){
      return (android.os.Bundle) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onDesiredSizeChanged(int arg1, int arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onSurfaceRedrawNeeded(android.view.SurfaceHolder arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onSurfaceDestroyed(android.view.SurfaceHolder arg1){
    }
  }
  // Fields

  public static final java.lang.String SERVICE_INTERFACE = "android.service.wallpaper.WallpaperService";

  public static final java.lang.String SERVICE_META_DATA = "android.service.wallpaper";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public WallpaperService(){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroy(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  public void setCallbackLooper(android.os.Looper arg1){
  }
  public abstract WallpaperService.Engine onCreateEngine();
}
