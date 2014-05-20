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
public class TestGrouping
{
  // Fields

  public static final java.util.Comparator<java.lang.Class<? extends junit.framework.TestCase>> SORT_BY_SIMPLE_NAME = null;

  public static final java.util.Comparator<java.lang.Class<? extends junit.framework.TestCase>> SORT_BY_FULLY_QUALIFIED_NAME = null;

  protected java.lang.String firstIncludedPackage;

  // Constructors

  public TestGrouping(java.util.Comparator<java.lang.Class<? extends junit.framework.TestCase>> arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public void setClassLoader(java.lang.ClassLoader arg1){
  }
  public java.util.List<TestMethod> getTests(){
    return (java.util.List) null;
  }
  public TestGrouping addPackagesRecursive(java.lang.String [] arg1){
    return (TestGrouping) null;
  }
  public TestGrouping removePackagesRecursive(java.lang.String [] arg1){
    return (TestGrouping) null;
  }
  protected java.util.List<java.lang.reflect.Method> getTestMethods(java.lang.Class<? extends junit.framework.TestCase> arg1){
    return (java.util.List) null;
  }
  public java.lang.String getFirstIncludedPackage(){
    return (java.lang.String) null;
  }
}
