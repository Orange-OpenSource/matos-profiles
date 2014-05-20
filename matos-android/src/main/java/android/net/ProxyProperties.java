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


public class ProxyProperties
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<ProxyProperties> CREATOR = null;

  // Constructors

  public ProxyProperties(java.lang.String arg1, int arg2, java.lang.String arg3){
  }
  private ProxyProperties(java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String [] arg4){
  }
  public ProxyProperties(ProxyProperties arg1){
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
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean isExcluded(java.lang.String arg1){
    return false;
  }
  public java.net.InetSocketAddress getSocketAddress(){
    return (java.net.InetSocketAddress) null;
  }
  public java.lang.String getExclusionList(){
    return (java.lang.String) null;
  }
  public java.net.Proxy makeProxy(){
    return (java.net.Proxy) null;
  }
}
