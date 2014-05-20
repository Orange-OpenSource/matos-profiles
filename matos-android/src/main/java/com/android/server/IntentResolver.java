package com.android.server;

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


public abstract class IntentResolver<F extends android.content.IntentFilter, R>
{
  // Constructors

  public IntentResolver(){
  }
  // Methods

  public boolean dump(java.io.PrintWriter arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5){
    return false;
  }
  public void addFilter(F arg1){
  }
  public java.util.Set<F> filterSet(){
    return (java.util.Set) null;
  }
  public java.util.List<R> queryIntent(android.content.Intent arg1, java.lang.String arg2, boolean arg3){
    return (java.util.List) null;
  }
  protected boolean allowFilterResult(F arg1, java.util.List<R> arg2){
    return false;
  }
  protected abstract java.lang.String packageForFilter(F arg1);
  public void removeFilter(F arg1){
  }
  public java.util.Iterator<F> filterIterator(){
    return (java.util.Iterator) null;
  }
  public java.util.List<R> queryIntentFromList(android.content.Intent arg1, java.lang.String arg2, boolean arg3, java.util.ArrayList<java.util.ArrayList<F>> arg4){
    return (java.util.List) null;
  }
  protected boolean isFilterStopped(F arg1){
    return false;
  }
  protected R newResult(F arg1, int arg2){
    return null;
  }
  protected void sortResults(java.util.List<R> arg1){
  }
  protected void dumpFilter(java.io.PrintWriter arg1, java.lang.String arg2, F arg3){
  }
}
