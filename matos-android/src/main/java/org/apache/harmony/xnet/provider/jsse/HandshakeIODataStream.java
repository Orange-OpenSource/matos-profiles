package org.apache.harmony.xnet.provider.jsse;

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


public class HandshakeIODataStream
  extends SSLInputStream  implements Appendable, DataStream
{
  // Constructors

  public HandshakeIODataStream(){
    super();
  }
  // Methods

  public void append(byte [] arg1){
  }
  public void write(byte arg1){
  }
  public void write(byte [] arg1){
  }
  public void mark(int arg1){
  }
  public void mark(){
  }
  public void reset(){
  }
  public int read() throws java.io.IOException{
    return 0;
  }
  public byte [] read(int arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public int read(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
    return 0;
  }
  public int available(){
    return 0;
  }
  public boolean markSupported(){
    return false;
  }
  public byte [] getData(int arg1){
    return (byte []) null;
  }
  public boolean hasData(){
    return false;
  }
  public void writeUint16(long arg1){
  }
  public void writeUint24(long arg1){
  }
  protected byte [] getDigestMD5withoutLast(){
    return (byte []) null;
  }
  protected byte [] getDigestSHAwithoutLast(){
    return (byte []) null;
  }
  protected byte [] getDigestMD5(){
    return (byte []) null;
  }
  protected byte [] getDigestSHA(){
    return (byte []) null;
  }
  protected byte [] getMessages(){
    return (byte []) null;
  }
  public void writeUint8(long arg1){
  }
  protected void clearBuffer(){
  }
  protected void removeFromMarkedPosition(){
  }
  public void writeUint32(long arg1){
  }
  public void writeUint64(long arg1){
  }
}
