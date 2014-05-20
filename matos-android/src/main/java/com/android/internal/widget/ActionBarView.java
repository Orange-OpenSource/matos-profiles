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
public class ActionBarView
  extends AbsActionBarView{
  // Fields

  public static final int DISPLAY_DEFAULT = 0;

  // Constructors
  
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActionBarView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  public void setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mSubtitle") java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  public android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  protected void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onDetachedFromWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSubtitle") 
  public java.lang.CharSequence getTitle(){
    return (java.lang.CharSequence) null;
  }
  public void setSplitActionBar(boolean arg1){
  }
  public void setSubtitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mSubtitle") java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSubtitle")
  public java.lang.CharSequence getSubtitle(){
    return (java.lang.CharSequence) null;
  }
  protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams(){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public boolean shouldDelayChildPressedState(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  protected void onFinishInflate(){
  }
  public void setIcon(android.graphics.drawable.Drawable arg1){
  }
  public void setIcon(int arg1){
  }
  public void setCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onNavigationListener") android.app.ActionBar.OnNavigationListener arg1){
  }
  public void collapseActionView(){
  }
  public void setHomeButtonEnabled(boolean arg1){
  }
  public void setDisplayOptions(int arg1){
  }
  public int getNavigationMode(){
    return 0;
  }
  public int getDisplayOptions(){
    return 0;
  }
  public void setNavigationMode(int arg1){
  }
  public void setLogo(android.graphics.drawable.Drawable arg1){
  }
  public void setLogo(int arg1){
  }
  public void setMenu(android.view.Menu arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("Callback") com.android.internal.view.menu.MenuPresenter.Callback arg2){
  }
  public boolean hasEmbeddedTabs(){
    return false;
  }
  public void setContextView(ActionBarContextView arg1){
  }
  public boolean isSplitActionBar(){
    return false;
  }
  public void setEmbeddedTabView(ScrollingTabContainerView arg1){
  }
  public void setCollapsable(boolean arg1){
  }
  public void setDropdownSelectedPosition(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mCustomNavigationView")
  public android.view.View getCustomNavigationView(){
    return (android.view.View) null;
  }
  public boolean isCollapsed(){
    return false;
  }
  public void setCustomNavigationView(@com.francetelecom.rd.stubs.annotation.FieldSet("mCustomNavigationView") android.view.View arg1){
  }
  public void setDropdownAdapter(@com.francetelecom.rd.stubs.annotation.FieldSet("mDropdownAdapter") @com.francetelecom.rd.stubs.annotation.CallBackRegister("adapter") android.widget.SpinnerAdapter arg1){
  }
  public int getDropdownSelectedPosition(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mDropdownAdapter")
  public android.widget.SpinnerAdapter getDropdownAdapter(){
    return (android.widget.SpinnerAdapter) null;
  }
  public boolean hasExpandedActionView(){
    return false;
  }
  public void setWindowCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCallBack") android.view.Window.Callback arg1){
  }
  public void initProgress(){
  }
  public void initIndeterminateProgress(){
  }
  public void setWindowTitle(java.lang.CharSequence arg1){
  }
}
