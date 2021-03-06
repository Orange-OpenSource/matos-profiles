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
public class DriverCall
  implements java.lang.Comparable
{
  // Classes

  public static enum State
  {
    // Enum Constants

    ACTIVE()
, HOLDING()
, DIALING()
, ALERTING()
, INCOMING()
, WAITING()
;
    // Fields

    // Constructors

    private State(){
    }
    // Methods

  }
  // Fields

  public int index;

  public boolean isMT;

  public DriverCall.State state;

  public boolean isMpty;

  public java.lang.String number;

  public int TOA;

  public boolean isVoice;

  public boolean isVoicePrivacy;

  public int als;

  public int numberPresentation;

  public java.lang.String name;

  public int namePresentation;

  public UUSInfo uusInfo;

  // Constructors

  public DriverCall(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int compareTo(java.lang.Object arg1){
    return 0;
  }
  public static DriverCall.State stateFromCLCC(int arg1) throws ATParseEx{
    return (DriverCall.State) null;
  }
  public static int presentationFromCLIP(int arg1) throws ATParseEx{
    return 0;
  }
}
