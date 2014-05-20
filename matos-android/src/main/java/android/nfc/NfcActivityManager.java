package android.nfc;

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
public final class NfcActivityManager
  extends INdefPushCallback.Stub{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public NfcActivityManager(NfcAdapter arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public synchronized void onResume(android.app.Activity arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public synchronized void onPause(android.app.Activity arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroy(android.app.Activity arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onNdefPushComplete(){
  }
  public synchronized void setNdefPushMessage(android.app.Activity arg1, NdefMessage arg2){
  }
  public synchronized void setNdefPushMessageCallback(android.app.Activity arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("CreateNdefMessageCallback") NfcAdapter.CreateNdefMessageCallback arg2){
  }
  public synchronized void setOnNdefPushCompleteCallback(android.app.Activity arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("OnNdefPushCompleteCallback") NfcAdapter.OnNdefPushCompleteCallback arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public NdefMessage createMessage(){
    return (NdefMessage) null;
  }
}
