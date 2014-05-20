package android.preference;

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
public abstract class TwoStatePreference
  extends Preference{
  // Constructors

	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TwoStatePreference(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TwoStatePreference(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TwoStatePreference(android.content.Context arg1){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onClick(){
  }
  public void setSummaryOn(@com.francetelecom.rd.stubs.annotation.FieldSet("mSummaryOn") java.lang.CharSequence arg1){
  }
  public void setSummaryOn(int arg1){
  }
  public void setSummaryOff(@com.francetelecom.rd.stubs.annotation.FieldSet("mSummaryOff") java.lang.CharSequence arg1){
  }
  public void setSummaryOff(int arg1){
  }
  public void setDisableDependentsState(boolean arg1){
  }
  public void setChecked(boolean arg1){
  }
  public boolean isChecked(){
    return false;
  }
  public boolean shouldDisableDependents(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSummaryOn")
  public java.lang.CharSequence getSummaryOn(){
    return (java.lang.CharSequence) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSummaryOff")
  public java.lang.CharSequence getSummaryOff(){
    return (java.lang.CharSequence) null;
  }
  public boolean getDisableDependentsState(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray arg1, int arg2){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSetInitialValue(boolean arg1, java.lang.Object arg2){
  }
}
