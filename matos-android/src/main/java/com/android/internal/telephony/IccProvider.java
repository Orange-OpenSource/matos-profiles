package com.android.internal.telephony;

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


public class IccProvider
  extends android.content.ContentProvider{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public IccProvider(){
    super();
  }
  // Methods

  public java.lang.String getType(android.net.Uri arg1){
    return (java.lang.String) null;
  }
  public int delete(android.net.Uri arg1, java.lang.String arg2, java.lang.String [] arg3){
    return 0;
  }
  public android.net.Uri insert(android.net.Uri arg1, android.content.ContentValues arg2){
    return (android.net.Uri) null;
  }
  public android.database.Cursor query(android.net.Uri arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String [] arg4, java.lang.String arg5){
    return (android.database.Cursor) null;
  }
  public int update(android.net.Uri arg1, android.content.ContentValues arg2, java.lang.String arg3, java.lang.String [] arg4){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onCreate(){
    return false;
  }
}
