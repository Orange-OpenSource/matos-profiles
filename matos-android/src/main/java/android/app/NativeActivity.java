package android.app;

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


public class NativeActivity
  extends Activity  implements android.view.SurfaceHolder.Callback2, android.view.InputQueue.Callback, android.view.ViewTreeObserver.OnGlobalLayoutListener
{
  // Fields

  public static final java.lang.String META_DATA_LIB_NAME = "android.app.lib_name";

  public static final java.lang.String META_DATA_FUNC_NAME = "android.app.func_name";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public NativeActivity(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onResume(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onPause(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDestroy(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onStart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSaveInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onStop(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onLowMemory(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onWindowFocusChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onGlobalLayout(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void surfaceChanged(android.view.SurfaceHolder arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void surfaceCreated(android.view.SurfaceHolder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void surfaceDestroyed(android.view.SurfaceHolder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void surfaceRedrawNeeded(android.view.SurfaceHolder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInputQueueCreated(android.view.InputQueue arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInputQueueDestroyed(android.view.InputQueue arg1){
  }
}
