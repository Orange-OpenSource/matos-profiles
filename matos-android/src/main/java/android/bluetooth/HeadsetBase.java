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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class HeadsetBase
{
  // Fields

  public static final int RFCOMM_DISCONNECTED = 1;

  public static final int DIRECTION_INCOMING = 1;

  public static final int DIRECTION_OUTGOING = 2;

  protected AtParser mAtParser;

  // Constructors

  public HeadsetBase(android.os.PowerManager arg1, BluetoothAdapter arg2, BluetoothDevice arg3, int arg4){
  }
  public HeadsetBase(android.os.PowerManager arg1, BluetoothAdapter arg2, BluetoothDevice arg3, int arg4, int arg5, android.os.Handler arg6){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public boolean connect(android.os.Handler arg1){
    return false;
  }
  public boolean isConnected(){
    return false;
  }
  public void disconnect(){
  }
  public int getDirection(){
    return 0;
  }
  public BluetoothDevice getRemoteDevice(){
    return (BluetoothDevice) null;
  }
  protected void handleInput(java.lang.String arg1){
  }
  protected void initializeAtParser(){
  }
  public AtParser getAtParser(){
    return (AtParser) null;
  }
  public void startEventThread(){
  }
  public boolean connectAsync(){
    return false;
  }
  public int getRemainingAsyncConnectWaitingTimeMs(){
    return 0;
  }
  public int waitForAsyncConnect(int arg1, android.os.Handler arg2){
    return 0;
  }
  public long getConnectTimestamp(){
    return 0l;
  }
  public synchronized boolean sendURC(java.lang.String arg1){
    return false;
  }
  public static int getAtInputCount(){
    return 0;
  }
}
