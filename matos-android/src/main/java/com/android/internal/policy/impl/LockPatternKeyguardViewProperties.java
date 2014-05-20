package com.android.internal.policy.impl;

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


public class LockPatternKeyguardViewProperties
  implements KeyguardViewProperties
{
  // Constructors

  public LockPatternKeyguardViewProperties(com.android.internal.widget.LockPatternUtils arg1, KeyguardUpdateMonitor arg2){
  }
  // Methods

  public boolean isSecure(){
    return false;
  }
  public KeyguardViewBase createKeyguardView(android.content.Context arg1, KeyguardUpdateMonitor arg2, KeyguardWindowController arg3){
    return (KeyguardViewBase) null;
  }
}
