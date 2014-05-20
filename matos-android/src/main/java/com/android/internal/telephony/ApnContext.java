package com.android.internal.telephony;

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
public class ApnContext
{
  // Fields

  public final java.lang.String LOG_TAG = (java.lang.String) null;

  protected static final boolean DBG = false;

  // Constructors

  public ApnContext(java.lang.String arg1, java.lang.String arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  protected void log(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mState")
  public synchronized DataConnectionTracker.State getState(){
    return (DataConnectionTracker.State) null;
  }
  public synchronized void setState(@com.francetelecom.rd.stubs.annotation.FieldSet("mState") DataConnectionTracker.State arg1){
  }
  public boolean isEnabled(){
    return false;
  }
  public boolean isReady(){
    return false;
  }
  public void setEnabled(boolean arg1){
  }
  public void setDependencyMet(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mReason")
  public synchronized java.lang.String getReason(){
    return (java.lang.String) null;
  }
  public boolean isDisconnected(){
    return false;
  }
  public java.lang.String getApnType(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mDataConnection")
  public synchronized DataConnection getDataConnection(){
    return (DataConnection) null;
  }
  public synchronized void setDataConnection(@com.francetelecom.rd.stubs.annotation.FieldSet("mDataConnection") DataConnection arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mDataConnectionAc")
  public synchronized DataConnectionAc getDataConnectionAc(){
    return (DataConnectionAc) null;
  }
  public synchronized void setDataConnectionAc(@com.francetelecom.rd.stubs.annotation.FieldSet("mDataConnectionAc") DataConnectionAc arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mApnSetting")
  public synchronized ApnSetting getApnSetting(){
    return (ApnSetting) null;
  }
  public synchronized void setApnSetting(@com.francetelecom.rd.stubs.annotation.FieldSet("mApnSetting") ApnSetting arg1){
  }
  public synchronized void setWaitingApns(@com.francetelecom.rd.stubs.annotation.FieldSet("mWaitingApns") java.util.ArrayList<ApnSetting> arg1){
  }
  public int getWaitingApnsPermFailCount(){
    return 0;
  }
  public void decWaitingApnsPermFailCount(){
  }
  public synchronized ApnSetting getNextWaitingApn(){
    return (ApnSetting) null;
  }
  public synchronized void removeNextWaitingApn(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mWaitingApns")
  public synchronized java.util.ArrayList<ApnSetting> getWaitingApns(){
    return (java.util.ArrayList) null;
  }
  public synchronized void setReason(@com.francetelecom.rd.stubs.annotation.FieldSet("mReason") java.lang.String arg1){
  }
  public boolean getDependencyMet(){
    return false;
  }
}
