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
public final class BluetoothAudioGateway
{
  // Classes

  public class IncomingConnectionInfo
  {
    // Fields

    public BluetoothAdapter mAdapter;

    public BluetoothDevice mRemoteDevice;

    public int mSocketFd;

    public int mRfcommChan;

    // Constructors

    IncomingConnectionInfo(BluetoothAdapter arg1, BluetoothDevice arg2, int arg3, int arg4){
    }
  }
  // Fields

  public static final int DEFAULT_HF_AG_CHANNEL = 10;

  public static final int DEFAULT_HS_AG_CHANNEL = 11;

  public static final int MSG_INCOMING_HEADSET_CONNECTION = 100;

  public static final int MSG_INCOMING_HANDSFREE_CONNECTION = 101;

  // Constructors

  public BluetoothAudioGateway(BluetoothAdapter arg1){
  }
  public BluetoothAudioGateway(BluetoothAdapter arg1, int arg2, int arg3){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public synchronized boolean start(android.os.Handler arg1){
    return false;
  }
  public synchronized void stop(){
  }
}
