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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SqlBlobImpl", superClass = "")
public interface Blob
{
  // Methods

  public byte [] getBytes(long arg1, int arg2) throws SQLException;
  public long length() throws SQLException;
  public long position(Blob arg1, long arg2) throws SQLException;
  public long position(byte [] arg1, long arg2) throws SQLException;
  public void free() throws SQLException;
  public void truncate(long arg1) throws SQLException;
  public java.io.OutputStream setBinaryStream(long arg1) throws SQLException;
  public int setBytes(long arg1, byte [] arg2) throws SQLException;
  public int setBytes(long arg1, byte [] arg2, int arg3, int arg4) throws SQLException;
  public java.io.InputStream getBinaryStream() throws SQLException;
  public java.io.InputStream getBinaryStream(long arg1, long arg2) throws SQLException;
}
