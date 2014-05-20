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

import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.CursorImpl")
public interface Cursor
{
  // Fields

  public static final int FIELD_TYPE_NULL = 0;

  public static final int FIELD_TYPE_INTEGER = 1;

  public static final int FIELD_TYPE_FLOAT = 2;

  public static final int FIELD_TYPE_STRING = 3;

  public static final int FIELD_TYPE_BLOB = 4;

  // Methods

  public short getShort(int arg1);
  public int getInt(int arg1);
  public long getLong(int arg1);
  public float getFloat(int arg1);
  public double getDouble(int arg1);
  public void close();
  public int getType(int arg1);
  public java.lang.String getString(int arg1);
  public boolean isFirst();
  public boolean isClosed();
  public int getCount();
  public void registerDataSetObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.database.DataSetObserver.onChanged") DataSetObserver arg1);
  public void unregisterDataSetObserver(DataSetObserver arg1);
  public int getPosition();
  public boolean requery();
  public android.os.Bundle getExtras();
  public void deactivate();
  public java.lang.String [] getColumnNames();
  public int getColumnIndex(java.lang.String arg1);
  public boolean isNull(int arg1);
  public byte [] getBlob(int arg1);
  public void copyStringToBuffer(int arg1, CharArrayBuffer arg2);
  public int getColumnIndexOrThrow(java.lang.String arg1) throws java.lang.IllegalArgumentException;
  public boolean moveToNext();
  public boolean moveToFirst();
  public boolean isAfterLast();
  public boolean moveToPosition(int arg1);
  public void registerContentObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") ContentObserver arg1);
  public void unregisterContentObserver(ContentObserver arg1);
  public boolean move(int arg1);
  public int getColumnCount();
  public boolean moveToLast();
  public boolean moveToPrevious();
  public boolean isLast();
  public boolean isBeforeFirst();
  public java.lang.String getColumnName(int arg1);
  public void setNotificationUri(android.content.ContentResolver arg1, android.net.Uri arg2);
  public boolean getWantsAllOnMoveCalls();
  public android.os.Bundle respond(android.os.Bundle arg1);
}
