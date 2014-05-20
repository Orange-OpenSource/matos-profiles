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

import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakeandroid.SQLConnectionImpl")
public interface Connection
  extends Wrapper, java.lang.AutoCloseable
{
  // Fields

  public static final int TRANSACTION_NONE = 0;

  public static final int TRANSACTION_READ_COMMITTED = 2;

  public static final int TRANSACTION_READ_UNCOMMITTED = 1;

  public static final int TRANSACTION_REPEATABLE_READ = 4;

  public static final int TRANSACTION_SERIALIZABLE = 8;

  // Methods

  public void setReadOnly(boolean arg1) throws SQLException;
  public void close() throws SQLException;
  public boolean isReadOnly() throws SQLException;
  public boolean isClosed() throws SQLException;
  public boolean isValid(int arg1) throws SQLException;
  public void commit() throws SQLException;
  public void rollback() throws SQLException;
  public void rollback(Savepoint arg1) throws SQLException;
  public int getTransactionIsolation() throws SQLException;
  public java.util.Map<java.lang.String, java.lang.Class<?>> getTypeMap() throws SQLException;
  public void setTransactionIsolation(int arg1) throws SQLException;
  public void setTypeMap(java.util.Map<java.lang.String, java.lang.Class<?>> arg1) throws SQLException;
  public void clearWarnings() throws SQLException;
  public DatabaseMetaData getMetaData() throws SQLException;
  public SQLWarning getWarnings() throws SQLException;
  public int getHoldability() throws SQLException;
  public Statement createStatement() throws SQLException;
  public Statement createStatement(int arg1, int arg2) throws SQLException;
  public Statement createStatement(int arg1, int arg2, int arg3) throws SQLException;
  public boolean getAutoCommit() throws SQLException;
  public java.lang.String getCatalog() throws SQLException;
  public java.lang.String nativeSQL(java.lang.String arg1) throws SQLException;
  public CallableStatement prepareCall(java.lang.String arg1) throws SQLException;
  public CallableStatement prepareCall(java.lang.String arg1, int arg2, int arg3) throws SQLException;
  public CallableStatement prepareCall(java.lang.String arg1, int arg2, int arg3, int arg4) throws SQLException;
  public PreparedStatement prepareStatement(java.lang.String arg1) throws SQLException;
  public PreparedStatement prepareStatement(java.lang.String arg1, int arg2) throws SQLException;
  public PreparedStatement prepareStatement(java.lang.String arg1, int [] arg2) throws SQLException;
  public PreparedStatement prepareStatement(java.lang.String arg1, int arg2, int arg3) throws SQLException;
  public PreparedStatement prepareStatement(java.lang.String arg1, int arg2, int arg3, int arg4) throws SQLException;
  public PreparedStatement prepareStatement(java.lang.String arg1, java.lang.String [] arg2) throws SQLException;
  public void releaseSavepoint(Savepoint arg1) throws SQLException;
  public void setAutoCommit(boolean arg1) throws SQLException;
  public void setCatalog(java.lang.String arg1) throws SQLException;
  public void setHoldability(int arg1) throws SQLException;
  public Savepoint setSavepoint() throws SQLException;
  public Savepoint setSavepoint(java.lang.String arg1) throws SQLException;
  public Clob createClob() throws SQLException;
  public Blob createBlob() throws SQLException;
  public NClob createNClob() throws SQLException;
  public SQLXML createSQLXML() throws SQLException;
  public void setClientInfo(java.lang.String arg1, java.lang.String arg2) throws SQLClientInfoException;
  public void setClientInfo(java.util.Properties arg1) throws SQLClientInfoException;
  public java.lang.String getClientInfo(java.lang.String arg1) throws SQLException;
  public java.util.Properties getClientInfo() throws SQLException;
  public Array createArrayOf(java.lang.String arg1, java.lang.Object [] arg2) throws SQLException;
  public Struct createStruct(java.lang.String arg1, java.lang.Object [] arg2) throws SQLException;
}
