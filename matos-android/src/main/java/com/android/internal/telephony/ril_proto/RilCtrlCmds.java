package com.android.internal.telephony.ril_proto;

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
public final class RilCtrlCmds
{
  // Classes

  public static final class CtrlReqRadioState
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int STATE_FIELD_NUMBER = 1;

    // Constructors

    public CtrlReqRadioState(){
      super();
    }
    // Methods

    public final RilCtrlCmds.CtrlReqRadioState clear(){
      return (RilCtrlCmds.CtrlReqRadioState) null;
    }
    public int getState(){
      return 0;
    }
    public RilCtrlCmds.CtrlReqRadioState setState(int arg1){
      return (RilCtrlCmds.CtrlReqRadioState) null;
    }
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro arg1) throws java.io.IOException{
    }
    public final boolean isInitialized(){
      return false;
    }
    public int getCachedSize(){
      return 0;
    }
    public int getSerializedSize(){
      return 0;
    }
    public RilCtrlCmds.CtrlReqRadioState mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlReqRadioState) null;
    }
    public static RilCtrlCmds.CtrlReqRadioState parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCtrlCmds.CtrlReqRadioState) null;
    }
    public static RilCtrlCmds.CtrlReqRadioState parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlReqRadioState) null;
    }
    public RilCtrlCmds.CtrlReqRadioState clearState(){
      return (RilCtrlCmds.CtrlReqRadioState) null;
    }
    public boolean hasState(){
      return false;
    }
  }
  public static final class CtrlRspRadioState
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int STATE_FIELD_NUMBER = 1;

    // Constructors

    public CtrlRspRadioState(){
      super();
    }
    // Methods

    public final RilCtrlCmds.CtrlRspRadioState clear(){
      return (RilCtrlCmds.CtrlRspRadioState) null;
    }
    public int getState(){
      return 0;
    }
    public RilCtrlCmds.CtrlRspRadioState setState(int arg1){
      return (RilCtrlCmds.CtrlRspRadioState) null;
    }
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro arg1) throws java.io.IOException{
    }
    public final boolean isInitialized(){
      return false;
    }
    public int getCachedSize(){
      return 0;
    }
    public int getSerializedSize(){
      return 0;
    }
    public RilCtrlCmds.CtrlRspRadioState mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlRspRadioState) null;
    }
    public static RilCtrlCmds.CtrlRspRadioState parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCtrlCmds.CtrlRspRadioState) null;
    }
    public static RilCtrlCmds.CtrlRspRadioState parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlRspRadioState) null;
    }
    public RilCtrlCmds.CtrlRspRadioState clearState(){
      return (RilCtrlCmds.CtrlRspRadioState) null;
    }
    public boolean hasState(){
      return false;
    }
  }
  public static final class CtrlReqSetMTCall
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int PHONE_NUMBER_FIELD_NUMBER = 1;

    // Constructors

    public CtrlReqSetMTCall(){
      super();
    }
    // Methods

    public final RilCtrlCmds.CtrlReqSetMTCall clear(){
      return (RilCtrlCmds.CtrlReqSetMTCall) null;
    }
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro arg1) throws java.io.IOException{
    }
    public RilCtrlCmds.CtrlReqSetMTCall setPhoneNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("phoneNumber") java.lang.String arg1){
      return (RilCtrlCmds.CtrlReqSetMTCall) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("phoneNumber")
    public java.lang.String getPhoneNumber(){
      return (java.lang.String) null;
    }
    public final boolean isInitialized(){
      return false;
    }
    public int getCachedSize(){
      return 0;
    }
    public int getSerializedSize(){
      return 0;
    }
    public RilCtrlCmds.CtrlReqSetMTCall mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlReqSetMTCall) null;
    }
    public static RilCtrlCmds.CtrlReqSetMTCall parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCtrlCmds.CtrlReqSetMTCall) null;
    }
    public static RilCtrlCmds.CtrlReqSetMTCall parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlReqSetMTCall) null;
    }
    public boolean hasPhoneNumber(){
      return false;
    }
    public RilCtrlCmds.CtrlReqSetMTCall clearPhoneNumber(){
      return (RilCtrlCmds.CtrlReqSetMTCall) null;
    }
  }
  public static final class CtrlHangupConnRemote
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int CONNECTION_ID_FIELD_NUMBER = 1;

    public static final int CALL_FAIL_CAUSE_FIELD_NUMBER = 2;

    // Constructors

    public CtrlHangupConnRemote(){
      super();
    }
    // Methods

    public final RilCtrlCmds.CtrlHangupConnRemote clear(){
      return (RilCtrlCmds.CtrlHangupConnRemote) null;
    }
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro arg1) throws java.io.IOException{
    }
    public final boolean isInitialized(){
      return false;
    }
    public int getCachedSize(){
      return 0;
    }
    public int getSerializedSize(){
      return 0;
    }
    public RilCtrlCmds.CtrlHangupConnRemote mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlHangupConnRemote) null;
    }
    public static RilCtrlCmds.CtrlHangupConnRemote parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCtrlCmds.CtrlHangupConnRemote) null;
    }
    public static RilCtrlCmds.CtrlHangupConnRemote parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlHangupConnRemote) null;
    }
    public int getConnectionId(){
      return 0;
    }
    public RilCtrlCmds.CtrlHangupConnRemote setConnectionId(int arg1){
      return (RilCtrlCmds.CtrlHangupConnRemote) null;
    }
    public boolean hasConnectionId(){
      return false;
    }
    public boolean hasCallFailCause(){
      return false;
    }
    public RilCtrlCmds.CtrlHangupConnRemote clearConnectionId(){
      return (RilCtrlCmds.CtrlHangupConnRemote) null;
    }
    public int getCallFailCause(){
      return 0;
    }
    public RilCtrlCmds.CtrlHangupConnRemote setCallFailCause(int arg1){
      return (RilCtrlCmds.CtrlHangupConnRemote) null;
    }
    public RilCtrlCmds.CtrlHangupConnRemote clearCallFailCause(){
      return (RilCtrlCmds.CtrlHangupConnRemote) null;
    }
  }
  public static final class CtrlSetCallTransitionFlag
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int FLAG_FIELD_NUMBER = 1;

    // Constructors

    public CtrlSetCallTransitionFlag(){
      super();
    }
    // Methods

    public final RilCtrlCmds.CtrlSetCallTransitionFlag clear(){
      return (RilCtrlCmds.CtrlSetCallTransitionFlag) null;
    }
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro arg1) throws java.io.IOException{
    }
    public final boolean isInitialized(){
      return false;
    }
    public int getCachedSize(){
      return 0;
    }
    public int getSerializedSize(){
      return 0;
    }
    public RilCtrlCmds.CtrlSetCallTransitionFlag mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlSetCallTransitionFlag) null;
    }
    public static RilCtrlCmds.CtrlSetCallTransitionFlag parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCtrlCmds.CtrlSetCallTransitionFlag) null;
    }
    public static RilCtrlCmds.CtrlSetCallTransitionFlag parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlSetCallTransitionFlag) null;
    }
    public RilCtrlCmds.CtrlSetCallTransitionFlag setFlag(boolean arg1){
      return (RilCtrlCmds.CtrlSetCallTransitionFlag) null;
    }
    public boolean hasFlag(){
      return false;
    }
    public boolean getFlag(){
      return false;
    }
    public RilCtrlCmds.CtrlSetCallTransitionFlag clearFlag(){
      return (RilCtrlCmds.CtrlSetCallTransitionFlag) null;
    }
  }
  public static final class CtrlReqAddDialingCall
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int PHONE_NUMBER_FIELD_NUMBER = 1;

    // Constructors

    public CtrlReqAddDialingCall(){
      super();
    }
    // Methods

    public final RilCtrlCmds.CtrlReqAddDialingCall clear(){
      return (RilCtrlCmds.CtrlReqAddDialingCall) null;
    }
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro arg1) throws java.io.IOException{
    }
    public RilCtrlCmds.CtrlReqAddDialingCall setPhoneNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("phoneNumber") java.lang.String arg1){
      return (RilCtrlCmds.CtrlReqAddDialingCall) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("phoneNumber")
    public java.lang.String getPhoneNumber(){
      return (java.lang.String) null;
    }
    public final boolean isInitialized(){
      return false;
    }
    public int getCachedSize(){
      return 0;
    }
    public int getSerializedSize(){
      return 0;
    }
    public RilCtrlCmds.CtrlReqAddDialingCall mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlReqAddDialingCall) null;
    }
    public static RilCtrlCmds.CtrlReqAddDialingCall parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCtrlCmds.CtrlReqAddDialingCall) null;
    }
    public static RilCtrlCmds.CtrlReqAddDialingCall parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCtrlCmds.CtrlReqAddDialingCall) null;
    }
    public boolean hasPhoneNumber(){
      return false;
    }
    public RilCtrlCmds.CtrlReqAddDialingCall clearPhoneNumber(){
      return (RilCtrlCmds.CtrlReqAddDialingCall) null;
    }
  }
  // Fields

  public static final int CTRL_CMD_ECHO = 0;

  public static final int CTRL_CMD_GET_RADIO_STATE = 1;

  public static final int CTRL_CMD_SET_RADIO_STATE = 2;

  public static final int CTRL_CMD_SET_MT_CALL = 1001;

  public static final int CTRL_CMD_HANGUP_CONN_REMOTE = 1002;

  public static final int CTRL_CMD_SET_CALL_TRANSITION_FLAG = 1003;

  public static final int CTRL_CMD_SET_CALL_ALERT = 1004;

  public static final int CTRL_CMD_SET_CALL_ACTIVE = 1005;

  public static final int CTRL_CMD_ADD_DIALING_CALL = 1006;

  public static final int CTRL_STATUS_OK = 0;

  public static final int CTRL_STATUS_ERR = 1;

  // Constructors

  private RilCtrlCmds(){
  }
}
