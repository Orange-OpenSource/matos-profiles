package com.android.server.am;

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


public class CompatModePackages
{
  // Fields

  public static final int COMPAT_FLAG_DONT_ASK = 1;

  public static final int COMPAT_FLAG_ENABLED = 2;

  // Constructors

  public CompatModePackages(ActivityManagerService arg1, java.io.File arg2){
  }
  // Methods

  public java.util.HashMap<java.lang.String, java.lang.Integer> getPackages(){
    return (java.util.HashMap) null;
  }
  public int computeCompatModeLocked(android.content.pm.ApplicationInfo arg1){
    return 0;
  }
  public boolean getPackageAskCompatModeLocked(java.lang.String arg1){
    return false;
  }
  public void handlePackageAddedLocked(java.lang.String arg1, boolean arg2){
  }
  public android.content.res.CompatibilityInfo compatibilityInfoForPackageLocked(android.content.pm.ApplicationInfo arg1){
    return (android.content.res.CompatibilityInfo) null;
  }
  public boolean getFrontActivityAskCompatModeLocked(){
    return false;
  }
  public void setFrontActivityAskCompatModeLocked(boolean arg1){
  }
  public void setPackageAskCompatModeLocked(java.lang.String arg1, boolean arg2){
  }
  public int getFrontActivityScreenCompatModeLocked(){
    return 0;
  }
  public void setFrontActivityScreenCompatModeLocked(int arg1){
  }
  public int getPackageScreenCompatModeLocked(java.lang.String arg1){
    return 0;
  }
  public void setPackageScreenCompatModeLocked(java.lang.String arg1, int arg2){
  }
}
