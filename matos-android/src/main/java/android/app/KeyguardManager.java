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
public class KeyguardManager
{
  // Classes

  public class KeyguardLock
  {
    // Fields

    // Constructors

    KeyguardLock(java.lang.String arg1){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.UseRule(value = "KeyguardManager.disableKeyguard", report = "-")
    public void disableKeyguard(){
    }
    public void reenableKeyguard(){
    }
  }
  public static interface OnKeyguardExitResult
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onKeyguardExitResult")
    public void onKeyguardExitResult(boolean arg1);
  }
  // Constructors

  KeyguardManager(){
  }
  // Methods

  public void exitKeyguardSecurely(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onKeyguardExitResult") KeyguardManager.OnKeyguardExitResult arg1){
  }
  public boolean inKeyguardRestrictedInputMode(){
    return false;
  }
  public boolean isKeyguardLocked(){
    return false;
  }
  public boolean isKeyguardSecure(){
    return false;
  }
  public KeyguardManager.KeyguardLock newKeyguardLock(java.lang.String arg1){
    return (KeyguardManager.KeyguardLock) null;
  }
}
