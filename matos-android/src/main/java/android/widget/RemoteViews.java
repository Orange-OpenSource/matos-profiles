package android.widget;

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
public class RemoteViews
  implements android.view.LayoutInflater.Filter, android.os.Parcelable
{
  // Classes

  public static @interface RemoteView
  {
  }
  public static class ActionException
    extends java.lang.RuntimeException  {
    // Constructors

    public ActionException(java.lang.Exception arg1){
      super();
    }
    public ActionException(java.lang.String arg1){
      super();
    }
  }
  // Fields

  public static final android.os.Parcelable.Creator<RemoteViews> CREATOR = null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public RemoteViews(java.lang.String arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public RemoteViews(android.os.Parcel arg1){
  }
  // Methods

  public RemoteViews clone(){
    return (RemoteViews) null;
  }
  public java.lang.String getPackage(){
    return (java.lang.String) null;
  }
  public void setBoolean(int arg1, java.lang.String arg2, boolean arg3){
  }
  public void setByte(int arg1, java.lang.String arg2, byte arg3){
  }
  public void setChar(int arg1, java.lang.String arg2, char arg3){
  }
  public void setDouble(int arg1, java.lang.String arg2, double arg3){
  }
  public void setFloat(int arg1, java.lang.String arg2, float arg3){
  }
  public void setInt(int arg1, java.lang.String arg2, int arg3){
  }
  public void setLong(int arg1, java.lang.String arg2, long arg3){
  }
  public void setShort(int arg1, java.lang.String arg2, short arg3){
  }
  public void setIntent(int arg1, java.lang.String arg2, android.content.Intent arg3){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void addView(int arg1, RemoteViews arg2){
  }
  public void removeAllViews(int arg1){
  }
  public void setString(int arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void setTextColor(int arg1, int arg2){
  }
  public void setEmptyView(int arg1, int arg2){
  }
  public android.view.View apply(android.content.Context arg1, android.view.ViewGroup arg2){
    return (android.view.View) null;
  }
  public void setCharSequence(int arg1, java.lang.String arg2, java.lang.CharSequence arg3){
  }
  public void setBitmap(int arg1, java.lang.String arg2, android.graphics.Bitmap arg3){
  }
  public void showNext(int arg1){
  }
  public void showPrevious(int arg1){
  }
  public void setDisplayedChild(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onLoadClass(java.lang.Class arg1){
    return false;
  }
  public void setUri(int arg1, java.lang.String arg2, android.net.Uri arg3){
  }
  public int getLayoutId(){
    return 0;
  }
  public void setImageViewResource(int arg1, int arg2){
  }
  public void setViewVisibility(int arg1, int arg2){
  }
  public void setTextViewText(int arg1, java.lang.CharSequence arg2){
  }
  public void setProgressBar(int arg1, int arg2, int arg3, boolean arg4){
  }
  public void reapply(android.content.Context arg1, android.view.View arg2){
  }
  public void setImageViewUri(int arg1, android.net.Uri arg2){
  }
  public void setImageViewBitmap(int arg1, android.graphics.Bitmap arg2){
  }
  public void setChronometer(int arg1, long arg2, java.lang.String arg3, boolean arg4){
  }
  public void setOnClickPendingIntent(int arg1, android.app.PendingIntent arg2){
  }
  public void setPendingIntentTemplate(int arg1, android.app.PendingIntent arg2){
  }
  public void setOnClickFillInIntent(int arg1, android.content.Intent arg2){
  }
  public void setDrawableParameters(int arg1, boolean arg2, int arg3, int arg4, android.graphics.PorterDuff.Mode arg5, int arg6){
  }
  @java.lang.Deprecated
  public void setRemoteAdapter(int arg1, int arg2, android.content.Intent arg3){
  }
  public void setRemoteAdapter(int arg1, android.content.Intent arg2){
  }
  public void setScrollPosition(int arg1, int arg2){
  }
  public void setRelativeScrollPosition(int arg1, int arg2){
  }
  public void setBundle(int arg1, java.lang.String arg2, android.os.Bundle arg3){
  }
}
