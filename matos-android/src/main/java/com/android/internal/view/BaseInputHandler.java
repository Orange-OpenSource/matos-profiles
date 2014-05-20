package com.android.internal.view;

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


public abstract class BaseInputHandler
  implements android.view.InputHandler
{
  // Constructors

  public BaseInputHandler(){
  }
  // Methods

  public void handleMotion(android.view.MotionEvent arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("FinishedCallback") android.view.InputQueue.FinishedCallback arg2){
  }
  public void handleKey(android.view.KeyEvent arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("FinishedCallback") android.view.InputQueue.FinishedCallback arg2){
  }
}
