package android.os;

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
public interface LocalPowerManager
{
  // Fields

  public static final int OTHER_EVENT = 0;

  public static final int BUTTON_EVENT = 1;

  public static final int TOUCH_EVENT = 2;

  public static final int POKE_LOCK_IGNORE_TOUCH_EVENTS = 1;

  public static final int POKE_LOCK_SHORT_TIMEOUT = 2;

  public static final int POKE_LOCK_MEDIUM_TIMEOUT = 4;

  public static final int POKE_LOCK_TIMEOUT_MASK = 6;

  // Methods

  public boolean isScreenOn();
  public void goToSleep(long arg1);
  public void userActivity(long arg1, boolean arg2, int arg3);
  public void enableUserActivity(boolean arg1);
  public void setScreenBrightnessOverride(int arg1);
  public void setButtonBrightnessOverride(int arg1);
  public void setKeyboardVisibility(boolean arg1);
}
