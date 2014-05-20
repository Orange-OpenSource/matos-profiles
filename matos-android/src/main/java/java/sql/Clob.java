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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SqlClobImpl", superClass = "")
public interface Clob
{
  // Methods

  public long length() throws SQLException;
  public long position(Clob arg1, long arg2) throws SQLException;
  public long position(java.lang.String arg1, long arg2) throws SQLException;
  public java.io.Reader getCharacterStream() throws SQLException;
  public java.io.Reader getCharacterStream(long arg1, long arg2) throws SQLException;
  public void free() throws SQLException;
  public java.io.InputStream getAsciiStream() throws SQLException;
  public java.lang.String getSubString(long arg1, int arg2) throws SQLException;
  public java.io.OutputStream setAsciiStream(long arg1) throws SQLException;
  public java.io.Writer setCharacterStream(long arg1) throws SQLException;
  public int setString(long arg1, java.lang.String arg2) throws SQLException;
  public int setString(long arg1, java.lang.String arg2, int arg3, int arg4) throws SQLException;
  public void truncate(long arg1) throws SQLException;
}
