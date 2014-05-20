package android.app;

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
public abstract class IntentService
  extends Service{
  // Constructors

  public IntentService(java.lang.String arg1){
    super();
  }
  // Methods

  public void onCreate(){
  }
  public void onDestroy(){
  }
  public void onStart(android.content.Intent arg1, int arg2){
  }
  public android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  public int onStartCommand(android.content.Intent arg1, int arg2, int arg3){
    return 0;
  }
  public void setIntentRedelivery(boolean arg1){
  }
  protected abstract void onHandleIntent(android.content.Intent arg1);
}
