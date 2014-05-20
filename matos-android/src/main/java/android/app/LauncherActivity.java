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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.LauncherActivityImpl", superClass = "")
public abstract class LauncherActivity
  extends ListActivity{
  // Classes

  public static class ListItem
  {
    // Fields

    public android.content.pm.ResolveInfo resolveInfo;

    public java.lang.CharSequence label;

    public android.graphics.drawable.Drawable icon;

    public java.lang.String packageName;

    public java.lang.String className;

    public android.os.Bundle extras;

    // Constructors

    ListItem(android.content.pm.PackageManager arg1, android.content.pm.ResolveInfo arg2, LauncherActivity.IconResizer arg3){
    }
    public ListItem(){
    }
  }
  public class IconResizer
  {
    // Fields

    // Constructors

    public IconResizer(){
    }
    // Methods

    public android.graphics.drawable.Drawable createIconThumbnail(android.graphics.drawable.Drawable arg1){
      return (android.graphics.drawable.Drawable) null;
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public LauncherActivity(){
    super();
  }
  // Methods

  protected void onCreate(android.os.Bundle arg1){
  }
  public void setTitle(java.lang.CharSequence arg1){
  }
  public void setTitle(int arg1){
  }
  protected void onListItemClick(android.widget.ListView arg1, android.view.View arg2, int arg3, long arg4){
  }
  protected android.content.Intent intentForPosition(int arg1){
    return (android.content.Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSetContentView(){
  }
  protected LauncherActivity.ListItem itemForPosition(int arg1){
    return (LauncherActivity.ListItem) null;
  }
  protected android.content.Intent getTargetIntent(){
    return (android.content.Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected java.util.List<android.content.pm.ResolveInfo> onQueryPackageManager(android.content.Intent arg1){
    return (java.util.List) null;
  }
  public java.util.List<LauncherActivity.ListItem> makeListItems(){
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onEvaluateShowIcons(){
    return false;
  }
}
