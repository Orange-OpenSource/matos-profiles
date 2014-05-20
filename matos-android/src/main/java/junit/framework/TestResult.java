package junit.framework;

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


public class TestResult
{
  // Fields

  protected java.util.Vector fFailures;

  protected java.util.Vector fErrors;

  protected java.util.Vector fListeners;

  protected int fRunTests;

  // Constructors

  public TestResult(){
  }
  // Methods

  protected void run(TestCase arg1){
  }
  public synchronized void stop(){
  }
  public synchronized java.util.Enumeration errors(){
    return (java.util.Enumeration) null;
  }
  public synchronized void addListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("testListener") TestListener arg1){
  }
  public void startTest(Test arg1){
  }
  public void endTest(Test arg1){
  }
  public synchronized void addError(Test arg1, java.lang.Throwable arg2){
  }
  public synchronized void addFailure(Test arg1, AssertionFailedError arg2){
  }
  public synchronized void removeListener(TestListener arg1){
  }
  public synchronized boolean wasSuccessful(){
    return false;
  }
  public synchronized boolean shouldStop(){
    return false;
  }
  public synchronized int errorCount(){
    return 0;
  }
  public synchronized int failureCount(){
    return 0;
  }
  public synchronized java.util.Enumeration failures(){
    return (java.util.Enumeration) null;
  }
  public synchronized int runCount(){
    return 0;
  }
  public void runProtected(Test arg1, Protectable arg2){
  }
}
