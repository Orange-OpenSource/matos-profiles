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
public class IccCardApplication
{
  // Classes

  public static enum AppType
  {
    // Enum Constants

    APPTYPE_UNKNOWN()
, APPTYPE_SIM()
, APPTYPE_USIM()
, APPTYPE_RUIM()
, APPTYPE_CSIM()
, APPTYPE_ISIM()
;
    // Fields

    // Constructors

    private AppType(){
    }
    // Methods

  }
  public static enum AppState
  {
    // Enum Constants

    APPSTATE_UNKNOWN()
, APPSTATE_DETECTED()
, APPSTATE_PIN()
, APPSTATE_PUK()
, APPSTATE_SUBSCRIPTION_PERSO()
, APPSTATE_READY()
;
    // Fields

    // Constructors

    private AppState(){
    }
    // Methods

  }
  public static enum PersoSubState
  {
    // Enum Constants

    PERSOSUBSTATE_UNKNOWN()
, PERSOSUBSTATE_IN_PROGRESS()
, PERSOSUBSTATE_READY()
, PERSOSUBSTATE_SIM_NETWORK()
, PERSOSUBSTATE_SIM_NETWORK_SUBSET()
, PERSOSUBSTATE_SIM_CORPORATE()
, PERSOSUBSTATE_SIM_SERVICE_PROVIDER()
, PERSOSUBSTATE_SIM_SIM()
, PERSOSUBSTATE_SIM_NETWORK_PUK()
, PERSOSUBSTATE_SIM_NETWORK_SUBSET_PUK()
, PERSOSUBSTATE_SIM_CORPORATE_PUK()
, PERSOSUBSTATE_SIM_SERVICE_PROVIDER_PUK()
, PERSOSUBSTATE_SIM_SIM_PUK()
, PERSOSUBSTATE_RUIM_NETWORK1()
, PERSOSUBSTATE_RUIM_NETWORK2()
, PERSOSUBSTATE_RUIM_HRPD()
, PERSOSUBSTATE_RUIM_CORPORATE()
, PERSOSUBSTATE_RUIM_SERVICE_PROVIDER()
, PERSOSUBSTATE_RUIM_RUIM()
, PERSOSUBSTATE_RUIM_NETWORK1_PUK()
, PERSOSUBSTATE_RUIM_NETWORK2_PUK()
, PERSOSUBSTATE_RUIM_HRPD_PUK()
, PERSOSUBSTATE_RUIM_CORPORATE_PUK()
, PERSOSUBSTATE_RUIM_SERVICE_PROVIDER_PUK()
, PERSOSUBSTATE_RUIM_RUIM_PUK()
;
    // Fields

    // Constructors

    private PersoSubState(){
    }
    // Methods

  }
  // Fields

  public IccCardApplication.AppType app_type;

  public IccCardApplication.AppState app_state;

  public IccCardApplication.PersoSubState perso_substate;

  public java.lang.String aid;

  public java.lang.String app_label;

  public int pin1_replaced;

  public IccCardStatus.PinState pin1;

  public IccCardStatus.PinState pin2;

  // Constructors

  public IccCardApplication(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
}
