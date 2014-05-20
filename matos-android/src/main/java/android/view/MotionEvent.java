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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class MotionEvent
  extends InputEvent  implements android.os.Parcelable
{
  // Classes

  public static final class PointerCoords
  {
    // Fields

    public float x;

    public float y;

    public float pressure;

    public float size;

    public float touchMajor;

    public float touchMinor;

    public float toolMajor;

    public float toolMinor;

    public float orientation;

    // Constructors

    public PointerCoords(){
    }
    public PointerCoords(MotionEvent.PointerCoords arg1){
    }
    // Methods

    public void clear(){
    }
    public void copyFrom(MotionEvent.PointerCoords arg1){
    }
    public static MotionEvent.PointerCoords [] createArray(int arg1){
      return (MotionEvent.PointerCoords []) null;
    }
    public float getAxisValue(int arg1){
      return 0.0f;
    }
    public void setAxisValue(int arg1, float arg2){
    }
  }
  public static final class PointerProperties
  {
    // Fields

    public int id;

    public int toolType;

    // Constructors

    public PointerProperties(){
    }
    public PointerProperties(MotionEvent.PointerProperties arg1){
    }
    // Methods

    public void clear(){
    }
    public void copyFrom(MotionEvent.PointerProperties arg1){
    }
    public static MotionEvent.PointerProperties [] createArray(int arg1){
      return (MotionEvent.PointerProperties []) null;
    }
  }
  // Fields

  public static final int INVALID_POINTER_ID = -1;

  public static final int ACTION_MASK = 255;

  public static final int ACTION_DOWN = 0;

  public static final int ACTION_UP = 1;

  public static final int ACTION_MOVE = 2;

  public static final int ACTION_CANCEL = 3;

  public static final int ACTION_OUTSIDE = 4;

  public static final int ACTION_POINTER_DOWN = 5;

  public static final int ACTION_POINTER_UP = 6;

  public static final int ACTION_HOVER_MOVE = 7;

  public static final int ACTION_SCROLL = 8;

  public static final int ACTION_HOVER_ENTER = 9;

  public static final int ACTION_HOVER_EXIT = 10;

  public static final int ACTION_POINTER_INDEX_MASK = 65280;

  public static final int ACTION_POINTER_INDEX_SHIFT = 8;

  public static final int ACTION_POINTER_1_DOWN = 5;

  public static final int ACTION_POINTER_2_DOWN = 261;

  public static final int ACTION_POINTER_3_DOWN = 517;

  public static final int ACTION_POINTER_1_UP = 6;

  public static final int ACTION_POINTER_2_UP = 262;

  public static final int ACTION_POINTER_3_UP = 518;

  public static final int ACTION_POINTER_ID_MASK = 65280;

  public static final int ACTION_POINTER_ID_SHIFT = 8;

  public static final int FLAG_WINDOW_IS_OBSCURED = 1;

  public static final int FLAG_TAINTED = -2147483648;

  public static final int EDGE_TOP = 1;

  public static final int EDGE_BOTTOM = 2;

  public static final int EDGE_LEFT = 4;

  public static final int EDGE_RIGHT = 8;

  public static final int AXIS_X = 0;

  public static final int AXIS_Y = 1;

  public static final int AXIS_PRESSURE = 2;

  public static final int AXIS_SIZE = 3;

  public static final int AXIS_TOUCH_MAJOR = 4;

  public static final int AXIS_TOUCH_MINOR = 5;

  public static final int AXIS_TOOL_MAJOR = 6;

  public static final int AXIS_TOOL_MINOR = 7;

  public static final int AXIS_ORIENTATION = 8;

  public static final int AXIS_VSCROLL = 9;

  public static final int AXIS_HSCROLL = 10;

  public static final int AXIS_Z = 11;

  public static final int AXIS_RX = 12;

  public static final int AXIS_RY = 13;

  public static final int AXIS_RZ = 14;

  public static final int AXIS_HAT_X = 15;

  public static final int AXIS_HAT_Y = 16;

  public static final int AXIS_LTRIGGER = 17;

  public static final int AXIS_RTRIGGER = 18;

  public static final int AXIS_THROTTLE = 19;

  public static final int AXIS_RUDDER = 20;

  public static final int AXIS_WHEEL = 21;

  public static final int AXIS_GAS = 22;

  public static final int AXIS_BRAKE = 23;

  public static final int AXIS_DISTANCE = 24;

  public static final int AXIS_TILT = 25;

  public static final int AXIS_GENERIC_1 = 32;

  public static final int AXIS_GENERIC_2 = 33;

  public static final int AXIS_GENERIC_3 = 34;

  public static final int AXIS_GENERIC_4 = 35;

  public static final int AXIS_GENERIC_5 = 36;

  public static final int AXIS_GENERIC_6 = 37;

  public static final int AXIS_GENERIC_7 = 38;

  public static final int AXIS_GENERIC_8 = 39;

  public static final int AXIS_GENERIC_9 = 40;

  public static final int AXIS_GENERIC_10 = 41;

  public static final int AXIS_GENERIC_11 = 42;

  public static final int AXIS_GENERIC_12 = 43;

  public static final int AXIS_GENERIC_13 = 44;

  public static final int AXIS_GENERIC_14 = 45;

  public static final int AXIS_GENERIC_15 = 46;

  public static final int AXIS_GENERIC_16 = 47;

  public static final int BUTTON_PRIMARY = 1;

  public static final int BUTTON_SECONDARY = 2;

  public static final int BUTTON_TERTIARY = 4;

  public static final int BUTTON_BACK = 8;

  public static final int BUTTON_FORWARD = 16;

  public static final int TOOL_TYPE_UNKNOWN = 0;

  public static final int TOOL_TYPE_FINGER = 1;

  public static final int TOOL_TYPE_STYLUS = 2;

  public static final int TOOL_TYPE_MOUSE = 3;

  public static final int TOOL_TYPE_ERASER = 4;

  public static final android.os.Parcelable.Creator<MotionEvent> CREATOR = null;

  // Constructors

  private MotionEvent(){
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final MotionEvent split(int arg1){
    return (MotionEvent) null;
  }
  public final void transform(android.graphics.Matrix arg1){
  }
  public MotionEvent copy(){
    return (MotionEvent) null;
  }
  public final float getSize(){
    return 0.0f;
  }
  public final float getSize(int arg1){
    return 0.0f;
  }
  public final void scale(float arg1){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public final float getX(){
    return 0.0f;
  }
  public final float getX(int arg1){
    return 0.0f;
  }
  public final float getY(){
    return 0.0f;
  }
  public final float getY(int arg1){
    return 0.0f;
  }
  public final int getFlags(){
    return 0;
  }
  public final int getAction(){
    return 0;
  }
  public final int getSource(){
    return 0;
  }
  public final int getDeviceId(){
    return 0;
  }
  public final float getOrientation(){
    return 0.0f;
  }
  public final float getOrientation(int arg1){
    return 0.0f;
  }
  public static MotionEvent obtain(long arg1, long arg2, int arg3, int arg4, MotionEvent.PointerProperties [] arg5, MotionEvent.PointerCoords [] arg6, int arg7, int arg8, float arg9, float arg10, int arg11, int arg12, int arg13, int arg14){
    return (MotionEvent) null;
  }
  public static MotionEvent obtain(long arg1, long arg2, int arg3, int arg4, int [] arg5, MotionEvent.PointerCoords [] arg6, int arg7, float arg8, float arg9, int arg10, int arg11, int arg12, int arg13){
    return (MotionEvent) null;
  }
  public static MotionEvent obtain(long arg1, long arg2, int arg3, float arg4, float arg5, float arg6, float arg7, int arg8, float arg9, float arg10, int arg11, int arg12){
    return (MotionEvent) null;
  }
  public static MotionEvent obtain(long arg1, long arg2, int arg3, int arg4, float arg5, float arg6, float arg7, float arg8, int arg9, float arg10, float arg11, int arg12, int arg13){
    return (MotionEvent) null;
  }
  public static MotionEvent obtain(long arg1, long arg2, int arg3, float arg4, float arg5, int arg6){
    return (MotionEvent) null;
  }
  public static MotionEvent obtain(MotionEvent arg1){
    return (MotionEvent) null;
  }
  public final void recycle(){
  }
  public final long getEventTime(){
    return 0l;
  }
  public final void setSource(int arg1){
  }
  public final int getMetaState(){
    return 0;
  }
  public final long getDownTime(){
    return 0l;
  }
  public final void setDownTime(long arg1){
  }
  public final void setEdgeFlags(int arg1){
  }
  public final void setAction(int arg1){
  }
  public final int getHistorySize(){
    return 0;
  }
  public static MotionEvent obtainNoHistory(MotionEvent arg1){
    return (MotionEvent) null;
  }
  public final void offsetLocation(float arg1, float arg2){
  }
  public final int getActionIndex(){
    return 0;
  }
  public final int getPointerId(int arg1){
    return 0;
  }
  public final int getPointerIdBits(){
    return 0;
  }
  public final boolean isTouchEvent(){
    return false;
  }
  public final int getButtonState(){
    return 0;
  }
  public final void setLocation(float arg1, float arg2){
  }
  public final int getActionMasked(){
    return 0;
  }
  public final int getPointerCount(){
    return 0;
  }
  public final float getAxisValue(int arg1){
    return 0.0f;
  }
  public final float getAxisValue(int arg1, int arg2){
    return 0.0f;
  }
  public static java.lang.String actionToString(int arg1){
    return (java.lang.String) null;
  }
  public final float getPressure(){
    return 0.0f;
  }
  public final float getPressure(int arg1){
    return 0.0f;
  }
  public final void setTainted(boolean arg1){
  }
  public final boolean isTainted(){
    return false;
  }
  public final long getEventTimeNano(){
    return 0l;
  }
  public final float getRawX(){
    return 0.0f;
  }
  public final float getRawY(){
    return 0.0f;
  }
  public final float getXPrecision(){
    return 0.0f;
  }
  public final float getYPrecision(){
    return 0.0f;
  }
  public final int findPointerIndex(int arg1){
    return 0;
  }
  public final float getHistoricalX(int arg1){
    return 0.0f;
  }
  public final float getHistoricalX(int arg1, int arg2){
    return 0.0f;
  }
  public final float getHistoricalY(int arg1){
    return 0.0f;
  }
  public final float getHistoricalY(int arg1, int arg2){
    return 0.0f;
  }
  public static MotionEvent createFromParcelBody(android.os.Parcel arg1){
    return (MotionEvent) null;
  }
  public final float getTouchMajor(){
    return 0.0f;
  }
  public final float getTouchMajor(int arg1){
    return 0.0f;
  }
  public final float getTouchMinor(){
    return 0.0f;
  }
  public final float getTouchMinor(int arg1){
    return 0.0f;
  }
  public final float getToolMajor(){
    return 0.0f;
  }
  public final float getToolMajor(int arg1){
    return 0.0f;
  }
  public final float getToolMinor(){
    return 0.0f;
  }
  public final float getToolMinor(int arg1){
    return 0.0f;
  }
  public final int getToolType(int arg1){
    return 0;
  }
  public final void getPointerCoords(int arg1, MotionEvent.PointerCoords arg2){
  }
  public final void getPointerProperties(int arg1, MotionEvent.PointerProperties arg2){
  }
  public final long getHistoricalEventTime(int arg1){
    return 0l;
  }
  public final float getHistoricalPressure(int arg1){
    return 0.0f;
  }
  public final float getHistoricalPressure(int arg1, int arg2){
    return 0.0f;
  }
  public final float getHistoricalSize(int arg1){
    return 0.0f;
  }
  public final float getHistoricalSize(int arg1, int arg2){
    return 0.0f;
  }
  public final float getHistoricalTouchMajor(int arg1){
    return 0.0f;
  }
  public final float getHistoricalTouchMajor(int arg1, int arg2){
    return 0.0f;
  }
  public final float getHistoricalTouchMinor(int arg1){
    return 0.0f;
  }
  public final float getHistoricalTouchMinor(int arg1, int arg2){
    return 0.0f;
  }
  public final float getHistoricalToolMajor(int arg1){
    return 0.0f;
  }
  public final float getHistoricalToolMajor(int arg1, int arg2){
    return 0.0f;
  }
  public final float getHistoricalToolMinor(int arg1){
    return 0.0f;
  }
  public final float getHistoricalToolMinor(int arg1, int arg2){
    return 0.0f;
  }
  public final float getHistoricalOrientation(int arg1){
    return 0.0f;
  }
  public final float getHistoricalOrientation(int arg1, int arg2){
    return 0.0f;
  }
  public final float getHistoricalAxisValue(int arg1, int arg2){
    return 0.0f;
  }
  public final float getHistoricalAxisValue(int arg1, int arg2, int arg3){
    return 0.0f;
  }
  public final void getHistoricalPointerCoords(int arg1, int arg2, MotionEvent.PointerCoords arg3){
  }
  public final int getEdgeFlags(){
    return 0;
  }
  public final void addBatch(long arg1, float arg2, float arg3, float arg4, float arg5, int arg6){
  }
  public final void addBatch(long arg1, MotionEvent.PointerCoords [] arg2, int arg3){
  }
  public final boolean isWithinBoundsNoHistory(float arg1, float arg2, float arg3, float arg4){
    return false;
  }
  public final MotionEvent clampNoHistory(float arg1, float arg2, float arg3, float arg4){
    return (MotionEvent) null;
  }
  public static java.lang.String axisToString(int arg1){
    return (java.lang.String) null;
  }
  public static int axisFromString(java.lang.String arg1){
    return 0;
  }
  public static java.lang.String buttonStateToString(int arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String toolTypeToString(int arg1){
    return (java.lang.String) null;
  }
}
