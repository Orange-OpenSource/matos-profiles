package com.android.internal.telephony;

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
public class CallerInfo
{
  // Fields

  public static final java.lang.String UNKNOWN_NUMBER = "-1";

  public static final java.lang.String PRIVATE_NUMBER = "-2";

  public static final java.lang.String PAYPHONE_NUMBER = "-3";

  public java.lang.String name;

  public java.lang.String phoneNumber;

  public java.lang.String normalizedNumber;

  public java.lang.String geoDescription;

  public java.lang.String cnapName;

  public int numberPresentation;

  public int namePresentation;

  public boolean contactExists;

  public java.lang.String phoneLabel;

  public int numberType;

  public java.lang.String numberLabel;

  public int photoResource;

  public long person_id;

  public boolean needUpdate;

  public android.net.Uri contactRefUri;

  public android.net.Uri contactRingtoneUri;

  public boolean shouldSendToVoicemail;

  public android.graphics.drawable.Drawable cachedPhoto;

  public boolean isCachedPhotoCurrent;

  // Constructors

  public CallerInfo(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean isVoiceMailNumber(){
    return false;
  }
  public static CallerInfo getCallerInfo(android.content.Context arg1, android.net.Uri arg2, android.database.Cursor arg3){
    return (CallerInfo) null;
  }
  public static CallerInfo getCallerInfo(android.content.Context arg1, android.net.Uri arg2){
    return (CallerInfo) null;
  }
  public static CallerInfo getCallerInfo(android.content.Context arg1, java.lang.String arg2){
    return (CallerInfo) null;
  }
  public static java.lang.String getCallerId(android.content.Context arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public boolean isEmergencyNumber(){
    return false;
  }
  public void updateGeoDescription(android.content.Context arg1, java.lang.String arg2){
  }
}
