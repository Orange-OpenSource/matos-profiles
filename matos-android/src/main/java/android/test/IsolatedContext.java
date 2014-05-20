package android.test;

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
public class IsolatedContext
  extends android.content.ContextWrapper{
  // Constructors

  public IsolatedContext(android.content.ContentResolver arg1, android.content.Context arg2){
    super((android.content.Context) null);
  }
  // Methods

  public java.lang.Object getSystemService(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public android.content.ContentResolver getContentResolver(){
    return (android.content.ContentResolver) null;
  }
  public android.content.Intent registerReceiver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onReceive") android.content.BroadcastReceiver arg1, android.content.IntentFilter arg2){
    return (android.content.Intent) null;
  }
  public void unregisterReceiver(android.content.BroadcastReceiver arg1){
  }
  public void sendBroadcast(android.content.Intent arg1){
  }
  public java.io.File getFilesDir(){
    return (java.io.File) null;
  }
  public void sendOrderedBroadcast(android.content.Intent arg1, java.lang.String arg2){
  }
  public boolean bindService(android.content.Intent arg1, android.content.ServiceConnection arg2, int arg3){
    return false;
  }
  public int checkUriPermission(android.net.Uri arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5, int arg6){
    return 0;
  }
  public int checkUriPermission(android.net.Uri arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  public java.util.List<android.content.Intent> getAndClearBroadcastIntents(){
    return (java.util.List) null;
  }
}
