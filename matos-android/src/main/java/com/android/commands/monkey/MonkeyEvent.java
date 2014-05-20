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


public abstract class MonkeyEvent
{
  // Fields

  protected int eventType;

  public static final int EVENT_TYPE_KEY = 0;

  public static final int EVENT_TYPE_TOUCH = 1;

  public static final int EVENT_TYPE_TRACKBALL = 2;

  public static final int EVENT_TYPE_ACTIVITY = 3;

  public static final int EVENT_TYPE_FLIP = 4;

  public static final int EVENT_TYPE_THROTTLE = 5;

  public static final int EVENT_TYPE_NOOP = 6;

  public static final int INJECT_SUCCESS = 1;

  public static final int INJECT_FAIL = 0;

  public static final int INJECT_ERROR_REMOTE_EXCEPTION = -1;

  public static final int INJECT_ERROR_SECURITY_EXCEPTION = -2;

  // Constructors

  public MonkeyEvent(int arg1){
  }
  // Methods

  public int getEventType(){
    return 0;
  }
  public boolean isThrottlable(){
    return false;
  }
  public abstract int injectEvent(android.view.IWindowManager arg1, android.app.IActivityManager arg2, int arg3);
}
