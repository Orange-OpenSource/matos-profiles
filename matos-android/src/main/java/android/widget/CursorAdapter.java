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
public abstract class CursorAdapter
  extends BaseAdapter  implements Filterable
{
  // Fields

  protected boolean mDataValid;

  protected boolean mAutoRequery;

  protected android.database.Cursor mCursor;

  protected android.content.Context mContext;

  protected int mRowIDColumn;

  protected android.database.DataSetObserver mDataSetObserver;

  protected FilterQueryProvider mFilterQueryProvider;

  @java.lang.Deprecated
  public static final int FLAG_AUTO_REQUERY = 1;

  public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CursorAdapter(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.mCursor") android.database.Cursor arg2){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CursorAdapter(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.mCursor") android.database.Cursor arg2, boolean arg3){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CursorAdapter(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.mCursor") android.database.Cursor arg2, int arg3){
    super();
  }
  // Methods

  protected void init(android.content.Context arg1, android.database.Cursor arg2, boolean arg3){
  }
  public Filter getFilter(){
    return (Filter) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onContentChanged(){
  }
  public abstract void bindView(android.view.View arg1, android.content.Context arg2, android.database.Cursor arg3);
  public java.lang.CharSequence convertToString(android.database.Cursor arg1){
    return (java.lang.CharSequence) null;
  }
  public android.database.Cursor swapCursor(@com.francetelecom.rd.stubs.annotation.FieldSet("this.mCursor") android.database.Cursor arg1){
    return (android.database.Cursor) null;
  }
  public abstract android.view.View newView(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.mCursor") android.database.Cursor arg2, android.view.ViewGroup arg3);
  public android.view.View newDropDownView(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.mCursor") android.database.Cursor arg2, android.view.ViewGroup arg3){
    return (android.view.View) null;
  }
  public int getCount(){
    return 0;
  }
  public boolean hasStableIds(){
    return false;
  }
  public void changeCursor(@com.francetelecom.rd.stubs.annotation.FieldSet("this.mCursor") android.database.Cursor arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mCursor") 
  public android.database.Cursor getCursor(){
    return (android.database.Cursor) null;
  }
  public java.lang.Object getItem(int arg1){
    return (java.lang.Object) null;
  }
  public long getItemId(int arg1){
    return 0l;
  }
  public android.view.View getView(int arg1, android.view.View arg2, android.view.ViewGroup arg3){
    return (android.view.View) null;
  }
  public android.view.View getDropDownView(int arg1, android.view.View arg2, android.view.ViewGroup arg3){
    return (android.view.View) null;
  }
  public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence arg1){
    return (android.database.Cursor) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("this.mFilterQueryProvider")
  public FilterQueryProvider getFilterQueryProvider(){
    return (FilterQueryProvider) null;
  }
  public void setFilterQueryProvider(@com.francetelecom.rd.stubs.annotation.FieldSet("this.mFilterQueryProvider") FilterQueryProvider arg1){
  }
}
