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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class CallerInfoAsyncQuery
{
  // Classes

  public static interface OnQueryCompleteListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onQueryComplete")
    public void onQueryComplete(int arg1, java.lang.Object arg2, CallerInfo arg3);
  }
  public static class QueryPoolException
    extends android.database.SQLException  {
    // Constructors

    public QueryPoolException(java.lang.String arg1){
      super();
    }
  }
  // Constructors

  private CallerInfoAsyncQuery(){
  }
  // Methods

  public static CallerInfoAsyncQuery startQuery(int arg1, android.content.Context arg2, android.net.Uri arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onQueryComplete") CallerInfoAsyncQuery.OnQueryCompleteListener arg4, java.lang.Object arg5){
    return (CallerInfoAsyncQuery) null;
  }
  public static CallerInfoAsyncQuery startQuery(int arg1, android.content.Context arg2, java.lang.String arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onQueryComplete") CallerInfoAsyncQuery.OnQueryCompleteListener arg4, java.lang.Object arg5){
    return (CallerInfoAsyncQuery) null;
  }
  public void addQueryListener(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onQueryComplete") CallerInfoAsyncQuery.OnQueryCompleteListener arg2, java.lang.Object arg3){
  }
}
