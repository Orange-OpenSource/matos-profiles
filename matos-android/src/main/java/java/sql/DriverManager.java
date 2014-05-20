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


public class DriverManager
{
  // Constructors

  private DriverManager(){
  }
  // Methods

  public static void println(java.lang.String arg1){
  }
  public static java.io.PrintWriter getLogWriter(){
    return (java.io.PrintWriter) null;
  }
  public static Connection getConnection(java.lang.String arg1) throws SQLException{
    return (Connection) null;
  }
  public static Connection getConnection(java.lang.String arg1, java.util.Properties arg2) throws SQLException{
    return (Connection) null;
  }
  public static Connection getConnection(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws SQLException{
    return (Connection) null;
  }
  public static int getLoginTimeout(){
    return 0;
  }
  public static void setLoginTimeout(int arg1){
  }
  public static void setLogWriter(java.io.PrintWriter arg1){
  }
  public static void deregisterDriver(Driver arg1) throws SQLException{
  }
  public static Driver getDriver(java.lang.String arg1) throws SQLException{
    return (Driver) null;
  }
  public static java.util.Enumeration<Driver> getDrivers(){
    return (java.util.Enumeration) null;
  }
  public static java.io.PrintStream getLogStream(){
    return (java.io.PrintStream) null;
  }
  public static void registerDriver(Driver arg1) throws SQLException{
  }
  public static void setLogStream(java.io.PrintStream arg1){
  }
}
