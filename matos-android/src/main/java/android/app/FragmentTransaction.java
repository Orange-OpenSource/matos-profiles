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

@Real("com.francetelecom.rd.fakeandroid.FragmentTransactionImpl")
public abstract class FragmentTransaction
{
  // Fields

  public static final int TRANSIT_ENTER_MASK = 4096;

  public static final int TRANSIT_EXIT_MASK = 8192;

  public static final int TRANSIT_UNSET = -1;

  public static final int TRANSIT_NONE = 0;

  public static final int TRANSIT_FRAGMENT_OPEN = 4097;

  public static final int TRANSIT_FRAGMENT_CLOSE = 8194;

  public static final int TRANSIT_FRAGMENT_FADE = 4099;

  // Constructors

  public FragmentTransaction(){
  }
  // Methods

  public abstract FragmentTransaction add(Fragment arg1, java.lang.String arg2);
  public abstract FragmentTransaction add(int arg1, Fragment arg2);
  public abstract FragmentTransaction add(int arg1, Fragment arg2, java.lang.String arg3);
  public abstract boolean isEmpty();
  public abstract FragmentTransaction replace(int arg1, Fragment arg2);
  public abstract FragmentTransaction replace(int arg1, Fragment arg2, java.lang.String arg3);
  public abstract FragmentTransaction remove(Fragment arg1);
  public abstract FragmentTransaction detach(Fragment arg1);
  public abstract FragmentTransaction show(Fragment arg1);
  public abstract FragmentTransaction attach(Fragment arg1);
  public abstract FragmentTransaction hide(Fragment arg1);
  public abstract FragmentTransaction setCustomAnimations(int arg1, int arg2);
  public abstract FragmentTransaction setCustomAnimations(int arg1, int arg2, int arg3, int arg4);
  public abstract FragmentTransaction setTransition(int arg1);
  public abstract FragmentTransaction setTransitionStyle(int arg1);
  public abstract FragmentTransaction addToBackStack(java.lang.String arg1);
  public abstract boolean isAddToBackStackAllowed();
  public abstract FragmentTransaction disallowAddToBackStack();
  public abstract FragmentTransaction setBreadCrumbTitle(int arg1);
  public abstract FragmentTransaction setBreadCrumbTitle(java.lang.CharSequence arg1);
  public abstract FragmentTransaction setBreadCrumbShortTitle(int arg1);
  public abstract FragmentTransaction setBreadCrumbShortTitle(java.lang.CharSequence arg1);
  public abstract int commit();
  public abstract int commitAllowingStateLoss();
}
