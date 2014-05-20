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

import com.francetelecom.rd.stubs.annotation.UseRule;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class NetworkPolicyManager
{
  // Fields

  public static final int POLICY_NONE = 0;

  public static final int POLICY_REJECT_METERED_BACKGROUND = 1;

  public static final int RULE_ALLOW_ALL = 0;

  public static final int RULE_REJECT_METERED = 1;

  public static final java.lang.String EXTRA_NETWORK_TEMPLATE = "android.net.NETWORK_TEMPLATE";

  // Constructors

  public NetworkPolicyManager(INetworkPolicyManager arg1){
  }
  // Methods

  public static NetworkPolicyManager getSystemService(android.content.Context arg1){
    return (NetworkPolicyManager) null;
  }
  public void registerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("INetworkPolicyListener") INetworkPolicyListener arg1){
  }
  public void unregisterListener(INetworkPolicyListener arg1){
  }
  public void setUidPolicy(int arg1, int arg2){
  }
  public int getUidPolicy(int arg1){
    return 0;
  }
  @UseRule("NetworkPolicyManager.setNetworkPolicies")
  public void setNetworkPolicies(@com.francetelecom.rd.stubs.annotation.FieldSet("mNetworkPolicies") NetworkPolicy [] arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mNetworkPolicies")
  public NetworkPolicy [] getNetworkPolicies(){
    return (NetworkPolicy []) null;
  }
  public static long computeLastCycleBoundary(long arg1, NetworkPolicy arg2){
    return 0l;
  }
  public static long computeNextCycleBoundary(long arg1, NetworkPolicy arg2){
    return 0l;
  }
  public static void snapToCycleDay(android.text.format.Time arg1, int arg2){
  }
  public static boolean isUidValidForPolicy(android.content.Context arg1, int arg2){
    return false;
  }
  public static void dumpPolicy(java.io.PrintWriter arg1, int arg2){
  }
  public static void dumpRules(java.io.PrintWriter arg1, int arg2){
  }
}
