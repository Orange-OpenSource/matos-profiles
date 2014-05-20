package android.media;

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
public class RingtoneManager
{
  // Fields

  public static final int TYPE_RINGTONE = 1;

  public static final int TYPE_NOTIFICATION = 2;

  public static final int TYPE_ALARM = 4;

  public static final int TYPE_ALL = 7;

  public static final java.lang.String ACTION_RINGTONE_PICKER = "android.intent.action.RINGTONE_PICKER";

  public static final java.lang.String EXTRA_RINGTONE_SHOW_DEFAULT = "android.intent.extra.ringtone.SHOW_DEFAULT";

  public static final java.lang.String EXTRA_RINGTONE_SHOW_SILENT = "android.intent.extra.ringtone.SHOW_SILENT";

  public static final java.lang.String EXTRA_RINGTONE_INCLUDE_DRM = "android.intent.extra.ringtone.INCLUDE_DRM";

  public static final java.lang.String EXTRA_RINGTONE_EXISTING_URI = "android.intent.extra.ringtone.EXISTING_URI";

  public static final java.lang.String EXTRA_RINGTONE_DEFAULT_URI = "android.intent.extra.ringtone.DEFAULT_URI";

  public static final java.lang.String EXTRA_RINGTONE_TYPE = "android.intent.extra.ringtone.TYPE";

  public static final java.lang.String EXTRA_RINGTONE_TITLE = "android.intent.extra.ringtone.TITLE";

  public static final java.lang.String EXTRA_RINGTONE_PICKED_URI = "android.intent.extra.ringtone.PICKED_URI";

  public static final int ID_COLUMN_INDEX = 0;

  public static final int TITLE_COLUMN_INDEX = 1;

  public static final int URI_COLUMN_INDEX = 2;

  // Constructors

  public RingtoneManager(android.app.Activity arg1){
  }
  public RingtoneManager(android.content.Context arg1){
  }
  // Methods

  public android.database.Cursor getCursor(){
    return (android.database.Cursor) null;
  }
  public static boolean isDefault(android.net.Uri arg1){
    return false;
  }
  public void setType(int arg1){
  }
  public static android.net.Uri getActualDefaultRingtoneUri(android.content.Context arg1, int arg2){
    return (android.net.Uri) null;
  }
  public Ringtone getRingtone(int arg1){
    return (Ringtone) null;
  }
  public static Ringtone getRingtone(android.content.Context arg1, android.net.Uri arg2){
    return (Ringtone) null;
  }
  public int inferStreamType(){
    return 0;
  }
  public void setStopPreviousRingtone(boolean arg1){
  }
  public void stopPreviousRingtone(){
  }
  public boolean getStopPreviousRingtone(){
    return false;
  }
  public boolean getIncludeDrm(){
    return false;
  }
  public void setIncludeDrm(boolean arg1){
  }
  public android.net.Uri getRingtoneUri(int arg1){
    return (android.net.Uri) null;
  }
  public int getRingtonePosition(android.net.Uri arg1){
    return 0;
  }
  public static android.net.Uri getValidRingtoneUri(android.content.Context arg1){
    return (android.net.Uri) null;
  }
  public static void setActualDefaultRingtoneUri(android.content.Context arg1, int arg2, android.net.Uri arg3){
  }
  public static int getDefaultType(android.net.Uri arg1){
    return 0;
  }
  public static android.net.Uri getDefaultUri(int arg1){
    return (android.net.Uri) null;
  }
}
