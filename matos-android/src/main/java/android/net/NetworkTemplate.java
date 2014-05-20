package android.net;

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


public class NetworkTemplate
  implements android.os.Parcelable
{
  // Fields

  public static final int MATCH_MOBILE_ALL = 1;

  public static final int MATCH_MOBILE_3G_LOWER = 2;

  public static final int MATCH_MOBILE_4G = 3;

  public static final int MATCH_WIFI = 4;

  public static final int MATCH_ETHERNET = 5;

  public static final android.os.Parcelable.Creator<NetworkTemplate> CREATOR = null;

  // Constructors

  public NetworkTemplate(int arg1, java.lang.String arg2){
  }
  private NetworkTemplate(android.os.Parcel arg1){
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
  public boolean matches(NetworkIdentity arg1){
    return false;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public java.lang.String getSubscriberId(){
    return (java.lang.String) null;
  }
  public static NetworkTemplate buildTemplateMobileAll(java.lang.String arg1){
    return (NetworkTemplate) null;
  }
  public static NetworkTemplate buildTemplateMobile3gLower(java.lang.String arg1){
    return (NetworkTemplate) null;
  }
  public static NetworkTemplate buildTemplateMobile4g(java.lang.String arg1){
    return (NetworkTemplate) null;
  }
  public static NetworkTemplate buildTemplateWifi(){
    return (NetworkTemplate) null;
  }
  public static NetworkTemplate buildTemplateEthernet(){
    return (NetworkTemplate) null;
  }
  public int getMatchRule(){
    return 0;
  }
}
