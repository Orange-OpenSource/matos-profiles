package android.view;

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
public interface Menu
{
  // Fields

  public static final int USER_MASK = 65535;

  public static final int USER_SHIFT = 0;

  public static final int CATEGORY_MASK = -65536;

  public static final int CATEGORY_SHIFT = 16;

  public static final int NONE = 0;

  public static final int FIRST = 1;

  public static final int CATEGORY_CONTAINER = 65536;

  public static final int CATEGORY_SYSTEM = 131072;

  public static final int CATEGORY_SECONDARY = 196608;

  public static final int CATEGORY_ALTERNATIVE = 262144;

  public static final int FLAG_APPEND_TO_GROUP = 1;

  public static final int FLAG_PERFORM_NO_CLOSE = 1;

  public static final int FLAG_ALWAYS_PERFORM_CLOSE = 2;

  // Methods

  public MenuItem add(java.lang.CharSequence arg1);
  public MenuItem add(int arg1);
  public MenuItem add(int arg1, int arg2, int arg3, java.lang.CharSequence arg4);
  public MenuItem add(int arg1, int arg2, int arg3, int arg4);
  public void clear();
  public int size();
  public void close();
  public MenuItem getItem(int arg1);
  public boolean hasVisibleItems();
  public MenuItem findItem(int arg1);
  public boolean performShortcut(int arg1, KeyEvent arg2, int arg3);
  public int addIntentOptions(int arg1, int arg2, int arg3, android.content.ComponentName arg4, android.content.Intent [] arg5, android.content.Intent arg6, int arg7, MenuItem [] arg8);
  public SubMenu addSubMenu(java.lang.CharSequence arg1);
  public SubMenu addSubMenu(int arg1);
  public SubMenu addSubMenu(int arg1, int arg2, int arg3, java.lang.CharSequence arg4);
  public SubMenu addSubMenu(int arg1, int arg2, int arg3, int arg4);
  public boolean isShortcutKey(int arg1, KeyEvent arg2);
  public boolean performIdentifierAction(int arg1, int arg2);
  public void removeGroup(int arg1);
  public void removeItem(int arg1);
  public void setGroupCheckable(int arg1, boolean arg2, boolean arg3);
  public void setGroupEnabled(int arg1, boolean arg2);
  public void setGroupVisible(int arg1, boolean arg2);
  public void setQwertyMode(boolean arg1);
}
