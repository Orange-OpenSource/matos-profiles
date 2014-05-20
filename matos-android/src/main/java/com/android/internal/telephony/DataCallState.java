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
public class DataCallState
{
  // Classes

  public static enum SetupResult
  {
    // Enum Constants

    SUCCESS()
, ERR_BadCommand()
, ERR_UnacceptableParameter()
, ERR_GetLastErrorFromRil()
, ERR_Stale()
, ERR_RilError()
;
    // Fields

    public DataConnection.FailCause mFailCause;

    // Constructors

    private SetupResult(){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public int version;

  public int status;

  public int cid;

  public int active;

  public java.lang.String type;

  public java.lang.String ifname;

  public java.lang.String [] addresses;

  public java.lang.String [] dnses;

  public java.lang.String [] gateways;

  public int suggestedRetryTime;

  // Constructors

  public DataCallState(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public DataCallState.SetupResult setLinkProperties(android.net.LinkProperties arg1, boolean arg2){
    return (DataCallState.SetupResult) null;
  }
}
