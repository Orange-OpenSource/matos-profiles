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
public abstract class ActivityUnitTestCase<T extends android.app.Activity>
  extends ActivityTestCase{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActivityUnitTestCase(@com.francetelecom.rd.stubs.annotation.FieldSet("clazz") java.lang.Class<T> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code("try { return clazz.newInstance(); } catch (Exception e) { return null; }")
  protected T startActivity(android.content.Intent arg1, android.os.Bundle arg2, java.lang.Object arg3){
    return null;
  }
  public int getRequestedOrientation(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code("try { return clazz.newInstance(); } catch (Exception e) { return null; }")
  public T getActivity(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void tearDown() throws java.lang.Exception{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void setUp() throws java.lang.Exception{
  }
  public void setApplication(android.app.Application arg1){
  }
  public void setActivityContext(android.content.Context arg1){
  }
  public android.content.Intent getStartedActivityIntent(){
    return (android.content.Intent) null;
  }
  public int getStartedActivityRequest(){
    return 0;
  }
  public boolean isFinishCalled(){
    return false;
  }
  public int getFinishedActivityRequest(){
    return 0;
  }
}
