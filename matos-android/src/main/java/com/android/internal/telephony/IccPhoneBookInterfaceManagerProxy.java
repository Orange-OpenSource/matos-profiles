package com.android.internal.telephony;

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


public class IccPhoneBookInterfaceManagerProxy
  extends IIccPhoneBook.Stub{
  // Constructors

  public IccPhoneBookInterfaceManagerProxy(IccPhoneBookInterfaceManager arg1){
    super();
  }
  // Methods

  public java.util.List<AdnRecord> getAdnRecordsInEf(int arg1) throws android.os.RemoteException{
    return (java.util.List) null;
  }
  public boolean updateAdnRecordsInEfBySearch(int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6) throws android.os.RemoteException{
    return false;
  }
  public boolean updateAdnRecordsInEfByIndex(int arg1, java.lang.String arg2, java.lang.String arg3, int arg4, java.lang.String arg5) throws android.os.RemoteException{
    return false;
  }
  public int [] getAdnRecordsSize(int arg1) throws android.os.RemoteException{
    return (int []) null;
  }
  public void setmIccPhoneBookInterfaceManager(IccPhoneBookInterfaceManager arg1){
  }
}
