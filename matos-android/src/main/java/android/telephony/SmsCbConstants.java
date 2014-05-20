package android.telephony;

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


public interface SmsCbConstants
{
  // Fields

  public static final int MESSAGE_ID_PWS_FIRST_IDENTIFIER = 4352;

  public static final int MESSAGE_ID_ETWS_TYPE_MASK = 65528;

  public static final int MESSAGE_ID_ETWS_TYPE = 4352;

  public static final int MESSAGE_ID_ETWS_EARTHQUAKE_WARNING = 4352;

  public static final int MESSAGE_ID_ETWS_TSUNAMI_WARNING = 4353;

  public static final int MESSAGE_ID_ETWS_EARTHQUAKE_AND_TSUNAMI_WARNING = 4354;

  public static final int MESSAGE_ID_ETWS_TEST_MESSAGE = 4355;

  public static final int MESSAGE_ID_ETWS_OTHER_EMERGENCY_TYPE = 4356;

  public static final int MESSAGE_ID_CMAS_FIRST_IDENTIFIER = 4370;

  public static final int MESSAGE_ID_CMAS_ALERT_PRESIDENTIAL_LEVEL = 4370;

  public static final int MESSAGE_ID_CMAS_ALERT_EXTREME_IMMEDIATE_OBSERVED = 4371;

  public static final int MESSAGE_ID_CMAS_ALERT_EXTREME_IMMEDIATE_LIKELY = 4372;

  public static final int MESSAGE_ID_CMAS_ALERT_EXTREME_EXPECTED_OBSERVED = 4373;

  public static final int MESSAGE_ID_CMAS_ALERT_EXTREME_EXPECTED_LIKELY = 4374;

  public static final int MESSAGE_ID_CMAS_ALERT_SEVERE_IMMEDIATE_OBSERVED = 4375;

  public static final int MESSAGE_ID_CMAS_ALERT_SEVERE_IMMEDIATE_LIKELY = 4376;

  public static final int MESSAGE_ID_CMAS_ALERT_SEVERE_EXPECTED_OBSERVED = 4377;

  public static final int MESSAGE_ID_CMAS_ALERT_SEVERE_EXPECTED_LIKELY = 4378;

  public static final int MESSAGE_ID_CMAS_ALERT_CHILD_ABDUCTION_EMERGENCY = 4379;

  public static final int MESSAGE_ID_CMAS_ALERT_REQUIRED_MONTHLY_TEST = 4380;

  public static final int MESSAGE_ID_CMAS_ALERT_EXERCISE = 4381;

  public static final int MESSAGE_ID_CMAS_ALERT_OPERATOR_DEFINED_USE = 4382;

  public static final int MESSAGE_ID_CMAS_LAST_IDENTIFIER = 4399;

  public static final int MESSAGE_ID_PWS_LAST_IDENTIFIER = 6399;

  public static final int MESSAGE_CODE_ETWS_ACTIVATE_POPUP = 256;

  public static final int MESSAGE_CODE_ETWS_EMERGENCY_USER_ALERT = 512;

  public static final int ETWS_WARNING_TYPE_EARTHQUAKE = 0;

  public static final int ETWS_WARNING_TYPE_TSUNAMI = 1;

  public static final int ETWS_WARNING_TYPE_EARTHQUAKE_AND_TSUNAMI = 2;

  public static final int ETWS_WARNING_TYPE_TEST = 3;

  public static final int ETWS_WARNING_TYPE_OTHER = 4;

}
