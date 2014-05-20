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

import com.francetelecom.rd.stubs.annotation.Real;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.FragmentManagerImpl")
public abstract class FragmentManager
{
  // Classes
	@Real("com.francetelecom.rd.fakeandroid.BackStackEntryImpl")
  public static interface BackStackEntry
  {
    // Methods

    public java.lang.String getName();
    public int getId();
    public java.lang.CharSequence getBreadCrumbTitle();
    public java.lang.CharSequence getBreadCrumbShortTitle();
    public int getBreadCrumbTitleRes();
    public int getBreadCrumbShortTitleRes();
  }
  public static interface OnBackStackChangedListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("onBackStackChanged")
    public void onBackStackChanged();
  }
  // Fields

  public static final int POP_BACK_STACK_INCLUSIVE = 1;

  // Constructors

  public FragmentManager(){
  }
  // Methods

  public abstract Fragment getFragment(android.os.Bundle arg1, java.lang.String arg2);
  public abstract void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4);
  public void invalidateOptionsMenu(){
  }
  public abstract boolean popBackStackImmediate();
  public abstract boolean popBackStackImmediate(java.lang.String arg1, int arg2);
  public abstract boolean popBackStackImmediate(int arg1, int arg2);
  public abstract Fragment findFragmentById(int arg1);
  public abstract Fragment findFragmentByTag(java.lang.String arg1);
  @java.lang.Deprecated
  public FragmentTransaction openTransaction(){
    return (FragmentTransaction) null;
  }
  public abstract FragmentTransaction beginTransaction();
  public abstract boolean executePendingTransactions();
  public abstract void popBackStack();
  public abstract void popBackStack(java.lang.String arg1, int arg2);
  public abstract void popBackStack(int arg1, int arg2);
  public abstract int getBackStackEntryCount();
  public abstract FragmentManager.BackStackEntry getBackStackEntryAt(int arg1);
  public abstract void addOnBackStackChangedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onBackStackChanged") FragmentManager.OnBackStackChangedListener arg1);
  public abstract void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener arg1);
  public abstract void putFragment(android.os.Bundle arg1, java.lang.String arg2, Fragment arg3);
  public abstract Fragment.SavedState saveFragmentInstanceState(Fragment arg1);
  public static void enableDebugLogging(boolean arg1){
  }
}
