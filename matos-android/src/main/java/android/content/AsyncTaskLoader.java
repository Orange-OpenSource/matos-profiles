package android.content;

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
public abstract class AsyncTaskLoader<D>
  extends Loader<D>{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("Loader")
  public AsyncTaskLoader(Context arg1){
    super((Context) null);
  }
  // Methods

  public void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("Loader")
  protected void onForceLoad(){
  }
  public void setUpdateThrottle(long arg1){
  }
  public boolean cancelLoad(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("Loader")
  public void onCanceled(D arg1){
  }
  public abstract D loadInBackground();
  protected D onLoadInBackground(){
    return null;
  }
  public void waitForLoader(){
  }
}
