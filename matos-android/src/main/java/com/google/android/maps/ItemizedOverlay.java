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


public abstract class ItemizedOverlay<Item extends OverlayItem>
  extends Overlay  implements Overlay.Snappable
{
  // Classes

  public static interface OnFocusChangeListener
  {
    // Methods

    public void onFocusChanged(ItemizedOverlay arg1, OverlayItem arg2);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ItemizedOverlay(android.graphics.drawable.Drawable arg1){
    super();
  }
  // Methods

  public abstract int size();
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
  public final Item getItem(int arg1){
    return null;
  }
  public void draw(android.graphics.Canvas arg1, MapView arg2, boolean arg3){
  }
  @com.francetelecom.rd.stubs.annotation.Code("arg1.onFocusChanged(this, getFocus());")
  public void setOnFocusChangeListener(ItemizedOverlay.OnFocusChangeListener arg1){
  }
  protected abstract Item createItem(int arg1);
  protected final void populate(){
  }
  public Item nextFocus(boolean arg1){
    return null;
  }
  protected boolean hitTest(Item arg1, android.graphics.drawable.Drawable arg2, int arg3, int arg4){
    return false;
  }
  protected static android.graphics.drawable.Drawable boundCenterBottom(android.graphics.drawable.Drawable arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  protected static android.graphics.drawable.Drawable boundCenter(android.graphics.drawable.Drawable arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public GeoPoint getCenter(){
    return (GeoPoint) null;
  }
  protected int getIndexToDraw(int arg1){
    return 0;
  }
  public int getLatSpanE6(){
    return 0;
  }
  public int getLonSpanE6(){
    return 0;
  }
  protected void setLastFocusedIndex(int arg1){
  }
  public void setFocus(@com.francetelecom.rd.stubs.annotation.FieldSet("focus") Item arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("focus")
  public Item getFocus(){
    return null;
  }
  public final int getLastFocusedIndex(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTap(GeoPoint arg1, MapView arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onTap(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onSnapToItem(int arg1, int arg2, android.graphics.Point arg3, MapView arg4){
    return false;
  }
  public void setDrawFocusedItem(boolean arg1){
  }
}
