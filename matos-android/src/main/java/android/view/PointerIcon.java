package android.view;

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


public final class PointerIcon
  implements android.os.Parcelable
{
  // Fields

  public static final int STYLE_CUSTOM = -1;

  public static final int STYLE_NULL = 0;

  public static final int STYLE_ARROW = 1000;

  public static final int STYLE_SPOT_HOVER = 2000;

  public static final int STYLE_SPOT_TOUCH = 2001;

  public static final int STYLE_SPOT_ANCHOR = 2002;

  public static final android.os.Parcelable.Creator<PointerIcon> CREATOR = null;

  // Constructors

  private PointerIcon(int arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public PointerIcon load(android.content.Context arg1){
    return (PointerIcon) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public android.graphics.Bitmap getBitmap(){
    return (android.graphics.Bitmap) null;
  }
  public int getStyle(){
    return 0;
  }
  public static PointerIcon getNullIcon(){
    return (PointerIcon) null;
  }
  public static PointerIcon getDefaultIcon(android.content.Context arg1){
    return (PointerIcon) null;
  }
  public static PointerIcon getSystemIcon(android.content.Context arg1, int arg2){
    return (PointerIcon) null;
  }
  public static PointerIcon createCustomIcon(android.graphics.Bitmap arg1, float arg2, float arg3){
    return (PointerIcon) null;
  }
  public static PointerIcon loadCustomIcon(android.content.res.Resources arg1, int arg2){
    return (PointerIcon) null;
  }
  public boolean isNullIcon(){
    return false;
  }
  public boolean isLoaded(){
    return false;
  }
  public float getHotSpotX(){
    return 0.0f;
  }
  public float getHotSpotY(){
    return 0.0f;
  }
}
