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
public class UUSInfo
{
  // Fields

  public static final int UUS_TYPE1_IMPLICIT = 0;

  public static final int UUS_TYPE1_REQUIRED = 1;

  public static final int UUS_TYPE1_NOT_REQUIRED = 2;

  public static final int UUS_TYPE2_REQUIRED = 3;

  public static final int UUS_TYPE2_NOT_REQUIRED = 4;

  public static final int UUS_TYPE3_REQUIRED = 5;

  public static final int UUS_TYPE3_NOT_REQUIRED = 6;

  public static final int UUS_DCS_USP = 0;

  public static final int UUS_DCS_OSIHLP = 1;

  public static final int UUS_DCS_X244 = 2;

  public static final int UUS_DCS_RMCF = 3;

  public static final int UUS_DCS_IA5c = 4;

  // Constructors

  public UUSInfo(){
  }
  public UUSInfo(int arg1, int arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mUserData") byte [] arg3){
  }
  // Methods

  public int getType(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mUserData") 
  public byte [] getUserData(){
    return (byte []) null;
  }
  public void setUserData(@com.francetelecom.rd.stubs.annotation.FieldSet("mUserData") byte [] arg1){
  }
  public void setType(int arg1){
  }
  public int getDcs(){
    return 0;
  }
  public void setDcs(int arg1){
  }
}
