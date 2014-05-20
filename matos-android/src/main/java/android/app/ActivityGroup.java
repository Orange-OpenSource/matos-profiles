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
public class ActivityGroup
  extends Activity{
  // Fields

  protected LocalActivityManager mLocalActivityManager;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActivityGroup(){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActivityGroup(boolean arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  protected void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  protected void onResume(){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  protected void onPause(){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  protected void onDestroy(){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  protected void onSaveInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  protected void onStop(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public java.util.HashMap<java.lang.String, java.lang.Object> onRetainNonConfigurationChildInstances(){
    return (java.util.HashMap) null;
  }
  public Activity getCurrentActivity(){
    return (Activity) null;
  }
  public final LocalActivityManager getLocalActivityManager(){
    return (LocalActivityManager) null;
  }
}
