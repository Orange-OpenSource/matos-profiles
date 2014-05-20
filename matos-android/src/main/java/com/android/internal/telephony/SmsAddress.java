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


public abstract class SmsAddress
{
  // Fields

  public static final int TON_UNKNOWN = 0;

  public static final int TON_INTERNATIONAL = 1;

  public static final int TON_NATIONAL = 2;

  public static final int TON_NETWORK = 3;

  public static final int TON_SUBSCRIBER = 4;

  public static final int TON_ALPHANUMERIC = 5;

  public static final int TON_ABBREVIATED = 6;

  public int ton;

  public java.lang.String address;

  public byte [] origBytes;

  // Constructors

  public SmsAddress(){
  }
  // Methods

  public java.lang.String getAddressString(){
    return (java.lang.String) null;
  }
  public boolean isAlphanumeric(){
    return false;
  }
  public boolean isNetworkSpecific(){
    return false;
  }
  public boolean couldBeEmailGateway(){
    return false;
  }
}
