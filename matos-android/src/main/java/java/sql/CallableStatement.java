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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.CallableStatementImpl", superClass = "")
public interface CallableStatement
  extends PreparedStatement
{
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
  public java.net.URL getURL(int arg1) throws SQLException;
  public java.net.URL getURL(java.lang.String arg1) throws SQLException;
  public void setBoolean(java.lang.String arg1, boolean arg2) throws SQLException;
  public void setByte(java.lang.String arg1, byte arg2) throws SQLException;
  public void setDouble(java.lang.String arg1, double arg2) throws SQLException;
  public void setFloat(java.lang.String arg1, float arg2) throws SQLException;
  public void setInt(java.lang.String arg1, int arg2) throws SQLException;
  public void setLong(java.lang.String arg1, long arg2) throws SQLException;
  public void setShort(java.lang.String arg1, short arg2) throws SQLException;
  public void setTimestamp(java.lang.String arg1, Timestamp arg2) throws SQLException;
  public void setTimestamp(java.lang.String arg1, Timestamp arg2, java.util.Calendar arg3) throws SQLException;
  public Ref getRef(int arg1) throws SQLException;
  public Ref getRef(java.lang.String arg1) throws SQLException;
  public java.lang.String getString(int arg1) throws SQLException;
  public java.lang.String getString(java.lang.String arg1) throws SQLException;
  public void setURL(java.lang.String arg1, java.net.URL arg2) throws SQLException;
  public Date getDate(int arg1) throws SQLException;
  public Date getDate(int arg1, java.util.Calendar arg2) throws SQLException;
  public Date getDate(java.lang.String arg1) throws SQLException;
  public Date getDate(java.lang.String arg1, java.util.Calendar arg2) throws SQLException;
  public Time getTime(int arg1) throws SQLException;
  public Time getTime(int arg1, java.util.Calendar arg2) throws SQLException;
  public Time getTime(java.lang.String arg1) throws SQLException;
  public Time getTime(java.lang.String arg1, java.util.Calendar arg2) throws SQLException;
  public void setTime(java.lang.String arg1, Time arg2) throws SQLException;
  public void setTime(java.lang.String arg1, Time arg2, java.util.Calendar arg3) throws SQLException;
  public Timestamp getTimestamp(int arg1) throws SQLException;
  public Timestamp getTimestamp(int arg1, java.util.Calendar arg2) throws SQLException;
  public Timestamp getTimestamp(java.lang.String arg1) throws SQLException;
  public Timestamp getTimestamp(java.lang.String arg1, java.util.Calendar arg2) throws SQLException;
  public void setDate(java.lang.String arg1, Date arg2) throws SQLException;
  public void setDate(java.lang.String arg1, Date arg2, java.util.Calendar arg3) throws SQLException;
  public java.io.Reader getCharacterStream(int arg1) throws SQLException;
  public java.io.Reader getCharacterStream(java.lang.String arg1) throws SQLException;
  public void setAsciiStream(java.lang.String arg1, java.io.InputStream arg2, int arg3) throws SQLException;
  public void setAsciiStream(java.lang.String arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void setAsciiStream(java.lang.String arg1, java.io.InputStream arg2) throws SQLException;
  public void setCharacterStream(java.lang.String arg1, java.io.Reader arg2, int arg3) throws SQLException;
  public void setCharacterStream(java.lang.String arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void setCharacterStream(java.lang.String arg1, java.io.Reader arg2) throws SQLException;
  public void setString(java.lang.String arg1, java.lang.String arg2) throws SQLException;
  public void setObject(java.lang.String arg1, java.lang.Object arg2) throws SQLException;
  public void setObject(java.lang.String arg1, java.lang.Object arg2, int arg3) throws SQLException;
  public void setObject(java.lang.String arg1, java.lang.Object arg2, int arg3, int arg4) throws SQLException;
  public Blob getBlob(int arg1) throws SQLException;
  public Blob getBlob(java.lang.String arg1) throws SQLException;
  public void setBigDecimal(java.lang.String arg1, java.math.BigDecimal arg2) throws SQLException;
  public void setBinaryStream(java.lang.String arg1, java.io.InputStream arg2, int arg3) throws SQLException;
  public void setBinaryStream(java.lang.String arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void setBinaryStream(java.lang.String arg1, java.io.InputStream arg2) throws SQLException;
  public void setBlob(java.lang.String arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void setBlob(java.lang.String arg1, Blob arg2) throws SQLException;
  public void setBlob(java.lang.String arg1, java.io.InputStream arg2) throws SQLException;
  public void setBytes(java.lang.String arg1, byte [] arg2) throws SQLException;
  public void setClob(java.lang.String arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void setClob(java.lang.String arg1, Clob arg2) throws SQLException;
  public void setClob(java.lang.String arg1, java.io.Reader arg2) throws SQLException;
  public void setNCharacterStream(java.lang.String arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void setNCharacterStream(java.lang.String arg1, java.io.Reader arg2) throws SQLException;
  public void setNClob(java.lang.String arg1, NClob arg2) throws SQLException;
  public void setNClob(java.lang.String arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void setNClob(java.lang.String arg1, java.io.Reader arg2) throws SQLException;
  public void setNString(java.lang.String arg1, java.lang.String arg2) throws SQLException;
  public void setNull(java.lang.String arg1, int arg2) throws SQLException;
  public void setNull(java.lang.String arg1, int arg2, java.lang.String arg3) throws SQLException;
  public void setRowId(java.lang.String arg1, RowId arg2) throws SQLException;
  public void setSQLXML(java.lang.String arg1, SQLXML arg2) throws SQLException;
  public java.math.BigDecimal getBigDecimal(int arg1) throws SQLException;
  public java.math.BigDecimal getBigDecimal(int arg1, int arg2) throws SQLException;
  public java.math.BigDecimal getBigDecimal(java.lang.String arg1) throws SQLException;
  public Clob getClob(int arg1) throws SQLException;
  public Clob getClob(java.lang.String arg1) throws SQLException;
  public boolean wasNull() throws SQLException;
  public RowId getRowId(int arg1) throws SQLException;
  public RowId getRowId(java.lang.String arg1) throws SQLException;
  public NClob getNClob(int arg1) throws SQLException;
  public NClob getNClob(java.lang.String arg1) throws SQLException;
  public SQLXML getSQLXML(int arg1) throws SQLException;
  public SQLXML getSQLXML(java.lang.String arg1) throws SQLException;
  public java.lang.String getNString(int arg1) throws SQLException;
  public java.lang.String getNString(java.lang.String arg1) throws SQLException;
  public java.io.Reader getNCharacterStream(int arg1) throws SQLException;
  public java.io.Reader getNCharacterStream(java.lang.String arg1) throws SQLException;
  public void registerOutParameter(int arg1, int arg2) throws SQLException;
  public void registerOutParameter(int arg1, int arg2, int arg3) throws SQLException;
  public void registerOutParameter(int arg1, int arg2, java.lang.String arg3) throws SQLException;
  public void registerOutParameter(java.lang.String arg1, int arg2) throws SQLException;
  public void registerOutParameter(java.lang.String arg1, int arg2, int arg3) throws SQLException;
  public void registerOutParameter(java.lang.String arg1, int arg2, java.lang.String arg3) throws SQLException;
}
