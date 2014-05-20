package android.content;

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


public interface IContentProvider
  extends android.os.IInterface
{
  // Fields

  public static final java.lang.String descriptor = "android.content.IContentProvider";

  public static final int QUERY_TRANSACTION = 1;

  public static final int GET_TYPE_TRANSACTION = 2;

  public static final int INSERT_TRANSACTION = 3;

  public static final int DELETE_TRANSACTION = 4;

  public static final int UPDATE_TRANSACTION = 10;

  public static final int BULK_INSERT_TRANSACTION = 13;

  public static final int OPEN_FILE_TRANSACTION = 14;

  public static final int OPEN_ASSET_FILE_TRANSACTION = 15;

  public static final int APPLY_BATCH_TRANSACTION = 20;

  public static final int CALL_TRANSACTION = 21;

  public static final int GET_STREAM_TYPES_TRANSACTION = 22;

  public static final int OPEN_TYPED_ASSET_FILE_TRANSACTION = 23;

  // Methods

  public java.lang.String getType(android.net.Uri arg1) throws android.os.RemoteException;
  public int delete(android.net.Uri arg1, java.lang.String arg2, java.lang.String [] arg3) throws android.os.RemoteException;
  public android.net.Uri insert(android.net.Uri arg1, ContentValues arg2) throws android.os.RemoteException;
  public android.database.Cursor query(android.net.Uri arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String [] arg4, java.lang.String arg5) throws android.os.RemoteException;
  public int update(android.net.Uri arg1, ContentValues arg2, java.lang.String arg3, java.lang.String [] arg4) throws android.os.RemoteException;
  public android.os.Bundle call(java.lang.String arg1, java.lang.String arg2, android.os.Bundle arg3) throws android.os.RemoteException;
  public int bulkInsert(android.net.Uri arg1, ContentValues [] arg2) throws android.os.RemoteException;
  public android.os.ParcelFileDescriptor openFile(android.net.Uri arg1, java.lang.String arg2) throws android.os.RemoteException, java.io.FileNotFoundException;
  public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri arg1, java.lang.String arg2) throws android.os.RemoteException, java.io.FileNotFoundException;
  public ContentProviderResult [] applyBatch(java.util.ArrayList<ContentProviderOperation> arg1) throws android.os.RemoteException, OperationApplicationException;
  public java.lang.String [] getStreamTypes(android.net.Uri arg1, java.lang.String arg2) throws android.os.RemoteException;
  public android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri arg1, java.lang.String arg2, android.os.Bundle arg3) throws android.os.RemoteException, java.io.FileNotFoundException;
}
