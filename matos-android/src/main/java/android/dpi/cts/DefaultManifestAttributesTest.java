package android.dpi.cts;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.DefaultManifestAttributesTestImpl", superClass = "")
public abstract class DefaultManifestAttributesTest
  extends android.test.AndroidTestCase{
  // Fields

  protected java.lang.String packageName;

  // Constructors

  public DefaultManifestAttributesTest(){
    super();
  }
  // Methods

  protected abstract java.lang.String getPackageName();
  protected void setUp(){
  }
  protected android.content.pm.ApplicationInfo getAppInfo(){
    return (android.content.pm.ApplicationInfo) null;
  }
  public void testSmallScreenDefault(){
  }
  public void testNormalScreenDefault(){
  }
  public void testLargeScreenDefault(){
  }
  public void testResizableDefault(){
  }
  public void testAnyDensityDefault(){
  }
}
