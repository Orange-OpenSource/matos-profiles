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


public final class MifareUltralight
  extends BasicTagTechnology{
  // Fields

  public static final int TYPE_UNKNOWN = -1;

  public static final int TYPE_ULTRALIGHT = 1;

  public static final int TYPE_ULTRALIGHT_C = 2;

  public static final int PAGE_SIZE = 4;

  public static final java.lang.String EXTRA_IS_UL_C = "isulc";

  // Constructors
  
  public MifareUltralight(android.nfc.Tag arg1) throws android.os.RemoteException{
    super((android.nfc.Tag) null, 0);
  }
  // Methods
  @ArgsRule(value="MifareUltralight.get", pos=1)
  public static MifareUltralight get(android.nfc.Tag arg1){
    return (MifareUltralight) null;
  }
  public int getType(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "MifareUltralight.transceive", report = "-")
  public byte [] transceive(byte [] arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public int getMaxTransceiveLength(){
    return 0;
  }
  public int getTimeout(){
    return 0;
  }
  public void setTimeout(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MifareUltralight.readPages", pos = 1, report = "-")
  public byte [] readPages(int arg1) throws java.io.IOException{
    return (byte []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MifareUltralight.writePage", pos = 1, report = "-")
  public void writePage(int arg1, byte [] arg2) throws java.io.IOException{
  }
}
