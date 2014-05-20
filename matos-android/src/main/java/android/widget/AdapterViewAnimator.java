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

import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class AdapterViewAnimator
  extends AdapterView<Adapter>  implements Advanceable, RemoteViewsAdapter.RemoteAdapterConnectionCallback
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AdapterViewAnimator(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AdapterViewAnimator(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AdapterViewAnimator(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
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
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public int getBaseline(){
    return 0;
  }
  public void setSelection(int arg1){
  }
  @FieldGet("adapter")
  public Adapter getAdapter(){
    return (Adapter) null;
  }
  public void setAdapter(@CallBackRegister("adapter")@FieldSet("adapter")Adapter arg1){
  }
  public android.view.View getSelectedView(){
    return (android.view.View) null;
  }
  public android.view.View getCurrentView(){
    return (android.view.View) null;
  }
  public void advance(){
  }
  public void showNext(){
  }
  public void showPrevious(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRemoteAdapterDisconnected(){
  }
  @android.view.RemotableViewMethod
  public void setRemoteViewsAdapter(android.content.Intent arg1){
  }
  @android.view.RemotableViewMethod
  public void setDisplayedChild(int arg1){
  }
  public int getDisplayedChild(){
    return 0;
  }
  public android.animation.ObjectAnimator getInAnimation(){
    return (android.animation.ObjectAnimator) null;
  }
  public void setInAnimation(android.animation.ObjectAnimator arg1){
  }
  public void setInAnimation(android.content.Context arg1, int arg2){
  }
  public android.animation.ObjectAnimator getOutAnimation(){
    return (android.animation.ObjectAnimator) null;
  }
  public void setOutAnimation(android.animation.ObjectAnimator arg1){
  }
  public void setOutAnimation(android.content.Context arg1, int arg2){
  }
  public void setAnimateFirstView(boolean arg1){
  }
  public void deferNotifyDataSetChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onRemoteAdapterConnected(){
    return false;
  }
  public void fyiWillBeAdvancedByHostKThx(){
  }
}
