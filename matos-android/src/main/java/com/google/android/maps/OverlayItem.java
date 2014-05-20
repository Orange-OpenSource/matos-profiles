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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class OverlayItem
{
  // Fields

  protected final GeoPoint mPoint = (GeoPoint) null;

  protected final java.lang.String mTitle = (java.lang.String) null;

  protected final java.lang.String mSnippet = (java.lang.String) null;

  protected android.graphics.drawable.Drawable mMarker;

  public static final int ITEM_STATE_FOCUSED_MASK = 4;

  public static final int ITEM_STATE_SELECTED_MASK = 2;

  public static final int ITEM_STATE_PRESSED_MASK = 1;

  // Constructors

  public OverlayItem(GeoPoint arg1, java.lang.String arg2, java.lang.String arg3){
  }
  // Methods

  public static void setState(android.graphics.drawable.Drawable arg1, int arg2){
  }
  public java.lang.String getTitle(){
    return (java.lang.String) null;
  }
  public GeoPoint getPoint(){
    return (GeoPoint) null;
  }
  public java.lang.String getSnippet(){
    return (java.lang.String) null;
  }
  public void setMarker(android.graphics.drawable.Drawable arg1){
  }
  public android.graphics.drawable.Drawable getMarker(int arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public java.lang.String routableAddress(){
    return (java.lang.String) null;
  }
}
