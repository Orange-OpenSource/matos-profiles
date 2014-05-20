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
public abstract class SimpleCursorTreeAdapter
  extends ResourceCursorTreeAdapter{
  // Classes

  public static interface ViewBinder
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("setViewValue")
    public boolean setViewValue(android.view.View arg1, android.database.Cursor arg2, int arg3);
  }
  // Constructors

  public SimpleCursorTreeAdapter(android.content.Context arg1, android.database.Cursor arg2, int arg3, int arg4, java.lang.String [] arg5, int [] arg6, int arg7, int arg8, java.lang.String [] arg9, int [] arg10){
    super((android.content.Context) null, (android.database.Cursor) null, 0, 0, 0, 0);
  }
  public SimpleCursorTreeAdapter(android.content.Context arg1, android.database.Cursor arg2, int arg3, int arg4, java.lang.String [] arg5, int [] arg6, int arg7, java.lang.String [] arg8, int [] arg9){
    super((android.content.Context) null, (android.database.Cursor) null, 0, 0, 0, 0);
  }
  public SimpleCursorTreeAdapter(android.content.Context arg1, android.database.Cursor arg2, int arg3, java.lang.String [] arg4, int [] arg5, int arg6, java.lang.String [] arg7, int [] arg8){
    super((android.content.Context) null, (android.database.Cursor) null, 0, 0, 0, 0);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("viewBinder")
  public SimpleCursorTreeAdapter.ViewBinder getViewBinder(){
    return (SimpleCursorTreeAdapter.ViewBinder) null;
  }
  public void setViewBinder(@com.francetelecom.rd.stubs.annotation.FieldSet("viewBinder") @com.francetelecom.rd.stubs.annotation.CallBackRegister("setViewValue") SimpleCursorTreeAdapter.ViewBinder arg1){
  }
  protected void setViewImage(ImageView arg1, java.lang.String arg2){
  }
  public void setViewText(TextView arg1, java.lang.String arg2){
  }
  protected void bindChildView(android.view.View arg1, android.content.Context arg2, android.database.Cursor arg3, boolean arg4){
  }
  protected void bindGroupView(android.view.View arg1, android.content.Context arg2, android.database.Cursor arg3, boolean arg4){
  }
}
