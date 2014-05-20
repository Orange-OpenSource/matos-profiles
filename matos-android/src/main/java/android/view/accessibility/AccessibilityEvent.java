package android.view.accessibility;

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
public final class AccessibilityEvent
  extends AccessibilityRecord  implements android.os.Parcelable
{
  // Fields

  public static final int INVALID_POSITION = -1;

  public static final int MAX_TEXT_LENGTH = 500;

  public static final int TYPE_VIEW_CLICKED = 1;

  public static final int TYPE_VIEW_LONG_CLICKED = 2;

  public static final int TYPE_VIEW_SELECTED = 4;

  public static final int TYPE_VIEW_FOCUSED = 8;

  public static final int TYPE_VIEW_TEXT_CHANGED = 16;

  public static final int TYPE_WINDOW_STATE_CHANGED = 32;

  public static final int TYPE_NOTIFICATION_STATE_CHANGED = 64;

  public static final int TYPE_VIEW_HOVER_ENTER = 128;

  public static final int TYPE_VIEW_HOVER_EXIT = 256;

  public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;

  public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;

  public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;

  public static final int TYPE_VIEW_SCROLLED = 4096;

  public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;

  public static final int TYPES_ALL_MASK = -1;

  public static final android.os.Parcelable.Creator<AccessibilityEvent> CREATOR = null;

  // Constructors

  private AccessibilityEvent(){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  protected void clear(){
  }
  public java.lang.CharSequence getPackageName(){
    return (java.lang.CharSequence) null;
  }
  public void setPackageName(java.lang.CharSequence arg1){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public static AccessibilityEvent obtain(int arg1){
    return (AccessibilityEvent) null;
  }
  public static AccessibilityEvent obtain(AccessibilityEvent arg1){
    return (AccessibilityEvent) null;
  }
  public static AccessibilityEvent obtain(){
    return (AccessibilityEvent) null;
  }
  public void recycle(){
  }
  public int getEventType(){
    return 0;
  }
  public long getEventTime(){
    return 0l;
  }
  public void setEventTime(long arg1){
  }
  public void setEventType(int arg1){
  }
  public void appendRecord(AccessibilityRecord arg1){
  }
  public void initFromParcel(android.os.Parcel arg1){
  }
  public void setConnection(android.accessibilityservice.IAccessibilityServiceConnection arg1){
  }
  public void setSealed(boolean arg1){
  }
  public int getRecordCount(){
    return 0;
  }
  public AccessibilityRecord getRecord(int arg1){
    return (AccessibilityRecord) null;
  }
  public static java.lang.String eventTypeToString(int arg1){
    return (java.lang.String) null;
  }
}
