package android.test.mock;

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
public class MockContentResolver
  extends android.content.ContentResolver{
  // Constructors

  public MockContentResolver(){
    super((android.content.Context) null);
  }
  // Methods

  public void notifyChange(android.net.Uri arg1, android.database.ContentObserver arg2, boolean arg3){
  }
  public void addProvider(java.lang.String arg1, android.content.ContentProvider arg2){
  }
  public boolean releaseProvider(android.content.IContentProvider arg1){
    return false;
  }
  protected android.content.IContentProvider acquireProvider(android.content.Context arg1, java.lang.String arg2){
    return (android.content.IContentProvider) null;
  }
  protected android.content.IContentProvider acquireExistingProvider(android.content.Context arg1, java.lang.String arg2){
    return (android.content.IContentProvider) null;
  }
}
