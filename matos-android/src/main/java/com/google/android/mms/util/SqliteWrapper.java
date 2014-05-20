package com.google.android.mms.util;

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


public final class SqliteWrapper
{
  // Constructors

  private SqliteWrapper(){
  }
  // Methods

  public static int delete(android.content.Context arg1, android.content.ContentResolver arg2, android.net.Uri arg3, java.lang.String arg4, java.lang.String [] arg5){
    return 0;
  }
  public static android.net.Uri insert(android.content.Context arg1, android.content.ContentResolver arg2, android.net.Uri arg3, android.content.ContentValues arg4){
    return (android.net.Uri) null;
  }
  public static android.database.Cursor query(android.content.Context arg1, android.content.ContentResolver arg2, android.net.Uri arg3, java.lang.String [] arg4, java.lang.String arg5, java.lang.String [] arg6, java.lang.String arg7){
    return (android.database.Cursor) null;
  }
  public static int update(android.content.Context arg1, android.content.ContentResolver arg2, android.net.Uri arg3, android.content.ContentValues arg4, java.lang.String arg5, java.lang.String [] arg6){
    return 0;
  }
  public static boolean requery(android.content.Context arg1, android.database.Cursor arg2){
    return false;
  }
  public static void checkSQLiteException(android.content.Context arg1, android.database.sqlite.SQLiteException arg2){
  }
}
