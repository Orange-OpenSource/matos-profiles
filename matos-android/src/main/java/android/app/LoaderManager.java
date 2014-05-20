package android.app;

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

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.Real;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.LoaderManagerImpl")
public abstract class LoaderManager
{
  // Classes

  public static interface LoaderCallbacks<D>
  {
    // Methods

	
	public android.content.Loader<D> onCreateLoader(int arg1, android.os.Bundle arg2);
	
    public void onLoadFinished(android.content.Loader<D> arg1, D arg2);
	
    public void onLoaderReset(android.content.Loader<D> arg1);
  }
  // Constructors

  public LoaderManager(){
  }
  // Methods

  public abstract <D>android.content.Loader<D> getLoader(int arg1);
  public abstract void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4);
  public static void enableDebugLogging(boolean arg1){
  }
  @Code({
	  "android.content.Loader<D> l = arg3.onCreateLoader(0, new android.os.Bundle());",
	  "arg3.onLoaderReset(l);",
	  "arg3.onLoadFinished(l, (D) new Object());", "return l;"})
  public abstract <D>android.content.Loader<D> initLoader(int arg1, android.os.Bundle arg2, LoaderManager.LoaderCallbacks<D> arg3); 
  
  @Code({
	  "android.content.Loader<D> l = arg3.onCreateLoader(0, new android.os.Bundle());",
	  "arg3.onLoaderReset(l);",
	  "arg3.onLoadFinished(l, (D) new Object());", "return l;"})
  public abstract <D>android.content.Loader<D> restartLoader(int arg1, android.os.Bundle arg2, LoaderManager.LoaderCallbacks<D> arg3);
  
  public abstract void destroyLoader(int arg1);
}
