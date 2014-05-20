package android.app;

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
public class Notification
  implements android.os.Parcelable
{
  // Classes

  public static class Builder
  {
    // Constructors

    public Builder(android.content.Context arg1){
    }
    // Methods

    public Notification.Builder setProgress(int arg1, int arg2, boolean arg3){
      return (Notification.Builder) null;
    }
    public Notification.Builder setContent(android.widget.RemoteViews arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setWhen(long arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setSmallIcon(int arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setSmallIcon(int arg1, int arg2){
      return (Notification.Builder) null;
    }
    public Notification.Builder setContentTitle(java.lang.CharSequence arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setContentText(java.lang.CharSequence arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setNumber(int arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setContentInfo(java.lang.CharSequence arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setContentIntent(PendingIntent arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setDeleteIntent(PendingIntent arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setFullScreenIntent(PendingIntent arg1, boolean arg2){
      return (Notification.Builder) null;
    }
    public Notification.Builder setTicker(java.lang.CharSequence arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setTicker(java.lang.CharSequence arg1, android.widget.RemoteViews arg2){
      return (Notification.Builder) null;
    }
    public Notification.Builder setLargeIcon(android.graphics.Bitmap arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setSound(android.net.Uri arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setSound(android.net.Uri arg1, int arg2){
      return (Notification.Builder) null;
    }
    public Notification.Builder setVibrate(long [] arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setLights(int arg1, int arg2, int arg3){
      return (Notification.Builder) null;
    }
    public Notification.Builder setOngoing(boolean arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setOnlyAlertOnce(boolean arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setAutoCancel(boolean arg1){
      return (Notification.Builder) null;
    }
    public Notification.Builder setDefaults(int arg1){
      return (Notification.Builder) null;
    }
    public Notification getNotification(){
      return (Notification) null;
    }
  }
  // Fields

  public static final int DEFAULT_ALL = -1;

  public static final int DEFAULT_SOUND = 1;

  public static final int DEFAULT_VIBRATE = 2;

  public static final int DEFAULT_LIGHTS = 4;

  public long when;

  public int icon;

  public int iconLevel;

  public int number;

  public PendingIntent contentIntent;

  public PendingIntent deleteIntent;

  public PendingIntent fullScreenIntent;

  public java.lang.CharSequence tickerText;

  public android.widget.RemoteViews tickerView;

  public android.widget.RemoteViews contentView;

  public android.graphics.Bitmap largeIcon;

  public android.net.Uri sound;

  public static final int STREAM_DEFAULT = -1;

  public int audioStreamType;

  public long [] vibrate;

  public int ledARGB;

  public int ledOnMS;

  public int ledOffMS;

  public int defaults;

  public static final int FLAG_SHOW_LIGHTS = 1;

  public static final int FLAG_ONGOING_EVENT = 2;

  public static final int FLAG_INSISTENT = 4;

  public static final int FLAG_ONLY_ALERT_ONCE = 8;

  public static final int FLAG_AUTO_CANCEL = 16;

  public static final int FLAG_NO_CLEAR = 32;

  public static final int FLAG_FOREGROUND_SERVICE = 64;

  public static final int FLAG_HIGH_PRIORITY = 128;

  public int flags;

  public static final android.os.Parcelable.Creator<Notification> CREATOR = null;

  // Constructors

  public Notification(){
  }
  public Notification(android.content.Context arg1, int arg2, java.lang.CharSequence arg3, long arg4, java.lang.CharSequence arg5, java.lang.CharSequence arg6, android.content.Intent arg7){
  }
  public Notification(int arg1, java.lang.CharSequence arg2, long arg3){
  }
  public Notification(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public Notification clone(){
    return (Notification) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void setLatestEventInfo(android.content.Context arg1, java.lang.CharSequence arg2, java.lang.CharSequence arg3, PendingIntent arg4){
  }
}
