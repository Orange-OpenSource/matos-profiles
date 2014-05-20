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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ServiceManagerNativeImpl", superClass = "")
public abstract class ServiceManagerNative
  extends Binder  implements IServiceManager
{
  // Constructors

  public ServiceManagerNative(){
    super();
  }
  // Methods

  public IBinder asBinder(){
    return (IBinder) null;
  }
  public static IServiceManager asInterface(IBinder arg1){
    return (IServiceManager) null;
  }
  public boolean onTransact(int arg1, Parcel arg2, Parcel arg3, int arg4){
    return false;
  }
}
