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


public class SmsCbMessage
{
  // Fields

  public static final int GEOGRAPHICAL_SCOPE_CELL_WIDE_IMMEDIATE = 0;

  public static final int GEOGRAPHICAL_SCOPE_PLMN_WIDE = 1;

  public static final int GEOGRAPHICAL_SCOPE_LA_WIDE = 2;

  public static final int GEOGRAPHICAL_SCOPE_CELL_WIDE = 3;

  // Constructors

  private SmsCbMessage(byte [] arg1) throws java.lang.IllegalArgumentException{
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static SmsCbMessage createFromPdu(byte [] arg1){
    return (SmsCbMessage) null;
  }
  public java.lang.String getMessageBody(){
    return (java.lang.String) null;
  }
  public int getGeographicalScope(){
    return 0;
  }
  public java.lang.String getLanguageCode(){
    return (java.lang.String) null;
  }
  public int getMessageIdentifier(){
    return 0;
  }
  public int getMessageCode(){
    return 0;
  }
  public int getUpdateNumber(){
    return 0;
  }
  public int getMessageFormat(){
    return 0;
  }
  public boolean getEtwsEmergencyUserAlert(){
    return false;
  }
  public boolean getEtwsPopup(){
    return false;
  }
  public int getEtwsWarningType(){
    return 0;
  }
  public long getEtwsSecurityTimestamp(){
    return 0l;
  }
  public byte [] getEtwsSecuritySignature(){
    return (byte []) null;
  }
  public void appendToBody(java.lang.String arg1){
  }
}
