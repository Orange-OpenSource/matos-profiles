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


public class StatementEvent
  extends java.util.EventObject{
  // Constructors

  public StatementEvent(PooledConnection arg1, java.sql.PreparedStatement arg2, java.sql.SQLException arg3){
    super((java.lang.Object) null);
  }
  public StatementEvent(PooledConnection arg1, java.sql.PreparedStatement arg2){
    super((java.lang.Object) null);
  }
  // Methods

  public java.sql.PreparedStatement getStatement(){
    return (java.sql.PreparedStatement) null;
  }
  public java.sql.SQLException getSQLException(){
    return (java.sql.SQLException) null;
  }
}
