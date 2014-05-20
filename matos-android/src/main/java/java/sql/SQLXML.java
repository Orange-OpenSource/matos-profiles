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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SQLXMLImplem", superClass = "")
public interface SQLXML
{
  // Methods

  public java.lang.String getString() throws SQLException;
  public <T extends javax.xml.transform.Result>T setResult(java.lang.Class<T> arg1) throws SQLException;
  public java.io.Reader getCharacterStream() throws SQLException;
  public void free() throws SQLException;
  public java.io.Writer setCharacterStream() throws SQLException;
  public void setString(java.lang.String arg1) throws SQLException;
  public <T extends javax.xml.transform.Source>T getSource(java.lang.Class<T> arg1) throws SQLException;
  public java.io.OutputStream setBinaryStream() throws SQLException;
  public java.io.InputStream getBinaryStream() throws SQLException;
}
