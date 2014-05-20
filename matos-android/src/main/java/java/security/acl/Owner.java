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


public interface Owner
{
  // Methods

  public boolean addOwner(java.security.Principal arg1, java.security.Principal arg2) throws NotOwnerException;
  public boolean deleteOwner(java.security.Principal arg1, java.security.Principal arg2) throws NotOwnerException, LastOwnerException;
  public boolean isOwner(java.security.Principal arg1);
}
