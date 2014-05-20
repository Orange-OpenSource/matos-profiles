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
public class SimpleCursorAdapter
  extends ResourceCursorAdapter{
  // Classes

  public static interface ViewBinder
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("setViewValue")
    public boolean setViewValue(android.view.View arg1, android.database.Cursor arg2, int arg3);
  }
  public static interface CursorToStringConverter
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("convert")
    public java.lang.CharSequence convertToString(android.database.Cursor arg1);
  }
  // Fields

  protected int [] mFrom;

  protected int [] mTo;

  // Constructors

  public SimpleCursorAdapter(android.content.Context arg1, int arg2, android.database.Cursor arg3, java.lang.String [] arg4, int [] arg5){
    super((android.content.Context) null, 0, (android.database.Cursor) null);
  }
  public SimpleCursorAdapter(android.content.Context arg1, int arg2, android.database.Cursor arg3, java.lang.String [] arg4, int [] arg5, int arg6){
    super((android.content.Context) null, 0, (android.database.Cursor) null);
  }
  // Methods

  public void bindView(android.view.View arg1, android.content.Context arg2, android.database.Cursor arg3){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("viewBinder")
  public SimpleCursorAdapter.ViewBinder getViewBinder(){
    return (SimpleCursorAdapter.ViewBinder) null;
  }
  public void setViewBinder(@com.francetelecom.rd.stubs.annotation.FieldSet("viewBinder") @com.francetelecom.rd.stubs.annotation.CallBackRegister("setViewValue") SimpleCursorAdapter.ViewBinder arg1){
  }
  public void setViewImage(ImageView arg1, java.lang.String arg2){
  }
  public void setViewText(TextView arg1, java.lang.String arg2){
  }
  public int getStringConversionColumn(){
    return 0;
  }
  public void setStringConversionColumn(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("CursorConverter")
  public SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter(){
    return (SimpleCursorAdapter.CursorToStringConverter) null;
  }
  public void setCursorToStringConverter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("convert") @com.francetelecom.rd.stubs.annotation.FieldSet("CursorConverter") SimpleCursorAdapter.CursorToStringConverter arg1){
  }
  public java.lang.CharSequence convertToString(android.database.Cursor arg1){
    return (java.lang.CharSequence) null;
  }
  public android.database.Cursor swapCursor(android.database.Cursor arg1){
    return (android.database.Cursor) null;
  }
  public void changeCursorAndColumns(android.database.Cursor arg1, java.lang.String [] arg2, int [] arg3){
  }
}
