package com.android.server;

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


public class TwilightCalculator
{
  // Fields

  public static final int DAY = 0;

  public static final int NIGHT = 1;

  public long mSunset;

  public long mSunrise;

  public int mState;

  // Constructors

  public TwilightCalculator(){
  }
  // Methods

  public void calculateTwilight(long arg1, double arg2, double arg3){
  }
}
