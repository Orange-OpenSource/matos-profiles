package android.net;

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


public interface IThrottleManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IThrottleManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IThrottleManager asInterface(android.os.IBinder arg1){
      return (IThrottleManager) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public long getResetTime(java.lang.String arg1) throws android.os.RemoteException;
  public long getPeriodStartTime(java.lang.String arg1) throws android.os.RemoteException;
  public long getCliffThreshold(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public int getCliffLevel(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public java.lang.String getHelpUri() throws android.os.RemoteException;
  public long getByteCount(java.lang.String arg1, int arg2, int arg3, int arg4) throws android.os.RemoteException;
  public int getThrottle(java.lang.String arg1) throws android.os.RemoteException;
}
