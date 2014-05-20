package com.google.android.maps;

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


public abstract class Overlay
{
  // Classes

  public static interface Snappable
  {
    // Methods

    public boolean onSnapToItem(int arg1, int arg2, android.graphics.Point arg3, MapView arg4);
  }
  // Fields

  protected static final float SHADOW_X_SKEW = 0.0f;

  protected static final float SHADOW_Y_SCALE = 0.0f;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Overlay(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2, MapView arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2, MapView arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1, MapView arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTrackballEvent(android.view.MotionEvent arg1, MapView arg2){
    return false;
  }
  public void draw(android.graphics.Canvas arg1, MapView arg2, boolean arg3){
  }
  public boolean draw(android.graphics.Canvas arg1, MapView arg2, boolean arg3, long arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTap(GeoPoint arg1, MapView arg2){
    return false;
  }
  protected static void drawAt(android.graphics.Canvas arg1, android.graphics.drawable.Drawable arg2, int arg3, int arg4, boolean arg5){
  }
}
