package android.test.suitebuilder;

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
public class TestSuiteBuilder
{
  // Classes

  public static class FailedToCreateTests
    extends junit.framework.TestCase  {
    // Constructors

    public FailedToCreateTests(java.lang.Exception arg1){
      super();
    }
    // Methods

    public void testSuiteConstructionFailed(){
    }
  }
  // Constructors

  public TestSuiteBuilder(java.lang.Class arg1){
  }
  public TestSuiteBuilder(java.lang.String arg1, java.lang.ClassLoader arg2){
  }
  // Methods

  public TestSuiteBuilder addTestSuite(junit.framework.TestSuite arg1){
    return (TestSuiteBuilder) null;
  }
  public final junit.framework.TestSuite build(){
    return (junit.framework.TestSuite) null;
  }
  public TestSuiteBuilder addRequirements(java.util.List<com.android.internal.util.Predicate<TestMethod>> arg1){
    return (TestSuiteBuilder) null;
  }
  public final TestSuiteBuilder addRequirements(com.android.internal.util.Predicate<TestMethod> [] arg1){
    return (TestSuiteBuilder) null;
  }
  public TestSuiteBuilder addTestClassByName(java.lang.String arg1, java.lang.String arg2, android.content.Context arg3){
    return (TestSuiteBuilder) null;
  }
  public TestSuiteBuilder includePackages(java.lang.String [] arg1){
    return (TestSuiteBuilder) null;
  }
  public TestSuiteBuilder excludePackages(java.lang.String [] arg1){
    return (TestSuiteBuilder) null;
  }
  public final TestSuiteBuilder includeAllPackagesUnderHere(){
    return (TestSuiteBuilder) null;
  }
  public TestSuiteBuilder named(java.lang.String arg1){
    return (TestSuiteBuilder) null;
  }
  protected java.lang.String getSuiteName(){
    return (java.lang.String) null;
  }
  protected TestGrouping getTestGrouping(){
    return (TestGrouping) null;
  }
}
