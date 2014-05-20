package android.nfc.tech;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;


public final class Ndef
  extends BasicTagTechnology{
  // Fields

  public static final int NDEF_MODE_READ_ONLY = 1;

  public static final int NDEF_MODE_READ_WRITE = 2;

  public static final int NDEF_MODE_UNKNOWN = 3;

  public static final java.lang.String EXTRA_NDEF_MSG = "ndefmsg";

  public static final java.lang.String EXTRA_NDEF_MAXLENGTH = "ndefmaxlength";

  public static final java.lang.String EXTRA_NDEF_CARDSTATE = "ndefcardstate";

  public static final java.lang.String EXTRA_NDEF_TYPE = "ndeftype";

  public static final int TYPE_OTHER = -1;

  public static final int TYPE_1 = 1;

  public static final int TYPE_2 = 2;

  public static final int TYPE_3 = 3;

  public static final int TYPE_4 = 4;

  public static final int TYPE_MIFARE_CLASSIC = 101;

  public static final int TYPE_ICODE_SLI = 102;

  public static final java.lang.String UNKNOWN = "android.ndef.unknown";

  public static final java.lang.String NFC_FORUM_TYPE_1 = "org.nfcforum.ndef.type1";

  public static final java.lang.String NFC_FORUM_TYPE_2 = "org.nfcforum.ndef.type2";

  public static final java.lang.String NFC_FORUM_TYPE_3 = "org.nfcforum.ndef.type3";

  public static final java.lang.String NFC_FORUM_TYPE_4 = "org.nfcforum.ndef.type4";

  public static final java.lang.String MIFARE_CLASSIC = "com.nxp.ndef.mifareclassic";

  public static final java.lang.String ICODE_SLI = "com.nxp.ndef.icodesli";

  // Constructors

  public Ndef(android.nfc.Tag arg1) throws android.os.RemoteException{
    super((android.nfc.Tag) null, 0);
  }
  // Methods
  @ArgsRule(value="Ndef.get", pos=1)
  public static Ndef get(android.nfc.Tag arg1){
    return (Ndef) null;
  }
  public java.lang.String getType(){
    return (java.lang.String) null;
  }
  public boolean makeReadOnly() throws java.io.IOException{
    return false;
  }
  public android.nfc.NdefMessage getCachedNdefMessage(){
    return (android.nfc.NdefMessage) null;
  }
  public int getMaxSize(){
    return 0;
  }
  public boolean isWritable(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Ndef.getNdefMessage", report = "-")
  public android.nfc.NdefMessage getNdefMessage() throws java.io.IOException, android.nfc.FormatException{
    return (android.nfc.NdefMessage) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Ndef.writeNdefMessage", report = "-")
  public void writeNdefMessage(android.nfc.NdefMessage arg1) throws java.io.IOException, android.nfc.FormatException{
  }
  public boolean canMakeReadOnly(){
    return false;
  }
}
