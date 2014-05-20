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
public class Spinner
  extends AbsSpinner  implements android.content.DialogInterface.OnClickListener
{
  // Fields

  public static final int MODE_DIALOG = 0;

  public static final int MODE_DROPDOWN = 1;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Spinner(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public Spinner(android.content.Context arg1, int arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Spinner(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Spinner(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  public Spinner(android.content.Context arg1, android.util.AttributeSet arg2, int arg3, int arg4){
    super((android.content.Context) null);
  }
  // Methods

  protected void onDetachedFromWindow(){
  }
  protected void onMeasure(int arg1, int arg2){
  }
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public boolean performClick(){
    return false;
  }
  public int getBaseline(){
    return 0;
  }
  public void setGravity(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onClick(android.content.DialogInterface arg1, int arg2){
  }
  public void setAdapter(SpinnerAdapter arg1){
  }
  public void setOnItemClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onItemClick") AdapterView.OnItemClickListener arg1){
  }
  public void setPrompt(java.lang.CharSequence arg1){
  }
  public void setPromptId(int arg1){
  }
  public java.lang.CharSequence getPrompt(){
    return (java.lang.CharSequence) null;
  }
}
