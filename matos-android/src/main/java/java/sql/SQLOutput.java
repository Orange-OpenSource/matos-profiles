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


public interface SQLOutput
{
  // Methods

  public void writeObject(SQLData arg1) throws SQLException;
  public void writeInt(int arg1) throws SQLException;
  public void writeBytes(byte [] arg1) throws SQLException;
  public void writeByte(byte arg1) throws SQLException;
  public void writeLong(long arg1) throws SQLException;
  public void writeShort(short arg1) throws SQLException;
  public void writeFloat(float arg1) throws SQLException;
  public void writeBoolean(boolean arg1) throws SQLException;
  public void writeDouble(double arg1) throws SQLException;
  public void writeString(java.lang.String arg1) throws SQLException;
  public void writeBigDecimal(java.math.BigDecimal arg1) throws SQLException;
  public void writeDate(Date arg1) throws SQLException;
  public void writeTime(Time arg1) throws SQLException;
  public void writeTimestamp(Timestamp arg1) throws SQLException;
  public void writeCharacterStream(java.io.Reader arg1) throws SQLException;
  public void writeAsciiStream(java.io.InputStream arg1) throws SQLException;
  public void writeBinaryStream(java.io.InputStream arg1) throws SQLException;
  public void writeRef(Ref arg1) throws SQLException;
  public void writeBlob(Blob arg1) throws SQLException;
  public void writeClob(Clob arg1) throws SQLException;
  public void writeStruct(Struct arg1) throws SQLException;
  public void writeArray(Array arg1) throws SQLException;
  public void writeURL(java.net.URL arg1) throws SQLException;
  public void writeNString(java.lang.String arg1) throws SQLException;
  public void writeNClob(NClob arg1) throws SQLException;
  public void writeRowId(RowId arg1) throws SQLException;
  public void writeSQLXML(SQLXML arg1) throws SQLException;
}
