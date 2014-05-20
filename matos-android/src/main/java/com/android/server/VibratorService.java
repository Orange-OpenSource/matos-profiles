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


public class VibratorService
  extends android.os.IVibratorService.Stub{
  // Constructors

  VibratorService(android.content.Context arg1){
    super();
  }
  // Methods

  public void vibrate(long arg1, android.os.IBinder arg2){
  }
  public boolean hasVibrator(){
    return false;
  }
  public void vibratePattern(long [] arg1, int arg2, android.os.IBinder arg3){
  }
  public void cancelVibrate(android.os.IBinder arg1){
  }
}
