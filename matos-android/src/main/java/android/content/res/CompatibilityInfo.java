package android.content.res;

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
public class CompatibilityInfo
  implements android.os.Parcelable
{
  // Classes

  public class Translator
  {
    // Fields

    public final float applicationScale = 0.0f;

    public final float applicationInvertedScale = 0.0f;

    // Constructors

    Translator(float arg1, float arg2){
    }
    Translator(){
    }
    // Methods

    public void translateWindowLayout(android.view.WindowManager.LayoutParams arg1){
    }
    public void translateRectInScreenToAppWindow(android.graphics.Rect arg1){
    }
    public void translateRectInAppWindowToScreen(android.graphics.Rect arg1){
    }
    public void translateCanvas(android.graphics.Canvas arg1){
    }
    public void translateRegionInWindowToScreen(android.graphics.Region arg1){
    }
    public android.graphics.Rect getTranslatedContentInsets(android.graphics.Rect arg1){
      return (android.graphics.Rect) null;
    }
    public android.graphics.Rect getTranslatedVisibleInsets(android.graphics.Rect arg1){
      return (android.graphics.Rect) null;
    }
    public android.graphics.Region getTranslatedTouchableArea(android.graphics.Region arg1){
      return (android.graphics.Region) null;
    }
    public void translateEventInScreenToAppWindow(android.view.MotionEvent arg1){
    }
    public void translatePointInScreenToAppWindow(android.graphics.PointF arg1){
    }
    public void translateRectInScreenToAppWinFrame(android.graphics.Rect arg1){
    }
    public void translateLayoutParamsInAppWindowToScreen(android.view.WindowManager.LayoutParams arg1){
    }
  }
  // Fields

  public static final CompatibilityInfo DEFAULT_COMPATIBILITY_INFO = null;

  public static final int DEFAULT_NORMAL_SHORT_DIMENSION = 320;

  public static final float MAXIMUM_ASPECT_RATIO = 1.7791667f;

  public final int applicationDensity = 0;

  public final float applicationScale = 0.0f;

  public final float applicationInvertedScale = 0.0f;

  public static final android.os.Parcelable.Creator<CompatibilityInfo> CREATOR = null;

  // Constructors

  public CompatibilityInfo(android.content.pm.ApplicationInfo arg1, int arg2, int arg3, boolean arg4){
  }
  private CompatibilityInfo(int arg1, int arg2, float arg3, float arg4){
  }
  private CompatibilityInfo(){
  }
  private CompatibilityInfo(android.os.Parcel arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public CompatibilityInfo.Translator getTranslator(){
    return (CompatibilityInfo.Translator) null;
  }
  public boolean supportsScreen(){
    return false;
  }
  public void applyToConfiguration(Configuration arg1){
  }
  public boolean isScalingRequired(){
    return false;
  }
  public boolean neverSupportsScreen(){
    return false;
  }
  public boolean alwaysSupportsScreen(){
    return false;
  }
  public void applyToDisplayMetrics(android.util.DisplayMetrics arg1){
  }
  public static float computeCompatibleScaling(android.util.DisplayMetrics arg1, android.util.DisplayMetrics arg2){
    return 0.0f;
  }
}
