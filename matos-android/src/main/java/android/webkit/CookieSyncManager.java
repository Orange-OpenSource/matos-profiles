package android.webkit;

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
public final class CookieSyncManager
  extends WebSyncManager  implements java.lang.Runnable
{
  // Constructors

  private CookieSyncManager(android.content.Context arg1){
    super((android.content.Context) null, (java.lang.String) null);
  }
  // Methods

  public static synchronized CookieSyncManager getInstance(){
    return (CookieSyncManager) null;
  }
  public static synchronized CookieSyncManager createInstance(android.content.Context arg1){
    return (CookieSyncManager) null;
  }
  protected void syncFromRamToFlash(){
  }
}
