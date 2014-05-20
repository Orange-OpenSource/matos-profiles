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


public class UsbRequest
{
  // Constructors

  public UsbRequest(){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public boolean queue(java.nio.ByteBuffer arg1, int arg2){
    return false;
  }
  public void close(){
  }
  public boolean initialize(UsbDeviceConnection arg1, UsbEndpoint arg2){
    return false;
  }
  public boolean cancel(){
    return false;
  }
  public UsbEndpoint getEndpoint(){
    return (UsbEndpoint) null;
  }
  public java.lang.Object getClientData(){
    return (java.lang.Object) null;
  }
  public void setClientData(java.lang.Object arg1){
  }
}
