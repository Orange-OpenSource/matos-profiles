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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ContextMenuImplem", superClass = "")
public interface ContextMenu
  extends Menu
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ContextMenuInfoImplem", superClass = "")
  public static interface ContextMenuInfo
  {
  }
  // Methods

  public ContextMenu setHeaderTitle(int arg1);
  public ContextMenu setHeaderTitle(java.lang.CharSequence arg1);
  public ContextMenu setHeaderIcon(int arg1);
  public ContextMenu setHeaderIcon(android.graphics.drawable.Drawable arg1);
  public ContextMenu setHeaderView(View arg1);
  public void clearHeader();
}
