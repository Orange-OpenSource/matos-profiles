package android.os;

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


public class RecoverySystem
{
  // Classes

  public static interface ProgressListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onProgress")
    public void onProgress(int arg1);
  }
  // Constructors

  public RecoverySystem(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "RecoverySystem.installPackage", pos = {1, 2}, report = "-")
  public static void installPackage(android.content.Context arg1, java.io.File arg2) throws java.io.IOException{
  }
  public static java.lang.String handleAftermath(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "RecoverySystem.rebootWipeUserData", report = "-")
  public static void rebootWipeUserData(android.content.Context arg1) throws java.io.IOException{
  }
  public static void verifyPackage(java.io.File arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onProgress") RecoverySystem.ProgressListener arg2, java.io.File arg3) throws java.io.IOException, java.security.GeneralSecurityException{
  }
  public static void rebootWipeCache(android.content.Context arg1) throws java.io.IOException{
  }
}
