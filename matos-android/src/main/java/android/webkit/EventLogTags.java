package android.webkit;

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


public class EventLogTags
{
  // Fields

  public static final int BROWSER_ZOOM_LEVEL_CHANGE = 70101;

  public static final int BROWSER_DOUBLE_TAP_DURATION = 70102;

  public static final int BROWSER_SNAP_CENTER = 70150;

  public static final int BROWSER_TEXT_SIZE_CHANGE = 70151;

  // Constructors

  private EventLogTags(){
  }
  // Methods

  public static void writeBrowserZoomLevelChange(int arg1, int arg2, long arg3){
  }
  public static void writeBrowserDoubleTapDuration(int arg1, long arg2){
  }
  public static void writeBrowserSnapCenter(){
  }
  public static void writeBrowserTextSizeChange(int arg1, int arg2){
  }
}
