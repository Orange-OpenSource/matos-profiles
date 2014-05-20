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


public final class MifareClassic
  extends BasicTagTechnology{
  // Fields

  public static final byte [] KEY_DEFAULT = null;

  public static final byte [] KEY_MIFARE_APPLICATION_DIRECTORY = null;

  public static final byte [] KEY_NFC_FORUM = null;

  public static final int TYPE_UNKNOWN = -1;

  public static final int TYPE_CLASSIC = 0;

  public static final int TYPE_PLUS = 1;

  public static final int TYPE_PRO = 2;

  public static final int SIZE_1K = 1024;

  public static final int SIZE_2K = 2048;

  public static final int SIZE_4K = 4096;

  public static final int SIZE_MINI = 320;

  public static final int BLOCK_SIZE = 16;

  // Constructors

  public MifareClassic(android.nfc.Tag arg1) throws android.os.RemoteException{
    super((android.nfc.Tag) null, 0);
  }
  // Methods
  @ArgsRule(value="MifareClassic.get", pos=1)
  public static MifareClassic get(android.nfc.Tag arg1){
    return (MifareClassic) null;
  }
  public int getType(){
    return 0;
  }
  public int getSize(){
    return 0;
  }
  public void transfer(int arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "MifareClassic.transceive", report = "-")
  public byte [] transceive(byte [] arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public int getMaxTransceiveLength(){
    return 0;
  }
  public void increment(int arg1, int arg2) throws java.io.IOException{
  }
  public void restore(int arg1) throws java.io.IOException{
  }
  public int getTimeout(){
    return 0;
  }
  public int getBlockCount(){
    return 0;
  }
  public boolean isEmulated(){
    return false;
  }
  public int getSectorCount(){
    return 0;
  }
  public int getBlockCountInSector(int arg1){
    return 0;
  }
  public int blockToSector(int arg1){
    return 0;
  }
  public int sectorToBlock(int arg1){
    return 0;
  }
  public boolean authenticateSectorWithKeyA(int arg1, byte [] arg2) throws java.io.IOException{
    return false;
  }
  public boolean authenticateSectorWithKeyB(int arg1, byte [] arg2) throws java.io.IOException{
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MifareClassic.readBlock", pos = 1, report = "-")
  public byte [] readBlock(int arg1) throws java.io.IOException{
    return (byte []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MifareClassic.writeBlock", pos = 1, report = "-")
  public void writeBlock(int arg1, byte [] arg2) throws java.io.IOException{
  }
  public void decrement(int arg1, int arg2) throws java.io.IOException{
  }
  public void setTimeout(int arg1){
  }
}
