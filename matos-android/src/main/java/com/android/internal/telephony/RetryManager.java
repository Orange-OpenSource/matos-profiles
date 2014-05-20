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


public class RetryManager
{
  // Fields

  public static final java.lang.String LOG_TAG = "RetryManager";

  public static final boolean DBG = false;

  // Constructors

  public RetryManager(){
  }
  // Methods

  public int getRetryCount(){
    return 0;
  }
  public int getRetryTimer(){
    return 0;
  }
  public void increaseRetryCount(){
  }
  public boolean isRetryNeeded(){
    return false;
  }
  public void resetRetryCount(){
  }
  public void retryForeverUsingLastTimeout(){
  }
  public boolean isRetryForever(){
    return false;
  }
  public boolean configure(int arg1, int arg2, int arg3){
    return false;
  }
  public boolean configure(java.lang.String arg1){
    return false;
  }
  public void setRetryCount(int arg1){
  }
}
