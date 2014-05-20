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


public class OperatorInfo
  implements android.os.Parcelable
{
  // Classes

  public static enum State
  {
    // Enum Constants

    UNKNOWN()
, AVAILABLE()
, CURRENT()
, FORBIDDEN()
;
    // Fields

    // Constructors

    private State(){
    }
    // Methods

  }
  // Fields

  public static final android.os.Parcelable.Creator<OperatorInfo> CREATOR = null;

  // Constructors

  OperatorInfo(@com.francetelecom.rd.stubs.annotation.FieldSet("operatorAlphaLong") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("operatorAlphaShort") java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("operatorNumeric") java.lang.String arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("state") OperatorInfo.State arg4){
  }
  public OperatorInfo(@com.francetelecom.rd.stubs.annotation.FieldSet("operatorAlphaLong") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("operatorAlphaShort") java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("operatorNumeric") java.lang.String arg3, java.lang.String arg4){
  }
  
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("state")
  public OperatorInfo.State getState(){
    return (OperatorInfo.State) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("operatorNumeric")
  public java.lang.String getOperatorNumeric(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("operatorAlphaLong")
  public java.lang.String getOperatorAlphaLong(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("operatorAlphaShort")
  public java.lang.String getOperatorAlphaShort(){
    return (java.lang.String) null;
  }
}
