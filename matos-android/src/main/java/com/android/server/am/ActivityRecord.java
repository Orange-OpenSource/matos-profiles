package com.android.server.am;

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


public final class ActivityRecord
  extends android.view.IApplicationToken.Stub{
  // Constructors

  public ActivityRecord(){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void stopFreezingScreenLocked(boolean arg1){
  }
  public void windowsVisible(){
  }
  public void windowsGone(){
  }
  public boolean keyDispatchingTimedOut(){
    return false;
  }
  public long getKeyDispatchingTimeout(){
    return 0l;
  }
  public boolean isInterestingToUserLocked(){
    return false;
  }
  public void setSleeping(boolean arg1){
  }
}
