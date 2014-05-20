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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ApplicationTestCaseImpl", superClass = "")
public abstract class ApplicationTestCase<T extends android.app.Application>
  extends AndroidTestCase{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ApplicationTestCase(@com.francetelecom.rd.stubs.annotation.FieldSet("clazz") java.lang.Class<T> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code("try { return clazz.newInstance(); } catch (Exception e) { return null; }")
  public T getApplication(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void tearDown() throws java.lang.Exception{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void setUp() throws java.lang.Exception{
  }
  public android.content.Context getSystemContext(){
    return (android.content.Context) null;
  }
  protected final void createApplication(){
  }
  protected final void terminateApplication(){
  }
  public final void testApplicationTestCaseSetUpProperly() throws java.lang.Exception{
  }
}
