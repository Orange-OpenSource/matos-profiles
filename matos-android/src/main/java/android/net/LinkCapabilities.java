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


public class LinkCapabilities
  implements android.os.Parcelable
{
  // Classes

  public static final class Key
  {
    // Fields

    public static final int RO_NETWORK_TYPE = 1;

    public static final int RW_DESIRED_FWD_BW = 2;

    public static final int RW_REQUIRED_FWD_BW = 3;

    public static final int RO_AVAILABLE_FWD_BW = 4;

    public static final int RW_DESIRED_REV_BW = 5;

    public static final int RW_REQUIRED_REV_BW = 6;

    public static final int RO_AVAILABLE_REV_BW = 7;

    public static final int RW_MAX_ALLOWED_LATENCY = 8;

    public static final int RO_BOUND_INTERFACE = 9;

    public static final int RO_PHYSICAL_INTERFACE = 10;

    // Constructors

    private Key(){
    }
  }
  public static final class Role
  {
    // Fields

    public static final java.lang.String DEFAULT = "default";

    public static final java.lang.String BULK_DOWNLOAD = "bulk.download";

    public static final java.lang.String BULK_UPLOAD = "bulk.upload";

    public static final java.lang.String VOIP_24KBPS = "voip.24k";

    public static final java.lang.String VOIP_32KBPS = "voip.32k";

    public static final java.lang.String VIDEO_STREAMING_480P = "video.streaming.480p";

    public static final java.lang.String VIDEO_STREAMING_720I = "video.streaming.720i";

    public static final java.lang.String VIDEO_CHAT_360P = "video.chat.360p";

    public static final java.lang.String VIDEO_CHAT_480P = "video.chat.480i";

    // Constructors

    private Role(){
    }
  }
  // Fields

  public static final android.os.Parcelable.Creator<LinkCapabilities> CREATOR = null;

  // Constructors

  public LinkCapabilities(){
  }
  public LinkCapabilities(LinkCapabilities arg1){
  }
  // Methods

  public java.lang.String get(int arg1){
    return (java.lang.String) null;
  }
  public void put(int arg1, java.lang.String arg2){
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.util.Collection<java.lang.String> values(){
    return (java.util.Collection) null;
  }
  protected static void log(java.lang.String arg1){
  }
  public void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  public java.util.Set<java.util.Map.Entry<java.lang.Integer, java.lang.String>> entrySet(){
    return (java.util.Set) null;
  }
  public int size(){
    return 0;
  }
  public java.util.Set<java.lang.Integer> keySet(){
    return (java.util.Set) null;
  }
  public boolean containsKey(int arg1){
    return false;
  }
  public boolean containsValue(java.lang.String arg1){
    return false;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public static LinkCapabilities createNeedsMap(java.lang.String arg1){
    return (LinkCapabilities) null;
  }
}
