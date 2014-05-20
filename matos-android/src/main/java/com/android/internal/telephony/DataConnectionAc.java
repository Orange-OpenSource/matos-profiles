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
public class DataConnectionAc
  extends com.android.internal.util.AsyncChannel{
  // Classes

  public static enum LinkPropertyChangeAction
  {
    // Enum Constants

    NONE()
, CHANGED()
, RESET()
;
    // Fields

    // Constructors

    private LinkPropertyChangeAction(){
    }
    // Methods

    public static DataConnectionAc.LinkPropertyChangeAction fromInt(int arg1){
      return (DataConnectionAc.LinkPropertyChangeAction) null;
    }
  }
  // Fields

  public DataConnection dataConnection;

  public static final int BASE = 266240;

  public static final int REQ_IS_INACTIVE = 266240;

  public static final int RSP_IS_INACTIVE = 266241;

  public static final int REQ_GET_CID = 266242;

  public static final int RSP_GET_CID = 266243;

  public static final int REQ_GET_APNSETTING = 266244;

  public static final int RSP_GET_APNSETTING = 266245;

  public static final int REQ_GET_LINK_PROPERTIES = 266246;

  public static final int RSP_GET_LINK_PROPERTIES = 266247;

  public static final int REQ_SET_LINK_PROPERTIES_HTTP_PROXY = 266248;

  public static final int RSP_SET_LINK_PROPERTIES_HTTP_PROXY = 266249;

  public static final int REQ_GET_LINK_CAPABILITIES = 266250;

  public static final int RSP_GET_LINK_CAPABILITIES = 266251;

  public static final int REQ_UPDATE_LINK_PROPERTIES_DATA_CALL_STATE = 266252;

  public static final int RSP_UPDATE_LINK_PROPERTIES_DATA_CALL_STATE = 266253;

  public static final int REQ_RESET = 266254;

  public static final int RSP_RESET = 266255;

  public static final int REQ_GET_REFCOUNT = 266256;

  public static final int RSP_GET_REFCOUNT = 266257;

  public static final int REQ_ADD_APNCONTEXT = 266258;

  public static final int RSP_ADD_APNCONTEXT = 266259;

  public static final int REQ_REMOVE_APNCONTEXT = 266260;

  public static final int RSP_REMOVE_APNCONTEXT = 266261;

  public static final int REQ_GET_APNCONTEXT_LIST = 266262;

  public static final int RSP_GET_APNCONTEXT_LIST = 266263;

  public static final int REQ_SET_RECONNECT_INTENT = 266264;

  public static final int RSP_SET_RECONNECT_INTENT = 266265;

  public static final int REQ_GET_RECONNECT_INTENT = 266266;

  public static final int RSP_GET_RECONNECT_INTENT = 266267;

  // Constructors

  public DataConnectionAc(DataConnection arg1, java.lang.String arg2){
    super();
  }
  // Methods

  public void resetSync(){
  }
  public void addApnContextSync(ApnContext arg1){
  }
  public void removeApnContextSync(ApnContext arg1){
  }
  public boolean isInactiveSync(){
    return false;
  }
  public android.net.LinkProperties getLinkPropertiesSync(){
    return (android.net.LinkProperties) null;
  }
  public android.net.LinkCapabilities getLinkCapabilitiesSync(){
    return (android.net.LinkCapabilities) null;
  }
  public java.util.Collection<ApnContext> getApnListSync(){
    return (java.util.Collection) null;
  }
  public void setReconnectIntentSync(android.app.PendingIntent arg1){
  }
  public android.app.PendingIntent getReconnectIntentSync(){
    return (android.app.PendingIntent) null;
  }
  public ApnSetting getApnSettingSync(){
    return (ApnSetting) null;
  }
  public int getRefCountSync(){
    return 0;
  }
  public int getCidSync(){
    return 0;
  }
  public DataConnection.UpdateLinkPropertyResult updateLinkPropertiesDataCallStateSync(DataCallState arg1){
    return (DataConnection.UpdateLinkPropertyResult) null;
  }
  public void setLinkPropertiesHttpProxySync(android.net.ProxyProperties arg1){
  }
  public void reqIsInactive(){
  }
  public boolean rspIsInactive(android.os.Message arg1){
    return false;
  }
  public void reqCid(){
  }
  public int rspCid(android.os.Message arg1){
    return 0;
  }
  public void reqRefCount(){
  }
  public int rspRefCount(android.os.Message arg1){
    return 0;
  }
  public void reqApnSetting(){
  }
  public ApnSetting rspApnSetting(android.os.Message arg1){
    return (ApnSetting) null;
  }
  public void reqLinkProperties(){
  }
  public android.net.LinkProperties rspLinkProperties(android.os.Message arg1){
    return (android.net.LinkProperties) null;
  }
  public void reqSetLinkPropertiesHttpProxy(android.net.ProxyProperties arg1){
  }
  public void reqUpdateLinkPropertiesDataCallState(DataCallState arg1){
  }
  public DataConnection.UpdateLinkPropertyResult rspUpdateLinkPropertiesDataCallState(android.os.Message arg1){
    return (DataConnection.UpdateLinkPropertyResult) null;
  }
  public void reqLinkCapabilities(){
  }
  public android.net.LinkCapabilities rspLinkCapabilities(android.os.Message arg1){
    return (android.net.LinkCapabilities) null;
  }
  public void reqReset(){
  }
  public void reqAddApnContext(ApnContext arg1){
  }
  public void reqRemomveApnContext(ApnContext arg1){
  }
  public void reqGetApnList(ApnContext arg1){
  }
  public java.util.Collection<ApnContext> rspApnList(android.os.Message arg1){
    return (java.util.Collection) null;
  }
  public void reqSetReconnectIntent(android.app.PendingIntent arg1){
  }
  public void reqGetReconnectIntent(){
  }
  public android.app.PendingIntent rspReconnectIntent(android.os.Message arg1){
    return (android.app.PendingIntent) null;
  }
}
