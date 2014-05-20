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

import com.francetelecom.rd.stubs.annotation.Code;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Binder
  implements IBinder
{
  // Constructors
  @Code({"try { onTransact(0,null,null,0); } catch (RemoteException e) {}"})
  public Binder(){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  protected boolean onTransact(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException{
    return false;
  }
  public java.lang.String getInterfaceDescriptor(){
    return (java.lang.String) null;
  }
  
  public final boolean transact(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException{
    return false;
  }
  public void attachInterface(IInterface arg1, java.lang.String arg2){
  }
  public IInterface queryLocalInterface(java.lang.String arg1){
    return (IInterface) null;
  }
  public static final int getCallingPid(){
    return 0;
  }
  public static final int getCallingUid(){
    return 0;
  }
  public static final long clearCallingIdentity(){
    return 0l;
  }
  public static final void restoreCallingIdentity(long arg1){
  }
  public static final void setThreadStrictModePolicy(int arg1){
  }
  public static final int getThreadStrictModePolicy(){
    return 0;
  }
  public static final void flushPendingCommands(){
  }
  public static final void joinThreadPool(){
  }
  public boolean pingBinder(){
    return false;
  }
  public boolean isBinderAlive(){
    return false;
  }
  public void dump(java.io.FileDescriptor arg1, java.lang.String [] arg2){
  }
  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void dumpAsync(java.io.FileDescriptor arg1, java.lang.String [] arg2){
  }
  public void linkToDeath(IBinder.DeathRecipient arg1, int arg2){
  }
  public boolean unlinkToDeath(IBinder.DeathRecipient arg1, int arg2){
    return false;
  }
}
