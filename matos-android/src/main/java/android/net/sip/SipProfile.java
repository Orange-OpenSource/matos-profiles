package android.net.sip;

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


public class SipProfile
  implements java.io.Serializable, android.os.Parcelable, java.lang.Cloneable
{
  // Classes

  public static class Builder
  {
    // Constructors

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SipProfile.Builder-1", pos = {1, 0}, report = "-")
    public Builder(SipProfile arg1){
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SipProfile.Builder-2", pos = {1, 0}, report = "-")
    public Builder(java.lang.String arg1) throws java.text.ParseException{
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SipProfile.Builder-3", pos = {1, 2, 0}, report = "-")
    public Builder(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
    }
    // Methods

    public SipProfile build(){
      return (SipProfile) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SipProfile.Builder setPassword(java.lang.String arg1){
      return (SipProfile.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SipProfile.Builder setPort(int arg1) throws java.lang.IllegalArgumentException{
      return (SipProfile.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SipProfile.Builder setAuthUserName(java.lang.String arg1){
      return (SipProfile.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SipProfile.Builder setProfileName(java.lang.String arg1){
      return (SipProfile.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SipProfile.Builder setProtocol(java.lang.String arg1) throws java.lang.IllegalArgumentException{
      return (SipProfile.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SipProfile.Builder.setOutboundProxy", pos = {1, 0}, report = "-")
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SipProfile.Builder setOutboundProxy(java.lang.String arg1){
      return (SipProfile.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SipProfile.Builder setDisplayName(java.lang.String arg1){
      return (SipProfile.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SipProfile.Builder setSendKeepAlive(boolean arg1){
      return (SipProfile.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SipProfile.Builder setAutoRegistration(boolean arg1){
      return (SipProfile.Builder) null;
    }
  }
  // Fields

  public static final android.os.Parcelable.Creator<SipProfile> CREATOR = null;

  // Constructors

  private SipProfile(){
  }
  private SipProfile(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String getProtocol(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public java.lang.String getDisplayName(){
    return (java.lang.String) null;
  }
  public int getCallingUid(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public javax.sip.address.SipURI getUri(){
    return (javax.sip.address.SipURI) null;
  }
  public java.lang.String getPassword(){
    return (java.lang.String) null;
  }
  public java.lang.String getUserName(){
    return (java.lang.String) null;
  }
  public java.lang.String getSipDomain(){
    return (java.lang.String) null;
  }
  public java.lang.String getUriString(){
    return (java.lang.String) null;
  }
  public boolean getSendKeepAlive(){
    return false;
  }
  public java.lang.String getProxyAddress(){
    return (java.lang.String) null;
  }
  public void setCallingUid(int arg1){
  }
  public boolean getAutoRegistration(){
    return false;
  }
  public java.lang.String getAuthUserName(){
    return (java.lang.String) null;
  }
  public javax.sip.address.Address getSipAddress(){
    return (javax.sip.address.Address) null;
  }
  public java.lang.String getProfileName(){
    return (java.lang.String) null;
  }
}
