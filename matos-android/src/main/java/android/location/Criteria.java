package android.location;

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
public class Criteria
  implements android.os.Parcelable
{
  // Fields

  public static final int NO_REQUIREMENT = 0;

  public static final int POWER_LOW = 1;

  public static final int POWER_MEDIUM = 2;

  public static final int POWER_HIGH = 3;

  public static final int ACCURACY_FINE = 1;

  public static final int ACCURACY_COARSE = 2;

  public static final int ACCURACY_LOW = 1;

  public static final int ACCURACY_MEDIUM = 2;

  public static final int ACCURACY_HIGH = 3;

  public static final android.os.Parcelable.Creator<Criteria> CREATOR = null;

  // Constructors

  public Criteria(){
  }
  public Criteria(Criteria arg1){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public int getAccuracy(){
    return 0;
  }
  public int getPowerRequirement(){
    return 0;
  }
  public void setAccuracy(int arg1){
  }
  public boolean isAltitudeRequired(){
    return false;
  }
  public boolean isSpeedRequired(){
    return false;
  }
  public boolean isBearingRequired(){
    return false;
  }
  public void setPowerRequirement(int arg1){
  }
  public void setBearingRequired(boolean arg1){
  }
  public void setSpeedRequired(boolean arg1){
  }
  public void setAltitudeRequired(boolean arg1){
  }
  public void setHorizontalAccuracy(int arg1){
  }
  public int getHorizontalAccuracy(){
    return 0;
  }
  public void setVerticalAccuracy(int arg1){
  }
  public int getVerticalAccuracy(){
    return 0;
  }
  public void setSpeedAccuracy(int arg1){
  }
  public int getSpeedAccuracy(){
    return 0;
  }
  public void setBearingAccuracy(int arg1){
  }
  public int getBearingAccuracy(){
    return 0;
  }
  public void setCostAllowed(boolean arg1){
  }
  public boolean isCostAllowed(){
    return false;
  }
}
