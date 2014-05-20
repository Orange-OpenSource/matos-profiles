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
public class MergeCursor
  extends AbstractCursor{
  // Constructors

  public MergeCursor(Cursor [] arg1){
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
  public void close(){
  }
  public int getType(int arg1){
    return 0;
  }
  public java.lang.String getString(int arg1){
    return (java.lang.String) null;
  }
  public int getCount(){
    return 0;
  }
  public void registerDataSetObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChanged") DataSetObserver arg1){
  }
  public void unregisterDataSetObserver(DataSetObserver arg1){
  }
  public boolean requery(){
    return false;
  }
  public void deactivate(){
  }
  public java.lang.String [] getColumnNames(){
    return (java.lang.String []) null;
  }
  public boolean onMove(int arg1, int arg2){
    return false;
  }
  public boolean isNull(int arg1){
    return false;
  }
  public byte [] getBlob(int arg1){
    return (byte []) null;
  }
  public void registerContentObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") ContentObserver arg1){
  }
  public void unregisterContentObserver(ContentObserver arg1){
  }
}
