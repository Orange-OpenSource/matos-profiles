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


public class RemoteCallbackList<E extends IInterface>
{
  // Constructors

  public RemoteCallbackList(){
  }
  // Methods

  public boolean register(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.os.IInterface.asBinder") E arg1){
    return false;
  }
  public boolean register(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.os.IInterface.asBinder") E arg1, java.lang.Object arg2){
    return false;
  }
  public void kill(){
  }
  public boolean unregister(E arg1){
    return false;
  }
  public int beginBroadcast(){
    return 0;
  }
  public E getBroadcastItem(int arg1){
    return null;
  }
  public void finishBroadcast(){
  }
  public void onCallbackDied(E arg1){
  }
  public void onCallbackDied(E arg1, java.lang.Object arg2){
  }
  public java.lang.Object getBroadcastCookie(int arg1){
    return (java.lang.Object) null;
  }
}
