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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class HandlerThread
  extends java.lang.Thread{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("createHandler")
  public HandlerThread(java.lang.String arg1){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("createHandler")
  public HandlerThread(java.lang.String arg1, int arg2){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public void run(){
  }
  public Looper getLooper(){
    return (Looper) null;
  }
  public boolean quit(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("createHandler")
  protected void onLooperPrepared(){
  }
  public int getThreadId(){
    return 0;
  }
}
