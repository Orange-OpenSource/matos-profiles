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


public abstract class WebSyncManager
  implements java.lang.Runnable
{
  // Fields

  protected android.os.Handler mHandler;

  protected WebViewDatabase mDataBase;

  protected static final java.lang.String LOGTAG = (java.lang.String) null;

  // Constructors

  protected WebSyncManager(android.content.Context arg1, java.lang.String arg2){
  }
  // Methods

  public void run(){
  }
  protected java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public void sync(){
  }
  public void startSync(){
  }
  public void stopSync(){
  }
  public void resetSync(){
  }
  protected void onSyncInit(){
  }
}
