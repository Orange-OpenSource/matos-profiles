package android.os;

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
public interface IBinder
{
  // Classes

  public static interface DeathRecipient
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("binderDied")
    public void binderDied();
  }
  // Fields

  public static final int FIRST_CALL_TRANSACTION = 1;

  public static final int LAST_CALL_TRANSACTION = 16777215;

  public static final int PING_TRANSACTION = 1599098439;

  public static final int DUMP_TRANSACTION = 1598311760;

  public static final int INTERFACE_TRANSACTION = 1598968902;

  public static final int TWEET_TRANSACTION = 1599362900;

  public static final int FLAG_ONEWAY = 1;

  // Methods

  public java.lang.String getInterfaceDescriptor() throws RemoteException;
  public boolean transact(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException;
  public IInterface queryLocalInterface(java.lang.String arg1);
  public boolean pingBinder();
  public boolean isBinderAlive();
  public void dump(java.io.FileDescriptor arg1, java.lang.String [] arg2) throws RemoteException;
  public void dumpAsync(java.io.FileDescriptor arg1, java.lang.String [] arg2) throws RemoteException;
  public void linkToDeath(@com.francetelecom.rd.stubs.annotation.CallBackRegister("binderDied") IBinder.DeathRecipient arg1, int arg2) throws RemoteException;
  public boolean unlinkToDeath(IBinder.DeathRecipient arg1, int arg2);
}
