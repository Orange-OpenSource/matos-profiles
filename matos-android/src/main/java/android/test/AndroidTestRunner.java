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
public class AndroidTestRunner
  extends junit.runner.BaseTestRunner{
  // Constructors

  public AndroidTestRunner(){
    super();
  }
  // Methods

  public void setContext(android.content.Context arg1){
  }
  public void runTest(){
  }
  public void runTest(junit.framework.TestResult arg1){
  }
  public void setTestClassName(java.lang.String arg1, java.lang.String arg2){
  }
  public java.util.List<junit.framework.TestCase> getTestCases(){
    return (java.util.List) null;
  }
  public void setTest(junit.framework.Test arg1){
  }
  public void clearTestListeners(){
  }
  public void addTestListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("testListener") junit.framework.TestListener arg1){
  }
  protected junit.framework.TestResult createTestResult(){
    return (junit.framework.TestResult) null;
  }
  public java.lang.String getTestClassName(){
    return (java.lang.String) null;
  }
  public junit.framework.TestResult getTestResult(){
    return (junit.framework.TestResult) null;
  }
  public void setInstrumentation(android.app.Instrumentation arg1){
  }
  public void setInstrumentaiton(android.app.Instrumentation arg1){
  }
  public void setPerformanceResultsWriter(android.os.PerformanceCollector.PerformanceResultsWriter arg1){
  }
  protected java.lang.Class loadSuiteClass(java.lang.String arg1) throws java.lang.ClassNotFoundException{
    return (java.lang.Class) null;
  }
  public void testStarted(java.lang.String arg1){
  }
  public void testEnded(java.lang.String arg1){
  }
  public void testFailed(int arg1, junit.framework.Test arg2, java.lang.Throwable arg3){
  }
  protected void runFailed(java.lang.String arg1){
  }
}
