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


public class Country
  implements android.os.Parcelable
{
  // Fields

  public static final int COUNTRY_SOURCE_NETWORK = 0;

  public static final int COUNTRY_SOURCE_LOCATION = 1;

  public static final int COUNTRY_SOURCE_SIM = 2;

  public static final int COUNTRY_SOURCE_LOCALE = 3;

  public static final android.os.Parcelable.Creator<Country> CREATOR = null;

  // Constructors

  public Country(java.lang.String arg1, int arg2){
  }
  public Country(Country arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public final int getSource(){
    return 0;
  }
  public final java.lang.String getCountryIso(){
    return (java.lang.String) null;
  }
  public boolean equalsIgnoreSource(Country arg1){
    return false;
  }
}
