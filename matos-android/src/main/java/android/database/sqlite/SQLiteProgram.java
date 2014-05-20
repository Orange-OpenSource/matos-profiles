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
public abstract class SQLiteProgram
  extends SQLiteClosable{
  // Fields

  protected SQLiteDatabase mDatabase;

  protected int nHandle;

  protected int nStatement;

  // Constructors

  SQLiteProgram(SQLiteDatabase arg1, java.lang.String arg2){
    super();
  }
  SQLiteProgram(SQLiteDatabase arg1, java.lang.String arg2, java.lang.Object [] arg3, boolean arg4){
    super();
  }
  // Methods

  protected void compile(java.lang.String arg1, boolean arg2){
  }
  public void close(){
  }
  public void bindNull(int arg1){
  }
  public void bindDouble(int arg1, double arg2){
  }
  public void bindLong(int arg1, long arg2){
  }
  public void bindBlob(int arg1, byte [] arg2){
  }
  public void bindString(int arg1, java.lang.String arg2){
  }
  public void bindAllArgsAsStrings(java.lang.String [] arg1){
  }
  public void clearBindings(){
  }
  protected void onAllReferencesReleased(){
  }
  protected void onAllReferencesReleasedFromContainer(){
  }
  public final int getUniqueId(){
    return 0;
  }
  protected final void native_compile(java.lang.String arg1){
  }
  protected final void native_finalize(){
  }
  protected final void native_bind_null(int arg1){
  }
  protected final void native_bind_long(int arg1, long arg2){
  }
  protected final void native_bind_double(int arg1, double arg2){
  }
  protected final void native_bind_string(int arg1, java.lang.String arg2){
  }
  protected final void native_bind_blob(int arg1, byte [] arg2){
  }
}
