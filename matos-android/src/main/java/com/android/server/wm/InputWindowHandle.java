package com.android.server.wm;

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

import com.francetelecom.rd.stubs.annotation.FieldNoValue;


public final class InputWindowHandle
{
  // Fields
	@FieldNoValue
  public final InputApplicationHandle inputApplicationHandle = (InputApplicationHandle) null;
	@FieldNoValue
  public final android.view.WindowManagerPolicy.WindowState windowState = (android.view.WindowManagerPolicy.WindowState) null;

  public android.view.InputChannel inputChannel;

  public java.lang.String name;

  public int layoutParamsFlags;

  public int layoutParamsType;

  public long dispatchingTimeoutNanos;

  public int frameLeft;

  public int frameTop;

  public int frameRight;

  public int frameBottom;

  public float scaleFactor;

  public final android.graphics.Region touchableRegion = (android.graphics.Region) null;

  public boolean visible;

  public boolean canReceiveKeys;

  public boolean hasFocus;

  public boolean hasWallpaper;

  public boolean paused;

  public int layer;

  public int ownerPid;

  public int ownerUid;

  public int inputFeatures;

  // Constructors

  public InputWindowHandle(@com.francetelecom.rd.stubs.annotation.FieldSet("inputApplicationHandle") InputApplicationHandle arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("windowState") android.view.WindowManagerPolicy.WindowState arg2){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
}
