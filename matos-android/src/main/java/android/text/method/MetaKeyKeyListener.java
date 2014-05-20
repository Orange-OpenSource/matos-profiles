package android.text.method;

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
public abstract class MetaKeyKeyListener
{
  // Fields

  public static final int META_SHIFT_ON = 1;

  public static final int META_ALT_ON = 2;

  public static final int META_SYM_ON = 4;

  public static final int META_CAP_LOCKED = 256;

  public static final int META_ALT_LOCKED = 512;

  public static final int META_SYM_LOCKED = 1024;

  public static final int META_SELECTING = 2048;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public MetaKeyKeyListener(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(android.view.View arg1, android.text.Editable arg2, int arg3, android.view.KeyEvent arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(android.view.View arg1, android.text.Editable arg2, int arg3, android.view.KeyEvent arg4){
    return false;
  }
  public void clearMetaKeyState(android.view.View arg1, android.text.Editable arg2, int arg3){
  }
  public static void clearMetaKeyState(android.text.Editable arg1, int arg2){
  }
  public long clearMetaKeyState(long arg1, int arg2){
    return 0l;
  }
  public static final int getMetaState(java.lang.CharSequence arg1){
    return 0;
  }
  public static final int getMetaState(java.lang.CharSequence arg1, int arg2){
    return 0;
  }
  public static final int getMetaState(long arg1){
    return 0;
  }
  public static final int getMetaState(long arg1, int arg2){
    return 0;
  }
  public static void stopSelecting(android.view.View arg1, android.text.Spannable arg2){
  }
  public static void startSelecting(android.view.View arg1, android.text.Spannable arg2){
  }
  public static boolean isMetaTracker(java.lang.CharSequence arg1, java.lang.Object arg2){
    return false;
  }
  public static boolean isSelectingMetaTracker(java.lang.CharSequence arg1, java.lang.Object arg2){
    return false;
  }
  public static void resetMetaState(android.text.Spannable arg1){
  }
  public static void adjustMetaAfterKeypress(android.text.Spannable arg1){
  }
  public static long adjustMetaAfterKeypress(long arg1){
    return 0l;
  }
  protected static void resetLockedMeta(android.text.Spannable arg1){
  }
  public static long resetLockedMeta(long arg1){
    return 0l;
  }
  public static long handleKeyDown(long arg1, int arg2, android.view.KeyEvent arg3){
    return 0l;
  }
  public static long handleKeyUp(long arg1, int arg2, android.view.KeyEvent arg3){
    return 0l;
  }
}
