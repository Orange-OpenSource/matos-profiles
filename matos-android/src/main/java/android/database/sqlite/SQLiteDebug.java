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
public final class SQLiteDebug
{
  // Classes

  public static class PagerStats
  {
    // Fields

    public long totalBytes;

    public long referencedBytes;

    public long databaseBytes;

    public int numPagers;

    public int memoryUsed;

    public int pageCacheOverflo;

    public int largestMemAlloc;

    public java.util.ArrayList<SQLiteDebug.DbStats> dbStats;

    // Constructors

    public PagerStats(){
    }
  }
  public static class DbStats
  {
    // Fields

    public java.lang.String dbName;

    public long pageSize;

    public long dbSize;

    public int lookaside;

    public java.lang.String cache;

    // Constructors

    public DbStats(java.lang.String arg1, long arg2, long arg3, int arg4, int arg5, int arg6, int arg7){
    }
  }
  // Fields

  public static final boolean DEBUG_SQL_STATEMENTS = false;

  public static final boolean DEBUG_SQL_TIME = false;

  public static final boolean DEBUG_SQL_CACHE = false;

  public static final boolean DEBUG_ACTIVE_CURSOR_FINALIZATION = false;

  public static final boolean DEBUG_LOCK_TIME_TRACKING = false;

  public static final boolean DEBUG_LOCK_TIME_TRACKING_STACK_TRACE = false;

  // Constructors

  public SQLiteDebug(){
  }
  // Methods

  public static SQLiteDebug.PagerStats getDatabaseInfo(){
    return (SQLiteDebug.PagerStats) null;
  }
  public static void getPagerStats(SQLiteDebug.PagerStats arg1){
  }
  public static long getHeapSize(){
    return 0l;
  }
  public static long getHeapAllocatedSize(){
    return 0l;
  }
  public static long getHeapFreeSize(){
    return 0l;
  }
  public static void getHeapDirtyPages(int [] arg1){
  }
  public static int getNumActiveCursorsFinalized(){
    return 0;
  }
}
