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


public interface PreparedStatement
  extends Statement
{
  // Methods

  public void setBoolean(int arg1, boolean arg2) throws SQLException;
  public void setByte(int arg1, byte arg2) throws SQLException;
  public void setDouble(int arg1, double arg2) throws SQLException;
  public void setFloat(int arg1, float arg2) throws SQLException;
  public void setInt(int arg1, int arg2) throws SQLException;
  public void setLong(int arg1, long arg2) throws SQLException;
  public void setShort(int arg1, short arg2) throws SQLException;
  public void setTimestamp(int arg1, Timestamp arg2) throws SQLException;
  public void setTimestamp(int arg1, Timestamp arg2, java.util.Calendar arg3) throws SQLException;
  public void setURL(int arg1, java.net.URL arg2) throws SQLException;
  public void setTime(int arg1, Time arg2) throws SQLException;
  public void setTime(int arg1, Time arg2, java.util.Calendar arg3) throws SQLException;
  public boolean execute() throws SQLException;
  public void setDate(int arg1, Date arg2) throws SQLException;
  public void setDate(int arg1, Date arg2, java.util.Calendar arg3) throws SQLException;
  public void setAsciiStream(int arg1, java.io.InputStream arg2, int arg3) throws SQLException;
  public void setAsciiStream(int arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void setAsciiStream(int arg1, java.io.InputStream arg2) throws SQLException;
  public void setCharacterStream(int arg1, java.io.Reader arg2, int arg3) throws SQLException;
  public void setCharacterStream(int arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void setCharacterStream(int arg1, java.io.Reader arg2) throws SQLException;
  public void setString(int arg1, java.lang.String arg2) throws SQLException;
  public void setObject(int arg1, java.lang.Object arg2) throws SQLException;
  public void setObject(int arg1, java.lang.Object arg2, int arg3) throws SQLException;
  public void setObject(int arg1, java.lang.Object arg2, int arg3, int arg4) throws SQLException;
  public void clearParameters() throws SQLException;
  public void setArray(int arg1, Array arg2) throws SQLException;
  public void setBigDecimal(int arg1, java.math.BigDecimal arg2) throws SQLException;
  public void setBinaryStream(int arg1, java.io.InputStream arg2, int arg3) throws SQLException;
  public void setBinaryStream(int arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void setBinaryStream(int arg1, java.io.InputStream arg2) throws SQLException;
  public void setBlob(int arg1, Blob arg2) throws SQLException;
  public void setBlob(int arg1, java.io.InputStream arg2, long arg3) throws SQLException;
  public void setBlob(int arg1, java.io.InputStream arg2) throws SQLException;
  public void setBytes(int arg1, byte [] arg2) throws SQLException;
  public void setClob(int arg1, Clob arg2) throws SQLException;
  public void setClob(int arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void setClob(int arg1, java.io.Reader arg2) throws SQLException;
  public void setNCharacterStream(int arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void setNCharacterStream(int arg1, java.io.Reader arg2) throws SQLException;
  public void setNClob(int arg1, NClob arg2) throws SQLException;
  public void setNClob(int arg1, java.io.Reader arg2, long arg3) throws SQLException;
  public void setNClob(int arg1, java.io.Reader arg2) throws SQLException;
  public void setNString(int arg1, java.lang.String arg2) throws SQLException;
  public void setNull(int arg1, int arg2) throws SQLException;
  public void setNull(int arg1, int arg2, java.lang.String arg3) throws SQLException;
  public void setRef(int arg1, Ref arg2) throws SQLException;
  public void setRowId(int arg1, RowId arg2) throws SQLException;
  public void setSQLXML(int arg1, SQLXML arg2) throws SQLException;
  public ResultSetMetaData getMetaData() throws SQLException;
  public void addBatch() throws SQLException;
  public ResultSet executeQuery() throws SQLException;
  public int executeUpdate() throws SQLException;
  public ParameterMetaData getParameterMetaData() throws SQLException;
  public void setUnicodeStream(int arg1, java.io.InputStream arg2, int arg3) throws SQLException;
}
