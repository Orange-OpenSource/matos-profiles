package com.android.internal.preference;

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


public class YesNoPreference
  extends android.preference.DialogPreference{
  // Constructors

  public YesNoPreference(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  public YesNoPreference(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  public YesNoPreference(android.content.Context arg1){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  // Methods

  public boolean getValue(){
    return false;
  }
  public void setValue(boolean arg1){
  }
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  public boolean shouldDisableDependents(){
    return false;
  }
  protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray arg1, int arg2){
    return (java.lang.Object) null;
  }
  protected void onSetInitialValue(boolean arg1, java.lang.Object arg2){
  }
  protected void onDialogClosed(boolean arg1){
  }
}
