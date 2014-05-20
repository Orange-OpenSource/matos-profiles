package android.server.search;

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
public class Searchables
{
  // Fields

  public static java.lang.String GOOGLE_SEARCH_COMPONENT_NAME;

  public static java.lang.String ENHANCED_GOOGLE_SEARCH_COMPONENT_NAME;

  // Constructors

  public Searchables(android.content.Context arg1){
  }
  // Methods

  public android.app.SearchableInfo getSearchableInfo(android.content.ComponentName arg1){
    return (android.app.SearchableInfo) null;
  }
  public synchronized java.util.ArrayList<android.content.pm.ResolveInfo> getGlobalSearchActivities(){
    return (java.util.ArrayList) null;
  }
  public synchronized android.content.ComponentName getGlobalSearchActivity(){
    return (android.content.ComponentName) null;
  }
  public synchronized android.content.ComponentName getWebSearchActivity(){
    return (android.content.ComponentName) null;
  }
  public void buildSearchableList(){
  }
  public synchronized java.util.ArrayList<android.app.SearchableInfo> getSearchablesInGlobalSearchList(){
    return (java.util.ArrayList) null;
  }
  public synchronized java.util.ArrayList<android.app.SearchableInfo> getSearchablesList(){
    return (java.util.ArrayList) null;
  }
}
