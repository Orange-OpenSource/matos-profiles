package android.widget;

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
public class ZoomButtonsController
  implements android.view.View.OnTouchListener
{
  // Classes

  public static interface OnZoomListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onZoom")
    public void onVisibilityChanged(boolean arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onZoom")
    public void onZoom(boolean arg1);
  }
  // Constructors

  public ZoomButtonsController(android.view.View arg1){
  }
  // Methods

  public boolean isVisible(){
    return false;
  }
  public void setVisible(boolean arg1){
  }
  public void setFocusable(boolean arg1){
  }
  public android.view.View getZoomControls(){
    return (android.view.View) null;
  }
  public boolean onTouch(android.view.View arg1, android.view.MotionEvent arg2){
    return false;
  }
  public void setZoomSpeed(long arg1){
  }
  public android.view.ViewGroup getContainer(){
    return (android.view.ViewGroup) null;
  }
  public void setZoomInEnabled(boolean arg1){
  }
  public void setZoomOutEnabled(boolean arg1){
  }
  public void setOnZoomListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onZoom") ZoomButtonsController.OnZoomListener arg1){
  }
  public boolean isAutoDismissed(){
    return false;
  }
  public void setAutoDismissed(boolean arg1){
  }
}
