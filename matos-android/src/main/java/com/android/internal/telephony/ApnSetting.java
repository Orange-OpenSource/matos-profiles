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

import com.francetelecom.rd.stubs.annotation.FieldNoValue;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class ApnSetting
{
  // Fields
  @FieldNoValue
  public final java.lang.String carrier = (java.lang.String) null;
  @FieldNoValue
  public final java.lang.String apn = (java.lang.String) null;
  @FieldNoValue
  public final java.lang.String proxy = (java.lang.String) null;
  @FieldNoValue
  public final java.lang.String port = (java.lang.String) null;
  @FieldNoValue
  public final java.lang.String mmsc = (java.lang.String) null;
  @FieldNoValue
  public final java.lang.String mmsProxy = (java.lang.String) null;
  @FieldNoValue
  public final java.lang.String mmsPort = (java.lang.String) null;
  @FieldNoValue
  public final java.lang.String user = (java.lang.String) null;
  @FieldNoValue
  public final java.lang.String password = (java.lang.String) null;
  
  public final int authType = 0;
  @FieldNoValue
  public final java.lang.String [] types = (java.lang.String []) null;
  
  public final int id = 0;
  @FieldNoValue
  public final java.lang.String numeric = (java.lang.String) null;
  @FieldNoValue
  public final java.lang.String protocol = (java.lang.String) null;
  @FieldNoValue
  public final java.lang.String roamingProtocol = (java.lang.String) null;
  
  public final boolean carrierEnabled = false;
  
  public final int bearer = 0;

  // Constructors

  public ApnSetting(int arg1, 
		  @com.francetelecom.rd.stubs.annotation.FieldSet("numeric") java.lang.String arg2, 
		  @com.francetelecom.rd.stubs.annotation.FieldSet("carrier") java.lang.String arg3,
		  @com.francetelecom.rd.stubs.annotation.FieldSet("apn") java.lang.String arg4,
		  @com.francetelecom.rd.stubs.annotation.FieldSet("proxy") java.lang.String arg5,
		  @com.francetelecom.rd.stubs.annotation.FieldSet("port") java.lang.String arg6,
		  @com.francetelecom.rd.stubs.annotation.FieldSet("mmsc") java.lang.String arg7,
		  @com.francetelecom.rd.stubs.annotation.FieldSet("mmsProxy") java.lang.String arg8,
		  @com.francetelecom.rd.stubs.annotation.FieldSet("mmsPort") java.lang.String arg9,
		  @com.francetelecom.rd.stubs.annotation.FieldSet("user") java.lang.String arg10, 
		  @com.francetelecom.rd.stubs.annotation.FieldSet("password") java.lang.String arg11, 
		  int arg12,
		  @com.francetelecom.rd.stubs.annotation.FieldSet("types") java.lang.String [] arg13, 
		  @com.francetelecom.rd.stubs.annotation.FieldSet("protocol") java.lang.String arg14, 
		  @com.francetelecom.rd.stubs.annotation.FieldSet("roamingProtocol") java.lang.String arg15,
		  boolean arg16, int arg17){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static ApnSetting fromString(java.lang.String arg1){
    return (ApnSetting) null;
  }
  public boolean canHandleType(java.lang.String arg1){
    return false;
  }
}
