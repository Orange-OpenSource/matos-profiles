package android.telephony.cdma;

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
public class CdmaCellLocation
  extends android.telephony.CellLocation{
  // Fields

  public static final int INVALID_LAT_LONG = 2147483647;

  // Constructors

  public CdmaCellLocation(){
    super();
  }
  public CdmaCellLocation(android.os.Bundle arg1){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public boolean isEmpty(){
    return false;
  }
  public int getSystemId(){
    return 0;
  }
  public void fillInNotifierBundle(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "CdmaCellLocation.getNetworkId", report = "-")
  public int getNetworkId(){
    return 0;
  }
  public void setStateInvalid(){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "CdmaCellLocation.setCellLocationData-1", report = "-")
  public void setCellLocationData(int arg1, int arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "CdmaCellLocation.setCellLocationData-2", report = "-")
  public void setCellLocationData(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "CdmaCellLocation.getBaseStationId", report = "-")
  public int getBaseStationId(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "CdmaCellLocation.getBaseStationLattitude", report = "-")
  public int getBaseStationLatitude(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "CdmaCellLocation.getBaseStationLongitude", report = "-")
  public int getBaseStationLongitude(){
    return 0;
  }
}
