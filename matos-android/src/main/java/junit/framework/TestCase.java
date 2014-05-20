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


@com.francetelecom.rd.stubs.annotation.Accumulator("stubAccumulator")
public abstract class TestCase
  extends Assert  implements Test
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TestCase(){
    super();
  }
  public TestCase(java.lang.String arg1){
    super();
  }
  // Methods

  public TestResult run(){
    return (TestResult) null;
  }
  public void run(TestResult arg1){
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void setName(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void tearDown() throws java.lang.Exception{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void setUp() throws java.lang.Exception{
  }
  public int countTestCases(){
    return 0;
  }
  protected TestResult createResult(){
    return (TestResult) null;
  }
  public void runBare() throws java.lang.Throwable{
  }
  protected void runTest() throws java.lang.Throwable{
  }
}
