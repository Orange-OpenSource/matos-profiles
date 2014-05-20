package android.app.backup;

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
public class FullBackup
{
  // Fields

  public static final java.lang.String APK_TREE_TOKEN = "a";

  public static final java.lang.String OBB_TREE_TOKEN = "obb";

  public static final java.lang.String ROOT_TREE_TOKEN = "r";

  public static final java.lang.String DATA_TREE_TOKEN = "f";

  public static final java.lang.String DATABASE_TREE_TOKEN = "db";

  public static final java.lang.String SHAREDPREFS_TREE_TOKEN = "sp";

  public static final java.lang.String CACHE_TREE_TOKEN = "c";

  public static final java.lang.String SHARED_STORAGE_TOKEN = "shared";

  public static final java.lang.String APPS_PREFIX = "apps/";

  public static final java.lang.String SHARED_PREFIX = "shared/";

  public static final java.lang.String FULL_BACKUP_INTENT_ACTION = "fullback";

  public static final java.lang.String FULL_RESTORE_INTENT_ACTION = "fullrest";

  public static final java.lang.String CONF_TOKEN_INTENT_EXTRA = "conftoken";

  // Constructors

  public FullBackup(){
  }
  // Methods

  public static int backupToTar(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, BackupDataOutput arg6){
    return 0;
  }
  public static void restoreFile(android.os.ParcelFileDescriptor arg1, long arg2, int arg3, long arg4, long arg5, java.io.File arg6) throws java.io.IOException{
  }
}
