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
public abstract class SQLiteOpenHelper
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("helper")
  public SQLiteOpenHelper(android.content.Context arg1, java.lang.String arg2, SQLiteDatabase.CursorFactory arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("helper")
  public SQLiteOpenHelper(android.content.Context arg1, java.lang.String arg2, SQLiteDatabase.CursorFactory arg3, int arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCorruption") android.database.DatabaseErrorHandler arg5){
  }
  // Methods

  public synchronized void close(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("helper")
  public abstract void onCreate(SQLiteDatabase arg1);
  public java.lang.String getDatabaseName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("helper")
  public abstract void onUpgrade(SQLiteDatabase arg1, int arg2, int arg3);
  public synchronized SQLiteDatabase getWritableDatabase(){
    return (SQLiteDatabase) null;
  }
  public synchronized SQLiteDatabase getReadableDatabase(){
    return (SQLiteDatabase) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("helper")
  public void onDowngrade(SQLiteDatabase arg1, int arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("helper")
  public void onOpen(SQLiteDatabase arg1){
  }
}
