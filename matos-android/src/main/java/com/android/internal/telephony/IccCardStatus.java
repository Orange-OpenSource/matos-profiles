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
public class IccCardStatus
{
  // Classes

  public static enum CardState
  {
    // Enum Constants

    CARDSTATE_ABSENT()
, CARDSTATE_PRESENT()
, CARDSTATE_ERROR()
;
    // Fields

    // Constructors

    private CardState(){
    }
    // Methods

  }
  public static enum PinState
  {
    // Enum Constants

    PINSTATE_UNKNOWN()
, PINSTATE_ENABLED_NOT_VERIFIED()
, PINSTATE_ENABLED_VERIFIED()
, PINSTATE_DISABLED()
, PINSTATE_ENABLED_BLOCKED()
, PINSTATE_ENABLED_PERM_BLOCKED()
;
    // Fields

    // Constructors

    private PinState(){
    }
    // Methods

  }
  // Constructors

  public IccCardStatus(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mIccCardApplication")
  public IccCardApplication getApplication(int arg1){
    return (IccCardApplication) null;
  }
  public void setCardState(int arg1){
  }
  public void setUniversalPinState(int arg1){
  }
  public void setGsmUmtsSubscriptionAppIndex(int arg1){
  }
  public void setCdmaSubscriptionAppIndex(int arg1){
  }
  public void setImsSubscriptionAppIndex(int arg1){
  }
  public void setNumApplications(int arg1){
  }
  public IccCardStatus.CardState getCardState(){
    return (IccCardStatus.CardState) null;
  }
  public int getCdmaSubscriptionAppIndex(){
    return 0;
  }
  public int getGsmUmtsSubscriptionAppIndex(){
    return 0;
  }
  public int getNumApplications(){
    return 0;
  }
  public IccCardStatus.PinState getUniversalPinState(){
    return (IccCardStatus.PinState) null;
  }
  public int getImsSubscriptionAppIndex(){
    return 0;
  }
  public void addApplication(@com.francetelecom.rd.stubs.annotation.FieldSet("mIccCardApplication") IccCardApplication arg1){
  }
}
