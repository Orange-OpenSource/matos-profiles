package android.content;

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

import com.francetelecom.rd.stubs.annotation.UseRule;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class ClipboardManager
  extends android.text.ClipboardManager{
  // Classes

  public static interface OnPrimaryClipChangedListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("onPrimaryClipChanged")
    public void onPrimaryClipChanged();
  }
  // Constructors

  public ClipboardManager(Context arg1, android.os.Handler arg2){
    super();
  }
  // Methods

  public java.lang.CharSequence getText(){
    return (java.lang.CharSequence) null;
  }
  @UseRule("ClipboardManager.setPrimaryClip")
  public void setPrimaryClip(ClipData arg1){
  }
  @UseRule("ClipboardManager.getPrimaryClip")
  public ClipData getPrimaryClip(){
    return (ClipData) null;
  }
  public ClipDescription getPrimaryClipDescription(){
    return (ClipDescription) null;
  }
  public boolean hasPrimaryClip(){
    return false;
  }
  @UseRule("ClipboardManager.addPrimaryClipChangedListener")
  public void addPrimaryClipChangedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onPrimaryClipChanged") ClipboardManager.OnPrimaryClipChangedListener arg1){
  }
  public void removePrimaryClipChangedListener(ClipboardManager.OnPrimaryClipChangedListener arg1){
  }
  @UseRule("ClipboardManager.setText")
  public void setText(java.lang.CharSequence arg1){
  }
  public boolean hasText(){
    return false;
  }
}
