package android.test;

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
public class RenamingDelegatingContext
  extends android.content.ContextWrapper{
  // Constructors

  public RenamingDelegatingContext(android.content.Context arg1, java.lang.String arg2){
    super((android.content.Context) null);
  }
  public RenamingDelegatingContext(android.content.Context arg1, android.content.Context arg2, java.lang.String arg3){
    super((android.content.Context) null);
  }
  // Methods

  public java.io.FileInputStream openFileInput(java.lang.String arg1) throws java.io.FileNotFoundException{
    return (java.io.FileInputStream) null;
  }
  public java.io.FileOutputStream openFileOutput(java.lang.String arg1, int arg2) throws java.io.FileNotFoundException{
    return (java.io.FileOutputStream) null;
  }
  public boolean deleteFile(java.lang.String arg1){
    return false;
  }
  public java.io.File getFileStreamPath(java.lang.String arg1){
    return (java.io.File) null;
  }
  public java.lang.String [] fileList(){
    return (java.lang.String []) null;
  }
  public java.io.File getCacheDir(){
    return (java.io.File) null;
  }
  public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg1, int arg2, android.database.sqlite.SQLiteDatabase.CursorFactory arg3){
    return (android.database.sqlite.SQLiteDatabase) null;
  }
  public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg1, int arg2, android.database.sqlite.SQLiteDatabase.CursorFactory arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCorruption") android.database.DatabaseErrorHandler arg4){
    return (android.database.sqlite.SQLiteDatabase) null;
  }
  public boolean deleteDatabase(java.lang.String arg1){
    return false;
  }
  public java.io.File getDatabasePath(java.lang.String arg1){
    return (java.io.File) null;
  }
  public java.lang.String [] databaseList(){
    return (java.lang.String []) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1.newInstance();")
  public static <T extends android.content.ContentProvider>T providerWithRenamedContext(java.lang.Class<T> arg1, android.content.Context arg2, java.lang.String arg3) throws java.lang.IllegalAccessException, java.lang.InstantiationException{
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1.newInstance();")
  public static <T extends android.content.ContentProvider>T providerWithRenamedContext(java.lang.Class<T> arg1, android.content.Context arg2, java.lang.String arg3, boolean arg4) throws java.lang.IllegalAccessException, java.lang.InstantiationException{
    return null;
  }
  public void makeExistingFilesAndDbsAccessible(){
  }
  public java.lang.String getDatabasePrefix(){
    return (java.lang.String) null;
  }
}
