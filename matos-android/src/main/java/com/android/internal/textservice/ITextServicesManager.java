package com.android.internal.textservice;

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
public interface ITextServicesManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements ITextServicesManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static ITextServicesManager asInterface(android.os.IBinder arg1){
      return (ITextServicesManager) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public android.view.textservice.SpellCheckerInfo getCurrentSpellChecker(java.lang.String arg1) throws android.os.RemoteException;
  public android.view.textservice.SpellCheckerSubtype getCurrentSpellCheckerSubtype(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  public void getSpellCheckerService(java.lang.String arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ITextServicesSessionListener") ITextServicesSessionListener arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SpellCheckerSessionListener") ISpellCheckerSessionListener arg4, android.os.Bundle arg5) throws android.os.RemoteException;
  public void finishSpellCheckerService(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SpellCheckerSessionListener") ISpellCheckerSessionListener arg1) throws android.os.RemoteException;
  public void setCurrentSpellChecker(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  public void setCurrentSpellCheckerSubtype(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public void setSpellCheckerEnabled(boolean arg1) throws android.os.RemoteException;
  public boolean isSpellCheckerEnabled() throws android.os.RemoteException;
  public android.view.textservice.SpellCheckerInfo [] getEnabledSpellCheckers() throws android.os.RemoteException;
}
