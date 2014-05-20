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


public interface Statement
  extends Wrapper, java.lang.AutoCloseable
{
  // Fields

  public static final int CLOSE_ALL_RESULTS = 3;

  public static final int CLOSE_CURRENT_RESULT = 1;

  public static final int EXECUTE_FAILED = -3;

  public static final int KEEP_CURRENT_RESULT = 2;

  public static final int NO_GENERATED_KEYS = 2;

  public static final int RETURN_GENERATED_KEYS = 1;

  public static final int SUCCESS_NO_INFO = -2;

  // Methods

  public void close() throws SQLException;
  public boolean isClosed() throws SQLException;
  public boolean execute(java.lang.String arg1) throws SQLException;
  public boolean execute(java.lang.String arg1, int arg2) throws SQLException;
  public boolean execute(java.lang.String arg1, int [] arg2) throws SQLException;
  public boolean execute(java.lang.String arg1, java.lang.String [] arg2) throws SQLException;
  public void cancel() throws SQLException;
  public Connection getConnection() throws SQLException;
  public int getMaxFieldSize() throws SQLException;
  public int getMaxRows() throws SQLException;
  public int getQueryTimeout() throws SQLException;
  public void setEscapeProcessing(boolean arg1) throws SQLException;
  public void setMaxFieldSize(int arg1) throws SQLException;
  public void setMaxRows(int arg1) throws SQLException;
  public void setQueryTimeout(int arg1) throws SQLException;
  public void clearWarnings() throws SQLException;
  public int getFetchDirection() throws SQLException;
  public int getFetchSize() throws SQLException;
  public SQLWarning getWarnings() throws SQLException;
  public void setFetchDirection(int arg1) throws SQLException;
  public void setFetchSize(int arg1) throws SQLException;
  public void addBatch(java.lang.String arg1) throws SQLException;
  public ResultSet getResultSet() throws SQLException;
  public void clearBatch() throws SQLException;
  public int [] executeBatch() throws SQLException;
  public ResultSet executeQuery(java.lang.String arg1) throws SQLException;
  public int executeUpdate(java.lang.String arg1) throws SQLException;
  public int executeUpdate(java.lang.String arg1, int arg2) throws SQLException;
  public int executeUpdate(java.lang.String arg1, int [] arg2) throws SQLException;
  public int executeUpdate(java.lang.String arg1, java.lang.String [] arg2) throws SQLException;
  public ResultSet getGeneratedKeys() throws SQLException;
  public boolean getMoreResults() throws SQLException;
  public boolean getMoreResults(int arg1) throws SQLException;
  public int getResultSetConcurrency() throws SQLException;
  public int getResultSetHoldability() throws SQLException;
  public int getResultSetType() throws SQLException;
  public int getUpdateCount() throws SQLException;
  public void setCursorName(java.lang.String arg1) throws SQLException;
  public void setPoolable(boolean arg1) throws SQLException;
  public boolean isPoolable() throws SQLException;
}
