package android.widget;

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
public interface Adapter
{
  // Fields

  public static final int IGNORE_ITEM_VIEW_TYPE = -1;

  public static final int NO_SELECTION = -2147483648;

  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("adapter")
  public boolean isEmpty();
  @com.francetelecom.rd.stubs.annotation.CallBack("adapter")
  public int getCount();
  @com.francetelecom.rd.stubs.annotation.CallBack("adapter")
  public boolean hasStableIds();
  @com.francetelecom.rd.stubs.annotation.CallBack("adapter")
  public java.lang.Object getItem(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("adapter")
  public long getItemId(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("adapter")
  public android.view.View getView(int arg1, android.view.View arg2, android.view.ViewGroup arg3);
  public void registerDataSetObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChanged") android.database.DataSetObserver arg1);
  public void unregisterDataSetObserver(android.database.DataSetObserver arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("adapter")
  public int getItemViewType(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("adapter")
  public int getViewTypeCount();
}
