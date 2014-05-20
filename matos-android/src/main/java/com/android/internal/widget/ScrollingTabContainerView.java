package com.android.internal.widget;

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
public class ScrollingTabContainerView
  extends android.widget.HorizontalScrollView  implements android.widget.AdapterView.OnItemSelectedListener
{
  // Classes

  protected class VisibilityAnimListener
    implements android.animation.Animator.AnimatorListener
  {
    // Fields

    // Constructors

	@com.francetelecom.rd.stubs.annotation.CallBackRegister("VisibilityAnimListener")
    protected VisibilityAnimListener(){
    }
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("VisibilityAnimListener")
    public void onAnimationStart(android.animation.Animator arg1){
    }
	@com.francetelecom.rd.stubs.annotation.CallBack("VisibilityAnimListener")
    public void onAnimationEnd(android.animation.Animator arg1){
    }
	@com.francetelecom.rd.stubs.annotation.CallBack("VisibilityAnimListener")
    public void onAnimationCancel(android.animation.Animator arg1){
    }
	@com.francetelecom.rd.stubs.annotation.CallBack("VisibilityAnimListener")
    public void onAnimationRepeat(android.animation.Animator arg1){
    }
    public ScrollingTabContainerView.VisibilityAnimListener withFinalVisibility(int arg1){
      return (ScrollingTabContainerView.VisibilityAnimListener) null;
    }
  }
  // Fields

  protected android.animation.Animator mVisibilityAnim;

  protected final ScrollingTabContainerView.VisibilityAnimListener mVisAnimListener = (ScrollingTabContainerView.VisibilityAnimListener) null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ScrollingTabContainerView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  protected void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onDetachedFromWindow(){
  }
  public void setContentHeight(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onMeasure(int arg1, int arg2){
  }
  public void animateToVisibility(int arg1){
  }
  public void removeAllTabs(){
  }
  public void addTab(android.app.ActionBar.Tab arg1, boolean arg2){
  }
  public void addTab(android.app.ActionBar.Tab arg1, int arg2, boolean arg3){
  }
  public void removeTabAt(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onItemSelected(android.widget.AdapterView<?> arg1, android.view.View arg2, int arg3, long arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onNothingSelected(android.widget.AdapterView<?> arg1){
  }
  public void animateToTab(int arg1){
  }
  public void setTabSelected(int arg1){
  }
  public void updateTab(int arg1){
  }
  public void setAllowCollapse(boolean arg1){
  }
}
