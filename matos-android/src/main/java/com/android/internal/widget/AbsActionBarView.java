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
public abstract class AbsActionBarView
  extends android.view.ViewGroup{
  // Classes

  protected class VisibilityAnimListener
    implements android.animation.Animator.AnimatorListener
  {
    // Fields

    // Constructors
	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onAnimation")
    protected VisibilityAnimListener(){
    }
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("onAnimation")
    public void onAnimationStart(android.animation.Animator arg1){
    }
	@com.francetelecom.rd.stubs.annotation.CallBack("onAnimation")
    public void onAnimationEnd(android.animation.Animator arg1){
    }
	@com.francetelecom.rd.stubs.annotation.CallBack("onAnimation")
    public void onAnimationCancel(android.animation.Animator arg1){
    }
	@com.francetelecom.rd.stubs.annotation.CallBack("onAnimation")
    public void onAnimationRepeat(android.animation.Animator arg1){
    }
	@com.francetelecom.rd.stubs.annotation.Code("return this;")
    public AbsActionBarView.VisibilityAnimListener withFinalVisibility(int arg1){
      return (AbsActionBarView.VisibilityAnimListener) null;
    }
  }
  // Fields

  protected com.android.internal.view.menu.ActionMenuView mMenuView;

  protected com.android.internal.view.menu.ActionMenuPresenter mActionMenuPresenter;

  protected ActionBarContainer mSplitView;

  protected boolean mSplitActionBar;

  protected boolean mSplitWhenNarrow;

  protected int mContentHeight;

  protected android.animation.Animator mVisibilityAnim;

  protected final AbsActionBarView.VisibilityAnimListener mVisAnimListener = (AbsActionBarView.VisibilityAnimListener) null;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsActionBarView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsActionBarView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsActionBarView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  public void setSplitActionBar(boolean arg1){
  }
  public void setContentHeight(int arg1){
  }
  public boolean showOverflowMenu(){
    return false;
  }
  public boolean hideOverflowMenu(){
    return false;
  }
  public boolean isOverflowMenuShowing(){
    return false;
  }
  public void setVisibility(int arg1){
  }
  protected int measureChildView(android.view.View arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  protected int positionChild(android.view.View arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  protected int positionChildInverse(android.view.View arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  public void setSplitWhenNarrow(boolean arg1){
  }
  public int getContentHeight(){
    return 0;
  }
  public void setSplitView(@com.francetelecom.rd.stubs.annotation.FieldSet("this.mSplitView") ActionBarContainer arg1){
  }
  public int getAnimatedVisibility(){
    return 0;
  }
  public void animateToVisibility(int arg1){
  }
  public void postShowOverflowMenu(){
  }
  public boolean isOverflowReserved(){
    return false;
  }
  public void dismissPopupMenus(){
  }
}
