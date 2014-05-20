package android.view;

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
public interface ViewParent
{
  // Methods

  public ViewParent getParent();
  public void requestChildFocus(View arg1, View arg2);
  public void focusableViewAvailable(View arg1);
  public boolean showContextMenuForChild(View arg1);
  public ActionMode startActionModeForChild(View arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("actionMode") ActionMode.Callback arg2);
  public View focusSearch(View arg1, int arg2);
  public boolean requestChildRectangleOnScreen(View arg1, android.graphics.Rect arg2, boolean arg3);
  public boolean requestSendAccessibilityEvent(View arg1, android.view.accessibility.AccessibilityEvent arg2);
  public void clearChildFocus(View arg1);
  public void recomputeViewAttributes(View arg1);
  public void bringChildToFront(View arg1);
  public void requestDisallowInterceptTouchEvent(boolean arg1);
  public void invalidateChild(View arg1, android.graphics.Rect arg2);
  public ViewParent invalidateChildInParent(int [] arg1, android.graphics.Rect arg2);
  public boolean getChildVisibleRect(View arg1, android.graphics.Rect arg2, android.graphics.Point arg3);
  public void requestTransparentRegion(View arg1);
  public void childDrawableStateChanged(View arg1);
  public void requestLayout();
  public boolean isLayoutRequested();
  public void createContextMenu(ContextMenu arg1);
}
