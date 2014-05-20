package android.hardware.usb;

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


public class UsbDeviceConnection
{
  // Constructors

  public UsbDeviceConnection(UsbDevice arg1){
  }
  // Methods

  public void close(){
  }
  public int getFileDescriptor(){
    return 0;
  }
  public java.lang.String getSerial(){
    return (java.lang.String) null;
  }
  public byte [] getRawDescriptors(){
    return (byte []) null;
  }
  public boolean claimInterface(UsbInterface arg1, boolean arg2){
    return false;
  }
  public boolean releaseInterface(UsbInterface arg1){
    return false;
  }
  public int controlTransfer(int arg1, int arg2, int arg3, int arg4, byte [] arg5, int arg6, int arg7){
    return 0;
  }
  public int bulkTransfer(UsbEndpoint arg1, byte [] arg2, int arg3, int arg4){
    return 0;
  }
  public UsbRequest requestWait(){
    return (UsbRequest) null;
  }
}
