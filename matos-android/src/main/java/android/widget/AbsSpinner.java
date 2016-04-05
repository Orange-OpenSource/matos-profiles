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
@com.francetelecom.rd.stubs.annotation.Field(modifier = 4, type = "SpinnerAdapter", value = "adapter")
public abstract class AbsSpinner
  extends AdapterView<SpinnerAdapter>{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsSpinner(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsSpinner(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsSpinner(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  public int getCount(){
    return 0;
  }
  protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams(){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  protected void onMeasure(int arg1, int arg2){
  }
  public void requestLayout(){
  }
  public void setSelection(int arg1, boolean arg2){
  }
  public void setSelection(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("adapter")
  public SpinnerAdapter getAdapter(){
    return (SpinnerAdapter) null;
  }
  public int pointToPosition(int arg1, int arg2){
    return 0;
  }
  public void setAdapter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("adapter") @com.francetelecom.rd.stubs.annotation.FieldSet("adapter") SpinnerAdapter arg1){
  }
  public android.view.View getSelectedView(){
    return (android.view.View) null;
  }
}
