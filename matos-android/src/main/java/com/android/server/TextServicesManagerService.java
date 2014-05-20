package com.android.server;

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
public class TextServicesManagerService
  extends com.android.internal.textservice.ITextServicesManager.Stub{
  // Constructors

  public TextServicesManagerService(android.content.Context arg1){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void systemReady(){
  }
  public android.view.textservice.SpellCheckerInfo getCurrentSpellChecker(java.lang.String arg1){
    return (android.view.textservice.SpellCheckerInfo) null;
  }
  public android.view.textservice.SpellCheckerSubtype getCurrentSpellCheckerSubtype(java.lang.String arg1, boolean arg2){
    return (android.view.textservice.SpellCheckerSubtype) null;
  }
  public void getSpellCheckerService(java.lang.String arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ITextServicesSessionListener") com.android.internal.textservice.ITextServicesSessionListener arg3, com.android.internal.textservice.ISpellCheckerSessionListener arg4, android.os.Bundle arg5){
  }
  public void finishSpellCheckerService(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SpellCheckerSessionListener") com.android.internal.textservice.ISpellCheckerSessionListener arg1){
  }
  public void setCurrentSpellChecker(java.lang.String arg1, java.lang.String arg2){
  }
  public void setCurrentSpellCheckerSubtype(java.lang.String arg1, int arg2){
  }
  public void setSpellCheckerEnabled(boolean arg1){
  }
  public boolean isSpellCheckerEnabled(){
    return false;
  }
  public android.view.textservice.SpellCheckerInfo [] getEnabledSpellCheckers(){
    return (android.view.textservice.SpellCheckerInfo []) null;
  }
}
