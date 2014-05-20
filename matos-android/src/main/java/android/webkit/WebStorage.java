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
public final class WebStorage
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.WebStorageQuotaUpdaterImpl", superClass = "")
  public static interface QuotaUpdater
  {
    // Methods

    public void updateQuota(long arg1);
  }
  public static class Origin
  {
    // Constructors

    private Origin(java.lang.String arg1, long arg2, long arg3){
    }
    private Origin(java.lang.String arg1, long arg2){
    }
    private Origin(java.lang.String arg1){
    }
    // Methods

    public long getQuota(){
      return 0l;
    }
    public long getUsage(){
      return 0l;
    }
    public java.lang.String getOrigin(){
      return (java.lang.String) null;
    }
  }
  // Constructors

  public WebStorage(){
  }
  // Methods

  public static WebStorage getInstance(){
    return (WebStorage) null;
  }
  public void update(){
  }
  public synchronized void createHandler(){
  }
  public void createUIHandler(){
  }
  public void getOrigins(ValueCallback<java.util.Map> arg1){
  }
  public void getUsageForOrigin(java.lang.String arg1, ValueCallback<java.lang.Long> arg2){
  }
  public void getQuotaForOrigin(java.lang.String arg1, ValueCallback<java.lang.Long> arg2){
  }
  public void setQuotaForOrigin(java.lang.String arg1, long arg2){
  }
  public void deleteOrigin(java.lang.String arg1){
  }
  public void deleteAllData(){
  }
  public void setAppCacheMaximumSize(long arg1){
  }
}
