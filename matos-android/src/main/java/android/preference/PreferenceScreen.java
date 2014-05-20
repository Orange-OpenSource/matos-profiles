package android.preference;

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
public final class PreferenceScreen
  extends PreferenceGroup  implements android.widget.AdapterView.OnItemClickListener, android.content.DialogInterface.OnDismissListener
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public PreferenceScreen(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  // Methods

  public void bind(android.widget.ListView arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onClick(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDismiss(android.content.DialogInterface arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onItemClick(android.widget.AdapterView arg1, android.view.View arg2, int arg3, long arg4){
  }
  public android.app.Dialog getDialog(){
    return (android.app.Dialog) null;
  }
  protected boolean isOnSameScreenAsChildren(){
    return false;
  }
  public android.widget.ListAdapter getRootAdapter(){
    return (android.widget.ListAdapter) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.widget.ListAdapter onCreateRootAdapter(){
    return (android.widget.ListAdapter) null;
  }
}
