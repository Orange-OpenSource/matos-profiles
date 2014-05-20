package android.database.sqlite;

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
public class SQLiteCursor
  extends android.database.AbstractWindowedCursor{
  // Constructors

  public SQLiteCursor(SQLiteDatabase arg1, SQLiteCursorDriver arg2, java.lang.String arg3, SQLiteQuery arg4){
    super();
  }
  public SQLiteCursor(SQLiteCursorDriver arg1, java.lang.String arg2, SQLiteQuery arg3){
    super();
  }
  // Methods

  protected void finalize(){
  }
  public void close(){
  }
  public int getCount(){
    return 0;
  }
  public boolean requery(){
    return false;
  }
  public void deactivate(){
  }
  public java.lang.String [] getColumnNames(){
    return (java.lang.String []) null;
  }
  public int getColumnIndex(java.lang.String arg1){
    return 0;
  }
  public SQLiteDatabase getDatabase(){
    return (SQLiteDatabase) null;
  }
  public boolean onMove(int arg1, int arg2){
    return false;
  }
  public void setWindow(android.database.CursorWindow arg1){
  }
  public void setSelectionArguments(java.lang.String [] arg1){
  }
}
