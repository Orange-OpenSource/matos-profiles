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
public class UserDictionary
{
  // Classes

  public static class Words
    implements BaseColumns
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.userword";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.userword";

    public static final java.lang.String _ID = "_id";

    public static final java.lang.String WORD = "word";

    public static final java.lang.String FREQUENCY = "frequency";

    public static final java.lang.String LOCALE = "locale";

    public static final java.lang.String APP_ID = "appid";

    public static final int LOCALE_TYPE_ALL = 0;

    public static final int LOCALE_TYPE_CURRENT = 1;

    public static final java.lang.String DEFAULT_SORT_ORDER = "frequency DESC";

    // Constructors

    public Words(){
    }
    // Methods

    public static void addWord(android.content.Context arg1, java.lang.String arg2, int arg3, int arg4){
    }
  }
  // Fields

  public static final java.lang.String AUTHORITY = "user_dictionary";

  public static final android.net.Uri CONTENT_URI = null;

  // Constructors

  public UserDictionary(){
  }
}
