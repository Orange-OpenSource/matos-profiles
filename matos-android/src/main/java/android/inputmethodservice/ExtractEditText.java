package android.inputmethodservice;

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
public class ExtractEditText
  extends android.widget.EditText{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ExtractEditText(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ExtractEditText(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ExtractEditText(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public boolean hasWindowFocus(){
    return false;
  }
  public boolean hasFocus(){
    return false;
  }
  public boolean isFocused(){
    return false;
  }
  public boolean performClick(){
    return false;
  }
  public void setExtractedText(android.view.inputmethod.ExtractedText arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTextContextMenuItem(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSelectionChanged(int arg1, int arg2){
  }
  public boolean isInputMethodTarget(){
    return false;
  }
  protected void viewClicked(android.view.inputmethod.InputMethodManager arg1){
  }
  public void startInternalChanges(){
  }
  public void finishInternalChanges(){
  }
  public boolean hasVerticalScrollBar(){
    return false;
  }
}
