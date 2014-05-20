package android.app;

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


public class UiModeManager
{
  // Fields

  public static java.lang.String ACTION_ENTER_CAR_MODE;

  public static java.lang.String ACTION_EXIT_CAR_MODE;

  public static java.lang.String ACTION_ENTER_DESK_MODE;

  public static java.lang.String ACTION_EXIT_DESK_MODE;

  public static final int MODE_NIGHT_AUTO = 0;

  public static final int MODE_NIGHT_NO = 1;

  public static final int MODE_NIGHT_YES = 2;

  public static final int ENABLE_CAR_MODE_GO_CAR_HOME = 1;

  public static final int DISABLE_CAR_MODE_GO_HOME = 1;

  // Constructors

  UiModeManager(){
  }
  // Methods

  public void enableCarMode(int arg1){
  }
  public void disableCarMode(int arg1){
  }
  public int getCurrentModeType(){
    return 0;
  }
  public void setNightMode(int arg1){
  }
  public int getNightMode(){
    return 0;
  }
}
