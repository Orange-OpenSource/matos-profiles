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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SqlParameterMetaDataImpl", superClass = "")
public interface ParameterMetaData
  extends Wrapper
{
  // Fields

  public static final int parameterModeIn = 1;

  public static final int parameterModeInOut = 2;

  public static final int parameterModeOut = 4;

  public static final int parameterModeUnknown = 0;

  public static final int parameterNoNulls = 0;

  public static final int parameterNullable = 1;

  public static final int parameterNullableUnknown = 2;

  // Methods

  public int getScale(int arg1) throws SQLException;
  public int getPrecision(int arg1) throws SQLException;
  public int getParameterCount() throws SQLException;
  public int isNullable(int arg1) throws SQLException;
  public boolean isSigned(int arg1) throws SQLException;
  public int getParameterType(int arg1) throws SQLException;
  public java.lang.String getParameterClassName(int arg1) throws SQLException;
  public int getParameterMode(int arg1) throws SQLException;
  public java.lang.String getParameterTypeName(int arg1) throws SQLException;
}
