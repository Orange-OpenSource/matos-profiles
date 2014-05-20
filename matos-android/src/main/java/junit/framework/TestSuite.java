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


public class TestSuite
  implements Test
{
  // Constructors

  public TestSuite(){
  }
  public TestSuite(java.lang.Class arg1, java.lang.String arg2){
  }
  public TestSuite(java.lang.Class arg1){
  }
  public TestSuite(java.lang.String arg1){
  }
  // Methods

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
  public int countTestCases(){
    return 0;
  }
  public void runTest(Test arg1, TestResult arg2){
  }
  public void addTest(Test arg1){
  }
  public void addTestSuite(java.lang.Class arg1){
  }
  public static Test createTest(java.lang.Class arg1, java.lang.String arg2){
    return (Test) null;
  }
  public static java.lang.reflect.Constructor getTestConstructor(java.lang.Class arg1) throws java.lang.NoSuchMethodException{
    return (java.lang.reflect.Constructor) null;
  }
  public Test testAt(int arg1){
    return (Test) null;
  }
  public int testCount(){
    return 0;
  }
  public java.util.Enumeration tests(){
    return (java.util.Enumeration) null;
  }
}
