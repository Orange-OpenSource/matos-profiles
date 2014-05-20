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
public class ListPreference
  extends DialogPreference{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListPreference(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ListPreference(android.content.Context arg1){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("mValue")
  public java.lang.String getValue(){
    return (java.lang.String) null;
  }
  public java.lang.CharSequence getEntry(){
    return (java.lang.CharSequence) null;
  }
  public void setValue(@com.francetelecom.rd.stubs.annotation.FieldSet("mValue") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mEntries")
  public java.lang.CharSequence [] getEntries(){
    return (java.lang.CharSequence []) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray arg1, int arg2){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSetInitialValue(boolean arg1, java.lang.Object arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSummary")
  public java.lang.CharSequence getSummary(){
    return (java.lang.CharSequence) null;
  }
  public void setSummary(@com.francetelecom.rd.stubs.annotation.FieldSet("mSummary") java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder arg1){
  }
  public void setEntries(@com.francetelecom.rd.stubs.annotation.FieldSet("mEntries") java.lang.CharSequence [] arg1){
  }
  public void setEntries(int arg1){
  }
  public void setEntryValues(@com.francetelecom.rd.stubs.annotation.FieldSet("mEntryValues") java.lang.CharSequence [] arg1){
  }
  public void setEntryValues(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mEntryValues")
  public java.lang.CharSequence [] getEntryValues(){
    return (java.lang.CharSequence []) null;
  }
  public int findIndexOfValue(java.lang.String arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDialogClosed(boolean arg1){
  }
  public void setValueIndex(int arg1){
  }
}
