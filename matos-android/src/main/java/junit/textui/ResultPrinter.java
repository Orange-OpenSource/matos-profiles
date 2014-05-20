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


public class ResultPrinter
  implements junit.framework.TestListener
{
  // Constructors

  public ResultPrinter(java.io.PrintStream arg1){
  }
  // Methods

  public java.io.PrintStream getWriter(){
    return (java.io.PrintStream) null;
  }
  public void startTest(junit.framework.Test arg1){
  }
  public void endTest(junit.framework.Test arg1){
  }
  public void addError(junit.framework.Test arg1, java.lang.Throwable arg2){
  }
  public void addFailure(junit.framework.Test arg1, junit.framework.AssertionFailedError arg2){
  }
  protected java.lang.String elapsedTimeAsString(long arg1){
    return (java.lang.String) null;
  }
  protected void printHeader(long arg1){
  }
  protected void printFooter(junit.framework.TestResult arg1){
  }
  protected void printErrors(junit.framework.TestResult arg1){
  }
  protected void printFailures(junit.framework.TestResult arg1){
  }
  protected void printDefects(java.util.Enumeration arg1, int arg2, java.lang.String arg3){
  }
  public void printDefect(junit.framework.TestFailure arg1, int arg2){
  }
  protected void printDefectHeader(junit.framework.TestFailure arg1, int arg2){
  }
  protected void printDefectTrace(junit.framework.TestFailure arg1){
  }
}
