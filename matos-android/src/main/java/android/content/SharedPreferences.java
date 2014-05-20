package android.content;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SharedPreferencesImpl", superClass = "")
public interface SharedPreferences
{
  // Classes

  public static interface OnSharedPreferenceChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onSharedPreferenceChanged")
    public void onSharedPreferenceChanged(SharedPreferences arg1, java.lang.String arg2);
  }
  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SharedPreferenceEditorImplem", superClass = "")
  public static interface Editor
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SharedPreferences.Editor putBoolean(java.lang.String arg1, boolean arg2);
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SharedPreferences.Editor putInt(java.lang.String arg1, int arg2);
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SharedPreferences.Editor putLong(java.lang.String arg1, long arg2);
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SharedPreferences.Editor putFloat(java.lang.String arg1, float arg2);
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SharedPreferences.Editor clear();
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SharedPreferences.Editor remove(java.lang.String arg1);
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public SharedPreferences.Editor putString(java.lang.String arg1, java.lang.String arg2);
    public boolean commit();
    public void apply();
    public SharedPreferences.Editor putStringSet(java.lang.String arg1, java.util.Set<java.lang.String> arg2);
  }
  // Methods

  public boolean getBoolean(java.lang.String arg1, boolean arg2);
  public int getInt(java.lang.String arg1, int arg2);
  public long getLong(java.lang.String arg1, long arg2);
  public float getFloat(java.lang.String arg1, float arg2);
  public boolean contains(java.lang.String arg1);
  public java.lang.String getString(java.lang.String arg1, java.lang.String arg2);
  public SharedPreferences.Editor edit();
  public java.util.Set<java.lang.String> getStringSet(java.lang.String arg1, java.util.Set<java.lang.String> arg2);
  public java.util.Map<java.lang.String, ?> getAll();
  public void registerOnSharedPreferenceChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.SharedPreferences.OnSharedPreferenceChangeListener.onSharedPreferenceChanged") SharedPreferences.OnSharedPreferenceChangeListener arg1);
  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener arg1);
}
