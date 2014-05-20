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

import com.francetelecom.rd.stubs.annotation.Real;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.PreferenceFragmentImpl")
public abstract class PreferenceFragment
  extends android.app.Fragment{
  // Classes

  public static interface OnPreferenceStartFragmentCallback
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnPreferenceStartFragmentCallback")
    public boolean onPreferenceStartFragment(PreferenceFragment arg1, Preference arg2);
  }
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public PreferenceFragment(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroy(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSaveInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStop(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActivityResult(int arg1, int arg2, android.content.Intent arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.view.View onCreateView(android.view.LayoutInflater arg1, android.view.ViewGroup arg2, android.os.Bundle arg3){
    return (android.view.View) null;
  }
  public PreferenceManager getPreferenceManager(){
    return (PreferenceManager) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActivityCreated(android.os.Bundle arg1){
  }
  public android.widget.ListView getListView(){
    return (android.widget.ListView) null;
  }
  public Preference findPreference(java.lang.CharSequence arg1){
    return (Preference) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onPreferenceTreeClick(PreferenceScreen arg1, Preference arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroyView(){
  }
  public void setPreferenceScreen(@com.francetelecom.rd.stubs.annotation.FieldSet("mPreferenceScreen") PreferenceScreen arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mPreferenceScreen")
  public PreferenceScreen getPreferenceScreen(){
    return (PreferenceScreen) null;
  }
  public void addPreferencesFromIntent(android.content.Intent arg1){
  }
  public void addPreferencesFromResource(int arg1){
  }
}
