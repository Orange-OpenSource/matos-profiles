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


public final class MapController
  implements android.view.View.OnKeyListener
{
  // Constructors

  public MapController(){
  }
  // Methods

  public void scrollBy(int arg1, int arg2){
  }
  public boolean zoomIn(){
    return false;
  }
  public boolean zoomOut(){
    return false;
  }
  public boolean onKey(android.view.View arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  public void stopPanning(){
  }
  public void animateTo(GeoPoint arg1){
  }
  public void animateTo(GeoPoint arg1, android.os.Message arg2){
  }
  public void animateTo(GeoPoint arg1, java.lang.Runnable arg2){
  }
  public void setCenter(GeoPoint arg1){
  }
  public void stopAnimation(boolean arg1){
  }
  public int setZoom(int arg1){
    return 0;
  }
  public void zoomToSpan(int arg1, int arg2){
  }
  public boolean zoomInFixing(int arg1, int arg2){
    return false;
  }
  public boolean zoomOutFixing(int arg1, int arg2){
    return false;
  }
}
