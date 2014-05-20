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
public final class DrmStore
{
  // Classes

  public static interface Columns
    extends BaseColumns
  {
    // Fields

    public static final java.lang.String DATA = "_data";

    public static final java.lang.String SIZE = "_size";

    public static final java.lang.String TITLE = "title";

    public static final java.lang.String MIME_TYPE = "mime_type";

  }
  public static interface Images
    extends DrmStore.Columns
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

  }
  public static interface Audio
    extends DrmStore.Columns
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

  }
  // Fields

  public static final java.lang.String AUTHORITY = "drm";

  // Constructors

  public DrmStore(){
  }
  // Methods

  public static final android.content.Intent addDrmFile(android.content.ContentResolver arg1, java.io.File arg2, java.lang.String arg3){
    return (android.content.Intent) null;
  }
  public static final android.content.Intent addDrmFile(android.content.ContentResolver arg1, java.io.FileInputStream arg2, java.lang.String arg3){
    return (android.content.Intent) null;
  }
  public static void enforceAccessDrmPermission(android.content.Context arg1){
  }
}
