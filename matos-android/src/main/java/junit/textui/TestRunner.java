package junit.textui;

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


public class TestRunner
  extends junit.runner.BaseTestRunner{
  // Fields

  public static final int SUCCESS_EXIT = 0;

  public static final int FAILURE_EXIT = 1;

  public static final int EXCEPTION_EXIT = 2;

  // Constructors

  public TestRunner(){
    super();
  }
  public TestRunner(java.io.PrintStream arg1){
    super();
  }
  public TestRunner(ResultPrinter arg1){
    super();
  }
  // Methods

  public static void main(java.lang.String [] arg1){
  }
  public static void run(java.lang.Class arg1){
  }
  public static junit.framework.TestResult run(junit.framework.Test arg1){
    return (junit.framework.TestResult) null;
  }
  protected junit.framework.TestResult start(java.lang.String [] arg1) throws java.lang.Exception{
    return (junit.framework.TestResult) null;
  }
  public junit.runner.TestSuiteLoader getLoader(){
    return (junit.runner.TestSuiteLoader) null;
  }
  protected void pause(boolean arg1){
  }
  protected junit.framework.TestResult createTestResult(){
    return (junit.framework.TestResult) null;
  }
  public void testStarted(java.lang.String arg1){
  }
  public void testEnded(java.lang.String arg1){
  }
  public void testFailed(int arg1, junit.framework.Test arg2, java.lang.Throwable arg3){
  }
  protected void runFailed(java.lang.String arg1){
  }
  public junit.framework.TestResult doRun(junit.framework.Test arg1){
    return (junit.framework.TestResult) null;
  }
  public junit.framework.TestResult doRun(junit.framework.Test arg1, boolean arg2){
    return (junit.framework.TestResult) null;
  }
  public static void runAndWait(junit.framework.Test arg1){
  }
  public void setPrinter(ResultPrinter arg1){
  }
}
