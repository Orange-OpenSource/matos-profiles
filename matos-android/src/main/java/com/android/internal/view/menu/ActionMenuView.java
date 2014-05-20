package com.android.internal.view.menu;

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
public class ActionMenuView
  extends android.widget.LinearLayout  implements MenuView, MenuBuilder.ItemInvoker
{
  // Classes

  public static interface ActionMenuChildView
  {
    // Methods

    public boolean needsDividerAfter();
    public boolean needsDividerBefore();
  }
  public static class LayoutParams
    extends android.widget.LinearLayout.LayoutParams  {
    // Fields

    @android.view.ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
    public boolean isOverflowButton;

    @android.view.ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
    public int cellsUsed;

    @android.view.ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
    public int extraPixels;

    @android.view.ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
    public boolean expandable;

    @android.view.ViewDebug.ExportedProperty(prefix = "", category = "layout", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
    public boolean preventEdgeOffset;

    public boolean expanded;

    // Constructors
    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(ActionMenuView.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2, boolean arg3){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActionMenuView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActionMenuView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  public void initialize(MenuBuilder arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDetachedFromWindow(){
  }
  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
    return false;
  }
  protected ActionMenuView.LayoutParams generateDefaultLayoutParams(){
    return (ActionMenuView.LayoutParams) null;
  }
  public ActionMenuView.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (ActionMenuView.LayoutParams) null;
  }
  protected ActionMenuView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return (ActionMenuView.LayoutParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public boolean isOverflowReserved(){
    return false;
  }
  protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return false;
  }
  public boolean invokeItem(MenuItemImpl arg1){
    return false;
  }
  public int getWindowAnimations(){
    return 0;
  }
  protected boolean hasDividerBeforeChildAt(int arg1){
    return false;
  }
  public void setPresenter(ActionMenuPresenter arg1){
  }
  public boolean isExpandedFormat(){
    return false;
  }
  public void setOverflowReserved(boolean arg1){
  }
  public ActionMenuView.LayoutParams generateOverflowButtonLayoutParams(){
    return (ActionMenuView.LayoutParams) null;
  }
}
