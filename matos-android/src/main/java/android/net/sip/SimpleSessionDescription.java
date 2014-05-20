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


public class SimpleSessionDescription
{
  // Classes

  public static class Media
  {
    // Constructors

    private Media(java.lang.String arg1, int arg2, int arg3, java.lang.String arg4){
    }
    // Methods

    public java.lang.String getType(){
      return (java.lang.String) null;
    }
    public java.lang.String getProtocol(){
      return (java.lang.String) null;
    }
    public int getPort(){
      return 0;
    }
    public void setFormat(java.lang.String arg1, java.lang.String arg2){
    }
    public java.lang.String [] getFormats(){
      return (java.lang.String []) null;
    }
    public int getPortCount(){
      return 0;
    }
    public java.lang.String getFmtp(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public java.lang.String getFmtp(int arg1){
      return (java.lang.String) null;
    }
    public void removeFormat(java.lang.String arg1){
    }
    public int [] getRtpPayloadTypes(){
      return (int []) null;
    }
    public java.lang.String getRtpmap(int arg1){
      return (java.lang.String) null;
    }
    public void setRtpPayload(int arg1, java.lang.String arg2, java.lang.String arg3){
    }
    public void removeRtpPayload(int arg1){
    }
  }
  // Constructors

  public SimpleSessionDescription(long arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("address") java.lang.String arg2){
  }
  public SimpleSessionDescription(java.lang.String arg1){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("address")
  public java.lang.String getAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.String getAttribute(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setAttribute(java.lang.String arg1, java.lang.String arg2){
  }
  public void setAddress(@com.francetelecom.rd.stubs.annotation.FieldSet("address") java.lang.String arg1){
  }
  public SimpleSessionDescription.Media newMedia(java.lang.String arg1, int arg2, int arg3, java.lang.String arg4){
    return (SimpleSessionDescription.Media) null;
  }
  public SimpleSessionDescription.Media [] getMedia(){
    return (SimpleSessionDescription.Media []) null;
  }
  public java.lang.String getEncryptionMethod(){
    return (java.lang.String) null;
  }
  public java.lang.String getEncryptionKey(){
    return (java.lang.String) null;
  }
  public void setEncryption(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String [] getBandwidthTypes(){
    return (java.lang.String []) null;
  }
  public int getBandwidth(java.lang.String arg1){
    return 0;
  }
  public void setBandwidth(java.lang.String arg1, int arg2){
  }
  public java.lang.String [] getAttributeNames(){
    return (java.lang.String []) null;
  }
}
