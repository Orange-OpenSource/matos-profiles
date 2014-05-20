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


@com.francetelecom.rd.stubs.annotation.Accumulator("stubAccumulator")
@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.DumpHierarchy(value = "android.hierarchy.ContentProvider", noAbstract = false)
public abstract class ContentProvider
  implements ComponentCallbacks2
{
  // Classes

  public static interface PipeDataWriter<T>
  {
    // Methods

    public void writeDataToPipe(android.os.ParcelFileDescriptor arg1, android.net.Uri arg2, java.lang.String arg3, android.os.Bundle arg4, T arg5);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ContentProvider(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ContentProvider(Context arg1, java.lang.String arg2, java.lang.String arg3, android.content.pm.PathPermission [] arg4){
  }
  // Methods

  public void shutdown(){
  }
  public final Context getContext(){
    return (Context) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract java.lang.String getType(android.net.Uri arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract int delete(android.net.Uri arg1, java.lang.String arg2, java.lang.String [] arg3);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract android.net.Uri insert(android.net.Uri arg1, ContentValues arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract android.database.Cursor query(android.net.Uri arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String [] arg4, java.lang.String arg5);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract int update(android.net.Uri arg1, ContentValues arg2, java.lang.String arg3, java.lang.String [] arg4);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract boolean onCreate();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onLowMemory(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onTrimMemory(int arg1){
  }
  public android.os.Bundle call(java.lang.String arg1, java.lang.String arg2, android.os.Bundle arg3){
    return (android.os.Bundle) null;
  }
  public int bulkInsert(android.net.Uri arg1, ContentValues [] arg2){
    return 0;
  }
  public android.os.ParcelFileDescriptor openFile(android.net.Uri arg1, java.lang.String arg2) throws java.io.FileNotFoundException{
    return (android.os.ParcelFileDescriptor) null;
  }
  public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri arg1, java.lang.String arg2) throws java.io.FileNotFoundException{
    return (android.content.res.AssetFileDescriptor) null;
  }
  public ContentProviderResult [] applyBatch(java.util.ArrayList<ContentProviderOperation> arg1) throws OperationApplicationException{
    return (ContentProviderResult []) null;
  }
  public java.lang.String [] getStreamTypes(android.net.Uri arg1, java.lang.String arg2){
    return (java.lang.String []) null;
  }
  public android.content.res.AssetFileDescriptor openTypedAssetFile(android.net.Uri arg1, java.lang.String arg2, android.os.Bundle arg3) throws java.io.FileNotFoundException{
    return (android.content.res.AssetFileDescriptor) null;
  }
  public <T>android.os.ParcelFileDescriptor openPipeHelper(android.net.Uri arg1, java.lang.String arg2, android.os.Bundle arg3, T arg4, ContentProvider.PipeDataWriter<T> arg5) throws java.io.FileNotFoundException{
    return (android.os.ParcelFileDescriptor) null;
  }
  public void attachInfo(Context arg1, android.content.pm.ProviderInfo arg2){
  }
  public static ContentProvider coerceToLocalContentProvider(IContentProvider arg1){
    return (ContentProvider) null;
  }
  protected final void setReadPermission(@com.francetelecom.rd.stubs.annotation.FieldSet("readPermission") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("readPermission")
  public final java.lang.String getReadPermission(){
    return (java.lang.String) null;
  }
  protected final void setWritePermission(@com.francetelecom.rd.stubs.annotation.FieldSet("writePermission") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("writePermission")
  public final java.lang.String getWritePermission(){
    return (java.lang.String) null;
  }
  protected final void setPathPermissions(android.content.pm.PathPermission [] arg1){
  }
  public final android.content.pm.PathPermission [] getPathPermissions(){
    return (android.content.pm.PathPermission []) null;
  }
  protected final android.os.ParcelFileDescriptor openFileHelper(android.net.Uri arg1, java.lang.String arg2) throws java.io.FileNotFoundException{
    return (android.os.ParcelFileDescriptor) null;
  }
  protected boolean isTemporary(){
    return false;
  }
  public IContentProvider getIContentProvider(){
    return (IContentProvider) null;
  }
}
