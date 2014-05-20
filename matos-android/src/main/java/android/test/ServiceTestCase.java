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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ServiceTestCaseImpl", superClass = "")
public abstract class ServiceTestCase<T extends android.app.Service>
  extends AndroidTestCase{
  // Constructors

  public ServiceTestCase(@com.francetelecom.rd.stubs.annotation.FieldSet("clazz") java.lang.Class<T> arg1){
    super();
  }
  // Methods

  public android.app.Application getApplication(){
    return (android.app.Application) null;
  }
  protected void startService(android.content.Intent arg1){
  }
  protected android.os.IBinder bindService(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("try { return clazz.newInstance(); } catch (Exception e) { return null; }")
  public T getService(){
    return null;
  }
  protected void tearDown() throws java.lang.Exception{
  }
  protected void setUp() throws java.lang.Exception{
  }
  public android.content.Context getSystemContext(){
    return (android.content.Context) null;
  }
  protected void setupService(){
  }
  protected void shutdownService(){
  }
  public void setApplication(android.app.Application arg1){
  }
  public void testServiceTestCaseSetUpProperly() throws java.lang.Exception{
  }
}
