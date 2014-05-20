package android.os;

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


public abstract class FileObserver
{
  // Fields

  public static final int ACCESS = 1;

  public static final int MODIFY = 2;

  public static final int ATTRIB = 4;

  public static final int CLOSE_WRITE = 8;

  public static final int CLOSE_NOWRITE = 16;

  public static final int OPEN = 32;

  public static final int MOVED_FROM = 64;

  public static final int MOVED_TO = 128;

  public static final int CREATE = 256;

  public static final int DELETE = 512;

  public static final int DELETE_SELF = 1024;

  public static final int MOVE_SELF = 2048;

  public static final int ALL_EVENTS = 4095;

  // Constructors

  public FileObserver(java.lang.String arg1){
  }
  public FileObserver(java.lang.String arg1, int arg2){
  }
  // Methods

  protected void finalize(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onEvent")
  public abstract void onEvent(int arg1, java.lang.String arg2);
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onEvent")
  public void startWatching(){
  }
  public void stopWatching(){
  }
}
