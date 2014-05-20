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
public class ClipboardService
  extends android.content.IClipboard.Stub{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ClipboardService(android.content.Context arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
    return false;
  }
  public void setPrimaryClip(@com.francetelecom.rd.stubs.annotation.FieldSet("mPrimaryClip") android.content.ClipData arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mPrimaryClip")
  public android.content.ClipData getPrimaryClip(java.lang.String arg1){
    return (android.content.ClipData) null;
  }
  public android.content.ClipDescription getPrimaryClipDescription(){
    return (android.content.ClipDescription) null;
  }
  public boolean hasPrimaryClip(){
    return false;
  }
  public void addPrimaryClipChangedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("dispatchPrimaryClipChanged") android.content.IOnPrimaryClipChangedListener arg1){
  }
  public void removePrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener arg1){
  }
  public boolean hasClipboardText(){
    return false;
  }
}
