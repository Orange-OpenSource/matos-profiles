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
public class AccessibilityRecord
{
  // Constructors

  AccessibilityRecord(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.CharSequence getClassName(){
    return (java.lang.CharSequence) null;
  }
  public java.util.List<java.lang.CharSequence> getText(){
    return (java.util.List) null;
  }
  public boolean isEnabled(){
    return false;
  }
  public void setContentDescription(java.lang.CharSequence arg1){
  }
  public java.lang.CharSequence getContentDescription(){
    return (java.lang.CharSequence) null;
  }
  public void setEnabled(boolean arg1){
  }
  public void setScrollX(int arg1){
  }
  public void setScrollY(int arg1){
  }
  public int getScrollX(){
    return 0;
  }
  public int getScrollY(){
    return 0;
  }
  public void setChecked(boolean arg1){
  }
  public boolean isChecked(){
    return false;
  }
  public AccessibilityNodeInfo getSource(){
    return (AccessibilityNodeInfo) null;
  }
  public static AccessibilityRecord obtain(AccessibilityRecord arg1){
    return (AccessibilityRecord) null;
  }
  public static AccessibilityRecord obtain(){
    return (AccessibilityRecord) null;
  }
  public void recycle(){
  }
  public void setConnection(android.accessibilityservice.IAccessibilityServiceConnection arg1){
  }
  public void setSealed(boolean arg1){
  }
  public boolean isFullScreen(){
    return false;
  }
  public void setClassName(java.lang.CharSequence arg1){
  }
  public void setFullScreen(boolean arg1){
  }
  public void setSource(android.view.View arg1){
  }
  public void setItemCount(int arg1){
  }
  public void setCurrentItemIndex(int arg1){
  }
  public void setScrollable(boolean arg1){
  }
  public void setMaxScrollX(int arg1){
  }
  public void setMaxScrollY(int arg1){
  }
  public boolean isPassword(){
    return false;
  }
  public void setPassword(boolean arg1){
  }
  public void setFromIndex(int arg1){
  }
  public void setToIndex(int arg1){
  }
  public void setRemovedCount(int arg1){
  }
  public void setAddedCount(int arg1){
  }
  public void setBeforeText(java.lang.CharSequence arg1){
  }
  public int getItemCount(){
    return 0;
  }
  public int getWindowId(){
    return 0;
  }
  public boolean isScrollable(){
    return false;
  }
  public int getCurrentItemIndex(){
    return 0;
  }
  public int getFromIndex(){
    return 0;
  }
  public int getToIndex(){
    return 0;
  }
  public int getMaxScrollX(){
    return 0;
  }
  public int getMaxScrollY(){
    return 0;
  }
  public int getAddedCount(){
    return 0;
  }
  public int getRemovedCount(){
    return 0;
  }
  public java.lang.CharSequence getBeforeText(){
    return (java.lang.CharSequence) null;
  }
  public android.os.Parcelable getParcelableData(){
    return (android.os.Parcelable) null;
  }
  public void setParcelableData(android.os.Parcelable arg1){
  }
}
