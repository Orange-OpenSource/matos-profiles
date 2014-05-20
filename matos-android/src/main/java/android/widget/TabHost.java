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


public class TabHost
  extends FrameLayout  implements android.view.ViewTreeObserver.OnTouchModeChangeListener
{
  // Classes

  public static interface OnTabChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onTabChanged")
    public void onTabChanged(java.lang.String arg1);
  }
  public static interface TabContentFactory
  {
    // Methods

    public android.view.View createTabContent(java.lang.String arg1);
  }
  public class TabSpec
  {
    // Fields

    // Constructors

    private TabSpec(java.lang.String arg1){
    }
    // Methods

    public java.lang.String getTag(){
      return (java.lang.String) null;
    }
    public TabHost.TabSpec setContent(int arg1){
      return (TabHost.TabSpec) null;
    }
    public TabHost.TabSpec setContent(TabHost.TabContentFactory arg1){
      return (TabHost.TabSpec) null;
    }
    public TabHost.TabSpec setContent(android.content.Intent arg1){
      return (TabHost.TabSpec) null;
    }
    public TabHost.TabSpec setIndicator(java.lang.CharSequence arg1){
      return (TabHost.TabSpec) null;
    }
    public TabHost.TabSpec setIndicator(java.lang.CharSequence arg1, android.graphics.drawable.Drawable arg2){
      return (TabHost.TabSpec) null;
    }
    public TabHost.TabSpec setIndicator(android.view.View arg1){
      return (TabHost.TabSpec) null;
    }
  }
  // Fields

  protected int mCurrentTab;

  protected android.app.LocalActivityManager mLocalActivityManager;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TabHost(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TabHost(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  public void setup(){
  }
  public void setup(android.app.LocalActivityManager arg1){
  }
  protected void onAttachedToWindow(){
  }
  protected void onDetachedFromWindow(){
  }
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  public void dispatchWindowFocusChanged(boolean arg1){
  }
  public void sendAccessibilityEvent(int arg1){
  }
  public TabWidget getTabWidget(){
    return (TabWidget) null;
  }
  public void addTab(TabHost.TabSpec arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onTouchModeChanged(boolean arg1){
  }
  public void setCurrentTabByTag(java.lang.String arg1){
  }
  public int getCurrentTab(){
    return 0;
  }
  public void setCurrentTab(int arg1){
  }
  public java.lang.String getCurrentTabTag(){
    return (java.lang.String) null;
  }
  public android.view.View getCurrentTabView(){
    return (android.view.View) null;
  }
  public TabHost.TabSpec newTabSpec(java.lang.String arg1){
    return (TabHost.TabSpec) null;
  }
  public void clearAllTabs(){
  }
  public android.view.View getCurrentView(){
    return (android.view.View) null;
  }
  public FrameLayout getTabContentView(){
    return (FrameLayout) null;
  }
  public void setOnTabChangedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.TabHost.OnTabChangeListener.onTabChanged") TabHost.OnTabChangeListener arg1){
  }
}
