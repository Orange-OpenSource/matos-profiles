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


public final class NfcB
  extends BasicTagTechnology{
  // Fields

  public static final java.lang.String EXTRA_APPDATA = "appdata";

  public static final java.lang.String EXTRA_PROTINFO = "protinfo";

  // Constructors

  public NfcB(android.nfc.Tag arg1) throws android.os.RemoteException{
    super((android.nfc.Tag) null, 0);
  }
  // Methods
  @ArgsRule(value="NfcB.get", pos=1)
  public static NfcB get(android.nfc.Tag arg1){
    return (NfcB) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "NfcB.getApplicationData", report = "-")
  public byte [] getApplicationData(){
    return (byte []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "NfcB.transceive", report = "-")
  public byte [] transceive(byte [] arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public int getMaxTransceiveLength(){
    return 0;
  }
  public byte [] getProtocolInfo(){
    return (byte []) null;
  }
}
