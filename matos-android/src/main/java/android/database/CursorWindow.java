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
public class CursorWindow
  extends android.database.sqlite.SQLiteClosable  implements android.os.Parcelable
{
  // Fields

  public int mWindowPtr;

  public static final android.os.Parcelable.Creator<CursorWindow> CREATOR = null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CursorWindow(java.lang.String arg1, boolean arg2){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CursorWindow(boolean arg1){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  private CursorWindow(android.os.Parcel arg1){
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public short getShort(int arg1, int arg2){
    return (short) 0;
  }
  public int getInt(int arg1, int arg2){
    return 0;
  }
  public long getLong(int arg1, int arg2){
    return 0l;
  }
  public boolean putLong(long arg1, int arg2, int arg3){
    return false;
  }
  public float getFloat(int arg1, int arg2){
    return 0.0f;
  }
  public double getDouble(int arg1, int arg2){
    return 0.0d;
  }
  public boolean putDouble(double arg1, int arg2, int arg3){
    return false;
  }
  public void clear(){
  }
  public void close(){
  }
  public int getType(int arg1, int arg2){
    return 0;
  }
  public java.lang.String getString(int arg1, int arg2){
    return (java.lang.String) null;
  }
  public boolean putString(java.lang.String arg1, int arg2, int arg3){
    return false;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAllReferencesReleased(){
  }
  public boolean isNull(int arg1, int arg2){
    return false;
  }
  public boolean isBlob(int arg1, int arg2){
    return false;
  }
  public byte [] getBlob(int arg1, int arg2){
    return (byte []) null;
  }
  public void copyStringToBuffer(int arg1, int arg2, CharArrayBuffer arg3){
  }
  public boolean isString(int arg1, int arg2){
    return false;
  }
  public boolean isLong(int arg1, int arg2){
    return false;
  }
  public boolean isFloat(int arg1, int arg2){
    return false;
  }
  public static CursorWindow newFromParcel(android.os.Parcel arg1){
    return (CursorWindow) null;
  }
  public boolean setNumColumns(int arg1){
    return false;
  }
  public boolean putNull(int arg1, int arg2){
    return false;
  }
  public int getStartPosition(){
    return 0;
  }
  public int getNumRows(){
    return 0;
  }
  public void setStartPosition(int arg1){
  }
  public boolean allocRow(){
    return false;
  }
  public void freeLastRow(){
  }
  public boolean putBlob(byte [] arg1, int arg2, int arg3){
    return false;
  }
}
