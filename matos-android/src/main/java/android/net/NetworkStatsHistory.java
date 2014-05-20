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


public class NetworkStatsHistory
  implements android.os.Parcelable
{
  // Classes

  public static class Entry
  {
    // Fields

    public static final long UNKNOWN = -1l;

    public long bucketDuration;

    public long bucketStart;

    public long activeTime;

    public long rxBytes;

    public long rxPackets;

    public long txBytes;

    public long txPackets;

    public long operations;

    // Constructors

    public Entry(){
    }
  }
  public static class DataStreamUtils
  {
    // Constructors

    public DataStreamUtils(){
    }
    // Methods

    @java.lang.Deprecated
    public static long [] readFullLongArray(java.io.DataInputStream arg1) throws java.io.IOException{
      return (long []) null;
    }
    public static long [] readVarLongArray(java.io.DataInputStream arg1) throws java.io.IOException{
      return (long []) null;
    }
    public static void writeVarLongArray(java.io.DataOutputStream arg1, long [] arg2, int arg3) throws java.io.IOException{
    }
    public static long readVarLong(java.io.DataInputStream arg1) throws java.io.IOException{
      return 0l;
    }
    public static void writeVarLong(java.io.DataOutputStream arg1, long arg2) throws java.io.IOException{
    }
  }
  public static class ParcelUtils
  {
    // Constructors

    public ParcelUtils(){
    }
    // Methods

    public static long [] readLongArray(android.os.Parcel arg1){
      return (long []) null;
    }
    public static void writeLongArray(android.os.Parcel arg1, long [] arg2, int arg3){
    }
  }
  // Fields

  public static final int FIELD_ACTIVE_TIME = 1;

  public static final int FIELD_RX_BYTES = 2;

  public static final int FIELD_RX_PACKETS = 4;

  public static final int FIELD_TX_BYTES = 8;

  public static final int FIELD_TX_PACKETS = 16;

  public static final int FIELD_OPERATIONS = 32;

  public static final int FIELD_ALL = -1;

  public static final android.os.Parcelable.Creator<NetworkStatsHistory> CREATOR = null;

  // Constructors

  public NetworkStatsHistory(long arg1){
  }
  public NetworkStatsHistory(long arg1, int arg2){
  }
  public NetworkStatsHistory(long arg1, int arg2, int arg3){
  }
  public NetworkStatsHistory(android.os.Parcel arg1){
  }
  public NetworkStatsHistory(java.io.DataInputStream arg1) throws java.io.IOException{
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int size(){
    return 0;
  }
  public void dump(java.lang.String arg1, java.io.PrintWriter arg2, boolean arg3){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public NetworkStatsHistory.Entry getValues(int arg1, NetworkStatsHistory.Entry arg2){
    return (NetworkStatsHistory.Entry) null;
  }
  public NetworkStatsHistory.Entry getValues(long arg1, long arg2, NetworkStatsHistory.Entry arg3){
    return (NetworkStatsHistory.Entry) null;
  }
  public NetworkStatsHistory.Entry getValues(long arg1, long arg2, long arg3, NetworkStatsHistory.Entry arg4){
    return (NetworkStatsHistory.Entry) null;
  }
  public long getEnd(){
    return 0l;
  }
  public void writeToStream(java.io.DataOutputStream arg1) throws java.io.IOException{
  }
  public long getBucketDuration(){
    return 0l;
  }
  public long getStart(){
    return 0l;
  }
  public int getIndexBefore(long arg1){
    return 0;
  }
  public int getIndexAfter(long arg1){
    return 0;
  }
  @java.lang.Deprecated
  public void recordData(long arg1, long arg2, long arg3, long arg4){
  }
  public void recordData(long arg1, long arg2, NetworkStats.Entry arg3){
  }
  public void recordEntireHistory(NetworkStatsHistory arg1){
  }
  public void removeBucketsBefore(long arg1){
  }
  @java.lang.Deprecated
  public void generateRandom(long arg1, long arg2, long arg3){
  }
  @java.lang.Deprecated
  public void generateRandom(long arg1, long arg2, long arg3, long arg4, long arg5, long arg6, long arg7, java.util.Random arg8){
  }
  public static long randomLong(java.util.Random arg1, long arg2, long arg3){
    return 0l;
  }
}
