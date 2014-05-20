package android.bluetooth;

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

import com.francetelecom.rd.stubs.annotation.UseRule;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class BluetoothSocket
  implements java.io.Closeable
{
  // Fields

  public static final int MAX_RFCOMM_CHANNEL = 30;

  // Constructors

  BluetoothSocket(int arg1, int arg2, boolean arg3, boolean arg4, BluetoothDevice arg5, int arg6, android.os.ParcelUuid arg7) throws java.io.IOException{
  }
  private BluetoothSocket(int arg1, int arg2, boolean arg3, boolean arg4, java.lang.String arg5, int arg6) throws java.io.IOException{
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void close() throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "BluetoothSocket.getInputStream", pos = {0, -1}, report = "-")
  public java.io.InputStream getInputStream() throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  @UseRule("BlutoothSocket.connect")
  public void connect() throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "BluetoothSocket.getOutputStream", pos = {0, -1}, report = "-")
  public java.io.OutputStream getOutputStream() throws java.io.IOException{
    return (java.io.OutputStream) null;
  }
  public boolean isConnected(){
    return false;
  }
  public BluetoothDevice getRemoteDevice(){
    return (BluetoothDevice) null;
  }
}
