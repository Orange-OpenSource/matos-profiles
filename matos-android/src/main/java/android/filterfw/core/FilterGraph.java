package android.filterfw.core;

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


public class FilterGraph
{
  // Fields

  public static final int AUTOBRANCH_OFF = 0;

  public static final int AUTOBRANCH_SYNCED = 1;

  public static final int AUTOBRANCH_UNSYNCED = 2;

  public static final int TYPECHECK_OFF = 0;

  public static final int TYPECHECK_DYNAMIC = 1;

  public static final int TYPECHECK_STRICT = 2;

  // Constructors

  public FilterGraph(){
  }
  // Methods

  public void connect(Filter arg1, java.lang.String arg2, Filter arg3, java.lang.String arg4){
  }
  public void connect(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public Filter getFilter(java.lang.String arg1){
    return (Filter) null;
  }
  public boolean isReady(){
    return false;
  }
  public void tearDown(FilterContext arg1){
  }
  public java.util.Set<Filter> getFilters(){
    return (java.util.Set) null;
  }
  public void beginProcessing(){
  }
  public boolean addFilter(Filter arg1){
    return false;
  }
  public void setAutoBranchMode(int arg1){
  }
  public void setDiscardUnconnectedOutputs(boolean arg1){
  }
  public void closeFilters(FilterContext arg1){
  }
  public boolean containsFilter(Filter arg1){
    return false;
  }
  public void flushFrames(){
  }
  public void setTypeCheckMode(int arg1){
  }
}
