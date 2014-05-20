package javax.sql;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.RowSetImpl", superClass = "")
public interface RowSet
  extends java.sql.ResultSet
{
  // Methods

  public void setReadOnly(boolean arg1) throws java.sql.SQLException;
  public void setBoolean(int arg1, boolean arg2) throws java.sql.SQLException;
  public void setBoolean(java.lang.String arg1, boolean arg2) throws java.sql.SQLException;
  public void setByte(int arg1, byte arg2) throws java.sql.SQLException;
  public void setByte(java.lang.String arg1, byte arg2) throws java.sql.SQLException;
  public void setDouble(int arg1, double arg2) throws java.sql.SQLException;
  public void setDouble(java.lang.String arg1, double arg2) throws java.sql.SQLException;
  public void setFloat(int arg1, float arg2) throws java.sql.SQLException;
  public void setFloat(java.lang.String arg1, float arg2) throws java.sql.SQLException;
  public void setInt(int arg1, int arg2) throws java.sql.SQLException;
  public void setInt(java.lang.String arg1, int arg2) throws java.sql.SQLException;
  public void setLong(int arg1, long arg2) throws java.sql.SQLException;
  public void setLong(java.lang.String arg1, long arg2) throws java.sql.SQLException;
  public void setShort(int arg1, short arg2) throws java.sql.SQLException;
  public void setShort(java.lang.String arg1, short arg2) throws java.sql.SQLException;
  public boolean isReadOnly();
  public void setTimestamp(int arg1, java.sql.Timestamp arg2) throws java.sql.SQLException;
  public void setTimestamp(int arg1, java.sql.Timestamp arg2, java.util.Calendar arg3) throws java.sql.SQLException;
  public void setTimestamp(java.lang.String arg1, java.sql.Timestamp arg2) throws java.sql.SQLException;
  public void setTimestamp(java.lang.String arg1, java.sql.Timestamp arg2, java.util.Calendar arg3) throws java.sql.SQLException;
  public void setURL(int arg1, java.net.URL arg2) throws java.sql.SQLException;
  public void setTime(int arg1, java.sql.Time arg2) throws java.sql.SQLException;
  public void setTime(int arg1, java.sql.Time arg2, java.util.Calendar arg3) throws java.sql.SQLException;
  public void setTime(java.lang.String arg1, java.sql.Time arg2) throws java.sql.SQLException;
  public void setTime(java.lang.String arg1, java.sql.Time arg2, java.util.Calendar arg3) throws java.sql.SQLException;
  public void execute() throws java.sql.SQLException;
  public java.lang.String getUrl() throws java.sql.SQLException;
  public void setDate(int arg1, java.sql.Date arg2) throws java.sql.SQLException;
  public void setDate(int arg1, java.sql.Date arg2, java.util.Calendar arg3) throws java.sql.SQLException;
  public void setDate(java.lang.String arg1, java.sql.Date arg2) throws java.sql.SQLException;
  public void setDate(java.lang.String arg1, java.sql.Date arg2, java.util.Calendar arg3) throws java.sql.SQLException;
  public void setAsciiStream(int arg1, java.io.InputStream arg2, int arg3) throws java.sql.SQLException;
  public void setAsciiStream(int arg1, java.io.InputStream arg2) throws java.sql.SQLException;
  public void setAsciiStream(java.lang.String arg1, java.io.InputStream arg2) throws java.sql.SQLException;
  public void setAsciiStream(java.lang.String arg1, java.io.InputStream arg2, int arg3) throws java.sql.SQLException;
  public void setCharacterStream(int arg1, java.io.Reader arg2, int arg3) throws java.sql.SQLException;
  public void setCharacterStream(int arg1, java.io.Reader arg2) throws java.sql.SQLException;
  public void setCharacterStream(java.lang.String arg1, java.io.Reader arg2) throws java.sql.SQLException;
  public void setCharacterStream(java.lang.String arg1, java.io.Reader arg2, int arg3) throws java.sql.SQLException;
  public void setString(int arg1, java.lang.String arg2) throws java.sql.SQLException;
  public void setString(java.lang.String arg1, java.lang.String arg2) throws java.sql.SQLException;
  public void setUsername(java.lang.String arg1) throws java.sql.SQLException;
  public java.lang.String getUsername();
  public void setObject(int arg1, java.lang.Object arg2) throws java.sql.SQLException;
  public void setObject(int arg1, java.lang.Object arg2, int arg3) throws java.sql.SQLException;
  public void setObject(int arg1, java.lang.Object arg2, int arg3, int arg4) throws java.sql.SQLException;
  public void setObject(java.lang.String arg1, java.lang.Object arg2) throws java.sql.SQLException;
  public void setObject(java.lang.String arg1, java.lang.Object arg2, int arg3) throws java.sql.SQLException;
  public void setObject(java.lang.String arg1, java.lang.Object arg2, int arg3, int arg4) throws java.sql.SQLException;
  public void setPassword(java.lang.String arg1) throws java.sql.SQLException;
  public void setType(int arg1) throws java.sql.SQLException;
  public java.lang.String getPassword();
  public void addRowSetListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("rowSetEvent") RowSetListener arg1);
  public void clearParameters() throws java.sql.SQLException;
  public java.lang.String getCommand();
  public java.lang.String getDataSourceName();
  public boolean getEscapeProcessing() throws java.sql.SQLException;
  public int getMaxFieldSize() throws java.sql.SQLException;
  public int getMaxRows() throws java.sql.SQLException;
  public int getQueryTimeout() throws java.sql.SQLException;
  public int getTransactionIsolation();
  public java.util.Map<java.lang.String, java.lang.Class<?>> getTypeMap() throws java.sql.SQLException;
  public void removeRowSetListener(RowSetListener arg1);
  public void setArray(int arg1, java.sql.Array arg2) throws java.sql.SQLException;
  public void setBigDecimal(int arg1, java.math.BigDecimal arg2) throws java.sql.SQLException;
  public void setBigDecimal(java.lang.String arg1, java.math.BigDecimal arg2) throws java.sql.SQLException;
  public void setBinaryStream(int arg1, java.io.InputStream arg2, int arg3) throws java.sql.SQLException;
  public void setBinaryStream(int arg1, java.io.InputStream arg2) throws java.sql.SQLException;
  public void setBinaryStream(java.lang.String arg1, java.io.InputStream arg2) throws java.sql.SQLException;
  public void setBinaryStream(java.lang.String arg1, java.io.InputStream arg2, int arg3) throws java.sql.SQLException;
  public void setBlob(int arg1, java.sql.Blob arg2) throws java.sql.SQLException;
  public void setBlob(int arg1, java.io.InputStream arg2) throws java.sql.SQLException;
  public void setBlob(int arg1, java.io.InputStream arg2, long arg3) throws java.sql.SQLException;
  public void setBlob(java.lang.String arg1, java.io.InputStream arg2) throws java.sql.SQLException;
  public void setBlob(java.lang.String arg1, java.io.InputStream arg2, long arg3) throws java.sql.SQLException;
  public void setBlob(java.lang.String arg1, java.sql.Blob arg2) throws java.sql.SQLException;
  public void setBytes(int arg1, byte [] arg2) throws java.sql.SQLException;
  public void setBytes(java.lang.String arg1, byte [] arg2) throws java.sql.SQLException;
  public void setClob(int arg1, java.sql.Clob arg2) throws java.sql.SQLException;
  public void setClob(int arg1, java.io.Reader arg2) throws java.sql.SQLException;
  public void setClob(int arg1, java.io.Reader arg2, long arg3) throws java.sql.SQLException;
  public void setClob(java.lang.String arg1, java.sql.Clob arg2) throws java.sql.SQLException;
  public void setClob(java.lang.String arg1, java.io.Reader arg2) throws java.sql.SQLException;
  public void setClob(java.lang.String arg1, java.io.Reader arg2, long arg3) throws java.sql.SQLException;
  public void setCommand(java.lang.String arg1) throws java.sql.SQLException;
  public void setConcurrency(int arg1) throws java.sql.SQLException;
  public void setDataSourceName(java.lang.String arg1) throws java.sql.SQLException;
  public void setEscapeProcessing(boolean arg1) throws java.sql.SQLException;
  public void setMaxFieldSize(int arg1) throws java.sql.SQLException;
  public void setMaxRows(int arg1) throws java.sql.SQLException;
  public void setNCharacterStream(int arg1, java.io.Reader arg2) throws java.sql.SQLException;
  public void setNCharacterStream(int arg1, java.io.Reader arg2, long arg3) throws java.sql.SQLException;
  public void setNCharacterStream(java.lang.String arg1, java.io.Reader arg2) throws java.sql.SQLException;
  public void setNCharacterStream(java.lang.String arg1, java.io.Reader arg2, long arg3) throws java.sql.SQLException;
  public void setNClob(int arg1, java.sql.NClob arg2) throws java.sql.SQLException;
  public void setNClob(int arg1, java.io.Reader arg2) throws java.sql.SQLException;
  public void setNClob(int arg1, java.io.Reader arg2, long arg3) throws java.sql.SQLException;
  public void setNClob(java.lang.String arg1, java.sql.NClob arg2) throws java.sql.SQLException;
  public void setNClob(java.lang.String arg1, java.io.Reader arg2) throws java.sql.SQLException;
  public void setNClob(java.lang.String arg1, java.io.Reader arg2, long arg3) throws java.sql.SQLException;
  public void setNString(int arg1, java.lang.String arg2) throws java.sql.SQLException;
  public void setNString(java.lang.String arg1, java.lang.String arg2) throws java.sql.SQLException;
  public void setNull(int arg1, int arg2) throws java.sql.SQLException;
  public void setNull(int arg1, int arg2, java.lang.String arg3) throws java.sql.SQLException;
  public void setNull(java.lang.String arg1, int arg2) throws java.sql.SQLException;
  public void setNull(java.lang.String arg1, int arg2, java.lang.String arg3) throws java.sql.SQLException;
  public void setQueryTimeout(int arg1) throws java.sql.SQLException;
  public void setRef(int arg1, java.sql.Ref arg2) throws java.sql.SQLException;
  public void setRowId(int arg1, java.sql.RowId arg2) throws java.sql.SQLException;
  public void setRowId(java.lang.String arg1, java.sql.RowId arg2) throws java.sql.SQLException;
  public void setSQLXML(int arg1, java.sql.SQLXML arg2) throws java.sql.SQLException;
  public void setSQLXML(java.lang.String arg1, java.sql.SQLXML arg2) throws java.sql.SQLException;
  public void setTransactionIsolation(int arg1) throws java.sql.SQLException;
  public void setTypeMap(java.util.Map<java.lang.String, java.lang.Class<?>> arg1) throws java.sql.SQLException;
  public void setUrl(java.lang.String arg1) throws java.sql.SQLException;
}
