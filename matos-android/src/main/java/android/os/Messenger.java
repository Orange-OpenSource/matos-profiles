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
public final class Messenger
  implements Parcelable
{
  // Fields

  public static final Parcelable.Creator<Messenger> CREATOR = null;

  // Constructors

  public Messenger( Handler arg1){
  }
  public Messenger(IBinder arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public void send(Message arg1) throws RemoteException{
  }
  public void writeToParcel(Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public IBinder getBinder(){
    return (IBinder) null;
  }
  public static void writeMessengerOrNullToParcel(Messenger arg1, Parcel arg2){
  }
  public static Messenger readMessengerOrNullFromParcel(Parcel arg1){
    return (Messenger) null;
  }
}
