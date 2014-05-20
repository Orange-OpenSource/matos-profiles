package android.media;

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
public class MiniThumbFile
{
  // Fields

  public static final int BYTES_PER_MINTHUMB = 10000;

  // Constructors

  public MiniThumbFile(android.net.Uri arg1){
  }
  // Methods

  public static synchronized void reset(){
  }
  public synchronized void deactivate(){
  }
  public static synchronized MiniThumbFile instance(android.net.Uri arg1){
    return (MiniThumbFile) null;
  }
  public synchronized byte [] getMiniThumbFromFile(long arg1, byte [] arg2){
    return (byte []) null;
  }
  public synchronized long getMagic(long arg1){
    return 0l;
  }
  public synchronized void saveMiniThumbToFile(byte [] arg1, long arg2, long arg3) throws java.io.IOException{
  }
}
