package junit.runner;

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


public abstract class BaseTestRunner
  implements junit.framework.TestListener
{
  // Fields

  public static final java.lang.String SUITE_METHODNAME = "suite";

  // Constructors

  public BaseTestRunner(){
  }
  // Methods

  public TestSuiteLoader getLoader(){
    return (TestSuiteLoader) null;
  }
  protected static java.util.Properties getPreferences(){
    return (java.util.Properties) null;
  }
  public static java.lang.String truncate(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public synchronized void startTest(junit.framework.Test arg1){
  }
  public synchronized void endTest(junit.framework.Test arg1){
  }
  public synchronized void addError(junit.framework.Test arg1, java.lang.Throwable arg2){
  }
  public synchronized void addFailure(junit.framework.Test arg1, junit.framework.AssertionFailedError arg2){
  }
  protected java.lang.Class loadSuiteClass(java.lang.String arg1) throws java.lang.ClassNotFoundException{
    return (java.lang.Class) null;
  }
  public abstract void testStarted(java.lang.String arg1);
  public abstract void testEnded(java.lang.String arg1);
  public abstract void testFailed(int arg1, junit.framework.Test arg2, java.lang.Throwable arg3);
  protected abstract void runFailed(java.lang.String arg1);
  public junit.framework.Test getTest(java.lang.String arg1){
    return (junit.framework.Test) null;
  }
  protected static void setPreferences(java.util.Properties arg1){
  }
  public static void savePreferences() throws java.io.IOException{
  }
  public void setPreference(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String elapsedTimeAsString(long arg1){
    return (java.lang.String) null;
  }
  protected java.lang.String processArguments(java.lang.String [] arg1){
    return (java.lang.String) null;
  }
  public void setLoading(boolean arg1){
  }
  public java.lang.String extractClassName(java.lang.String arg1){
    return (java.lang.String) null;
  }
  protected void clearStatus(){
  }
  protected boolean useReloadingTestSuiteLoader(){
    return false;
  }
  public static java.lang.String getPreference(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static int getPreference(java.lang.String arg1, int arg2){
    return 0;
  }
  public static boolean inVAJava(){
    return false;
  }
  public static java.lang.String getFilteredTrace(java.lang.Throwable arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String getFilteredTrace(java.lang.String arg1){
    return (java.lang.String) null;
  }
  protected static boolean showStackRaw(){
    return false;
  }
}
