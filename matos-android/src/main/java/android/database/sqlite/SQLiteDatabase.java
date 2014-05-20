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
public class SQLiteDatabase
  extends SQLiteClosable{
  // Classes

  public static interface CursorFactory
  {
    // Methods

    public android.database.Cursor newCursor(SQLiteDatabase arg1, SQLiteCursorDriver arg2, java.lang.String arg3, SQLiteQuery arg4);
  }
  public static interface CustomFunction
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("callback")
    public void callback(java.lang.String [] arg1);
  }
  // Fields

  public static final int CONFLICT_ROLLBACK = 1;

  public static final int CONFLICT_ABORT = 2;

  public static final int CONFLICT_FAIL = 3;

  public static final int CONFLICT_IGNORE = 4;

  public static final int CONFLICT_REPLACE = 5;

  public static final int CONFLICT_NONE = 0;

  public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;

  public static final int OPEN_READWRITE = 0;

  public static final int OPEN_READONLY = 1;

  public static final int NO_LOCALIZED_COLLATORS = 16;

  public static final int CREATE_IF_NECESSARY = 268435456;

  public static final int MAX_SQL_CACHE_SIZE = 100;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  private SQLiteDatabase(java.lang.String arg1, SQLiteDatabase.CursorFactory arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCorruption") android.database.DatabaseErrorHandler arg4, short arg5){
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public long replace(java.lang.String arg1, java.lang.String arg2, android.content.ContentValues arg3){
    return 0l;
  }
  public void close(){
  }
  public int delete(java.lang.String arg1, java.lang.String arg2, java.lang.String [] arg3){
    return 0;
  }
  public long insert(java.lang.String arg1, java.lang.String arg2, android.content.ContentValues arg3){
    return 0l;
  }
  public boolean isReadOnly(){
    return false;
  }
  public static SQLiteDatabase create(SQLiteDatabase.CursorFactory arg1){
    return (SQLiteDatabase) null;
  }
  public final java.lang.String getPath(){
    return (java.lang.String) null;
  }
  public boolean isOpen(){
    return false;
  }
  public android.database.Cursor query(boolean arg1, java.lang.String arg2, java.lang.String [] arg3, java.lang.String arg4, java.lang.String [] arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9){
    return (android.database.Cursor) null;
  }
  public android.database.Cursor query(java.lang.String arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String [] arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7){
    return (android.database.Cursor) null;
  }
  public android.database.Cursor query(java.lang.String arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String [] arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8){
    return (android.database.Cursor) null;
  }
  public int update(java.lang.String arg1, android.content.ContentValues arg2, java.lang.String arg3, java.lang.String [] arg4){
    return 0;
  }
  public void setVersion(int arg1){
  }
  public int getVersion(){
    return 0;
  }
  public static SQLiteDatabase openOrCreateDatabase(java.io.File arg1, SQLiteDatabase.CursorFactory arg2){
    return (SQLiteDatabase) null;
  }
  public static SQLiteDatabase openOrCreateDatabase(java.lang.String arg1, SQLiteDatabase.CursorFactory arg2){
    return (SQLiteDatabase) null;
  }
  public static SQLiteDatabase openOrCreateDatabase(java.lang.String arg1, SQLiteDatabase.CursorFactory arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCorruption") android.database.DatabaseErrorHandler arg3){
    return (SQLiteDatabase) null;
  }
  public void setLocale(java.util.Locale arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAllReferencesReleased(){
  }
  public void beginTransaction(){
  }
  public SQLiteStatement compileStatement(java.lang.String arg1) throws android.database.SQLException{
    return (SQLiteStatement) null;
  }
  public void execSQL(java.lang.String arg1) throws android.database.SQLException{
  }
  public void execSQL(java.lang.String arg1, java.lang.Object [] arg2) throws android.database.SQLException{
  }
  public void endTransaction(){
  }
  public boolean isDbLockedByCurrentThread(){
    return false;
  }
  public boolean inTransaction(){
    return false;
  }
  public void beginTransactionNonExclusive(){
  }
  public void setTransactionSuccessful(){
  }
  public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs(){
    return (java.util.List) null;
  }
  public static int releaseMemory(){
    return 0;
  }
  public void setLockingEnabled(boolean arg1){
  }
  public void beginTransactionWithListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.database.sqlite.SQLiteTransactionListener.onChange") SQLiteTransactionListener arg1){
  }
  public void beginTransactionWithListenerNonExclusive(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.database.sqlite.SQLiteTransactionListener.onChange") SQLiteTransactionListener arg1){
  }
  public boolean isDbLockedByOtherThreads(){
    return false;
  }
  public boolean yieldIfContended(){
    return false;
  }
  public boolean yieldIfContendedSafely(){
    return false;
  }
  public boolean yieldIfContendedSafely(long arg1){
    return false;
  }
  public java.util.Map<java.lang.String, java.lang.String> getSyncedTables(){
    return (java.util.Map) null;
  }
  public static SQLiteDatabase openDatabase(java.lang.String arg1, SQLiteDatabase.CursorFactory arg2, int arg3){
    return (SQLiteDatabase) null;
  }
  public static SQLiteDatabase openDatabase(java.lang.String arg1, SQLiteDatabase.CursorFactory arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCorruption") android.database.DatabaseErrorHandler arg4){
    return (SQLiteDatabase) null;
  }
  public void addCustomFunction(java.lang.String arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("callback") SQLiteDatabase.CustomFunction arg3){
  }
  public long getMaximumSize(){
    return 0l;
  }
  public long setMaximumSize(long arg1){
    return 0l;
  }
  public long getPageSize(){
    return 0l;
  }
  public void setPageSize(long arg1){
  }
  public void markTableSyncable(java.lang.String arg1, java.lang.String arg2){
  }
  public void markTableSyncable(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public static java.lang.String findEditTable(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public android.database.Cursor queryWithFactory(SQLiteDatabase.CursorFactory arg1, boolean arg2, java.lang.String arg3, java.lang.String [] arg4, java.lang.String arg5, java.lang.String [] arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10){
    return (android.database.Cursor) null;
  }
  public android.database.Cursor rawQuery(java.lang.String arg1, java.lang.String [] arg2){
    return (android.database.Cursor) null;
  }
  public android.database.Cursor rawQueryWithFactory(SQLiteDatabase.CursorFactory arg1, java.lang.String arg2, java.lang.String [] arg3, java.lang.String arg4){
    return (android.database.Cursor) null;
  }
  public long insertOrThrow(java.lang.String arg1, java.lang.String arg2, android.content.ContentValues arg3) throws android.database.SQLException{
    return 0l;
  }
  public long replaceOrThrow(java.lang.String arg1, java.lang.String arg2, android.content.ContentValues arg3) throws android.database.SQLException{
    return 0l;
  }
  public long insertWithOnConflict(java.lang.String arg1, java.lang.String arg2, android.content.ContentValues arg3, int arg4){
    return 0l;
  }
  public int updateWithOnConflict(java.lang.String arg1, android.content.ContentValues arg2, java.lang.String arg3, java.lang.String [] arg4, int arg5){
    return 0;
  }
  public boolean needUpgrade(int arg1){
    return false;
  }
  public void setMaxSqlCacheSize(int arg1){
  }
  public boolean enableWriteAheadLogging(){
    return false;
  }
  public void disableWriteAheadLogging(){
  }
  public boolean isDatabaseIntegrityOk(){
    return false;
  }
}
