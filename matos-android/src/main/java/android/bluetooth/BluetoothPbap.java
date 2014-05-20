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
public class BluetoothPbap
{
  // Classes

  public static interface ServiceListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("serviceListener")
    public void onServiceConnected();
    @com.francetelecom.rd.stubs.annotation.CallBack("serviceListener")
    public void onServiceDisconnected();
  }
  // Fields

  public static final java.lang.String PBAP_STATE = "android.bluetooth.pbap.intent.PBAP_STATE";

  public static final java.lang.String PBAP_PREVIOUS_STATE = "android.bluetooth.pbap.intent.PBAP_PREVIOUS_STATE";

  public static final java.lang.String PBAP_STATE_CHANGED_ACTION = "android.bluetooth.pbap.intent.action.PBAP_STATE_CHANGED";

  public static final int STATE_ERROR = -1;

  public static final int STATE_DISCONNECTED = 0;

  public static final int STATE_CONNECTING = 1;

  public static final int STATE_CONNECTED = 2;

  public static final int RESULT_FAILURE = 0;

  public static final int RESULT_SUCCESS = 1;

  public static final int RESULT_CANCELED = 2;

  // Constructors

  public BluetoothPbap(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serviceListener") BluetoothPbap.ServiceListener arg2){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public int getState(){
    return 0;
  }
  public synchronized void close(){
  }
  public boolean isConnected(BluetoothDevice arg1){
    return false;
  }
  public boolean disconnect(){
    return false;
  }
  public BluetoothDevice getClient(){
    return (BluetoothDevice) null;
  }
  public static boolean doesClassMatchSink(BluetoothClass arg1){
    return false;
  }
}
