package com.android.server;

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
public class CountryDetectorService
  extends android.location.ICountryDetector.Stub  implements java.lang.Runnable
{
  // Constructors

  public CountryDetectorService(android.content.Context arg1){
    super();
  }
  // Methods

  public void run(){
  }
  public android.location.Country detectCountry() throws android.os.RemoteException{
    return (android.location.Country) null;
  }
  protected void setCountryListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("CountryListener") android.location.CountryListener arg1){
  }
  public void addCountryListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ICountryListener") android.location.ICountryListener arg1) throws android.os.RemoteException{
  }
  public void removeCountryListener(android.location.ICountryListener arg1) throws android.os.RemoteException{
  }
  protected void notifyReceivers(android.location.Country arg1){
  }
}
