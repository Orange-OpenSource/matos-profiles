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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ProviderTestCase2Impl", superClass = "")
public abstract class ProviderTestCase2<T extends android.content.ContentProvider>
  extends AndroidTestCase{
  // Constructors

  public ProviderTestCase2(@com.francetelecom.rd.stubs.annotation.FieldSet("clazz") java.lang.Class<T> arg1, java.lang.String arg2){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code("try { return clazz.newInstance(); } catch (Exception e) { return null; }")
  public T getProvider(){
    return null;
  }
  protected void tearDown() throws java.lang.Exception{
  }
  protected void setUp() throws java.lang.Exception{
  }
  public android.test.mock.MockContentResolver getMockContentResolver(){
    return (android.test.mock.MockContentResolver) null;
  }
  public IsolatedContext getMockContext(){
    return (IsolatedContext) null;
  }
  public static <T extends android.content.ContentProvider>android.content.ContentResolver newResolverWithContentProviderFromSql(android.content.Context arg1, java.lang.String arg2, java.lang.Class<T> arg3, java.lang.String arg4, java.lang.String arg5, int arg6, java.lang.String arg7) throws java.lang.IllegalAccessException, java.lang.InstantiationException{
    return (android.content.ContentResolver) null;
  }
}
