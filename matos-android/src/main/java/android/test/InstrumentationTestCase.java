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
public class InstrumentationTestCase
  extends junit.framework.TestCase{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public InstrumentationTestCase(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void tearDown() throws java.lang.Exception{
  }
  protected void runTest() throws java.lang.Throwable{
  }
  @com.francetelecom.rd.stubs.annotation.Code("try { return arg2.newInstance(); } catch (Exception e) { return null; }")
  public final <T extends android.app.Activity>T launchActivity(java.lang.String arg1, java.lang.Class<T> arg2, android.os.Bundle arg3){
    return null;
  }
  public void injectInstrumentation(android.app.Instrumentation arg1){
  }
  public android.app.Instrumentation getInstrumentation(){
    return (android.app.Instrumentation) null;
  }
  public void injectInsrumentation(android.app.Instrumentation arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("try { return arg2.newInstance(); } catch (Exception e) { return null; }")
  public final <T extends android.app.Activity>T launchActivityWithIntent(java.lang.String arg1, java.lang.Class<T> arg2, android.content.Intent arg3){
    return null;
  }
  public void runTestOnUiThread(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1) throws java.lang.Throwable{
  }
  public void sendKeys(java.lang.String arg1){
  }
  public void sendKeys(int [] arg1){
  }
  public void sendRepeatedKeys(int [] arg1){
  }
}
