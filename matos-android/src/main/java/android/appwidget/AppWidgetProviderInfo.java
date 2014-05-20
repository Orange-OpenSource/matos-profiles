package android.appwidget;

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
public class AppWidgetProviderInfo
  implements android.os.Parcelable
{
  // Fields

  public static final int RESIZE_NONE = 0;

  public static final int RESIZE_HORIZONTAL = 1;

  public static final int RESIZE_VERTICAL = 2;

  public static final int RESIZE_BOTH = 3;

  public android.content.ComponentName provider;

  public int minWidth;

  public int minHeight;

  public int minResizeWidth;

  public int minResizeHeight;

  public int updatePeriodMillis;

  public int initialLayout;

  public android.content.ComponentName configure;

  public java.lang.String label;

  public int icon;

  public int autoAdvanceViewId;

  public int previewImage;

  public int resizeMode;

  public static final android.os.Parcelable.Creator<AppWidgetProviderInfo> CREATOR = null;

  // Constructors

  public AppWidgetProviderInfo(){
  }
  public AppWidgetProviderInfo(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
}
