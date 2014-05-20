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
public interface IBluetoothHeadset
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IBlueToothHeadSetStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IBluetoothHeadset
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IBluetoothHeadset asInterface(android.os.IBinder arg1){
      return (IBluetoothHeadset) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public boolean setPriority(BluetoothDevice arg1, int arg2) throws android.os.RemoteException;
  public int getPriority(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean connect(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean disconnect(BluetoothDevice arg1) throws android.os.RemoteException;
  public java.util.List<BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
  public java.util.List<BluetoothDevice> getDevicesMatchingConnectionStates(int [] arg1) throws android.os.RemoteException;
  public int getConnectionState(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean startVoiceRecognition(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean stopVoiceRecognition(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean isAudioConnected(BluetoothDevice arg1) throws android.os.RemoteException;
  public int getBatteryUsageHint(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean createIncomingConnect(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean acceptIncomingConnect(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean rejectIncomingConnect(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean cancelConnectThread() throws android.os.RemoteException;
  public boolean connectHeadsetInternal(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean disconnectHeadsetInternal(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean setAudioState(BluetoothDevice arg1, int arg2) throws android.os.RemoteException;
  public int getAudioState(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean startScoUsingVirtualVoiceCall(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean stopScoUsingVirtualVoiceCall(BluetoothDevice arg1) throws android.os.RemoteException;
}
