package com.android.location.provider;

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
public abstract class GeocodeProvider
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public GeocodeProvider(){
  }
  // Methods

  public android.os.IBinder getBinder(){
    return (android.os.IBinder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract java.lang.String onGetFromLocation(double arg1, double arg2, int arg3, android.location.GeocoderParams arg4, java.util.List<android.location.Address> arg5);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract java.lang.String onGetFromLocationName(java.lang.String arg1, double arg2, double arg3, double arg4, double arg5, int arg6, android.location.GeocoderParams arg7, java.util.List<android.location.Address> arg8);
}
