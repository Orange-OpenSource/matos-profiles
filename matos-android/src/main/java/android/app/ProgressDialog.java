package android.app;

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
public class ProgressDialog
  extends AlertDialog{
  // Fields

  public static final int STYLE_SPINNER = 0;

  public static final int STYLE_HORIZONTAL = 1;

  // Constructors

  public ProgressDialog(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public ProgressDialog(android.content.Context arg1, int arg2){
    super((android.content.Context) null);
  }
  // Methods

  protected void onCreate(android.os.Bundle arg1){
  }
  public void onStart(){
  }
  protected void onStop(){
  }
  public void setProgress(int arg1){
  }
  public void setSecondaryProgress(int arg1){
  }
  public static ProgressDialog show(android.content.Context arg1, java.lang.CharSequence arg2, java.lang.CharSequence arg3){
    return (ProgressDialog) null;
  }
  public static ProgressDialog show(android.content.Context arg1, java.lang.CharSequence arg2, java.lang.CharSequence arg3, boolean arg4){
    return (ProgressDialog) null;
  }
  public static ProgressDialog show(android.content.Context arg1, java.lang.CharSequence arg2, java.lang.CharSequence arg3, boolean arg4, boolean arg5){
    return (ProgressDialog) null;
  }
  public static ProgressDialog show(android.content.Context arg1, java.lang.CharSequence arg2, java.lang.CharSequence arg3, boolean arg4, boolean arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.onCancel") android.content.DialogInterface.OnCancelListener arg6){
    return (ProgressDialog) null;
  }
  public int getProgress(){
    return 0;
  }
  public void setMessage(java.lang.CharSequence arg1){
  }
  public void setMax(int arg1){
  }
  public int getMax(){
    return 0;
  }
  public void setIndeterminate(boolean arg1){
  }
  public void incrementProgressBy(int arg1){
  }
  public boolean isIndeterminate(){
    return false;
  }
  public void setIndeterminateDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setProgressDrawable(android.graphics.drawable.Drawable arg1){
  }
  public int getSecondaryProgress(){
    return 0;
  }
  public void incrementSecondaryProgressBy(int arg1){
  }
  public void setProgressStyle(int arg1){
  }
  public void setProgressNumberFormat(java.lang.String arg1){
  }
  public void setProgressPercentFormat(java.text.NumberFormat arg1){
  }
}
