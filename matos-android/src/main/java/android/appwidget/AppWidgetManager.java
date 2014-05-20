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
public class AppWidgetManager
{
  // Fields

  public static final java.lang.String ACTION_APPWIDGET_PICK = "android.appwidget.action.APPWIDGET_PICK";

  public static final java.lang.String ACTION_APPWIDGET_CONFIGURE = "android.appwidget.action.APPWIDGET_CONFIGURE";

  public static final java.lang.String EXTRA_APPWIDGET_ID = "appWidgetId";

  public static final java.lang.String EXTRA_APPWIDGET_IDS = "appWidgetIds";

  public static final java.lang.String EXTRA_CUSTOM_INFO = "customInfo";

  public static final java.lang.String EXTRA_CUSTOM_EXTRAS = "customExtras";

  public static final int INVALID_APPWIDGET_ID = 0;

  public static final java.lang.String ACTION_APPWIDGET_UPDATE = "android.appwidget.action.APPWIDGET_UPDATE";

  public static final java.lang.String ACTION_APPWIDGET_DELETED = "android.appwidget.action.APPWIDGET_DELETED";

  public static final java.lang.String ACTION_APPWIDGET_DISABLED = "android.appwidget.action.APPWIDGET_DISABLED";

  public static final java.lang.String ACTION_APPWIDGET_ENABLED = "android.appwidget.action.APPWIDGET_ENABLED";

  public static final java.lang.String META_DATA_APPWIDGET_PROVIDER = "android.appwidget.provider";

  // Constructors

  private AppWidgetManager(android.content.Context arg1){
  }
  // Methods

  public static AppWidgetManager getInstance(android.content.Context arg1){
    return (AppWidgetManager) null;
  }
  public void updateAppWidget(int [] arg1, android.widget.RemoteViews arg2){
  }
  public void updateAppWidget(int arg1, android.widget.RemoteViews arg2){
  }
  public void updateAppWidget(android.content.ComponentName arg1, android.widget.RemoteViews arg2){
  }
  public void partiallyUpdateAppWidget(int [] arg1, android.widget.RemoteViews arg2){
  }
  public void partiallyUpdateAppWidget(int arg1, android.widget.RemoteViews arg2){
  }
  public void notifyAppWidgetViewDataChanged(int [] arg1, int arg2){
  }
  public void notifyAppWidgetViewDataChanged(int arg1, int arg2){
  }
  public java.util.List<AppWidgetProviderInfo> getInstalledProviders(){
    return (java.util.List) null;
  }
  public AppWidgetProviderInfo getAppWidgetInfo(int arg1){
    return (AppWidgetProviderInfo) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AppWidgetManager.bindAppWidgetId", pos = {1, 2}, report = "-")
  public void bindAppWidgetId(int arg1, android.content.ComponentName arg2){
  }
  public void bindRemoteViewsService(int arg1, android.content.Intent arg2, android.os.IBinder arg3){
  }
  public void unbindRemoteViewsService(int arg1, android.content.Intent arg2){
  }
  public int [] getAppWidgetIds(android.content.ComponentName arg1){
    return (int []) null;
  }
}
