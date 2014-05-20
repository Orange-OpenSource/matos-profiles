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


public class ContentProviderClient
{
  // Constructors

  ContentProviderClient(ContentResolver arg1, IContentProvider arg2){
  }
  // Methods

  public java.lang.String getType(android.net.Uri arg1) throws android.os.RemoteException{
    return (java.lang.String) null;
  }
  public int delete(android.net.Uri arg1, java.lang.String arg2, java.lang.String [] arg3) throws android.os.RemoteException{
    return 0;
  }
  public android.net.Uri insert(android.net.Uri arg1, ContentValues arg2) throws android.os.RemoteException{
    return (android.net.Uri) null;
  }
  public boolean release(){
    return false;
  }
  public android.database.Cursor query(android.net.Uri arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String [] arg4, java.lang.String arg5) throws android.os.RemoteException{
    return (android.database.Cursor) null;
  }
  public int update(android.net.Uri arg1, ContentValues arg2, java.lang.String arg3, java.lang.String [] arg4) throws android.os.RemoteException{
    return 0;
  }
  public int bulkInsert(android.net.Uri arg1, ContentValues [] arg2) throws android.os.RemoteException{
    return 0;
  }
  public android.os.ParcelFileDescriptor openFile(android.net.Uri arg1, java.lang.String arg2) throws android.os.RemoteException, java.io.FileNotFoundException{
    return (android.os.ParcelFileDescriptor) null;
  }
  public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri arg1, java.lang.String arg2) throws android.os.RemoteException, java.io.FileNotFoundException{
    return (android.content.res.AssetFileDescriptor) null;
  }
  public ContentProviderResult [] applyBatch(java.util.ArrayList<ContentProviderOperation> arg1) throws android.os.RemoteException, OperationApplicationException{
    return (ContentProviderResult []) null;
  }
  public java.lang.String [] getStreamTypes(android.net.Uri arg1, java.lang.String arg2) throws android.os.RemoteException{
    return (java.lang.String []) null;
  }
  public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(android.net.Uri arg1, java.lang.String arg2, android.os.Bundle arg3) throws android.os.RemoteException, java.io.FileNotFoundException{
    return (android.content.res.AssetFileDescriptor) null;
  }
  public ContentProvider getLocalContentProvider(){
    return (ContentProvider) null;
  }
}
