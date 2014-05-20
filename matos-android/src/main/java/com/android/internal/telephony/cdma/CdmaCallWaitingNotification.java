package com.android.internal.telephony.cdma;

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
public class CdmaCallWaitingNotification
{
  // Fields

  public java.lang.String number;

  public int numberPresentation;

  public java.lang.String name;

  public int namePresentation;

  public int numberType;

  public int numberPlan;

  public int isPresent;

  public int signalType;

  public int alertPitch;

  public int signal;

  // Constructors

  public CdmaCallWaitingNotification(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static int presentationFromCLIP(int arg1){
    return 0;
  }
}
