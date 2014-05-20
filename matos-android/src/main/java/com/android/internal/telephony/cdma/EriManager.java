package com.android.internal.telephony.cdma;

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
public final class EriManager
{
  // Fields

  public static final int ERI_FROM_XML = 0;

  public static final int ERI_FROM_FILE_SYSTEM = 1;

  public static final int ERI_FROM_MODEM = 2;

  // Constructors

  public EriManager(com.android.internal.telephony.PhoneBase arg1, android.content.Context arg2, int arg3){
  }
  // Methods

  public void dispose(){
  }
  public int getCdmaEriIconIndex(int arg1, int arg2){
    return 0;
  }
  public int getCdmaEriIconMode(int arg1, int arg2){
    return 0;
  }
  public java.lang.String getCdmaEriText(int arg1, int arg2){
    return (java.lang.String) null;
  }
  public boolean isEriFileLoaded(){
    return false;
  }
  public void loadEriFile(){
  }
  public int getEriFileVersion(){
    return 0;
  }
  public int getEriNumberOfEntries(){
    return 0;
  }
  public int getEriFileType(){
    return 0;
  }
}
