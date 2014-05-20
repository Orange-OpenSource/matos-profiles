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
public abstract class AbstractWindowedCursor
  extends AbstractCursor{
  // Fields

  protected CursorWindow mWindow;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbstractWindowedCursor(){
    super();
  }
  // Methods

  public short getShort(int arg1){
    return (short) 0;
  }
  public int getInt(int arg1){
    return 0;
  }
  public long getLong(int arg1){
    return 0l;
  }
  public float getFloat(int arg1){
    return 0.0f;
  }
  public double getDouble(int arg1){
    return 0.0d;
  }
  public int getType(int arg1){
    return 0;
  }
  public java.lang.String getString(int arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("cursorWindow")
  public CursorWindow getWindow(){
    return (CursorWindow) null;
  }
  public void setWindow(@com.francetelecom.rd.stubs.annotation.FieldSet("cursorWindow") CursorWindow arg1){
  }
  public boolean isNull(int arg1){
    return false;
  }
  public boolean isBlob(int arg1){
    return false;
  }
  public byte [] getBlob(int arg1){
    return (byte []) null;
  }
  protected void clearOrCreateLocalWindow(java.lang.String arg1){
  }
  public void copyStringToBuffer(int arg1, CharArrayBuffer arg2){
  }
  public boolean isString(int arg1){
    return false;
  }
  public boolean isLong(int arg1){
    return false;
  }
  public boolean isFloat(int arg1){
    return false;
  }
  protected void checkPosition(){
  }
  public boolean hasWindow(){
    return false;
  }
  protected void closeWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDeactivateOrClose(){
  }
}
