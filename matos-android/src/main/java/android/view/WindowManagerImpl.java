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
public class WindowManagerImpl
  implements WindowManager
{
  // Fields

  public static final int RELAYOUT_IN_TOUCH_MODE = 1;

  public static final int RELAYOUT_FIRST_TIME = 2;

  public static final int ADD_FLAG_APP_VISIBLE = 2;

  public static final int ADD_FLAG_IN_TOUCH_MODE = 1;

  public static final int ADD_OKAY = 0;

  public static final int ADD_BAD_APP_TOKEN = -1;

  public static final int ADD_BAD_SUBWINDOW_TOKEN = -2;

  public static final int ADD_NOT_APP_TOKEN = -3;

  public static final int ADD_APP_EXITING = -4;

  public static final int ADD_DUPLICATE_ADD = -5;

  public static final int ADD_STARTING_NOT_NEEDED = -6;

  public static final int ADD_MULTIPLE_SINGLETON = -7;

  public static final int ADD_PERMISSION_DENIED = -8;

  // Constructors

  public WindowManagerImpl(){
  }
  // Methods

  public static WindowManagerImpl getDefault(){
    return (WindowManagerImpl) null;
  }
  public static WindowManager getDefault(android.content.res.CompatibilityInfo arg1){
    return (WindowManager) null;
  }
  public static WindowManager getDefault(CompatibilityInfoHolder arg1){
    return (WindowManager) null;
  }
  public void updateViewLayout(View arg1, ViewGroup.LayoutParams arg2){
  }
  public void addView(View arg1){
  }
  public void addView(View arg1, ViewGroup.LayoutParams arg2){
  }
  public void addView(View arg1, ViewGroup.LayoutParams arg2, CompatibilityInfoHolder arg3){
  }
  public void removeView(View arg1){
  }
  public boolean isHardwareAccelerated(){
    return false;
  }
  public void dumpGfxInfo(java.io.FileDescriptor arg1){
  }
  public void setStoppedState(android.os.IBinder arg1, boolean arg2){
  }
  public Display getDefaultDisplay(){
    return (Display) null;
  }
  public void trimMemory(int arg1){
  }
  public void closeAll(android.os.IBinder arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void closeAll(){
  }
  public void removeViewImmediate(View arg1){
  }
  public void trimLocalMemory(){
  }
  public void reportNewConfiguration(android.content.res.Configuration arg1){
  }
  public WindowManager.LayoutParams getRootViewLayoutParameter(View arg1){
    return (WindowManager.LayoutParams) null;
  }
}
