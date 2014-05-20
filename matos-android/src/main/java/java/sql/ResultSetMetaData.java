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


public interface ResultSetMetaData
  extends Wrapper
{
  // Fields

  public static final int columnNoNulls = 0;

  public static final int columnNullable = 1;

  public static final int columnNullableUnknown = 2;

  // Methods

  public boolean isReadOnly(int arg1) throws SQLException;
  public int getScale(int arg1) throws SQLException;
  public int getColumnCount() throws SQLException;
  public java.lang.String getColumnName(int arg1) throws SQLException;
  public boolean isWritable(int arg1) throws SQLException;
  public int getPrecision(int arg1) throws SQLException;
  public java.lang.String getCatalogName(int arg1) throws SQLException;
  public java.lang.String getColumnClassName(int arg1) throws SQLException;
  public int getColumnDisplaySize(int arg1) throws SQLException;
  public java.lang.String getColumnLabel(int arg1) throws SQLException;
  public int getColumnType(int arg1) throws SQLException;
  public java.lang.String getColumnTypeName(int arg1) throws SQLException;
  public java.lang.String getSchemaName(int arg1) throws SQLException;
  public java.lang.String getTableName(int arg1) throws SQLException;
  public boolean isAutoIncrement(int arg1) throws SQLException;
  public boolean isCaseSensitive(int arg1) throws SQLException;
  public boolean isCurrency(int arg1) throws SQLException;
  public boolean isDefinitelyWritable(int arg1) throws SQLException;
  public int isNullable(int arg1) throws SQLException;
  public boolean isSearchable(int arg1) throws SQLException;
  public boolean isSigned(int arg1) throws SQLException;
}
