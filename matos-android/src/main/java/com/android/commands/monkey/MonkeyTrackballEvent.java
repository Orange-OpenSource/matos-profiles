package com.android.commands.monkey;

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


public class MonkeyTrackballEvent
  extends MonkeyMotionEvent{
  // Constructors

  public MonkeyTrackballEvent(int arg1){
    super(0, 0, 0);
  }
  // Methods

  protected java.lang.String getTypeLabel(){
    return (java.lang.String) null;
  }
  protected boolean injectMotionEvent(android.view.IWindowManager arg1, android.view.MotionEvent arg2) throws android.os.RemoteException{
    return false;
  }
}
