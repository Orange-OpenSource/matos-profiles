package android.net.sip;

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
public class SipSessionAdapter
  extends ISipSessionListener.Stub{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SipSessionAdapter(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onError(ISipSession arg1, int arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCallEnded(ISipSession arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCallEstablished(ISipSession arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCallBusy(ISipSession arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCalling(ISipSession arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRinging(ISipSession arg1, SipProfile arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRingingBack(ISipSession arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCallTransferring(ISipSession arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCallChangeFailed(ISipSession arg1, int arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRegistering(ISipSession arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRegistrationDone(ISipSession arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRegistrationFailed(ISipSession arg1, int arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRegistrationTimeout(ISipSession arg1){
  }
}
