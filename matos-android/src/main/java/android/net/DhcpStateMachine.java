package android.net;

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


public class DhcpStateMachine
  extends com.android.internal.util.StateMachine{
  // Fields

  public static final int CMD_START_DHCP = 196609;

  public static final int CMD_STOP_DHCP = 196610;

  public static final int CMD_RENEW_DHCP = 196611;

  public static final int CMD_PRE_DHCP_ACTION = 196612;

  public static final int CMD_POST_DHCP_ACTION = 196613;

  public static final int CMD_PRE_DHCP_ACTION_COMPLETE = 196614;

  public static final int DHCP_SUCCESS = 1;

  public static final int DHCP_FAILURE = 2;

  // Constructors

  private DhcpStateMachine(android.content.Context arg1, com.android.internal.util.StateMachine arg2, java.lang.String arg3){
    super((java.lang.String) null);
  }
  // Methods

  public static DhcpStateMachine makeDhcpStateMachine(android.content.Context arg1, com.android.internal.util.StateMachine arg2, java.lang.String arg3){
    return (DhcpStateMachine) null;
  }
  public void registerForPreDhcpNotification(){
  }
}
