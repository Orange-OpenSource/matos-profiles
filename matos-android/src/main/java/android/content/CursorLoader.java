package android.content;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.Code;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class CursorLoader
  extends AsyncTaskLoader<android.database.Cursor>{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  @Code({"super(arg1);","content = new com.francetelecom.rd.fakeandroid.CursorImpl(com.francetelecom.rd.stubs.Generator.token);"})
  public CursorLoader(Context arg1){
    super((Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  @Code({"super(arg1);","content = new com.francetelecom.rd.fakeandroid.CursorImpl(com.francetelecom.rd.stubs.Generator.token);"})
  @ArgsRule(value="CursorLoader",pos={0,2,3,4,5,6})
  public CursorLoader(Context arg1, android.net.Uri arg2, java.lang.String [] arg3, java.lang.String arg4, java.lang.String [] arg5, java.lang.String arg6){
    super((Context) null);
  }
  // Methods

  public void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4){
  }
  public android.net.Uri getUri(){
    return (android.net.Uri) null;
  }
  public void deliverResult(android.database.Cursor arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onStartLoading(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onStopLoading(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onReset(){
  }
  @ArgsRule(value="CursorLoader.setSelection", pos={0,1})
  public void setSelection(java.lang.String arg1){
  }
  public java.lang.String [] getProjection(){
    return (java.lang.String []) null;
  }
  public java.lang.String getSelection(){
    return (java.lang.String) null;
  }
  public java.lang.String [] getSelectionArgs(){
    return (java.lang.String []) null;
  }
  @ArgsRule(value="CursorLoader.setUri", pos={0,1})
  public void setUri(android.net.Uri arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCanceled(android.database.Cursor arg1){
  }
  public android.database.Cursor loadInBackground(){
    return (android.database.Cursor) null;
  }
  @ArgsRule(value="CursorLoader.setProjection", pos={0,1})
  public void setProjection(java.lang.String [] arg1){
  }
  @ArgsRule(value="CursorLoader.setSelectionArgs", pos={0,1})
  public void setSelectionArgs(java.lang.String [] arg1){
  }
  public java.lang.String getSortOrder(){
    return (java.lang.String) null;
  }
  public void setSortOrder(java.lang.String arg1){
  }
}
