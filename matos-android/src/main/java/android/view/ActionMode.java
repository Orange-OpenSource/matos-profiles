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
public abstract class ActionMode
{
  // Classes

  public static interface Callback
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("actionMode")
    public boolean onCreateActionMode(ActionMode arg1, Menu arg2);
	@com.francetelecom.rd.stubs.annotation.CallBack("actionMode")
    public boolean onPrepareActionMode(ActionMode arg1, Menu arg2);
	@com.francetelecom.rd.stubs.annotation.CallBack("actionMode")
    public boolean onActionItemClicked(ActionMode arg1, MenuItem arg2);
	@com.francetelecom.rd.stubs.annotation.CallBack("actionMode")
    public void onDestroyActionMode(ActionMode arg1);
  }
  // Constructors

  public ActionMode(){
  }
  // Methods

  public abstract void finish();
  public abstract void setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mTitle") java.lang.CharSequence arg1);
  public abstract void setTitle(int arg1);
  public abstract MenuInflater getMenuInflater();
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTitle")
  public abstract java.lang.CharSequence getTitle();
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTag")
  public java.lang.Object getTag(){
    return (java.lang.Object) null;
  }
  public abstract void setCustomView(View arg1);
  public abstract void setSubtitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mSubtitle") java.lang.CharSequence arg1);
  public abstract void setSubtitle(int arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSubtitle")
  public abstract java.lang.CharSequence getSubtitle();
  public void setTag(@com.francetelecom.rd.stubs.annotation.FieldSet("mTag") java.lang.Object arg1){
  }
  public abstract void invalidate();
  public abstract Menu getMenu();
  public abstract View getCustomView();
  public boolean isUiFocusable(){
    return false;
  }
}
