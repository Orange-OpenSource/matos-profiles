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


public class TrafficStats
{
  // Fields

  public static final int UNSUPPORTED = -1;

  public static final int UID_REMOVED = -4;

  public static final int UID_TETHERING = -5;

  public static final int TAG_SYSTEM_DOWNLOAD = -255;

  public static final int TAG_SYSTEM_MEDIA = -254;

  public static final int TAG_SYSTEM_BACKUP = -253;

  // Constructors

  public TrafficStats(){
  }
  // Methods

  public static void incrementOperationCount(int arg1){
  }
  public static void incrementOperationCount(int arg1, int arg2){
  }
  public static long getTxPackets(java.lang.String arg1){
    return 0l;
  }
  public static long getRxPackets(java.lang.String arg1){
    return 0l;
  }
  public static void tagSocket(java.net.Socket arg1) throws java.net.SocketException{
  }
  public static void setThreadStatsTag(int arg1){
  }
  public static int getThreadStatsTag(){
    return 0;
  }
  public static void clearThreadStatsTag(){
  }
  public static void setThreadStatsUid(int arg1){
  }
  public static void clearThreadStatsUid(){
  }
  public static void untagSocket(java.net.Socket arg1) throws java.net.SocketException{
  }
  public static void startDataProfiling(android.content.Context arg1){
  }
  public static NetworkStats stopDataProfiling(android.content.Context arg1){
    return (NetworkStats) null;
  }
  public static long getMobileTxPackets(){
    return 0l;
  }
  public static long getMobileRxPackets(){
    return 0l;
  }
  public static long getMobileTxBytes(){
    return 0l;
  }
  public static long getMobileRxBytes(){
    return 0l;
  }
  public static long getTxBytes(java.lang.String arg1){
    return 0l;
  }
  public static long getRxBytes(java.lang.String arg1){
    return 0l;
  }
  public static long getTotalTxPackets(){
    return 0l;
  }
  public static long getTotalRxPackets(){
    return 0l;
  }
  public static long getTotalTxBytes(){
    return 0l;
  }
  public static long getTotalRxBytes(){
    return 0l;
  }
  public static long getUidTxBytes(int arg1){
    return 0l;
  }
  public static long getUidRxBytes(int arg1){
    return 0l;
  }
  public static long getUidTxPackets(int arg1){
    return 0l;
  }
  public static long getUidRxPackets(int arg1){
    return 0l;
  }
  public static long getUidTcpTxBytes(int arg1){
    return 0l;
  }
  public static long getUidTcpRxBytes(int arg1){
    return 0l;
  }
  public static long getUidUdpTxBytes(int arg1){
    return 0l;
  }
  public static long getUidUdpRxBytes(int arg1){
    return 0l;
  }
  public static long getUidTcpTxSegments(int arg1){
    return 0l;
  }
  public static long getUidTcpRxSegments(int arg1){
    return 0l;
  }
  public static long getUidUdpTxPackets(int arg1){
    return 0l;
  }
  public static long getUidUdpRxPackets(int arg1){
    return 0l;
  }
}
