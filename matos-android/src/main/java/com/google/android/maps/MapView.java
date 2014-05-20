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


public class MapView
  extends android.view.ViewGroup{
  // Classes

  public static enum ReticleDrawMode
  {
    // Enum Constants

    Ret1()
, Ret2()
, Ret3()
;
    // Fields

    // Constructors

    private ReticleDrawMode(){
    }
    // Methods

  }
  public static class LayoutParams
    extends android.view.ViewGroup.LayoutParams  {
    // Fields

    public static final int MODE_MAP = 0;

    public static final int MODE_VIEW = 1;

    public int mode;

    public GeoPoint point;

    public int x;

    public int y;

    public int alignment;

    public static final int LEFT = 3;

    public static final int RIGHT = 5;

    public static final int TOP = 48;

    public static final int BOTTOM = 80;

    public static final int CENTER_HORIZONTAL = 1;

    public static final int CENTER_VERTICAL = 16;

    public static final int CENTER = 17;

    public static final int TOP_LEFT = 51;

    public static final int BOTTOM_CENTER = 81;

    // Constructors

    public LayoutParams(int arg1, int arg2, GeoPoint arg3, int arg4){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2, GeoPoint arg3, int arg4, int arg5, int arg6){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2, int arg3, int arg4, int arg5){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    // Methods

    public java.lang.String debug(java.lang.String arg1){
      return (java.lang.String) null;
    }
  }
  // Constructors

  public MapView(android.content.Context arg1, java.lang.String arg2){
    super((android.content.Context) null);
  }
  public MapView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  public MapView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public boolean isOpaque(){
    return false;
  }
  public void onRestoreInstanceState(android.os.Bundle arg1){
  }
  public void onSaveInstanceState(android.os.Bundle arg1){
  }
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  public boolean onTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  public void onWindowFocusChanged(boolean arg1){
  }
  protected void onDetachedFromWindow(){
  }
  protected MapView.LayoutParams generateDefaultLayoutParams(){
    return (MapView.LayoutParams) null;
  }
  public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  protected final void onMeasure(int arg1, int arg2){
  }
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return false;
  }
  public void computeScroll(){
  }
  public void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
  }
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  protected final void onDraw(android.graphics.Canvas arg1){
  }
  public android.view.View getZoomControls(){
    return (android.view.View) null;
  }
  public void displayZoomControls(boolean arg1){
  }
  public boolean canCoverCenter(){
    return false;
  }
  public void preLoad(){
  }
  public int getZoomLevel(){
    return 0;
  }
  public void setSatellite(boolean arg1){
  }
  public boolean isSatellite(){
    return false;
  }
  public void setTraffic(boolean arg1){
  }
  public boolean isTraffic(){
    return false;
  }
  public void setStreetView(boolean arg1){
  }
  public boolean isStreetView(){
    return false;
  }
  public GeoPoint getMapCenter(){
    return (GeoPoint) null;
  }
  public MapController getController(){
    return (MapController) null;
  }
  public final java.util.List<Overlay> getOverlays(){
    return (java.util.List) null;
  }
  public int getLatitudeSpan(){
    return 0;
  }
  public int getLongitudeSpan(){
    return 0;
  }
  public void setReticleDrawMode(MapView.ReticleDrawMode arg1){
  }
  public int getMaxZoomLevel(){
    return 0;
  }
  public android.widget.ZoomButtonsController getZoomButtonsController(){
    return (android.widget.ZoomButtonsController) null;
  }
  public void setBuiltInZoomControls(boolean arg1){
  }
  public Projection getProjection(){
    return (Projection) null;
  }
}
