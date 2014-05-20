package com.android.commands.monkey;

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


public class MonkeySourceRandom
  implements MonkeyEventSource
{
  // Fields

  public static final int FACTOR_TOUCH = 0;

  public static final int FACTOR_MOTION = 1;

  public static final int FACTOR_PINCHZOOM = 2;

  public static final int FACTOR_TRACKBALL = 3;

  public static final int FACTOR_NAV = 4;

  public static final int FACTOR_MAJORNAV = 5;

  public static final int FACTOR_SYSOPS = 6;

  public static final int FACTOR_APPSWITCH = 7;

  public static final int FACTOR_FLIP = 8;

  public static final int FACTOR_ANYTHING = 9;

  public static final int FACTORZ_COUNT = 10;

  // Constructors

  public MonkeySourceRandom(java.util.Random arg1, java.util.ArrayList<android.content.ComponentName> arg2, long arg3, boolean arg4){
  }
  // Methods

  public boolean validate(){
    return false;
  }
  public void setVerbose(int arg1){
  }
  public MonkeyEvent getNextEvent(){
    return (MonkeyEvent) null;
  }
  public static int getKeyCode(java.lang.String arg1){
    return 0;
  }
  public void setFactors(float [] arg1){
  }
  public void setFactors(int arg1, float arg2){
  }
  public void generateActivity(){
  }
  public static java.lang.String getKeyName(int arg1){
    return (java.lang.String) null;
  }
}
