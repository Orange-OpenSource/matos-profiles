package java.util.logging;

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


public final class LoggingPermission
  extends java.security.BasicPermission  implements java.io.Serializable, java.security.Guard
{
  // Constructors

  public LoggingPermission(java.lang.String arg1, java.lang.String arg2){
    super((java.lang.String) null);
  }
  // Methods

  public java.lang.String getActions(){
    return (java.lang.String) null;
  }
  public boolean implies(java.security.Permission arg1){
    return false;
  }
}
