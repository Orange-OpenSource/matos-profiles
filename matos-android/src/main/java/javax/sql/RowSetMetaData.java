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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SqlRowSetMetaDataImpl", superClass = "")
public interface RowSetMetaData
  extends java.sql.ResultSetMetaData
{
  // Methods

  public void setPrecision(int arg1, int arg2) throws java.sql.SQLException;
  public void setCurrency(int arg1, boolean arg2) throws java.sql.SQLException;
  public void setColumnCount(int arg1) throws java.sql.SQLException;
  public void setScale(int arg1, int arg2) throws java.sql.SQLException;
  public void setAutoIncrement(int arg1, boolean arg2) throws java.sql.SQLException;
  public void setCaseSensitive(int arg1, boolean arg2) throws java.sql.SQLException;
  public void setCatalogName(int arg1, java.lang.String arg2) throws java.sql.SQLException;
  public void setColumnDisplaySize(int arg1, int arg2) throws java.sql.SQLException;
  public void setColumnLabel(int arg1, java.lang.String arg2) throws java.sql.SQLException;
  public void setColumnName(int arg1, java.lang.String arg2) throws java.sql.SQLException;
  public void setColumnType(int arg1, int arg2) throws java.sql.SQLException;
  public void setColumnTypeName(int arg1, java.lang.String arg2) throws java.sql.SQLException;
  public void setNullable(int arg1, int arg2) throws java.sql.SQLException;
  public void setSchemaName(int arg1, java.lang.String arg2) throws java.sql.SQLException;
  public void setSearchable(int arg1, boolean arg2) throws java.sql.SQLException;
  public void setSigned(int arg1, boolean arg2) throws java.sql.SQLException;
  public void setTableName(int arg1, java.lang.String arg2) throws java.sql.SQLException;
}
