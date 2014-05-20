package java.util.zip;

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


public class Deflater
{
  // Fields

  public static final int BEST_COMPRESSION = 9;

  public static final int BEST_SPEED = 1;

  public static final int DEFAULT_COMPRESSION = -1;

  public static final int DEFAULT_STRATEGY = 0;

  public static final int DEFLATED = 8;

  public static final int FILTERED = 1;

  public static final int HUFFMAN_ONLY = 2;

  public static final int NO_COMPRESSION = 0;

  public static final int NO_FLUSH = 0;

  public static final int SYNC_FLUSH = 2;

  public static final int FULL_FLUSH = 3;

  // Constructors

  public Deflater(){
  }
  public Deflater(int arg1){
  }
  public Deflater(int arg1, boolean arg2){
  }
  // Methods

  protected void finalize(){
  }
  public synchronized void reset(){
  }
  public synchronized boolean finished(){
    return false;
  }
  public synchronized void end(){
  }
  public synchronized long getBytesWritten(){
    return 0l;
  }
  public void setInput(byte [] arg1){
  }
  public synchronized void setInput(byte [] arg1, int arg2, int arg3){
  }
  public synchronized boolean needsInput(){
    return false;
  }
  public synchronized int getAdler(){
    return 0;
  }
  public synchronized long getBytesRead(){
    return 0l;
  }
  public synchronized int getTotalIn(){
    return 0;
  }
  public synchronized int getTotalOut(){
    return 0;
  }
  public void setDictionary(byte [] arg1){
  }
  public synchronized void setDictionary(byte [] arg1, int arg2, int arg3){
  }
  public synchronized void finish(){
  }
  public synchronized void setLevel(int arg1){
  }
  public int deflate(byte [] arg1){
    return 0;
  }
  public synchronized int deflate(byte [] arg1, int arg2, int arg3){
    return 0;
  }
  public synchronized int deflate(byte [] arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  public synchronized void setStrategy(int arg1){
  }
}
