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
public final class RilCmds
{
  // Classes

  public static final class RilAppStatus
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int APP_TYPE_FIELD_NUMBER = 1;

    public static final int APP_STATE_FIELD_NUMBER = 2;

    public static final int PERSO_SUBSTATE_FIELD_NUMBER = 3;

    public static final int AID_FIELD_NUMBER = 4;

    public static final int APP_LABEL_FIELD_NUMBER = 5;

    public static final int PIN1_REPLACED_FIELD_NUMBER = 6;

    public static final int PIN1_FIELD_NUMBER = 7;

    public static final int PIN2_FIELD_NUMBER = 8;

    // Constructors

    public RilAppStatus(){
      super();
    }
    // Methods

    public final RilCmds.RilAppStatus clear(){
      return (RilCmds.RilAppStatus) null;
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
    public RilCmds.RilAppStatus mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RilAppStatus) null;
    }
    public static RilCmds.RilAppStatus parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RilAppStatus) null;
    }
    public static RilCmds.RilAppStatus parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RilAppStatus) null;
    }
    public boolean hasAppType(){
      return false;
    }
    public boolean hasAppState(){
      return false;
    }
    public boolean hasPersoSubstate(){
      return false;
    }
    public boolean hasAid(){
      return false;
    }
    public boolean hasAppLabel(){
      return false;
    }
    public boolean hasPin1Replaced(){
      return false;
    }
    public boolean hasPin1(){
      return false;
    }
    public boolean hasPin2(){
      return false;
    }
    public int getAppType(){
      return 0;
    }
    public RilCmds.RilAppStatus setAppType(int arg1){
      return (RilCmds.RilAppStatus) null;
    }
    public RilCmds.RilAppStatus clearAppType(){
      return (RilCmds.RilAppStatus) null;
    }
    public int getAppState(){
      return 0;
    }
    public RilCmds.RilAppStatus setAppState(int arg1){
      return (RilCmds.RilAppStatus) null;
    }
    public RilCmds.RilAppStatus clearAppState(){
      return (RilCmds.RilAppStatus) null;
    }
    public int getPersoSubstate(){
      return 0;
    }
    public RilCmds.RilAppStatus setPersoSubstate(int arg1){
      return (RilCmds.RilAppStatus) null;
    }
    public RilCmds.RilAppStatus clearPersoSubstate(){
      return (RilCmds.RilAppStatus) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("aid")
    public java.lang.String getAid(){
      return (java.lang.String) null;
    }
    public RilCmds.RilAppStatus setAid(@com.francetelecom.rd.stubs.annotation.FieldSet("aid") java.lang.String arg1){
      return (RilCmds.RilAppStatus) null;
    }
    public RilCmds.RilAppStatus clearAid(){
      return (RilCmds.RilAppStatus) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("appLabel")
    public java.lang.String getAppLabel(){
      return (java.lang.String) null;
    }
    public RilCmds.RilAppStatus setAppLabel(@com.francetelecom.rd.stubs.annotation.FieldSet("appLabel") java.lang.String arg1){
      return (RilCmds.RilAppStatus) null;
    }
    public RilCmds.RilAppStatus clearAppLabel(){
      return (RilCmds.RilAppStatus) null;
    }
    public int getPin1Replaced(){
      return 0;
    }
    public RilCmds.RilAppStatus setPin1Replaced(int arg1){
      return (RilCmds.RilAppStatus) null;
    }
    public RilCmds.RilAppStatus clearPin1Replaced(){
      return (RilCmds.RilAppStatus) null;
    }
    public int getPin1(){
      return 0;
    }
    public RilCmds.RilAppStatus setPin1(int arg1){
      return (RilCmds.RilAppStatus) null;
    }
    public RilCmds.RilAppStatus clearPin1(){
      return (RilCmds.RilAppStatus) null;
    }
    public int getPin2(){
      return 0;
    }
    public RilCmds.RilAppStatus setPin2(int arg1){
      return (RilCmds.RilAppStatus) null;
    }
    public RilCmds.RilAppStatus clearPin2(){
      return (RilCmds.RilAppStatus) null;
    }
  }
  public static final class RilCardStatus
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int CARD_STATE_FIELD_NUMBER = 1;

    public static final int UNIVERSAL_PIN_STATE_FIELD_NUMBER = 2;

    public static final int GSM_UMTS_SUBSCRIPTION_APP_INDEX_FIELD_NUMBER = 3;

    public static final int CDMA_SUBSCRIPTION_APP_INDEX_FIELD_NUMBER = 4;

    public static final int IMS_SUBSCRIPTION_APP_INDEX_FIELD_NUMBER = 5;

    public static final int NUM_APPLICATIONS_FIELD_NUMBER = 6;

    public static final int APPLICATIONS_FIELD_NUMBER = 7;

    // Constructors

    public RilCardStatus(){
      super();
    }
    // Methods

    public final RilCmds.RilCardStatus clear(){
      return (RilCmds.RilCardStatus) null;
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
    public RilCmds.RilCardStatus mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RilCardStatus) null;
    }
    public static RilCmds.RilCardStatus parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RilCardStatus) null;
    }
    public static RilCmds.RilCardStatus parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus setCardState(int arg1){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus setUniversalPinState(int arg1){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus setGsmUmtsSubscriptionAppIndex(int arg1){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus setCdmaSubscriptionAppIndex(int arg1){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus setImsSubscriptionAppIndex(int arg1){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus setNumApplications(int arg1){
      return (RilCmds.RilCardStatus) null;
    }
    public int getCardState(){
      return 0;
    }
    public int getCdmaSubscriptionAppIndex(){
      return 0;
    }
    public int getGsmUmtsSubscriptionAppIndex(){
      return 0;
    }
    public int getNumApplications(){
      return 0;
    }
    public boolean hasCardState(){
      return false;
    }
    public boolean hasUniversalPinState(){
      return false;
    }
    public boolean hasGsmUmtsSubscriptionAppIndex(){
      return false;
    }
    public boolean hasCdmaSubscriptionAppIndex(){
      return false;
    }
    public boolean hasImsSubscriptionAppIndex(){
      return false;
    }
    public boolean hasNumApplications(){
      return false;
    }
    public RilCmds.RilCardStatus clearCardState(){
      return (RilCmds.RilCardStatus) null;
    }
    public int getUniversalPinState(){
      return 0;
    }
    public RilCmds.RilCardStatus clearUniversalPinState(){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus clearGsmUmtsSubscriptionAppIndex(){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus clearCdmaSubscriptionAppIndex(){
      return (RilCmds.RilCardStatus) null;
    }
    public int getImsSubscriptionAppIndex(){
      return 0;
    }
    public RilCmds.RilCardStatus clearImsSubscriptionAppIndex(){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus clearNumApplications(){
      return (RilCmds.RilCardStatus) null;
    }
    public java.util.List<RilCmds.RilAppStatus> getApplicationsList(){
      return (java.util.List) null;
    }
    public int getApplicationsCount(){
      return 0;
    }
    public RilCmds.RilAppStatus getApplications(int arg1){
      return (RilCmds.RilAppStatus) null;
    }
    public RilCmds.RilCardStatus setApplications(int arg1, RilCmds.RilAppStatus arg2){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus addApplications(RilCmds.RilAppStatus arg1){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RilCardStatus clearApplications(){
      return (RilCmds.RilCardStatus) null;
    }
  }
  public static final class RilUusInfo
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int UUS_TYPE_FIELD_NUMBER = 1;

    public static final int UUS_DCS_FIELD_NUMBER = 2;

    public static final int UUS_LENGTH_FIELD_NUMBER = 3;

    public static final int UUS_DATA_FIELD_NUMBER = 4;

    // Constructors

    public RilUusInfo(){
      super();
    }
    // Methods

    public final RilCmds.RilUusInfo clear(){
      return (RilCmds.RilUusInfo) null;
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
    public RilCmds.RilUusInfo mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RilUusInfo) null;
    }
    public static RilCmds.RilUusInfo parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RilUusInfo) null;
    }
    public static RilCmds.RilUusInfo parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RilUusInfo) null;
    }
    public boolean hasUusType(){
      return false;
    }
    public boolean hasUusDcs(){
      return false;
    }
    public boolean hasUusLength(){
      return false;
    }
    public boolean hasUusData(){
      return false;
    }
    public int getUusType(){
      return 0;
    }
    public RilCmds.RilUusInfo setUusType(int arg1){
      return (RilCmds.RilUusInfo) null;
    }
    public RilCmds.RilUusInfo clearUusType(){
      return (RilCmds.RilUusInfo) null;
    }
    public int getUusDcs(){
      return 0;
    }
    public RilCmds.RilUusInfo setUusDcs(int arg1){
      return (RilCmds.RilUusInfo) null;
    }
    public RilCmds.RilUusInfo clearUusDcs(){
      return (RilCmds.RilUusInfo) null;
    }
    public int getUusLength(){
      return 0;
    }
    public RilCmds.RilUusInfo setUusLength(int arg1){
      return (RilCmds.RilUusInfo) null;
    }
    public RilCmds.RilUusInfo clearUusLength(){
      return (RilCmds.RilUusInfo) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("uusData")
    public java.lang.String getUusData(){
      return (java.lang.String) null;
    }
    public RilCmds.RilUusInfo setUusData(@com.francetelecom.rd.stubs.annotation.FieldSet("uusData") java.lang.String arg1){
      return (RilCmds.RilUusInfo) null;
    }
    public RilCmds.RilUusInfo clearUusData(){
      return (RilCmds.RilUusInfo) null;
    }
  }
  public static final class RilCall
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int STATE_FIELD_NUMBER = 1;

    public static final int INDEX_FIELD_NUMBER = 2;

    public static final int TOA_FIELD_NUMBER = 3;

    public static final int IS_MPTY_FIELD_NUMBER = 4;

    public static final int IS_MT_FIELD_NUMBER = 5;

    public static final int ALS_FIELD_NUMBER = 6;

    public static final int IS_VOICE_FIELD_NUMBER = 7;

    public static final int IS_VOICE_PRIVACY_FIELD_NUMBER = 8;

    public static final int NUMBER_FIELD_NUMBER = 9;

    public static final int NUMBER_PRESENTATION_FIELD_NUMBER = 10;

    public static final int NAME_FIELD_NUMBER = 11;

    public static final int NAME_PRESENTATION_FIELD_NUMBER = 12;

    public static final int UUS_INFO_FIELD_NUMBER = 13;

    // Constructors

    public RilCall(){
      super();
    }
    // Methods

    public final RilCmds.RilCall clear(){
      return (RilCmds.RilCall) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("name")
    public java.lang.String getName(){
      return (java.lang.String) null;
    }
    public int getState(){
      return 0;
    }
    public RilCmds.RilCall setName(@com.francetelecom.rd.stubs.annotation.FieldSet("name") java.lang.String arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall setState(int arg1){
      return (RilCmds.RilCall) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("number")
    public java.lang.String getNumber(){
      return (java.lang.String) null;
    }
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro arg1) throws java.io.IOException{
    }
    public int getIndex(){
      return 0;
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
    public RilCmds.RilCall mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RilCall) null;
    }
    public static RilCmds.RilCall parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RilCall) null;
    }
    public static RilCmds.RilCall parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearState(){
      return (RilCmds.RilCall) null;
    }
    public boolean hasState(){
      return false;
    }
    public RilCmds.RilCall setIndex(int arg1){
      return (RilCmds.RilCall) null;
    }
    public int getNumberPresentation(){
      return 0;
    }
    public RilCmds.RilCall setNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("number") java.lang.String arg1){
      return (RilCmds.RilCall) null;
    }
    public boolean hasUusInfo(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mRilUusInfo")
    public RilCmds.RilUusInfo getUusInfo(){
      return (RilCmds.RilUusInfo) null;
    }
    public RilCmds.RilCall setUusInfo(@com.francetelecom.rd.stubs.annotation.FieldSet("mRilUusInfo") RilCmds.RilUusInfo arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearUusInfo(){
      return (RilCmds.RilCall) null;
    }
    public boolean hasIndex(){
      return false;
    }
    public boolean hasToa(){
      return false;
    }
    public boolean hasIsMpty(){
      return false;
    }
    public boolean hasIsMt(){
      return false;
    }
    public boolean hasAls(){
      return false;
    }
    public boolean hasIsVoice(){
      return false;
    }
    public boolean hasIsVoicePrivacy(){
      return false;
    }
    public boolean hasNumber(){
      return false;
    }
    public boolean hasNumberPresentation(){
      return false;
    }
    public boolean hasName(){
      return false;
    }
    public boolean hasNamePresentation(){
      return false;
    }
    public RilCmds.RilCall clearIndex(){
      return (RilCmds.RilCall) null;
    }
    public int getToa(){
      return 0;
    }
    public RilCmds.RilCall setToa(int arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearToa(){
      return (RilCmds.RilCall) null;
    }
    public boolean getIsMpty(){
      return false;
    }
    public RilCmds.RilCall setIsMpty(boolean arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearIsMpty(){
      return (RilCmds.RilCall) null;
    }
    public boolean getIsMt(){
      return false;
    }
    public RilCmds.RilCall setIsMt(boolean arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearIsMt(){
      return (RilCmds.RilCall) null;
    }
    public int getAls(){
      return 0;
    }
    public RilCmds.RilCall setAls(int arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearAls(){
      return (RilCmds.RilCall) null;
    }
    public boolean getIsVoice(){
      return false;
    }
    public RilCmds.RilCall setIsVoice(boolean arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearIsVoice(){
      return (RilCmds.RilCall) null;
    }
    public boolean getIsVoicePrivacy(){
      return false;
    }
    public RilCmds.RilCall setIsVoicePrivacy(boolean arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearIsVoicePrivacy(){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearNumber(){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall setNumberPresentation(int arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearNumberPresentation(){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearName(){
      return (RilCmds.RilCall) null;
    }
    public int getNamePresentation(){
      return 0;
    }
    public RilCmds.RilCall setNamePresentation(int arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RilCall clearNamePresentation(){
      return (RilCmds.RilCall) null;
    }
  }
  public static final class RILGWSignalStrength
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int SIGNAL_STRENGTH_FIELD_NUMBER = 1;

    public static final int BIT_ERROR_RATE_FIELD_NUMBER = 2;

    // Constructors

    public RILGWSignalStrength(){
      super();
    }
    // Methods

    public final RilCmds.RILGWSignalStrength clear(){
      return (RilCmds.RILGWSignalStrength) null;
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
    public RilCmds.RILGWSignalStrength mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RILGWSignalStrength) null;
    }
    public static RilCmds.RILGWSignalStrength parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RILGWSignalStrength) null;
    }
    public static RilCmds.RILGWSignalStrength parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RILGWSignalStrength) null;
    }
    public int getSignalStrength(){
      return 0;
    }
    public boolean hasSignalStrength(){
      return false;
    }
    public RilCmds.RILGWSignalStrength setSignalStrength(int arg1){
      return (RilCmds.RILGWSignalStrength) null;
    }
    public RilCmds.RILGWSignalStrength clearSignalStrength(){
      return (RilCmds.RILGWSignalStrength) null;
    }
    public boolean hasBitErrorRate(){
      return false;
    }
    public int getBitErrorRate(){
      return 0;
    }
    public RilCmds.RILGWSignalStrength setBitErrorRate(int arg1){
      return (RilCmds.RILGWSignalStrength) null;
    }
    public RilCmds.RILGWSignalStrength clearBitErrorRate(){
      return (RilCmds.RILGWSignalStrength) null;
    }
  }
  public static final class RILCDMASignalStrength
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int DBM_FIELD_NUMBER = 1;

    public static final int ECIO_FIELD_NUMBER = 2;

    // Constructors

    public RILCDMASignalStrength(){
      super();
    }
    // Methods

    public final RilCmds.RILCDMASignalStrength clear(){
      return (RilCmds.RILCDMASignalStrength) null;
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
    public RilCmds.RILCDMASignalStrength mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RILCDMASignalStrength) null;
    }
    public static RilCmds.RILCDMASignalStrength parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RILCDMASignalStrength) null;
    }
    public static RilCmds.RILCDMASignalStrength parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RILCDMASignalStrength) null;
    }
    public int getDbm(){
      return 0;
    }
    public boolean hasDbm(){
      return false;
    }
    public boolean hasEcio(){
      return false;
    }
    public RilCmds.RILCDMASignalStrength setDbm(int arg1){
      return (RilCmds.RILCDMASignalStrength) null;
    }
    public RilCmds.RILCDMASignalStrength clearDbm(){
      return (RilCmds.RILCDMASignalStrength) null;
    }
    public int getEcio(){
      return 0;
    }
    public RilCmds.RILCDMASignalStrength setEcio(int arg1){
      return (RilCmds.RILCDMASignalStrength) null;
    }
    public RilCmds.RILCDMASignalStrength clearEcio(){
      return (RilCmds.RILCDMASignalStrength) null;
    }
  }
  public static final class RILEVDOSignalStrength
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int DBM_FIELD_NUMBER = 1;

    public static final int ECIO_FIELD_NUMBER = 2;

    public static final int SIGNAL_NOISE_RATIO_FIELD_NUMBER = 3;

    // Constructors

    public RILEVDOSignalStrength(){
      super();
    }
    // Methods

    public final RilCmds.RILEVDOSignalStrength clear(){
      return (RilCmds.RILEVDOSignalStrength) null;
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
    public RilCmds.RILEVDOSignalStrength mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RILEVDOSignalStrength) null;
    }
    public static RilCmds.RILEVDOSignalStrength parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RILEVDOSignalStrength) null;
    }
    public static RilCmds.RILEVDOSignalStrength parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RILEVDOSignalStrength) null;
    }
    public int getDbm(){
      return 0;
    }
    public boolean hasDbm(){
      return false;
    }
    public boolean hasEcio(){
      return false;
    }
    public RilCmds.RILEVDOSignalStrength setDbm(int arg1){
      return (RilCmds.RILEVDOSignalStrength) null;
    }
    public RilCmds.RILEVDOSignalStrength clearDbm(){
      return (RilCmds.RILEVDOSignalStrength) null;
    }
    public int getEcio(){
      return 0;
    }
    public RilCmds.RILEVDOSignalStrength setEcio(int arg1){
      return (RilCmds.RILEVDOSignalStrength) null;
    }
    public RilCmds.RILEVDOSignalStrength clearEcio(){
      return (RilCmds.RILEVDOSignalStrength) null;
    }
    public boolean hasSignalNoiseRatio(){
      return false;
    }
    public int getSignalNoiseRatio(){
      return 0;
    }
    public RilCmds.RILEVDOSignalStrength setSignalNoiseRatio(int arg1){
      return (RilCmds.RILEVDOSignalStrength) null;
    }
    public RilCmds.RILEVDOSignalStrength clearSignalNoiseRatio(){
      return (RilCmds.RILEVDOSignalStrength) null;
    }
  }
  public static final class RILLTESignalStrength
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int SIGNAL_STRENGTH_FIELD_NUMBER = 1;

    public static final int RSRP_FIELD_NUMBER = 2;

    public static final int RSRQ_FIELD_NUMBER = 3;

    public static final int RSSNR_FIELD_NUMBER = 4;

    public static final int CQI_FIELD_NUMBER = 5;

    // Constructors

    public RILLTESignalStrength(){
      super();
    }
    // Methods

    public final RilCmds.RILLTESignalStrength clear(){
      return (RilCmds.RILLTESignalStrength) null;
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
    public RilCmds.RILLTESignalStrength mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RILLTESignalStrength) null;
    }
    public static RilCmds.RILLTESignalStrength parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RILLTESignalStrength) null;
    }
    public static RilCmds.RILLTESignalStrength parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RILLTESignalStrength) null;
    }
    public int getSignalStrength(){
      return 0;
    }
    public boolean hasSignalStrength(){
      return false;
    }
    public boolean hasRsrp(){
      return false;
    }
    public boolean hasRsrq(){
      return false;
    }
    public boolean hasRssnr(){
      return false;
    }
    public boolean hasCqi(){
      return false;
    }
    public RilCmds.RILLTESignalStrength setSignalStrength(int arg1){
      return (RilCmds.RILLTESignalStrength) null;
    }
    public RilCmds.RILLTESignalStrength clearSignalStrength(){
      return (RilCmds.RILLTESignalStrength) null;
    }
    public int getRsrp(){
      return 0;
    }
    public RilCmds.RILLTESignalStrength setRsrp(int arg1){
      return (RilCmds.RILLTESignalStrength) null;
    }
    public RilCmds.RILLTESignalStrength clearRsrp(){
      return (RilCmds.RILLTESignalStrength) null;
    }
    public int getRsrq(){
      return 0;
    }
    public RilCmds.RILLTESignalStrength setRsrq(int arg1){
      return (RilCmds.RILLTESignalStrength) null;
    }
    public RilCmds.RILLTESignalStrength clearRsrq(){
      return (RilCmds.RILLTESignalStrength) null;
    }
    public int getRssnr(){
      return 0;
    }
    public RilCmds.RILLTESignalStrength setRssnr(int arg1){
      return (RilCmds.RILLTESignalStrength) null;
    }
    public RilCmds.RILLTESignalStrength clearRssnr(){
      return (RilCmds.RILLTESignalStrength) null;
    }
    public int getCqi(){
      return 0;
    }
    public RilCmds.RILLTESignalStrength setCqi(int arg1){
      return (RilCmds.RILLTESignalStrength) null;
    }
    public RilCmds.RILLTESignalStrength clearCqi(){
      return (RilCmds.RILLTESignalStrength) null;
    }
  }
  public static final class RspStrings
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int STRINGS_FIELD_NUMBER = 1;

    // Constructors

    public RspStrings(){
      super();
    }
    // Methods

    public final RilCmds.RspStrings clear(){
      return (RilCmds.RspStrings) null;
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
    public RilCmds.RspStrings mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspStrings) null;
    }
    public static RilCmds.RspStrings parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RspStrings) null;
    }
    public static RilCmds.RspStrings parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspStrings) null;
    }
    public java.util.List<java.lang.String> getStringsList(){
      return (java.util.List) null;
    }
    public int getStringsCount(){
      return 0;
    }
    public java.lang.String getStrings(int arg1){
      return (java.lang.String) null;
    }
    public RilCmds.RspStrings setStrings(int arg1, java.lang.String arg2){
      return (RilCmds.RspStrings) null;
    }
    public RilCmds.RspStrings addStrings(java.lang.String arg1){
      return (RilCmds.RspStrings) null;
    }
    public RilCmds.RspStrings clearStrings(){
      return (RilCmds.RspStrings) null;
    }
  }
  public static final class RspIntegers
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int INTEGERS_FIELD_NUMBER = 1;

    // Constructors

    public RspIntegers(){
      super();
    }
    // Methods

    public final RilCmds.RspIntegers clear(){
      return (RilCmds.RspIntegers) null;
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
    public RilCmds.RspIntegers mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspIntegers) null;
    }
    public static RilCmds.RspIntegers parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RspIntegers) null;
    }
    public static RilCmds.RspIntegers parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspIntegers) null;
    }
    public java.util.List<java.lang.Integer> getIntegersList(){
      return (java.util.List) null;
    }
    public int getIntegersCount(){
      return 0;
    }
    public int getIntegers(int arg1){
      return 0;
    }
    public RilCmds.RspIntegers setIntegers(int arg1, int arg2){
      return (RilCmds.RspIntegers) null;
    }
    public RilCmds.RspIntegers addIntegers(int arg1){
      return (RilCmds.RspIntegers) null;
    }
    public RilCmds.RspIntegers clearIntegers(){
      return (RilCmds.RspIntegers) null;
    }
  }
  public static final class RspGetSimStatus
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int CARD_STATUS_FIELD_NUMBER = 1;

    // Constructors

    public RspGetSimStatus(){
      super();
    }
    // Methods

    public final RilCmds.RspGetSimStatus clear(){
      return (RilCmds.RspGetSimStatus) null;
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
    public RilCmds.RspGetSimStatus mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspGetSimStatus) null;
    }
    public static RilCmds.RspGetSimStatus parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RspGetSimStatus) null;
    }
    public static RilCmds.RspGetSimStatus parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspGetSimStatus) null;
    }
    public boolean hasCardStatus(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mCardStatus")
    public RilCmds.RilCardStatus getCardStatus(){
      return (RilCmds.RilCardStatus) null;
    }
    public RilCmds.RspGetSimStatus setCardStatus(@com.francetelecom.rd.stubs.annotation.FieldSet("mCardStatus") RilCmds.RilCardStatus arg1){
      return (RilCmds.RspGetSimStatus) null;
    }
    public RilCmds.RspGetSimStatus clearCardStatus(){
      return (RilCmds.RspGetSimStatus) null;
    }
  }
  public static final class ReqEnterSimPin
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int PIN_FIELD_NUMBER = 1;

    // Constructors

    public ReqEnterSimPin(){
      super();
    }
    // Methods

    public final RilCmds.ReqEnterSimPin clear(){
      return (RilCmds.ReqEnterSimPin) null;
    }
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro arg1) throws java.io.IOException{
    }
    public final boolean isInitialized(){
      return false;
    }
    public boolean hasPin(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("pin")
    public java.lang.String getPin(){
      return (java.lang.String) null;
    }
    public RilCmds.ReqEnterSimPin setPin(@com.francetelecom.rd.stubs.annotation.FieldSet("pin") java.lang.String arg1){
      return (RilCmds.ReqEnterSimPin) null;
    }
    public RilCmds.ReqEnterSimPin clearPin(){
      return (RilCmds.ReqEnterSimPin) null;
    }
    public int getCachedSize(){
      return 0;
    }
    public int getSerializedSize(){
      return 0;
    }
    public RilCmds.ReqEnterSimPin mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqEnterSimPin) null;
    }
    public static RilCmds.ReqEnterSimPin parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.ReqEnterSimPin) null;
    }
    public static RilCmds.ReqEnterSimPin parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqEnterSimPin) null;
    }
  }
  public static final class RspEnterSimPin
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int RETRIES_REMAINING_FIELD_NUMBER = 1;

    // Constructors

    public RspEnterSimPin(){
      super();
    }
    // Methods

    public final RilCmds.RspEnterSimPin clear(){
      return (RilCmds.RspEnterSimPin) null;
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
    public RilCmds.RspEnterSimPin mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspEnterSimPin) null;
    }
    public static RilCmds.RspEnterSimPin parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RspEnterSimPin) null;
    }
    public static RilCmds.RspEnterSimPin parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspEnterSimPin) null;
    }
    public boolean hasRetriesRemaining(){
      return false;
    }
    public int getRetriesRemaining(){
      return 0;
    }
    public RilCmds.RspEnterSimPin setRetriesRemaining(int arg1){
      return (RilCmds.RspEnterSimPin) null;
    }
    public RilCmds.RspEnterSimPin clearRetriesRemaining(){
      return (RilCmds.RspEnterSimPin) null;
    }
  }
  public static final class RspGetCurrentCalls
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int CALLS_FIELD_NUMBER = 1;

    // Constructors

    public RspGetCurrentCalls(){
      super();
    }
    // Methods

    public final RilCmds.RspGetCurrentCalls clear(){
      return (RilCmds.RspGetCurrentCalls) null;
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
    public RilCmds.RspGetCurrentCalls mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspGetCurrentCalls) null;
    }
    public static RilCmds.RspGetCurrentCalls parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RspGetCurrentCalls) null;
    }
    public static RilCmds.RspGetCurrentCalls parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspGetCurrentCalls) null;
    }
    public java.util.List<RilCmds.RilCall> getCallsList(){
      return (java.util.List) null;
    }
    public int getCallsCount(){
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mRilCall") 
    public RilCmds.RilCall getCalls(int arg1){
      return (RilCmds.RilCall) null;
    }
    public RilCmds.RspGetCurrentCalls setCalls(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mRilCall") RilCmds.RilCall arg2){
      return (RilCmds.RspGetCurrentCalls) null;
    }
    public RilCmds.RspGetCurrentCalls addCalls(@com.francetelecom.rd.stubs.annotation.FieldSet("mRilCall") RilCmds.RilCall arg1){
      return (RilCmds.RspGetCurrentCalls) null;
    }
    public RilCmds.RspGetCurrentCalls clearCalls(){
      return (RilCmds.RspGetCurrentCalls) null;
    }
  }
  public static final class ReqDial
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int ADDRESS_FIELD_NUMBER = 1;

    public static final int CLIR_FIELD_NUMBER = 2;

    public static final int UUS_INFO_FIELD_NUMBER = 3;

    // Constructors

    public ReqDial(){
      super();
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.FieldGet("address")
    public java.lang.String getAddress(){
      return (java.lang.String) null;
    }
    public final RilCmds.ReqDial clear(){
      return (RilCmds.ReqDial) null;
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
    public RilCmds.ReqDial mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqDial) null;
    }
    public static RilCmds.ReqDial parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.ReqDial) null;
    }
    public static RilCmds.ReqDial parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqDial) null;
    }
    public RilCmds.ReqDial setAddress(@com.francetelecom.rd.stubs.annotation.FieldSet("address") java.lang.String arg1){
      return (RilCmds.ReqDial) null;
    }
    public boolean hasAddress(){
      return false;
    }
    public boolean hasClir(){
      return false;
    }
    public boolean hasUusInfo(){
      return false;
    }
    public RilCmds.ReqDial clearAddress(){
      return (RilCmds.ReqDial) null;
    }
    public int getClir(){
      return 0;
    }
    public RilCmds.ReqDial setClir(int arg1){
      return (RilCmds.ReqDial) null;
    }
    public RilCmds.ReqDial clearClir(){
      return (RilCmds.ReqDial) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mRilUusInfo")
    public RilCmds.RilUusInfo getUusInfo(){
      return (RilCmds.RilUusInfo) null;
    }
    public RilCmds.ReqDial setUusInfo(@com.francetelecom.rd.stubs.annotation.FieldSet("mRilUusInfo") RilCmds.RilUusInfo arg1){
      return (RilCmds.ReqDial) null;
    }
    public RilCmds.ReqDial clearUusInfo(){
      return (RilCmds.ReqDial) null;
    }
  }
  public static final class ReqHangUp
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int CONNECTION_INDEX_FIELD_NUMBER = 1;

    // Constructors

    public ReqHangUp(){
      super();
    }
    // Methods

    public final RilCmds.ReqHangUp clear(){
      return (RilCmds.ReqHangUp) null;
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
    public RilCmds.ReqHangUp mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqHangUp) null;
    }
    public static RilCmds.ReqHangUp parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.ReqHangUp) null;
    }
    public static RilCmds.ReqHangUp parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqHangUp) null;
    }
    public boolean hasConnectionIndex(){
      return false;
    }
    public int getConnectionIndex(){
      return 0;
    }
    public RilCmds.ReqHangUp setConnectionIndex(int arg1){
      return (RilCmds.ReqHangUp) null;
    }
    public RilCmds.ReqHangUp clearConnectionIndex(){
      return (RilCmds.ReqHangUp) null;
    }
  }
  public static final class RspLastCallFailCause
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int LAST_CALL_FAIL_CAUSE_FIELD_NUMBER = 1;

    // Constructors

    public RspLastCallFailCause(){
      super();
    }
    // Methods

    public final RilCmds.RspLastCallFailCause clear(){
      return (RilCmds.RspLastCallFailCause) null;
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
    public RilCmds.RspLastCallFailCause mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspLastCallFailCause) null;
    }
    public static RilCmds.RspLastCallFailCause parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RspLastCallFailCause) null;
    }
    public static RilCmds.RspLastCallFailCause parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspLastCallFailCause) null;
    }
    public int getLastCallFailCause(){
      return 0;
    }
    public boolean hasLastCallFailCause(){
      return false;
    }
    public RilCmds.RspLastCallFailCause setLastCallFailCause(int arg1){
      return (RilCmds.RspLastCallFailCause) null;
    }
    public RilCmds.RspLastCallFailCause clearLastCallFailCause(){
      return (RilCmds.RspLastCallFailCause) null;
    }
  }
  public static final class RspSignalStrength
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int GW_SIGNALSTRENGTH_FIELD_NUMBER = 1;

    public static final int CDMA_SIGNALSTRENGTH_FIELD_NUMBER = 2;

    public static final int EVDO_SIGNALSTRENGTH_FIELD_NUMBER = 3;

    public static final int LTE_SIGNALSTRENGTH_FIELD_NUMBER = 4;

    // Constructors

    public RspSignalStrength(){
      super();
    }
    // Methods

    public final RilCmds.RspSignalStrength clear(){
      return (RilCmds.RspSignalStrength) null;
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
    public RilCmds.RspSignalStrength mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspSignalStrength) null;
    }
    public static RilCmds.RspSignalStrength parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RspSignalStrength) null;
    }
    public static RilCmds.RspSignalStrength parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspSignalStrength) null;
    }
    public boolean hasGwSignalstrength(){
      return false;
    }
    public boolean hasCdmaSignalstrength(){
      return false;
    }
    public boolean hasEvdoSignalstrength(){
      return false;
    }
    public boolean hasLteSignalstrength(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mRILGWSignalStrength")
    public RilCmds.RILGWSignalStrength getGwSignalstrength(){
      return (RilCmds.RILGWSignalStrength) null;
    }
    public RilCmds.RspSignalStrength setGwSignalstrength(@com.francetelecom.rd.stubs.annotation.FieldSet("mRILGWSignalStrength") RilCmds.RILGWSignalStrength arg1){
      return (RilCmds.RspSignalStrength) null;
    }
    public RilCmds.RspSignalStrength clearGwSignalstrength(){
      return (RilCmds.RspSignalStrength) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mRILCDMASignalStrength") 
    public RilCmds.RILCDMASignalStrength getCdmaSignalstrength(){
      return (RilCmds.RILCDMASignalStrength) null;
    }
    public RilCmds.RspSignalStrength setCdmaSignalstrength(@com.francetelecom.rd.stubs.annotation.FieldSet("mRILCDMASignalStrength") RilCmds.RILCDMASignalStrength arg1){
      return (RilCmds.RspSignalStrength) null;
    }
    public RilCmds.RspSignalStrength clearCdmaSignalstrength(){
      return (RilCmds.RspSignalStrength) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mRILEVDOSignalStrength") 
    public RilCmds.RILEVDOSignalStrength getEvdoSignalstrength(){
      return (RilCmds.RILEVDOSignalStrength) null;
    }
    public RilCmds.RspSignalStrength setEvdoSignalstrength(@com.francetelecom.rd.stubs.annotation.FieldSet("mRILEVDOSignalStrength") RilCmds.RILEVDOSignalStrength arg1){
      return (RilCmds.RspSignalStrength) null;
    }
    public RilCmds.RspSignalStrength clearEvdoSignalstrength(){
      return (RilCmds.RspSignalStrength) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mRILLTESignalStrength") 
   public RilCmds.RILLTESignalStrength getLteSignalstrength(){
      return (RilCmds.RILLTESignalStrength) null;
    }
    public RilCmds.RspSignalStrength setLteSignalstrength(@com.francetelecom.rd.stubs.annotation.FieldSet("mRILLTESignalStrength") RilCmds.RILLTESignalStrength arg1){
      return (RilCmds.RspSignalStrength) null;
    }
    public RilCmds.RspSignalStrength clearLteSignalstrength(){
      return (RilCmds.RspSignalStrength) null;
    }
  }
  public static final class RspOperator
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int LONG_ALPHA_ONS_FIELD_NUMBER = 1;

    public static final int SHORT_ALPHA_ONS_FIELD_NUMBER = 2;

    public static final int MCC_MNC_FIELD_NUMBER = 3;

    // Constructors

    public RspOperator(){
      super();
    }
    // Methods

    public final RilCmds.RspOperator clear(){
      return (RilCmds.RspOperator) null;
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
    public RilCmds.RspOperator mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspOperator) null;
    }
    public static RilCmds.RspOperator parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.RspOperator) null;
    }
    public static RilCmds.RspOperator parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.RspOperator) null;
    }
    public boolean hasLongAlphaOns(){
      return false;
    }
    public boolean hasShortAlphaOns(){
      return false;
    }
    public boolean hasMccMnc(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("longAlphaOns")
    public java.lang.String getLongAlphaOns(){
      return (java.lang.String) null;
    }
    public RilCmds.RspOperator setLongAlphaOns(@com.francetelecom.rd.stubs.annotation.FieldSet("longAlphaOns") java.lang.String arg1){
      return (RilCmds.RspOperator) null;
    }
    public RilCmds.RspOperator clearLongAlphaOns(){
      return (RilCmds.RspOperator) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("shortAlphaOns")
    public java.lang.String getShortAlphaOns(){
      return (java.lang.String) null;
    }
    public RilCmds.RspOperator setShortAlphaOns(@com.francetelecom.rd.stubs.annotation.FieldSet("shortAlphaOns") java.lang.String arg1){
      return (RilCmds.RspOperator) null;
    }
    public RilCmds.RspOperator clearShortAlphaOns(){
      return (RilCmds.RspOperator) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mccMnc")
    public java.lang.String getMccMnc(){
      return (java.lang.String) null;
    }
    public RilCmds.RspOperator setMccMnc(@com.francetelecom.rd.stubs.annotation.FieldSet("mccMnc") java.lang.String arg1){
      return (RilCmds.RspOperator) null;
    }
    public RilCmds.RspOperator clearMccMnc(){
      return (RilCmds.RspOperator) null;
    }
  }
  public static final class ReqSeparateConnection
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int INDEX_FIELD_NUMBER = 1;

    // Constructors

    public ReqSeparateConnection(){
      super();
    }
    // Methods

    public final RilCmds.ReqSeparateConnection clear(){
      return (RilCmds.ReqSeparateConnection) null;
    }
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro arg1) throws java.io.IOException{
    }
    public int getIndex(){
      return 0;
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
    public RilCmds.ReqSeparateConnection mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqSeparateConnection) null;
    }
    public static RilCmds.ReqSeparateConnection parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.ReqSeparateConnection) null;
    }
    public static RilCmds.ReqSeparateConnection parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqSeparateConnection) null;
    }
    public RilCmds.ReqSeparateConnection setIndex(int arg1){
      return (RilCmds.ReqSeparateConnection) null;
    }
    public boolean hasIndex(){
      return false;
    }
    public RilCmds.ReqSeparateConnection clearIndex(){
      return (RilCmds.ReqSeparateConnection) null;
    }
  }
  public static final class ReqSetMute
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int STATE_FIELD_NUMBER = 1;

    // Constructors

    public ReqSetMute(){
      super();
    }
    // Methods

    public final RilCmds.ReqSetMute clear(){
      return (RilCmds.ReqSetMute) null;
    }
    public boolean getState(){
      return false;
    }
    public RilCmds.ReqSetMute setState(boolean arg1){
      return (RilCmds.ReqSetMute) null;
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
    public RilCmds.ReqSetMute mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqSetMute) null;
    }
    public static RilCmds.ReqSetMute parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.ReqSetMute) null;
    }
    public static RilCmds.ReqSetMute parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqSetMute) null;
    }
    public RilCmds.ReqSetMute clearState(){
      return (RilCmds.ReqSetMute) null;
    }
    public boolean hasState(){
      return false;
    }
  }
  public static final class ReqScreenState
    extends com.google.protobuf.micro.MessageMicro  {
    // Fields

    public static final int STATE_FIELD_NUMBER = 1;

    // Constructors

    public ReqScreenState(){
      super();
    }
    // Methods

    public final RilCmds.ReqScreenState clear(){
      return (RilCmds.ReqScreenState) null;
    }
    public boolean getState(){
      return false;
    }
    public RilCmds.ReqScreenState setState(boolean arg1){
      return (RilCmds.ReqScreenState) null;
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
    public RilCmds.ReqScreenState mergeFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqScreenState) null;
    }
    public static RilCmds.ReqScreenState parseFrom(byte [] arg1) throws com.google.protobuf.micro.InvalidProtocolBufferMicroException{
      return (RilCmds.ReqScreenState) null;
    }
    public static RilCmds.ReqScreenState parseFrom(com.google.protobuf.micro.CodedInputStreamMicro arg1) throws java.io.IOException{
      return (RilCmds.ReqScreenState) null;
    }
    public RilCmds.ReqScreenState clearState(){
      return (RilCmds.ReqScreenState) null;
    }
    public boolean hasState(){
      return false;
    }
  }
  // Fields

  public static final int RADIOSTATE_OFF = 0;

  public static final int RADIOSTATE_UNAVAILABLE = 1;

  public static final int RADIOSTATE_SIM_NOT_READY = 2;

  public static final int RADIOSTATE_SIM_LOCKED_OR_ABSENT = 3;

  public static final int RADIOSTATE_SIM_READY = 4;

  public static final int RADIOSTATE_RUIM_NOT_READY = 5;

  public static final int RADIOSTATE_RUIM_READY = 6;

  public static final int RADIOSTATE_RUIM_LOCKED_OR_ABSENT = 7;

  public static final int RADIOSTATE_NV_NOT_READY = 8;

  public static final int RADIOSTATE_NV_READY = 9;

  public static final int CARDSTATE_ABSENT = 0;

  public static final int CARDSTATE_PRESENT = 1;

  public static final int CARDSTATE_ERROR = 2;

  public static final int PERSOSUBSTATE_UNKNOWN = 0;

  public static final int PERSOSUBSTATE_IN_PROGRESS = 1;

  public static final int PERSOSUBSTATE_READY = 2;

  public static final int PERSOSUBSTATE_SIM_NETWORK = 3;

  public static final int PERSOSUBSTATE_SIM_NETWORK_SUBSET = 4;

  public static final int PERSOSUBSTATE_SIM_CORPORATE = 5;

  public static final int PERSOSUBSTATE_SIM_SERVICE_PROVIDER = 6;

  public static final int PERSOSUBSTATE_SIM_SIM = 7;

  public static final int PERSOSUBSTATE_SIM_NETWORK_PUK = 8;

  public static final int PERSOSUBSTATE_SIM_NETWORK_SUBSET_PUK = 9;

  public static final int PERSOSUBSTATE_SIM_CORPORATE_PUK = 10;

  public static final int PERSOSUBSTATE_SIM_SERVICE_PROVIDER_PUK = 11;

  public static final int PERSOSUBSTATE_SIM_SIM_PUK = 12;

  public static final int PERSOSUBSTATE_RUIM_NETWORK1 = 13;

  public static final int PERSOSUBSTATE_RUIM_NETWORK2 = 14;

  public static final int PERSOSUBSTATE_RUIM_HRPD = 15;

  public static final int PERSOSUBSTATE_RUIM_CORPORATE = 16;

  public static final int PERSOSUBSTATE_RUIM_SERVICE_PROVIDER = 17;

  public static final int PERSOSUBSTATE_RUIM_RUIM = 18;

  public static final int PERSOSUBSTATE_RUIM_NETWORK1_PUK = 19;

  public static final int PERSOSUBSTATE_RUIM_NETWORK2_PUK = 20;

  public static final int PERSOSUBSTATE_RUIM_HRPD_PUK = 21;

  public static final int PERSOSUBSTATE_RUIM_CORPORATE_PUK = 22;

  public static final int PERSOSUBSTATE_RUIM_SERVICE_PROVIDER_PUK = 23;

  public static final int PERSOSUBSTATE_RUIM_RUIM_PUK = 24;

  public static final int APPSTATE_UNKNOWN = 0;

  public static final int APPSTATE_DETECTED = 1;

  public static final int APPSTATE_PIN = 2;

  public static final int APPSTATE_PUK = 3;

  public static final int APPSTATE_SUBSCRIPTION_PERSO = 4;

  public static final int APPSTATE_READY = 5;

  public static final int PINSTATE_UNKNOWN = 0;

  public static final int PINSTATE_ENABLED_NOT_VERIFIED = 1;

  public static final int PINSTATE_ENABLED_VERIFIED = 2;

  public static final int PINSTATE_DISABLED = 3;

  public static final int PINSTATE_ENABLED_BLOCKED = 4;

  public static final int PINSTATE_ENABLED_PERM_BLOCKED = 5;

  public static final int APPTYPE_UNKNOWN = 0;

  public static final int APPTYPE_SIM = 1;

  public static final int APPTYPE_USIM = 2;

  public static final int APPTYPE_RUIM = 3;

  public static final int APPTYPE_CSIM = 4;

  public static final int RILUUSTYPE1_IMPLICIT = 0;

  public static final int RILUUSTYPE1_REQUIRED = 1;

  public static final int RILUUSTYPE1_NOT_REQUIRED = 2;

  public static final int RILUUSTYPE2_REQUIRED = 3;

  public static final int RILUUSTYPE2_NOT_REQUIRED = 4;

  public static final int RILUUSTYPE3_REQUIRED = 5;

  public static final int RILUUSTYPE3_NOT_REQUIRED = 6;

  public static final int RILUUSDCS_USP = 0;

  public static final int RILUUSDCS_OSIHLP = 1;

  public static final int RILUUSDCS_X244 = 2;

  public static final int RILUUSDCS_RMCF = 3;

  public static final int RILUUSDCS_IA5c = 4;

  public static final int CALLSTATE_ACTIVE = 0;

  public static final int CALLSTATE_HOLDING = 1;

  public static final int CALLSTATE_DIALING = 2;

  public static final int CALLSTATE_ALERTING = 3;

  public static final int CALLSTATE_INCOMING = 4;

  public static final int CALLSTATE_WAITING = 5;

  // Constructors

  private RilCmds(){
  }
}
