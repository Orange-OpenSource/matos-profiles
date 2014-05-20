package android.database;

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
public abstract class AbstractCursor
  implements CrossProcessCursor
{
  // Classes

  protected static class SelfContentObserver
    extends ContentObserver  {
    // Constructors

	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange")
    public SelfContentObserver(AbstractCursor arg1){
      super((android.os.Handler) null);
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onChange")
    public void onChange(boolean arg1){
    }
    public boolean deliverSelfNotifications(){
      return false;
    }
  }
  // Fields

  protected java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> mUpdatedRows;

  protected int mRowIdColumnIndex;

  protected int mPos;

  protected java.lang.Long mCurrentRowID;

  protected android.content.ContentResolver mContentResolver;

  protected boolean mClosed;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbstractCursor(){
  }
  // Methods

  protected void finalize(){
  }
  public abstract short getShort(int arg1);
  public abstract int getInt(int arg1);
  public abstract long getLong(int arg1);
  public abstract float getFloat(int arg1);
  public abstract double getDouble(int arg1);
  public void close(){
  }
  public int getType(int arg1){
    return 0;
  }
  public abstract java.lang.String getString(int arg1);
  public final boolean isFirst(){
    return false;
  }
  public boolean isClosed(){
    return false;
  }
  public CursorWindow getWindow(){
    return (CursorWindow) null;
  }
  public abstract int getCount();
  public void registerDataSetObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.database.DataSetObserver.onChanged") DataSetObserver arg1){
  }
  public void unregisterDataSetObserver(DataSetObserver arg1){
  }
  public final int getPosition(){
    return 0;
  }
  public boolean requery(){
    return false;
  }
  public android.os.Bundle getExtras(){
    return (android.os.Bundle) null;
  }
  public void deactivate(){
  }
  public abstract java.lang.String [] getColumnNames();
  public int getColumnIndex(java.lang.String arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onMove(int arg1, int arg2){
    return false;
  }
  public abstract boolean isNull(int arg1);
  public byte [] getBlob(int arg1){
    return (byte []) null;
  }
  public void copyStringToBuffer(int arg1, CharArrayBuffer arg2){
  }
  protected void checkPosition(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDeactivateOrClose(){
  }
  public int getColumnIndexOrThrow(java.lang.String arg1){
    return 0;
  }
  public final boolean moveToNext(){
    return false;
  }
  public final boolean moveToFirst(){
    return false;
  }
  public final boolean isAfterLast(){
    return false;
  }
  public final boolean moveToPosition(int arg1){
    return false;
  }
  public void registerContentObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.database.ContentObserver.onChange") ContentObserver arg1){
  }
  public void unregisterContentObserver(ContentObserver arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onChange(boolean arg1){
  }
  public final boolean move(int arg1){
    return false;
  }
  public void fillWindow(int arg1, CursorWindow arg2){
  }
  public int getColumnCount(){
    return 0;
  }
  public final boolean moveToLast(){
    return false;
  }
  public final boolean moveToPrevious(){
    return false;
  }
  public final boolean isLast(){
    return false;
  }
  public final boolean isBeforeFirst(){
    return false;
  }
  public java.lang.String getColumnName(int arg1){
    return (java.lang.String) null;
  }
  protected void notifyDataSetChange(){
  }
  protected DataSetObservable getDataSetObservable(){
    return (DataSetObservable) null;
  }
  public void setNotificationUri(android.content.ContentResolver arg1, android.net.Uri arg2){
  }
  public android.net.Uri getNotificationUri(){
    return (android.net.Uri) null;
  }
  public boolean getWantsAllOnMoveCalls(){
    return false;
  }
  public void setExtras(android.os.Bundle arg1){
  }
  public android.os.Bundle respond(android.os.Bundle arg1){
    return (android.os.Bundle) null;
  }
  protected boolean isFieldUpdated(int arg1){
    return false;
  }
  protected java.lang.Object getUpdatedField(int arg1){
    return (java.lang.Object) null;
  }
}
