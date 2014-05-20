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
public class AppWidgetHostView
  extends android.widget.FrameLayout{
  // Constructors

  public AppWidgetHostView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public AppWidgetHostView(android.content.Context arg1, int arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (android.widget.FrameLayout.LayoutParams) null;
  }
  protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> arg1){
  }
  protected boolean drawChild(android.graphics.Canvas arg1, android.view.View arg2, long arg3){
    return false;
  }
  public void updateAppWidget(android.widget.RemoteViews arg1){
  }
  public AppWidgetProviderInfo getAppWidgetInfo(){
    return (AppWidgetProviderInfo) null;
  }
  public int getAppWidgetId(){
    return 0;
  }
  public void setAppWidget(int arg1, AppWidgetProviderInfo arg2){
  }
  protected void prepareView(android.view.View arg1){
  }
  protected android.view.View getDefaultView(){
    return (android.view.View) null;
  }
  protected android.view.View getErrorView(){
    return (android.view.View) null;
  }
}
