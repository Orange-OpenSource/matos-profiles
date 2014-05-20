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
public class SocialContract
{
  // Classes

  public static final class Activities
    implements BaseColumns
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final android.net.Uri CONTENT_AUTHORED_BY_URI = null;

    public static final android.net.Uri CONTENT_CONTACT_STATUS_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/activity";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/activity";

    // Constructors

    private Activities(){
    }
  }
  // Fields

  public static final java.lang.String AUTHORITY = "com.android.social";

  public static final android.net.Uri AUTHORITY_URI = null;

  // Constructors

  public SocialContract(){
  }
}
