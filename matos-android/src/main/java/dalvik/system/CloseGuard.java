package dalvik.system;

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


public final class CloseGuard
{
  // Classes

  public static interface Reporter
  {
    // Methods

	 @com.francetelecom.rd.stubs.annotation.CallBack("Reporter")
     public void report(java.lang.String arg1, java.lang.Throwable arg2);
  }
  // Constructors

  private CloseGuard(){
  }
  // Methods

  public static CloseGuard get(){
    return (CloseGuard) null;
  }
  public void close(){
  }
  public void open(java.lang.String arg1){
  }
  public static void setEnabled(boolean arg1){
  }
  public void warnIfOpen(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mReporter")
  public static CloseGuard.Reporter getReporter(){
    return (CloseGuard.Reporter) null;
  }
  public static void setReporter(@com.francetelecom.rd.stubs.annotation.FieldSet("mReporter") @com.francetelecom.rd.stubs.annotation.CallBackRegister("Reporter") CloseGuard.Reporter arg1){  }
}
