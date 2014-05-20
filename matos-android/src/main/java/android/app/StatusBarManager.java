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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class StatusBarManager
{
  // Fields

  public static final int DISABLE_EXPAND = 65536;

  public static final int DISABLE_NOTIFICATION_ICONS = 131072;

  public static final int DISABLE_NOTIFICATION_ALERTS = 262144;

  public static final int DISABLE_NOTIFICATION_TICKER = 524288;

  public static final int DISABLE_SYSTEM_INFO = 1048576;

  public static final int DISABLE_HOME = 2097152;

  public static final int DISABLE_RECENT = 16777216;

  public static final int DISABLE_BACK = 4194304;

  public static final int DISABLE_CLOCK = 8388608;

  @java.lang.Deprecated
  public static final int DISABLE_NAVIGATION = 18874368;

  public static final int DISABLE_NONE = 0;

  public static final int DISABLE_MASK = 33488896;

  // Constructors

  StatusBarManager(android.content.Context arg1){
  }
  // Methods

  public void disable(int arg1){
  }
  public void setIcon(java.lang.String arg1, int arg2, int arg3, java.lang.String arg4){
  }
  public void removeIcon(java.lang.String arg1){
  }
  public void expand(){
  }
  public void collapse(){
  }
  public void setIconVisibility(java.lang.String arg1, boolean arg2){
  }
}
