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
public class InstrumentationTestRunner
  extends android.app.Instrumentation  implements TestSuiteProvider
{
  // Fields

  public static final java.lang.String ARGUMENT_TEST_CLASS = "class";

  public static final java.lang.String ARGUMENT_TEST_PACKAGE = "package";

  public static final java.lang.String ARGUMENT_TEST_SIZE_PREDICATE = "size";

  public static final java.lang.String ARGUMENT_DELAY_MSEC = "delay_msec";

  public static final java.lang.String REPORT_VALUE_ID = "InstrumentationTestRunner";

  public static final java.lang.String REPORT_KEY_NUM_TOTAL = "numtests";

  public static final java.lang.String REPORT_KEY_NUM_CURRENT = "current";

  public static final java.lang.String REPORT_KEY_NAME_CLASS = "class";

  public static final java.lang.String REPORT_KEY_NAME_TEST = "test";

  public static final int REPORT_VALUE_RESULT_START = 1;

  public static final int REPORT_VALUE_RESULT_OK = 0;

  public static final int REPORT_VALUE_RESULT_ERROR = -1;

  public static final int REPORT_VALUE_RESULT_FAILURE = -2;

  public static final java.lang.String REPORT_KEY_STACK = "stack";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public InstrumentationTestRunner(){
    super();
  }
  // Methods

  public android.os.Bundle getBundle(){
    return (android.os.Bundle) null;
  }
  public java.lang.ClassLoader getLoader(){
    return (java.lang.ClassLoader) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStart(){
  }
  public junit.framework.TestSuite getTestSuite(){
    return (junit.framework.TestSuite) null;
  }
  protected AndroidTestRunner getAndroidTestRunner(){
    return (AndroidTestRunner) null;
  }
  public junit.framework.TestSuite getAllTests(){
    return (junit.framework.TestSuite) null;
  }
}
