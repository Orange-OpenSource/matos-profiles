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


public abstract class SmsMessageBase
{
  // Classes

  public static class TextEncodingDetails
  {
    // Fields

    public int msgCount;

    public int codeUnitCount;

    public int codeUnitsRemaining;

    public int codeUnitSize;

    public int languageTable;

    public int languageShiftTable;

    // Constructors

    public TextEncodingDetails(){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public abstract static class SubmitPduBase
  {
    // Fields

    public byte [] encodedScAddress;

    public byte [] encodedMessage;

    // Constructors

    public SubmitPduBase(){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Fields

  protected java.lang.String scAddress;

  protected SmsAddress originatingAddress;

  protected java.lang.String messageBody;

  protected java.lang.String pseudoSubject;

  protected java.lang.String emailFrom;

  protected java.lang.String emailBody;

  protected boolean isEmail;

  protected long scTimeMillis;

  protected byte [] mPdu;

  protected byte [] userData;

  protected SmsHeader userDataHeader;

  protected boolean isMwi;

  protected boolean mwiSense;

  protected boolean mwiDontStore;

  protected int statusOnIcc;

  protected int indexOnIcc;

  public int messageRef;

  // Constructors

  public SmsMessageBase(){
  }
  // Methods

  public byte [] getUserData(){
    return (byte []) null;
  }
  public abstract int getStatus();
  public abstract boolean isStatusReportMessage();
  public abstract int getProtocolIdentifier();
  public abstract boolean isReplace();
  public abstract boolean isCphsMwiMessage();
  public abstract boolean isMWIClearMessage();
  public abstract boolean isMWISetMessage();
  public abstract boolean isMwiDontStore();
  public abstract boolean isReplyPathPresent();
  public abstract android.telephony.SmsMessage.MessageClass getMessageClass();
  public boolean isEmail(){
    return false;
  }
  public SmsHeader getUserDataHeader(){
    return (SmsHeader) null;
  }
  public java.lang.String getMessageBody(){
    return (java.lang.String) null;
  }
  protected void parseMessageBody(){
  }
  public java.lang.String getServiceCenterAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String getOriginatingAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String getDisplayOriginatingAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String getDisplayMessageBody(){
    return (java.lang.String) null;
  }
  public java.lang.String getPseudoSubject(){
    return (java.lang.String) null;
  }
  public long getTimestampMillis(){
    return 0l;
  }
  public java.lang.String getEmailBody(){
    return (java.lang.String) null;
  }
  public java.lang.String getEmailFrom(){
    return (java.lang.String) null;
  }
  public byte [] getPdu(){
    return (byte []) null;
  }
  public int getStatusOnIcc(){
    return 0;
  }
  public int getIndexOnIcc(){
    return 0;
  }
  protected void extractEmailAddressFromMessageBody(){
  }
}
