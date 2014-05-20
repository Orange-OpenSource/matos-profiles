package android.view;

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


public final class InputDevice
  implements android.os.Parcelable
{
  // Classes

  public static final class MotionRange
  {
    // Constructors

    private MotionRange(int arg1, int arg2, float arg3, float arg4, float arg5, float arg6){
    }
    // Methods

    public int getAxis(){
      return 0;
    }
    public int getSource(){
      return 0;
    }
    public float getMax(){
      return 0.0f;
    }
    public float getMin(){
      return 0.0f;
    }
    public float getRange(){
      return 0.0f;
    }
    public float getFlat(){
      return 0.0f;
    }
    public float getFuzz(){
      return 0.0f;
    }
  }
  // Fields

  public static final int SOURCE_CLASS_MASK = 255;

  public static final int SOURCE_CLASS_BUTTON = 1;

  public static final int SOURCE_CLASS_POINTER = 2;

  public static final int SOURCE_CLASS_TRACKBALL = 4;

  public static final int SOURCE_CLASS_POSITION = 8;

  public static final int SOURCE_CLASS_JOYSTICK = 16;

  public static final int SOURCE_UNKNOWN = 0;

  public static final int SOURCE_KEYBOARD = 257;

  public static final int SOURCE_DPAD = 513;

  public static final int SOURCE_GAMEPAD = 1025;

  public static final int SOURCE_TOUCHSCREEN = 4098;

  public static final int SOURCE_MOUSE = 8194;

  public static final int SOURCE_STYLUS = 16386;

  public static final int SOURCE_TRACKBALL = 65540;

  public static final int SOURCE_TOUCHPAD = 1048584;

  public static final int SOURCE_JOYSTICK = 16777232;

  public static final int SOURCE_ANY = -256;

  public static final int MOTION_RANGE_X = 0;

  public static final int MOTION_RANGE_Y = 1;

  public static final int MOTION_RANGE_PRESSURE = 2;

  public static final int MOTION_RANGE_SIZE = 3;

  public static final int MOTION_RANGE_TOUCH_MAJOR = 4;

  public static final int MOTION_RANGE_TOUCH_MINOR = 5;

  public static final int MOTION_RANGE_TOOL_MAJOR = 6;

  public static final int MOTION_RANGE_TOOL_MINOR = 7;

  public static final int MOTION_RANGE_ORIENTATION = 8;

  public static final int KEYBOARD_TYPE_NONE = 0;

  public static final int KEYBOARD_TYPE_NON_ALPHABETIC = 1;

  public static final int KEYBOARD_TYPE_ALPHABETIC = 2;

  public static final android.os.Parcelable.Creator<InputDevice> CREATOR = null;

  // Constructors

  private InputDevice(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public int getId(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public int getKeyboardType(){
    return 0;
  }
  public static InputDevice getDevice(int arg1){
    return (InputDevice) null;
  }
  public KeyCharacterMap getKeyCharacterMap(){
    return (KeyCharacterMap) null;
  }
  public static int [] getDeviceIds(){
    return (int []) null;
  }
  public int getSources(){
    return 0;
  }
  public InputDevice.MotionRange getMotionRange(int arg1){
    return (InputDevice.MotionRange) null;
  }
  public InputDevice.MotionRange getMotionRange(int arg1, int arg2){
    return (InputDevice.MotionRange) null;
  }
  public java.util.List<InputDevice.MotionRange> getMotionRanges(){
    return (java.util.List) null;
  }
}
