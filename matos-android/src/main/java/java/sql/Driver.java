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

@Real("com.francetelecom.rd.fakeandroid.SQLDriverImpl")
public interface Driver
{
  // Methods

  public Connection connect(java.lang.String arg1, java.util.Properties arg2) throws SQLException;
  public int getMajorVersion();
  public int getMinorVersion();
  public boolean acceptsURL(java.lang.String arg1) throws SQLException;
  public DriverPropertyInfo [] getPropertyInfo(java.lang.String arg1, java.util.Properties arg2) throws SQLException;
  public boolean jdbcCompliant();
}
