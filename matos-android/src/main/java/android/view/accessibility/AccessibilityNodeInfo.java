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
public class AccessibilityNodeInfo
  implements android.os.Parcelable
{
  // Fields

  public static final int ACTION_FOCUS = 1;

  public static final int ACTION_CLEAR_FOCUS = 2;

  public static final int ACTION_SELECT = 4;

  public static final int ACTION_CLEAR_SELECTION = 8;

  public static final android.os.Parcelable.Creator<AccessibilityNodeInfo> CREATOR = null;

  // Constructors

  private AccessibilityNodeInfo(){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public AccessibilityNodeInfo getParent(){
    return (AccessibilityNodeInfo) null;
  }
  public int getActions(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mClassName") 
  public java.lang.CharSequence getClassName(){
    return (java.lang.CharSequence) null;
  }
  public void setParent(android.view.View arg1){
  }
  public boolean isSealed(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mPackageName")
  public java.lang.CharSequence getPackageName(){
    return (java.lang.CharSequence) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mText")
  public java.lang.CharSequence getText(){
    return (java.lang.CharSequence) null;
  }
  public void setPackageName(@com.francetelecom.rd.stubs.annotation.FieldSet("mPackageName") java.lang.CharSequence arg1){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean isEnabled(){
    return false;
  }
  public int getChildCount(){
    return 0;
  }
  public void setContentDescription(@com.francetelecom.rd.stubs.annotation.FieldSet("mContentDescription") java.lang.CharSequence arg1){
  }
  public boolean isFocused(){
    return false;
  }
  public boolean isFocusable(){
    return false;
  }
  public void setSelected(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mContentDescription")
  public java.lang.CharSequence getContentDescription(){
    return (java.lang.CharSequence) null;
  }
  public void setEnabled(boolean arg1){
  }
  public void setFocusable(boolean arg1){
  }
  public boolean isClickable(){
    return false;
  }
  public void setClickable(boolean arg1){
  }
  public boolean isLongClickable(){
    return false;
  }
  public void setLongClickable(boolean arg1){
  }
  public boolean isSelected(){
    return false;
  }
  public void setText(@com.francetelecom.rd.stubs.annotation.FieldSet("mText") java.lang.CharSequence arg1){
  }
  public AccessibilityNodeInfo getChild(int arg1){
    return (AccessibilityNodeInfo) null;
  }
  public void setChecked(boolean arg1){
  }
  public boolean isChecked(){
    return false;
  }
  public void addAction(int arg1){
  }
  public void setCheckable(boolean arg1){
  }
  public void addChild(android.view.View arg1){
  }
  public static AccessibilityNodeInfo obtain(android.view.View arg1){
    return (AccessibilityNodeInfo) null;
  }
  public static AccessibilityNodeInfo obtain(){
    return (AccessibilityNodeInfo) null;
  }
  public static AccessibilityNodeInfo obtain(AccessibilityNodeInfo arg1){
    return (AccessibilityNodeInfo) null;
  }
  public void recycle(){
  }
  public final void setConnection(android.accessibilityservice.IAccessibilityServiceConnection arg1){
  }
  public void setSealed(boolean arg1){
  }
  public void setClassName(@com.francetelecom.rd.stubs.annotation.FieldSet("mClassName") java.lang.CharSequence arg1){
  }
  public void setSource(android.view.View arg1){
  }
  public void setScrollable(boolean arg1){
  }
  public boolean isPassword(){
    return false;
  }
  public void setPassword(boolean arg1){
  }
  public int getWindowId(){
    return 0;
  }
  public boolean isScrollable(){
    return false;
  }
  public boolean isCheckable(){
    return false;
  }
  public void setBoundsInParent(android.graphics.Rect arg1){
  }
  public void setBoundsInScreen(android.graphics.Rect arg1){
  }
  public void setFocused(boolean arg1){
  }
  public void getBoundsInScreen(android.graphics.Rect arg1){
  }
  protected void enforceNotSealed(){
  }
  protected void enforceSealed(){
  }
  public boolean performAction(int arg1){
    return false;
  }
  public java.util.List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String arg1){
    return (java.util.List) null;
  }
  public void getBoundsInParent(android.graphics.Rect arg1){
  }
}
