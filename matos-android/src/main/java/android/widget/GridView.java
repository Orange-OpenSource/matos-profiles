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
public class GridView
  extends AbsListView{
  // Fields

  public static final int NO_STRETCH = 0;

  public static final int STRETCH_SPACING = 1;

  public static final int STRETCH_COLUMN_WIDTH = 2;

  public static final int STRETCH_SPACING_UNIFORM = 3;

  public static final int AUTO_FIT = -1;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public GridView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public GridView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public GridView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyMultiple(int arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  protected void attachLayoutAnimationParameters(android.view.View arg1, android.view.ViewGroup.LayoutParams arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
  }
  protected int computeVerticalScrollRange(){
    return 0;
  }
  protected int computeVerticalScrollOffset(){
    return 0;
  }
  protected int computeVerticalScrollExtent(){
    return 0;
  }
  public void setGravity(int arg1){
  }
  public void setSelection(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("adapter")
  public ListAdapter getAdapter(){
    return (ListAdapter) null;
  }
  public void setAdapter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("adapter") @com.francetelecom.rd.stubs.annotation.FieldSet("adapter") ListAdapter arg1){
  }
  @android.view.RemotableViewMethod
  public void setRemoteViewsAdapter(android.content.Intent arg1){
  }
  @android.view.RemotableViewMethod
  public void smoothScrollToPosition(int arg1){
  }
  @android.view.RemotableViewMethod
  public void smoothScrollByOffset(int arg1){
  }
  protected void layoutChildren(){
  }
  public void setNumColumns(int arg1){
  }
  public void setHorizontalSpacing(int arg1){
  }
  public void setVerticalSpacing(int arg1){
  }
  public void setStretchMode(int arg1){
  }
  public int getStretchMode(){
    return 0;
  }
  public void setColumnWidth(int arg1){
  }
  @android.view.ViewDebug.ExportedProperty(prefix = "", category = "", mapping = {}, resolveId = false, flagMapping = {}, deepExport = false, indexMapping = {})
  public int getNumColumns(){
    return 0;
  }
}
