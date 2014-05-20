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
public class TestRunner
  implements PerformanceTestCase.Intermediates
{
  // Classes

  public class JunitTestSuite
    extends junit.framework.TestSuite    implements junit.framework.TestListener
  {
    // Fields

    // Constructors

    public JunitTestSuite(){
      super();
    }
    // Methods

    public void run(junit.framework.TestResult arg1){
    }
    public void startTest(junit.framework.Test arg1){
    }
    public void endTest(junit.framework.Test arg1){
    }
    public void addError(junit.framework.Test arg1, java.lang.Throwable arg2){
    }
    public void addFailure(junit.framework.Test arg1, junit.framework.AssertionFailedError arg2){
    }
  }
  public static class IntermediateTime
  {
    // Fields

    public java.lang.String name;

    public long timeInNS;

    // Constructors

    public IntermediateTime(java.lang.String arg1, long arg2){
    }
  }
  public static interface Listener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("testRunnerListener")
    public void finished(java.lang.String arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("testRunnerListener")
    public void started(java.lang.String arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("testRunnerListener")
    public void failed(java.lang.String arg1, java.lang.Throwable arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("testRunnerListener")
    public void passed(java.lang.String arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("testRunnerListener")
    public void performance(java.lang.String arg1, long arg2, int arg3, java.util.List<TestRunner.IntermediateTime> arg4);
  }
  // Fields

  public static final int REGRESSION = 0;

  public static final int PERFORMANCE = 1;

  public static final int PROFILING = 2;

  public static final int CLEARSCREEN = 0;

  // Constructors

  public TestRunner(android.content.Context arg1){
  }
  // Methods

  public void run(java.lang.String [] arg1){
  }
  public void run(java.lang.String arg1){
  }
  public static java.lang.String getTitle(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void addListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("testRunnerListener") TestRunner.Listener arg1){
  }
  public void startProfiling(){
  }
  public void startTiming(boolean arg1){
  }
  public void setInternalIterations(int arg1){
  }
  public void addIntermediate(java.lang.String arg1){
  }
  public void addIntermediate(java.lang.String arg1, long arg2){
  }
  public void finishTiming(boolean arg1){
  }
  public void failed(java.lang.String arg1, java.lang.Throwable arg2){
  }
  public void passed(java.lang.String arg1){
  }
  public static java.lang.String [] getChildren(android.content.Context arg1, java.lang.String arg2){
    return (java.lang.String []) null;
  }
  public static java.lang.String [] getChildren(java.lang.reflect.Method arg1){
    return (java.lang.String []) null;
  }
  public void finishProfiling(){
  }
  public int passedCount(){
    return 0;
  }
  public int failedCount(){
    return 0;
  }
  public void setPerformanceMode(int arg1){
  }
  public void runInPerformanceMode(java.lang.Object arg1, java.lang.String arg2, boolean arg3, java.lang.String arg4) throws java.lang.Exception{
  }
  public void runSingleJunitTest(java.lang.String arg1){
  }
  public static java.lang.reflect.Method getChildrenMethod(java.lang.Class arg1){
    return (java.lang.reflect.Method) null;
  }
  public static java.lang.reflect.Method getChildrenMethod(android.content.Context arg1, java.lang.String arg2){
    return (java.lang.reflect.Method) null;
  }
  public static java.lang.String [] getTestChildren(android.content.Context arg1, java.lang.String arg2){
    return (java.lang.String []) null;
  }
  public static java.lang.String [] getTestChildren(java.lang.Class arg1){
    return (java.lang.String []) null;
  }
  public static java.lang.reflect.Method [] getAllTestMethods(java.lang.Class arg1){
    return (java.lang.reflect.Method []) null;
  }
  public static int countJunitTests(java.lang.Class arg1){
    return 0;
  }
  public static boolean isTestSuite(android.content.Context arg1, java.lang.String arg2){
    return false;
  }
  public boolean isJunitTest(java.lang.String arg1){
    return false;
  }
  public static int countTests(android.content.Context arg1, java.lang.String arg2){
    return 0;
  }
}
