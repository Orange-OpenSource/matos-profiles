package com.android.inputmethod.pinyin;

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


public interface IPinyinDecoderService
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IPinyinDecoderStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IPinyinDecoderService
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IPinyinDecoderService asInterface(android.os.IBinder arg1){
      return (IPinyinDecoderService) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public int getInt() throws android.os.RemoteException;
  public void setMaxLens(int arg1, int arg2) throws android.os.RemoteException;
  public int imSearch(byte [] arg1, int arg2) throws android.os.RemoteException;
  public int imDelSearch(int arg1, boolean arg2, boolean arg3) throws android.os.RemoteException;
  public void imResetSearch() throws android.os.RemoteException;
  public int imAddLetter(byte arg1) throws android.os.RemoteException;
  public java.lang.String imGetPyStr(boolean arg1) throws android.os.RemoteException;
  public int imGetPyStrLen(boolean arg1) throws android.os.RemoteException;
  public int [] imGetSplStart() throws android.os.RemoteException;
  public java.lang.String imGetChoice(int arg1) throws android.os.RemoteException;
  public java.lang.String imGetChoices(int arg1) throws android.os.RemoteException;
  public java.util.List<java.lang.String> imGetChoiceList(int arg1, int arg2, int arg3) throws android.os.RemoteException;
  public int imChoose(int arg1) throws android.os.RemoteException;
  public int imCancelLastChoice() throws android.os.RemoteException;
  public int imGetFixedLen() throws android.os.RemoteException;
  public boolean imCancelInput() throws android.os.RemoteException;
  public void imFlushCache() throws android.os.RemoteException;
  public int imGetPredictsNum(java.lang.String arg1) throws android.os.RemoteException;
  public java.util.List<java.lang.String> imGetPredictList(int arg1, int arg2) throws android.os.RemoteException;
  public java.lang.String imGetPredictItem(int arg1) throws android.os.RemoteException;
  public java.lang.String syncUserDict(java.lang.String arg1) throws android.os.RemoteException;
  public boolean syncBegin() throws android.os.RemoteException;
  public void syncFinish() throws android.os.RemoteException;
  public int syncPutLemmas(java.lang.String arg1) throws android.os.RemoteException;
  public java.lang.String syncGetLemmas() throws android.os.RemoteException;
  public int syncGetLastCount() throws android.os.RemoteException;
  public int syncGetTotalCount() throws android.os.RemoteException;
  public void syncClearLastGot() throws android.os.RemoteException;
  public int imSyncGetCapacity() throws android.os.RemoteException;
}
