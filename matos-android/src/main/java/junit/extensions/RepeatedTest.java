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


public class RepeatedTest
  extends TestDecorator{
  // Constructors

  public RepeatedTest(junit.framework.Test arg1, int arg2){
    super((junit.framework.Test) null);
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
}
