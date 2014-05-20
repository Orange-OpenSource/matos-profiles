package android.test.mock;

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


public class MockIContentProvider
  implements android.content.IContentProvider
{
  // Constructors

  public MockIContentProvider(){
  }
  // Methods

  public java.lang.String getType(android.net.Uri arg1){
    return (java.lang.String) null;
  }
  public int delete(android.net.Uri arg1, java.lang.String arg2, java.lang.String [] arg3) throws android.os.RemoteException{
    return 0;
  }
  public android.net.Uri insert(android.net.Uri arg1, android.content.ContentValues arg2) throws android.os.RemoteException{
    return (android.net.Uri) null;
  }
  public android.database.Cursor query(android.net.Uri arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String [] arg4, java.lang.String arg5){
    return (android.database.Cursor) null;
  }
  public int update(android.net.Uri arg1, android.content.ContentValues arg2, java.lang.String arg3, java.lang.String [] arg4) throws android.os.RemoteException{
    return 0;
  }
  public android.os.IBinder asBinder(){
    return (android.os.IBinder) null;
  }
  public android.os.Bundle call(java.lang.String arg1, java.lang.String arg2, android.os.Bundle arg3) throws android.os.RemoteException{
    return (android.os.Bundle) null;
  }
  public int bulkInsert(android.net.Uri arg1, android.content.ContentValues [] arg2){
    return 0;
  }
  public android.os.ParcelFileDescriptor openFile(android.net.Uri arg1, java.lang.String arg2){
    return (android.os.ParcelFileDescriptor) null;
  }
  public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri arg1, java.lang.String arg2){
    return (android.content.res.AssetFileDescriptor) null;
  }
  public android.content.ContentProviderResult [] applyBatch(java.util.ArrayList<android.content.ContentProviderOperation> arg1){
    return (android.content.ContentProviderResult []) null;
  }
  public java.lang.String [] getStreamTypes(android.net.Uri arg1, java.lang.String arg2) throws android.os.RemoteException{
    return (java.lang.String []) null;
  }
  public android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri arg1, java.lang.String arg2, android.os.Bundle arg3) throws android.os.RemoteException, java.io.FileNotFoundException{
    return (android.content.res.AssetFileDescriptor) null;
  }
  public android.content.EntityIterator queryEntities(android.net.Uri arg1, java.lang.String arg2, java.lang.String [] arg3, java.lang.String arg4){
    return (android.content.EntityIterator) null;
  }
}
