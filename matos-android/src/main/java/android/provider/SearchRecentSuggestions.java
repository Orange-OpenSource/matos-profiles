package android.provider;

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
public class SearchRecentSuggestions
{
  // Fields

  public static final java.lang.String [] QUERIES_PROJECTION_1LINE = null;

  public static final java.lang.String [] QUERIES_PROJECTION_2LINE = null;

  public static final int QUERIES_PROJECTION_DATE_INDEX = 1;

  public static final int QUERIES_PROJECTION_QUERY_INDEX = 2;

  public static final int QUERIES_PROJECTION_DISPLAY1_INDEX = 3;

  public static final int QUERIES_PROJECTION_DISPLAY2_INDEX = 4;

  // Constructors

  public SearchRecentSuggestions(android.content.Context arg1, java.lang.String arg2, int arg3){
  }
  // Methods

  public void clearHistory(){
  }
  protected void truncateHistory(android.content.ContentResolver arg1, int arg2){
  }
  public void saveRecentQuery(java.lang.String arg1, java.lang.String arg2){
  }
}
