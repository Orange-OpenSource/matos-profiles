package junit.extensions;

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


public class TestDecorator
  extends junit.framework.Assert  implements junit.framework.Test
{
  // Fields

  protected junit.framework.Test fTest;

  // Constructors

  public TestDecorator(junit.framework.Test arg1){
    super();
  }
  // Methods

  public void run(junit.framework.TestResult arg1){
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int countTestCases(){
    return 0;
  }
  public junit.framework.Test getTest(){
    return (junit.framework.Test) null;
  }
  public void basicRun(junit.framework.TestResult arg1){
  }
}
