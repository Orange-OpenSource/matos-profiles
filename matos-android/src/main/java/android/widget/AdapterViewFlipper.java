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

import com.francetelecom.rd.stubs.annotation.UseSuper;


@RemoteViews.RemoteView
public class AdapterViewFlipper
  extends AdapterViewAnimator{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AdapterViewFlipper(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AdapterViewFlipper(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected void onDetachedFromWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected void onWindowVisibilityChanged(int arg1){
  }
  @UseSuper
  public void setAdapter(Adapter arg1){
  }
  @android.view.RemotableViewMethod
  public void showNext(){
  }
  @android.view.RemotableViewMethod
  public void showPrevious(){
  }
  public void fyiWillBeAdvancedByHostKThx(){
  }
  public void setFlipInterval(int arg1){
  }
  public void startFlipping(){
  }
  public void stopFlipping(){
  }
  public boolean isFlipping(){
    return false;
  }
  public void setAutoStart(boolean arg1){
  }
  public boolean isAutoStart(){
    return false;
  }
}
