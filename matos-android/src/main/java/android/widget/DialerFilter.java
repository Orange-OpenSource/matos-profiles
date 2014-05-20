package android.widget;

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
public class DialerFilter
  extends RelativeLayout{
  // Fields

  public static final int DIGITS_AND_LETTERS = 1;

  public static final int DIGITS_AND_LETTERS_NO_DIGITS = 2;

  public static final int DIGITS_AND_LETTERS_NO_LETTERS = 3;

  public static final int DIGITS_ONLY = 4;

  public static final int LETTERS_ONLY = 5;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public DialerFilter(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public DialerFilter(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  public void append(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFinishInflate(){
  }
  public int getMode(){
    return 0;
  }
  public void setMode(int arg1){
  }
  public boolean isQwertyKeyboard(){
    return false;
  }
  public java.lang.CharSequence getLetters(){
    return (java.lang.CharSequence) null;
  }
  public java.lang.CharSequence getDigits(){
    return (java.lang.CharSequence) null;
  }
  public java.lang.CharSequence getFilterText(){
    return (java.lang.CharSequence) null;
  }
  public void clearText(){
  }
  public void setLettersWatcher(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.text.TextWatcher arg1){
  }
  public void setDigitsWatcher(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.text.TextWatcher arg1){
  }
  public void setFilterWatcher(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.text.TextWatcher arg1){
  }
  public void removeFilterWatcher(android.text.TextWatcher arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onModeChange(int arg1, int arg2){
  }
}
