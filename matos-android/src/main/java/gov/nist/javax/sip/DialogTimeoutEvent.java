package gov.nist.javax.sip;

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


public class DialogTimeoutEvent
  extends java.util.EventObject{
  // Classes

  public static enum Reason
  {
    // Enum Constants

    AckNotReceived()
, AckNotSent()
, ReInviteTimeout()
;
    // Fields

    // Constructors

    private Reason(){
    }
    // Methods

  }
  // Constructors

  public DialogTimeoutEvent(java.lang.Object arg1, javax.sip.Dialog arg2, DialogTimeoutEvent.Reason arg3){
    super((java.lang.Object) null);
  }
  // Methods

  public javax.sip.Dialog getDialog(){
    return (javax.sip.Dialog) null;
  }
  public DialogTimeoutEvent.Reason getReason(){
    return (DialogTimeoutEvent.Reason) null;
  }
}
