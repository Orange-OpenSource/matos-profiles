package com.android.server.pm;

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


public class UserManager
{
  // Constructors

  UserManager(java.io.File arg1, java.io.File arg2){
  }
  // Methods

  public android.content.pm.UserInfo createUser(java.lang.String arg1, int arg2, java.util.List<android.content.pm.ApplicationInfo> arg3){
    return (android.content.pm.UserInfo) null;
  }
  public void removeUser(int arg1){
  }
  public void removePackageForAllUsers(java.lang.String arg1){
  }
  public void installPackageForAllUsers(java.lang.String arg1, int arg2){
  }
  public java.util.List<android.content.pm.UserInfo> getUsers(){
    return (java.util.List) null;
  }
  public void clearUserDataForAllUsers(java.lang.String arg1){
  }
}
