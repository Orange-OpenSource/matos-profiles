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
public abstract class DialogPreference
  extends Preference  implements PreferenceManager.OnActivityDestroyListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public DialogPreference(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public DialogPreference(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  protected void showDialog(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onClick(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onClick(android.content.DialogInterface arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDismiss(android.content.DialogInterface arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDialogClosed(boolean arg1){
  }
  public android.app.Dialog getDialog(){
    return (android.app.Dialog) null;
  }
  public void setDialogTitle(java.lang.CharSequence arg1){
  }
  public void setDialogTitle(int arg1){
  }
  public java.lang.CharSequence getDialogTitle(){
    return (java.lang.CharSequence) null;
  }
  public void setDialogMessage(java.lang.CharSequence arg1){
  }
  public void setDialogMessage(int arg1){
  }
  public java.lang.CharSequence getDialogMessage(){
    return (java.lang.CharSequence) null;
  }
  public void setDialogIcon(android.graphics.drawable.Drawable arg1){
  }
  public void setDialogIcon(int arg1){
  }
  public android.graphics.drawable.Drawable getDialogIcon(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setPositiveButtonText(java.lang.CharSequence arg1){
  }
  public void setPositiveButtonText(int arg1){
  }
  public java.lang.CharSequence getPositiveButtonText(){
    return (java.lang.CharSequence) null;
  }
  public void setNegativeButtonText(java.lang.CharSequence arg1){
  }
  public void setNegativeButtonText(int arg1){
  }
  public java.lang.CharSequence getNegativeButtonText(){
    return (java.lang.CharSequence) null;
  }
  public void setDialogLayoutResource(int arg1){
  }
  public int getDialogLayoutResource(){
    return 0;
  }
  protected boolean needInputMethod(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.view.View onCreateDialogView(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onBindDialogView(android.view.View arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActivityDestroy(){
  }
}
