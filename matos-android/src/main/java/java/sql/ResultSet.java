package java.sql;

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


public interface ResultSet
  extends Wrapper, java.lang.AutoCloseable
{
  // Fields

  public static final int CLOSE_CURSORS_AT_COMMIT = 2;

  public static final int HOLD_CURSORS_OVER_COMMIT = 1;

  public static final int CONCUR_READ_ONLY = 1007;

  public static final int CONCUR_UPDATABLE = 1008;

  public static final int FETCH_FORWARD = 1000;

  public static final int FETCH_REVERSE = 1001;

  public static final int FETCH_UNKNOWN = 1002;

  public static final int TYPE_FORWARD_ONLY = 1003;

  public static final int TYPE_SCROLL_INSENSITIVE = 1004;

  public static final int TYPE_SCROLL_SENSITIVE = 1005;

  // Methods

  public java.lang.Object getObject(int arg1) throws SQLException;
  public java.lang.Object getObject(int arg1, java.util.Map<java.lang.String, java.lang.Class<?>> arg2) throws SQLException;
  public java.lang.Object getObject(java.lang.String arg1) throws SQLException;
  public java.lang.Object getObject(java.lang.String arg1, java.util.Map<java.lang.String, java.lang.Class<?>> arg2) throws SQLException;
  public boolean getBoolean(int arg1) throws SQLException;
  public boolean getBoolean(java.lang.String arg1) throws SQLException;
  public byte getByte(int arg1) throws SQLException;
  public byte getByte(java.lang.String arg1) throws SQLException;
  public short getShort(int arg1) throws SQLException;
  public short getShort(java.lang.String arg1) throws SQLException;
  public int getInt(int arg1) throws SQLException;
  public int getInt(java.lang.String arg1) throws SQLException;
  public long getLong(int arg1) throws SQLException;
  public long getLong(java.lang.String arg1) throws SQLException;
  public float getFloat(int arg1) throws SQLException;
  public float getFloat(java.lang.String arg1) throws SQLException;
  public double getDouble(int arg1) throws SQLException;
  public double getDouble(java.lang.String arg1) throws SQLException;
  public byte [] getBytes(int arg1) throws SQLException;
  public byte [] getBytes(java.lang.String arg1) throws SQLException;
  public Array getArray(int arg1) throws SQLException;
  public Array getArray(java.lang.String arg1) throws SQLException;
  public boolean next() throws SQLException;
  public java.net.URL getURL(int arg1) throws SQLException;
  public java.net.URL getURL(java.lang.String arg1) throws SQLException;
  public void close() throws SQLException;
  public int getType() throws SQLException;
  public boolean previous() throws SQLException;
  public Ref getRef(int arg1) throws SQLException;
  public Ref getRef(java.lang.String arg1) throws SQLException;
  public java.lang.String getString(int arg1) throws SQLException;
  public java.lang.String getString(java.lang.String arg1) throws SQLException;
  public boolean isFirst() throws SQLException;
  public Date getDate(int arg1) throws SQLException;
  public Date getDate(int arg1, java.util.Calendar arg2) throws SQLException;
  public Date getDate(java.lang.String arg1) throws SQLException;
  public Date getDate(java.lang.String arg1, java.util.Calendar arg2) throws SQLException;
  public Time getTime(int arg1) throws SQLException;
  public Time getTime(int arg1, java.util.Calendar arg2) throws SQLException;
  public Time getTime(java.lang.String arg1) throws SQLException;
  public Time getTime(java.lang.String arg1, java.util.Calendar arg2) throws SQLException;
  public boolean isClosed() throws SQLException;
  public Timestamp getTimestamp(int arg1) throws SQLException;
  public Timestamp getTimestamp(int arg1, java.util.Calendar arg2) throws SQLException;
  public Timestamp getTimestamp(java.lang.String arg1) throws SQLException;
  public Timestamp getTimestamp(java.lang.String arg1, java.util.Calendar arg2) throws SQLException;
  public boolean first() throws SQLException;
  public boolean last() throws SQLException;
  public java.io.Reader getCharacterStream(int arg1) throws SQLException;
  public java.io.Reader getCharacterStream(java.lang.String arg1) throws SQLException;
  public java.io.InputStream getAsciiStream(int arg1) throws SQLException;
  public java.io.InputStream getAsciiStream(java.lang.String arg1) throws SQLException;
  public Blob getBlob(int arg1) throws SQLException;
  public Blob getBlob(java.lang.String arg1) throws SQLException;
  public boolean isAfterLast() throws SQLException;
  public boolean isLast() throws SQLException;
  public boolean isBeforeFirst() throws SQLException;
  public boolean relative(int arg1) throws SQLException;
  public boolean absolute(int arg1) throws SQLException;
  public void afterLast() throws SQLException;
  public void beforeFirst() throws SQLException;
  public void cancelRowUpdates() throws SQLException;
  public void clearWarnings() throws SQLException;
  public void deleteRow() throws SQLException;
  public int findColumn(java.lang.String arg1) throws SQLException;
  public java.math.BigDecimal getBigDecimal(int arg1) throws SQLException;
  public java.math.BigDecimal getBigDecimal(int arg1, int arg2) throws SQLException;
  public java.math.BigDecimal getBigDecimal(java.lang.String arg1) throws SQLException;
  public java.math.BigDecimal getBigDecimal(java.lang.String arg1, int arg2) throws SQLException;
  public java.io.InputStream getBinaryStream(int arg1) throws SQLException;
  public java.io.InputStream getBinaryStream(java.lang.String arg1) throws SQLException;
  public Clob getClob(int arg1) throws SQLException;
  public Clob getClob(java.lang.String arg1) throws SQLException;
  public int getConcurrency() throws SQLException;
  public java.lang.String getCursorName() throws SQLException;
  public int getFetchDirection() throws SQLException;
  public int getFetchSize() throws SQLException;
  public ResultSetMetaData getMetaData() throws SQLException;
  public int getRow() throws SQLException;
  public Statement getStatement() throws SQLException;
  public java.io.InputStream getUnicodeStream(int arg1) throws SQLException;
  public java.io.InputStream getUnicodeStream(java.lang.String arg1) throws SQLException;
  public SQLWarning getWarnings() throws SQLException;
  public void insertRow() throws SQLException;
  public void moveToCurrentRow() throws SQLException;
  public void moveToInsertRow() throws SQLException;
  public void refreshRow() throws SQLException;
  public boolean rowDeleted() throws SQLException;
  public boolean rowInserted() throws SQLException;
  public boolean rowUpdated() throws SQLException;
  public void setFetchDirection(int arg1) throws SQLException;
  public void setFetchSize(int arg1) throws SQLException;
  public void updateArray(int arg1, Array arg2) throws SQLException;
  public void updateArray(java.lang.String arg1, Array arg2) throws SQLException;
  public void updateAsciiStream(int arg1, java.io.InputStream arg2, int arg3) throws SQLException;
  public void updateAsciiStream(java.lang.String arg1, java.io.InputStream arg2, int arg3) throws SQLException;
  public void updateAsciiStream(int arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void updateAsciiStream(java.lang.String arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void updateAsciiStream(int arg1, java.io.InputStream arg2) throws SQLException;
  public void updateAsciiStream(java.lang.String arg1, java.io.InputStream arg2) throws SQLException;
  public void updateBigDecimal(int arg1, java.math.BigDecimal arg2) throws SQLException;
  public void updateBigDecimal(java.lang.String arg1, java.math.BigDecimal arg2) throws SQLException;
  public void updateBinaryStream(int arg1, java.io.InputStream arg2, int arg3) throws SQLException;
  public void updateBinaryStream(java.lang.String arg1, java.io.InputStream arg2, int arg3) throws SQLException;
  public void updateBinaryStream(int arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void updateBinaryStream(java.lang.String arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void updateBinaryStream(int arg1, java.io.InputStream arg2) throws SQLException;
  public void updateBinaryStream(java.lang.String arg1, java.io.InputStream arg2) throws SQLException;
  public void updateBlob(int arg1, Blob arg2) throws SQLException;
  public void updateBlob(java.lang.String arg1, Blob arg2) throws SQLException;
  public void updateBlob(int arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void updateBlob(java.lang.String arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void updateBlob(int arg1, java.io.InputStream arg2) throws SQLException;
  public void updateBlob(java.lang.String arg1, java.io.InputStream arg2) throws SQLException;
  public void updateBoolean(int arg1, boolean arg2) throws SQLException;
  public void updateBoolean(java.lang.String arg1, boolean arg2) throws SQLException;
  public void updateByte(int arg1, byte arg2) throws SQLException;
  public void updateByte(java.lang.String arg1, byte arg2) throws SQLException;
  public void updateBytes(int arg1, byte [] arg2) throws SQLException;
  public void updateBytes(java.lang.String arg1, byte [] arg2) throws SQLException;
  public void updateCharacterStream(int arg1, java.io.Reader arg2, int arg3) throws SQLException;
  public void updateCharacterStream(java.lang.String arg1, java.io.Reader arg2, int arg3) throws SQLException;
  public void updateCharacterStream(int arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void updateCharacterStream(java.lang.String arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void updateCharacterStream(int arg1, java.io.Reader arg2) throws SQLException;
  public void updateCharacterStream(java.lang.String arg1, java.io.Reader arg2) throws SQLException;
  public void updateClob(int arg1, Clob arg2) throws SQLException;
  public void updateClob(java.lang.String arg1, Clob arg2) throws SQLException;
  public void updateClob(int arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void updateClob(java.lang.String arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void updateClob(int arg1, java.io.Reader arg2) throws SQLException;
  public void updateClob(java.lang.String arg1, java.io.Reader arg2) throws SQLException;
  public void updateDate(int arg1, Date arg2) throws SQLException;
  public void updateDate(java.lang.String arg1, Date arg2) throws SQLException;
  public void updateDouble(int arg1, double arg2) throws SQLException;
  public void updateDouble(java.lang.String arg1, double arg2) throws SQLException;
  public void updateFloat(int arg1, float arg2) throws SQLException;
  public void updateFloat(java.lang.String arg1, float arg2) throws SQLException;
  public void updateInt(int arg1, int arg2) throws SQLException;
  public void updateInt(java.lang.String arg1, int arg2) throws SQLException;
  public void updateLong(int arg1, long arg2) throws SQLException;
  public void updateLong(java.lang.String arg1, long arg2) throws SQLException;
  public void updateNull(int arg1) throws SQLException;
  public void updateNull(java.lang.String arg1) throws SQLException;
  public void updateObject(int arg1, java.lang.Object arg2) throws SQLException;
  public void updateObject(int arg1, java.lang.Object arg2, int arg3) throws SQLException;
  public void updateObject(java.lang.String arg1, java.lang.Object arg2) throws SQLException;
  public void updateObject(java.lang.String arg1, java.lang.Object arg2, int arg3) throws SQLException;
  public void updateRef(int arg1, Ref arg2) throws SQLException;
  public void updateRef(java.lang.String arg1, Ref arg2) throws SQLException;
  public void updateRow() throws SQLException;
  public void updateShort(int arg1, short arg2) throws SQLException;
  public void updateShort(java.lang.String arg1, short arg2) throws SQLException;
  public void updateString(int arg1, java.lang.String arg2) throws SQLException;
  public void updateString(java.lang.String arg1, java.lang.String arg2) throws SQLException;
  public void updateTime(int arg1, Time arg2) throws SQLException;
  public void updateTime(java.lang.String arg1, Time arg2) throws SQLException;
  public void updateTimestamp(int arg1, Timestamp arg2) throws SQLException;
  public void updateTimestamp(java.lang.String arg1, Timestamp arg2) throws SQLException;
  public boolean wasNull() throws SQLException;
  public RowId getRowId(int arg1) throws SQLException;
  public RowId getRowId(java.lang.String arg1) throws SQLException;
  public void updateRowId(int arg1, RowId arg2) throws SQLException;
  public void updateRowId(java.lang.String arg1, RowId arg2) throws SQLException;
  public int getHoldability() throws SQLException;
  public void updateNString(int arg1, java.lang.String arg2) throws SQLException;
  public void updateNString(java.lang.String arg1, java.lang.String arg2) throws SQLException;
  public void updateNClob(int arg1, NClob arg2) throws SQLException;
  public void updateNClob(java.lang.String arg1, NClob arg2) throws SQLException;
  public void updateNClob(int arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void updateNClob(java.lang.String arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void updateNClob(int arg1, java.io.Reader arg2) throws SQLException;
  public void updateNClob(java.lang.String arg1, java.io.Reader arg2) throws SQLException;
  public NClob getNClob(int arg1) throws SQLException;
  public NClob getNClob(java.lang.String arg1) throws SQLException;
  public SQLXML getSQLXML(int arg1) throws SQLException;
  public SQLXML getSQLXML(java.lang.String arg1) throws SQLException;
  public void updateSQLXML(int arg1, SQLXML arg2) throws SQLException;
  public void updateSQLXML(java.lang.String arg1, SQLXML arg2) throws SQLException;
  public java.lang.String getNString(int arg1) throws SQLException;
  public java.lang.String getNString(java.lang.String arg1) throws SQLException;
  public java.io.Reader getNCharacterStream(int arg1) throws SQLException;
  public java.io.Reader getNCharacterStream(java.lang.String arg1) throws SQLException;
  public void updateNCharacterStream(int arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void updateNCharacterStream(java.lang.String arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void updateNCharacterStream(int arg1, java.io.Reader arg2) throws SQLException;
  public void updateNCharacterStream(java.lang.String arg1, java.io.Reader arg2) throws SQLException;
}
