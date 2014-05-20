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

import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.RemoteCallbackImpl")
public abstract class RemoteCallback
  implements Parcelable
{
  // Fields

  public static final Parcelable.Creator<RemoteCallback> CREATOR = null;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public RemoteCallback(Handler arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  RemoteCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IRemoteCallback") IRemoteCallback arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public void writeToParcel(Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void sendResult(Bundle arg1) throws RemoteException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onResult(Bundle arg1);
}
