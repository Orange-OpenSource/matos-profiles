package android.database;

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
public class DatabaseUtils
{
  // Classes

  public static class InsertHelper
  {
    // Fields

    public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;

    public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;

    // Constructors

    public InsertHelper(android.database.sqlite.SQLiteDatabase arg1, java.lang.String arg2){
    }
    // Methods

    public long replace(android.content.ContentValues arg1){
      return 0l;
    }
    public void close(){
    }
    public long insert(android.content.ContentValues arg1){
      return 0l;
    }
    public long execute(){
      return 0l;
    }
    public void bind(int arg1, double arg2){
    }
    public void bind(int arg1, float arg2){
    }
    public void bind(int arg1, long arg2){
    }
    public void bind(int arg1, int arg2){
    }
    public void bind(int arg1, boolean arg2){
    }
    public void bind(int arg1, byte [] arg2){
    }
    public void bind(int arg1, java.lang.String arg2){
    }
    public void bindNull(int arg1){
    }
    public int getColumnIndex(java.lang.String arg1){
      return 0;
    }
    public void prepareForInsert(){
    }
    public void prepareForReplace(){
    }
  }
  // Fields

  public static final int STATEMENT_SELECT = 1;

  public static final int STATEMENT_UPDATE = 2;

  public static final int STATEMENT_ATTACH = 3;

  public static final int STATEMENT_BEGIN = 4;

  public static final int STATEMENT_COMMIT = 5;

  public static final int STATEMENT_ABORT = 6;

  public static final int STATEMENT_PRAGMA = 7;

  public static final int STATEMENT_DDL = 8;

  public static final int STATEMENT_UNPREPARED = 9;

  public static final int STATEMENT_OTHER = 99;

  // Constructors

  public DatabaseUtils(){
  }
  // Methods

  public static void cursorStringToContentValuesIfPresent(Cursor arg1, android.content.ContentValues arg2, java.lang.String arg3){
  }
  public static void cursorLongToContentValuesIfPresent(Cursor arg1, android.content.ContentValues arg2, java.lang.String arg3){
  }
  public static void cursorIntToContentValuesIfPresent(Cursor arg1, android.content.ContentValues arg2, java.lang.String arg3){
  }
  public static final void writeExceptionToParcel(android.os.Parcel arg1, java.lang.Exception arg2){
  }
  public static final void readExceptionFromParcel(android.os.Parcel arg1){
  }
  public static void readExceptionWithFileNotFoundExceptionFromParcel(android.os.Parcel arg1) throws java.io.FileNotFoundException{
  }
  public static void readExceptionWithOperationApplicationExceptionFromParcel(android.os.Parcel arg1) throws android.content.OperationApplicationException{
  }
  public static void bindObjectToProgram(android.database.sqlite.SQLiteProgram arg1, int arg2, java.lang.Object arg3){
  }
  public static int getTypeOfObject(java.lang.Object arg1){
    return 0;
  }
  public static void appendEscapedSQLString(java.lang.StringBuilder arg1, java.lang.String arg2){
  }
  public static java.lang.String sqlEscapeString(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static final void appendValueToSql(java.lang.StringBuilder arg1, java.lang.Object arg2){
  }
  public static java.lang.String concatenateWhere(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public static java.lang.String getCollationKey(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String getHexCollationKey(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static void dumpCursor(Cursor arg1){
  }
  public static void dumpCursor(Cursor arg1, java.io.PrintStream arg2){
  }
  public static void dumpCursor(Cursor arg1, java.lang.StringBuilder arg2){
  }
  public static java.lang.String dumpCursorToString(Cursor arg1){
    return (java.lang.String) null;
  }
  public static void dumpCurrentRow(Cursor arg1){
  }
  public static void dumpCurrentRow(Cursor arg1, java.io.PrintStream arg2){
  }
  public static void dumpCurrentRow(Cursor arg1, java.lang.StringBuilder arg2){
  }
  public static java.lang.String dumpCurrentRowToString(Cursor arg1){
    return (java.lang.String) null;
  }
  public static void cursorStringToContentValues(Cursor arg1, java.lang.String arg2, android.content.ContentValues arg3){
  }
  public static void cursorStringToContentValues(Cursor arg1, java.lang.String arg2, android.content.ContentValues arg3, java.lang.String arg4){
  }
  public static void cursorStringToInsertHelper(Cursor arg1, java.lang.String arg2, DatabaseUtils.InsertHelper arg3, int arg4){
  }
  public static void cursorIntToContentValues(Cursor arg1, java.lang.String arg2, android.content.ContentValues arg3){
  }
  public static void cursorIntToContentValues(Cursor arg1, java.lang.String arg2, android.content.ContentValues arg3, java.lang.String arg4){
  }
  public static void cursorLongToContentValues(Cursor arg1, java.lang.String arg2, android.content.ContentValues arg3){
  }
  public static void cursorLongToContentValues(Cursor arg1, java.lang.String arg2, android.content.ContentValues arg3, java.lang.String arg4){
  }
  public static void cursorDoubleToCursorValues(Cursor arg1, java.lang.String arg2, android.content.ContentValues arg3){
  }
  public static void cursorDoubleToContentValues(Cursor arg1, java.lang.String arg2, android.content.ContentValues arg3, java.lang.String arg4){
  }
  public static void cursorRowToContentValues(Cursor arg1, android.content.ContentValues arg2){
  }
  public static long queryNumEntries(android.database.sqlite.SQLiteDatabase arg1, java.lang.String arg2){
    return 0l;
  }
  public static long queryNumEntries(android.database.sqlite.SQLiteDatabase arg1, java.lang.String arg2, java.lang.String arg3){
    return 0l;
  }
  public static long queryNumEntries(android.database.sqlite.SQLiteDatabase arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String [] arg4){
    return 0l;
  }
  public static long longForQuery(android.database.sqlite.SQLiteDatabase arg1, java.lang.String arg2, java.lang.String [] arg3){
    return 0l;
  }
  public static long longForQuery(android.database.sqlite.SQLiteStatement arg1, java.lang.String [] arg2){
    return 0l;
  }
  public static java.lang.String stringForQuery(android.database.sqlite.SQLiteDatabase arg1, java.lang.String arg2, java.lang.String [] arg3){
    return (java.lang.String) null;
  }
  public static java.lang.String stringForQuery(android.database.sqlite.SQLiteStatement arg1, java.lang.String [] arg2){
    return (java.lang.String) null;
  }
  public static android.os.ParcelFileDescriptor blobFileDescriptorForQuery(android.database.sqlite.SQLiteDatabase arg1, java.lang.String arg2, java.lang.String [] arg3){
    return (android.os.ParcelFileDescriptor) null;
  }
  public static android.os.ParcelFileDescriptor blobFileDescriptorForQuery(android.database.sqlite.SQLiteStatement arg1, java.lang.String [] arg2){
    return (android.os.ParcelFileDescriptor) null;
  }
  public static void cursorShortToContentValuesIfPresent(Cursor arg1, android.content.ContentValues arg2, java.lang.String arg3){
  }
  public static void cursorFloatToContentValuesIfPresent(Cursor arg1, android.content.ContentValues arg2, java.lang.String arg3){
  }
  public static void cursorDoubleToContentValuesIfPresent(Cursor arg1, android.content.ContentValues arg2, java.lang.String arg3){
  }
  public static void createDbFromSqlStatements(android.content.Context arg1, java.lang.String arg2, int arg3, java.lang.String arg4){
  }
  public static int getSqlStatementType(java.lang.String arg1){
    return 0;
  }
  public static java.lang.String [] appendSelectionArgs(java.lang.String [] arg1, java.lang.String [] arg2){
    return (java.lang.String []) null;
  }
}
