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
public class PreferenceManager
{
  // Classes

  public static interface OnActivityResultListener
  {
    // Methods

    public boolean onActivityResult(int arg1, int arg2, android.content.Intent arg3);
  }
  public static interface OnActivityStopListener
  {
    // Methods

    public void onActivityStop();
  }
  public static interface OnActivityDestroyListener
  {
    // Methods

    public void onActivityDestroy();
  }
  // Fields

  public static final java.lang.String METADATA_KEY_PREFERENCES = "android.preference";

  public static final java.lang.String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";

  // Constructors

  PreferenceManager(android.app.Activity arg1, int arg2){
  }
  private PreferenceManager(android.content.Context arg1){
  }
  // Methods

  public android.content.SharedPreferences getSharedPreferences(){
    return (android.content.SharedPreferences) null;
  }
  public Preference findPreference(java.lang.CharSequence arg1){
    return (Preference) null;
  }
  public static android.content.SharedPreferences getDefaultSharedPreferences(android.content.Context arg1){
    return (android.content.SharedPreferences) null;
  }
  public PreferenceScreen inflateFromResource(android.content.Context arg1, int arg2, PreferenceScreen arg3){
    return (PreferenceScreen) null;
  }
  public PreferenceScreen createPreferenceScreen(android.content.Context arg1){
    return (PreferenceScreen) null;
  }
  public java.lang.String getSharedPreferencesName(){
    return (java.lang.String) null;
  }
  public void setSharedPreferencesName(java.lang.String arg1){
  }
  public int getSharedPreferencesMode(){
    return 0;
  }
  public void setSharedPreferencesMode(int arg1){
  }
  public static void setDefaultValues(android.content.Context arg1, int arg2, boolean arg3){
  }
  public static void setDefaultValues(android.content.Context arg1, java.lang.String arg2, int arg3, int arg4, boolean arg5){
  }
}
