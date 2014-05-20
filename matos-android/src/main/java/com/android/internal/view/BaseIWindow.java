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


public class BaseIWindow
  extends android.view.IWindow.Stub{
  // Fields

  public int mSeq;

  // Constructors

  public BaseIWindow(){
    super();
  }
  // Methods

  public void dispatchDragEvent(android.view.DragEvent arg1){
  }
  public void dispatchSystemUiVisibilityChanged(int arg1, int arg2, int arg3, int arg4){
  }
  public void resized(int arg1, int arg2, android.graphics.Rect arg3, android.graphics.Rect arg4, boolean arg5, android.content.res.Configuration arg6){
  }
  public void dispatchAppVisibility(boolean arg1){
  }
  public void dispatchWallpaperOffsets(float arg1, float arg2, float arg3, float arg4, boolean arg5){
  }
  public void dispatchWallpaperCommand(java.lang.String arg1, int arg2, int arg3, int arg4, android.os.Bundle arg5, boolean arg6){
  }
  public void dispatchGetNewSurface(){
  }
  public void windowFocusChanged(boolean arg1, boolean arg2){
  }
  public void executeCommand(java.lang.String arg1, java.lang.String arg2, android.os.ParcelFileDescriptor arg3){
  }
  public void closeSystemDialogs(java.lang.String arg1){
  }
  public void setSession(android.view.IWindowSession arg1){
  }
}
