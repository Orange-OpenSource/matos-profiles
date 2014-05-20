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

import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface IBluetoothA2dp
  extends android.os.IInterface
{
  // Classes
	@Real("com.francetelecom.rd.fakeandroid.IBlueToothA2dpImpl")
  public abstract static class Stub
    extends android.os.Binder    implements IBluetoothA2dp
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IBluetoothA2dp asInterface(android.os.IBinder arg1){
      return (IBluetoothA2dp) null;
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
  public boolean allowIncomingConnect(BluetoothDevice arg1, boolean arg2) throws android.os.RemoteException;
  public boolean connectSinkInternal(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean disconnectSinkInternal(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean isA2dpPlaying(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean suspendSink(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean resumeSink(BluetoothDevice arg1) throws android.os.RemoteException;
}
