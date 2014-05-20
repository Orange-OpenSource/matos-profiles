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


public class NetworkStats
  implements android.os.Parcelable
{
  // Classes

  public static class Entry
  {
    // Fields

    public java.lang.String iface;

    public int uid;

    public int set;

    public int tag;

    public long rxBytes;

    public long rxPackets;

    public long txBytes;

    public long txPackets;

    public long operations;

    // Constructors

    public Entry(){
    }
    public Entry(long arg1, long arg2, long arg3, long arg4, long arg5){
    }
    public Entry(java.lang.String arg1, int arg2, int arg3, int arg4, long arg5, long arg6, long arg7, long arg8, long arg9){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final java.lang.String IFACE_ALL = null;

  public static final int UID_ALL = -1;

  public static final int SET_ALL = -1;

  public static final int SET_DEFAULT = 0;

  public static final int SET_FOREGROUND = 1;

  public static final int TAG_NONE = 0;

  public static final android.os.Parcelable.Creator<NetworkStats> CREATOR = null;

  // Constructors

  public NetworkStats(long arg1, int arg2){
  }
  public NetworkStats(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int size(){
    return 0;
  }
  public NetworkStats.Entry getTotal(NetworkStats.Entry arg1){
    return (NetworkStats.Entry) null;
  }
  public NetworkStats.Entry getTotal(NetworkStats.Entry arg1, int arg2){
    return (NetworkStats.Entry) null;
  }
  public NetworkStats.Entry getTotal(NetworkStats.Entry arg1, java.util.HashSet<java.lang.String> arg2){
    return (NetworkStats.Entry) null;
  }
  public void dump(java.lang.String arg1, java.io.PrintWriter arg2){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public NetworkStats.Entry getValues(int arg1, NetworkStats.Entry arg2){
    return (NetworkStats.Entry) null;
  }
  public NetworkStats subtract(NetworkStats arg1){
    return (NetworkStats) null;
  }
  public int findIndex(java.lang.String arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  @java.lang.Deprecated
  public NetworkStats combineValues(java.lang.String arg1, int arg2, int arg3, long arg4, long arg5, long arg6, long arg7, long arg8){
    return (NetworkStats) null;
  }
  public NetworkStats combineValues(java.lang.String arg1, int arg2, int arg3, int arg4, long arg5, long arg6, long arg7, long arg8, long arg9){
    return (NetworkStats) null;
  }
  public NetworkStats combineValues(NetworkStats.Entry arg1){
    return (NetworkStats) null;
  }
  public long getElapsedRealtime(){
    return 0l;
  }
  public void spliceOperationsFrom(NetworkStats arg1){
  }
  public void combineAllValues(NetworkStats arg1){
  }
  public long getTotalBytes(){
    return 0l;
  }
  public static java.lang.String setToString(int arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String tagToString(int arg1){
    return (java.lang.String) null;
  }
  public NetworkStats subtractClamped(NetworkStats arg1){
    return (NetworkStats) null;
  }
  public NetworkStats groupedByIface(){
    return (NetworkStats) null;
  }
  public NetworkStats addIfaceValues(java.lang.String arg1, long arg2, long arg3, long arg4, long arg5){
    return (NetworkStats) null;
  }
  public NetworkStats addValues(java.lang.String arg1, int arg2, int arg3, int arg4, long arg5, long arg6, long arg7, long arg8, long arg9){
    return (NetworkStats) null;
  }
  public NetworkStats addValues(NetworkStats.Entry arg1){
    return (NetworkStats) null;
  }
  public long getElapsedRealtimeAge(){
    return 0l;
  }
  public int internalSize(){
    return 0;
  }
  public java.lang.String [] getUniqueIfaces(){
    return (java.lang.String []) null;
  }
  public int [] getUniqueUids(){
    return (int []) null;
  }
  public NetworkStats groupedByUid(){
    return (NetworkStats) null;
  }
}
