package java.security.acl;

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


public interface AclEntry
  extends java.lang.Cloneable
{
  // Methods

  public java.lang.String toString();
  public java.lang.Object clone();
  public boolean checkPermission(Permission arg1);
  public java.util.Enumeration<Permission> permissions();
  public java.security.Principal getPrincipal();
  public boolean addPermission(Permission arg1);
  public boolean removePermission(Permission arg1);
  public boolean isNegative();
  public boolean setPrincipal(java.security.Principal arg1);
  public void setNegativePermissions();
}
