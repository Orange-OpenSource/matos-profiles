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


public interface TelephonyProperties
{
  // Fields

  public static final java.lang.String PROPERTY_BASEBAND_VERSION = "gsm.version.baseband";

  public static final java.lang.String PROPERTY_RIL_IMPL = "gsm.version.ril-impl";

  public static final java.lang.String PROPERTY_OPERATOR_ALPHA = "gsm.operator.alpha";

  public static final java.lang.String PROPERTY_OPERATOR_NUMERIC = "gsm.operator.numeric";

  public static final java.lang.String PROPERTY_OPERATOR_ISMANUAL = "operator.ismanual";

  public static final java.lang.String PROPERTY_OPERATOR_ISROAMING = "gsm.operator.isroaming";

  public static final java.lang.String PROPERTY_OPERATOR_ISO_COUNTRY = "gsm.operator.iso-country";

  public static final java.lang.String PROPERTY_LTE_ON_CDMA_PRODUCT_TYPE = "telephony.lteOnCdmaProductType";

  public static final java.lang.String PROPERTY_LTE_ON_CDMA_DEVICE = "telephony.lteOnCdmaDevice";

  public static final java.lang.String CURRENT_ACTIVE_PHONE = "gsm.current.phone-type";

  public static final java.lang.String PROPERTY_SIM_STATE = "gsm.sim.state";

  public static final java.lang.String PROPERTY_ICC_OPERATOR_NUMERIC = "gsm.sim.operator.numeric";

  public static final java.lang.String PROPERTY_ICC_OPERATOR_ALPHA = "gsm.sim.operator.alpha";

  public static final java.lang.String PROPERTY_ICC_OPERATOR_ISO_COUNTRY = "gsm.sim.operator.iso-country";

  public static final java.lang.String PROPERTY_DATA_NETWORK_TYPE = "gsm.network.type";

  public static final java.lang.String PROPERTY_INECM_MODE = "ril.cdma.inecmmode";

  public static final java.lang.String PROPERTY_ECM_EXIT_TIMER = "ro.cdma.ecmexittimer";

  public static final java.lang.String PROPERTY_IDP_STRING = "ro.cdma.idpstring";

  public static final java.lang.String PROPERTY_OTASP_NUM_SCHEMA = "ro.cdma.otaspnumschema";

  public static final java.lang.String PROPERTY_DISABLE_CALL = "ro.telephony.disable-call";

  public static final java.lang.String PROPERTY_RIL_SENDS_MULTIPLE_CALL_RING = "ro.telephony.call_ring.multiple";

  public static final java.lang.String PROPERTY_CALL_RING_DELAY = "ro.telephony.call_ring.delay";

  public static final java.lang.String PROPERTY_CDMA_MSG_ID = "persist.radio.cdma.msgid";

  public static final java.lang.String PROPERTY_WAKE_LOCK_TIMEOUT = "ro.ril.wake_lock_timeout";

  public static final java.lang.String PROPERTY_RESET_ON_RADIO_TECH_CHANGE = "persist.radio.reset_on_switch";

  public static final java.lang.String PROPERTY_SMS_RECEIVE = "telephony.sms.receive";

  public static final java.lang.String PROPERTY_SMS_SEND = "telephony.sms.send";

  public static final java.lang.String PROPERTY_TEST_CSIM = "persist.radio.test-csim";

}
