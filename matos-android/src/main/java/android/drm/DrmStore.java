package android.drm;

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


public class DrmStore
{
  // Classes

  public static interface ConstraintsColumns
  {
    // Fields

    public static final java.lang.String MAX_REPEAT_COUNT = "max_repeat_count";

    public static final java.lang.String REMAINING_REPEAT_COUNT = "remaining_repeat_count";

    public static final java.lang.String LICENSE_START_TIME = "license_start_time";

    public static final java.lang.String LICENSE_EXPIRY_TIME = "license_expiry_time";

    public static final java.lang.String LICENSE_AVAILABLE_TIME = "license_available_time";

    public static final java.lang.String EXTENDED_METADATA = "extended_metadata";

  }
  public static class DrmObjectType
  {
    // Fields

    public static final int UNKNOWN = 0;

    public static final int CONTENT = 1;

    public static final int RIGHTS_OBJECT = 2;

    public static final int TRIGGER_OBJECT = 3;

    // Constructors

    public DrmObjectType(){
    }
  }
  public static class Playback
  {
    // Fields

    public static final int START = 0;

    public static final int STOP = 1;

    public static final int PAUSE = 2;

    public static final int RESUME = 3;

    // Constructors

    public Playback(){
    }
  }
  public static class Action
  {
    // Fields

    public static final int DEFAULT = 0;

    public static final int PLAY = 1;

    public static final int RINGTONE = 2;

    public static final int TRANSFER = 3;

    public static final int OUTPUT = 4;

    public static final int PREVIEW = 5;

    public static final int EXECUTE = 6;

    public static final int DISPLAY = 7;

    // Constructors

    public Action(){
    }
  }
  public static class RightsStatus
  {
    // Fields

    public static final int RIGHTS_VALID = 0;

    public static final int RIGHTS_INVALID = 1;

    public static final int RIGHTS_EXPIRED = 2;

    public static final int RIGHTS_NOT_ACQUIRED = 3;

    // Constructors

    public RightsStatus(){
    }
  }
  // Constructors

  public DrmStore(){
  }
}
