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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SqlArrayImpl", superClass = "")
public interface Array
{
  // Methods

  public java.lang.Object getArray() throws SQLException;
  public java.lang.Object getArray(long arg1, int arg2) throws SQLException;
  public java.lang.Object getArray(long arg1, int arg2, java.util.Map<java.lang.String, java.lang.Class<?>> arg3) throws SQLException;
  public java.lang.Object getArray(java.util.Map<java.lang.String, java.lang.Class<?>> arg1) throws SQLException;
  public void free() throws SQLException;
  public java.lang.String getBaseTypeName() throws SQLException;
  public int getBaseType() throws SQLException;
  public ResultSet getResultSet() throws SQLException;
  public ResultSet getResultSet(long arg1, int arg2) throws SQLException;
  public ResultSet getResultSet(long arg1, int arg2, java.util.Map<java.lang.String, java.lang.Class<?>> arg3) throws SQLException;
  public ResultSet getResultSet(java.util.Map<java.lang.String, java.lang.Class<?>> arg1) throws SQLException;
}
