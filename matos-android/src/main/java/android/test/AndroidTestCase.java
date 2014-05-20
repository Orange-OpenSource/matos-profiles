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
public class AndroidTestCase
  extends junit.framework.TestCase{
  // Fields

  protected android.content.Context mContext;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AndroidTestCase(){
    super();
  }
  // Methods

  public android.content.Context getContext(){
    return (android.content.Context) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void tearDown() throws java.lang.Exception{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void setUp() throws java.lang.Exception{
  }
  public void setContext(android.content.Context arg1){
  }
  public void testAndroidTestCaseSetupProperly(){
  }
  public void setTestContext(android.content.Context arg1){
  }
  public android.content.Context getTestContext(){
    return (android.content.Context) null;
  }
  public void assertActivityRequiresPermission(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void assertReadingContentUriRequiresPermission(android.net.Uri arg1, java.lang.String arg2){
  }
  public void assertWritingContentUriRequiresPermission(android.net.Uri arg1, java.lang.String arg2){
  }
  protected void scrubClass(java.lang.Class<?> arg1) throws java.lang.IllegalAccessException{
  }
}
