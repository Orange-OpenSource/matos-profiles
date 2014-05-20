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
public class Applications
{
  // Classes

  public static interface ApplicationColumns
    extends BaseColumns
  {
    // Fields

    public static final java.lang.String NAME = "name";

    public static final java.lang.String ICON = "icon";

    public static final java.lang.String URI = "uri";

  }
  // Fields

  public static final java.lang.String AUTHORITY = "applications";

  @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ApplicationURI")
  public static final android.net.Uri CONTENT_URI = null;

  public static final java.lang.String APPLICATION_PATH = "applications";

  public static final java.lang.String SEARCH_PATH = "search";

  public static final java.lang.String APPLICATION_ITEM_TYPE = "vnd.android.cursor.item/vnd.android.application";

  public static final java.lang.String APPLICATION_DIR_TYPE = "vnd.android.cursor.dir/vnd.android.application";

  // Constructors

  private Applications(){
  }
  // Methods

  public static android.database.Cursor search(android.content.ContentResolver arg1, java.lang.String arg2){
    return (android.database.Cursor) null;
  }
  public static android.content.ComponentName uriToComponentName(android.net.Uri arg1){
    return (android.content.ComponentName) null;
  }
  public static android.net.Uri componentNameToUri(java.lang.String arg1, java.lang.String arg2){
    return (android.net.Uri) null;
  }
}
