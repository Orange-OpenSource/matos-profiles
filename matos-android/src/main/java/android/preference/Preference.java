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
public class Preference
  implements java.lang.Comparable<Preference>
{
  // Classes

  public static interface OnPreferenceChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("change")
    public boolean onPreferenceChange(Preference arg1, java.lang.Object arg2);
  }
  public static interface OnPreferenceClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("click")
    public boolean onPreferenceClick(Preference arg1);
  }
  public static class BaseSavedState
    extends android.view.AbsSavedState  {
    // Fields

    public static final android.os.Parcelable.Creator<Preference.BaseSavedState> CREATOR = null;

    // Constructors

    public BaseSavedState(android.os.Parcel arg1){
      super((android.os.Parcelable) null);
    }
    public BaseSavedState(android.os.Parcelable arg1){
      super((android.os.Parcelable) null);
    }
  }
  // Fields

  public static final int DEFAULT_ORDER = 2147483647;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Preference(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Preference(android.content.Context arg1, android.util.AttributeSet arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Preference(android.content.Context arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int compareTo(Preference arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mKey")
  public java.lang.String getKey(){
    return (java.lang.String) null;
  }
  public android.content.Context getContext(){
    return (android.content.Context) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mFragment")
  public java.lang.String getFragment(){
    return (java.lang.String) null;
  }
  public void setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mTitle") java.lang.CharSequence arg1){
  }
  public void setTitle(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mIntent")
  public android.content.Intent getIntent(){
    return (android.content.Intent) null;
  }
  public void setIntent(@com.francetelecom.rd.stubs.annotation.FieldSet("mIntent") android.content.Intent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  public void setPersistent(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTitle")
  public java.lang.CharSequence getTitle(){
    return (java.lang.CharSequence) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.view.View onCreateView(android.view.ViewGroup arg1){
    return (android.view.View) null;
  }
  public android.content.SharedPreferences getSharedPreferences(){
    return (android.content.SharedPreferences) null;
  }
  public android.view.View getView(android.view.View arg1, android.view.ViewGroup arg2){
    return (android.view.View) null;
  }
  public boolean isEnabled(){
    return false;
  }
  public void restoreHierarchyState(android.os.Bundle arg1){
  }
  public void saveHierarchyState(android.os.Bundle arg1){
  }
  public void setEnabled(boolean arg1){
  }
  public int getOrder(){
    return 0;
  }
  public void setOrder(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onBindView(android.view.View arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onClick(){
  }
  public boolean shouldDisableDependents(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray arg1, int arg2){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSetInitialValue(boolean arg1, java.lang.Object arg2){
  }
  public boolean isPersistent(){
    return false;
  }
  protected void notifyChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKey(android.view.View arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  public void setIcon(@com.francetelecom.rd.stubs.annotation.FieldSet("mIcon") android.graphics.drawable.Drawable arg1){
  }
  public void setIcon( int arg1){
  }
  protected boolean callChangeListener(java.lang.Object arg1){
    return false;
  }
  protected boolean persistBoolean(boolean arg1){
    return false;
  }
  public void notifyDependencyChange(boolean arg1){
  }
  protected boolean getPersistedBoolean(boolean arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSummary")
  public java.lang.CharSequence getSummary(){
    return (java.lang.CharSequence) null;
  }
  public void setFragment(@com.francetelecom.rd.stubs.annotation.FieldSet("mFragment") java.lang.String arg1){
  }
  public android.os.Bundle getExtras(){
    return (android.os.Bundle) null;
  }
  public android.os.Bundle peekExtras(){
    return (android.os.Bundle) null;
  }
  public void setLayoutResource(int arg1){
  }
  public int getLayoutResource(){
    return 0;
  }
  public void setWidgetLayoutResource(int arg1){
  }
  public int getWidgetLayoutResource(){
    return 0;
  }
  public int getTitleRes(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mIcon")
  public android.graphics.drawable.Drawable getIcon(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setSummary(@com.francetelecom.rd.stubs.annotation.FieldSet("mSummary") java.lang.CharSequence arg1){
  }
  public void setSummary(int arg1){
  }
  public void setSelectable(boolean arg1){
  }
  public boolean isSelectable(){
    return false;
  }
  public void setShouldDisableView(boolean arg1){
  }
  public boolean getShouldDisableView(){
    return false;
  }
  public void setKey(@com.francetelecom.rd.stubs.annotation.FieldSet("mKey") java.lang.String arg1){
  }
  public boolean hasKey(){
    return false;
  }
  protected boolean shouldPersist(){
    return false;
  }
  public void setOnPreferenceChangeListener(@com.francetelecom.rd.stubs.annotation.FieldSet("changeListener") @com.francetelecom.rd.stubs.annotation.CallBackRegister("change") Preference.OnPreferenceChangeListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("changeListener")
  public Preference.OnPreferenceChangeListener getOnPreferenceChangeListener(){
    return (Preference.OnPreferenceChangeListener) null;
  }
  public void setOnPreferenceClickListener(@com.francetelecom.rd.stubs.annotation.FieldSet("clickListener") @com.francetelecom.rd.stubs.annotation.CallBackRegister("click") Preference.OnPreferenceClickListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("clickListener")
  public Preference.OnPreferenceClickListener getOnPreferenceClickListener(){
    return (Preference.OnPreferenceClickListener) null;
  }
  public android.content.SharedPreferences.Editor getEditor(){
    return (android.content.SharedPreferences.Editor) null;
  }
  public boolean shouldCommit(){
    return false;
  }
  protected void notifyHierarchyChanged(){
  }
  public PreferenceManager getPreferenceManager(){
    return (PreferenceManager) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToHierarchy(PreferenceManager arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToActivity(){
  }
  protected Preference findPreferenceInHierarchy(java.lang.String arg1){
    return (Preference) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDependencyChanged(Preference arg1, boolean arg2){
  }
  public void setDependency(@com.francetelecom.rd.stubs.annotation.FieldSet("mDependency") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mDependency")
  public java.lang.String getDependency(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onPrepareForRemoval(){
  }
  public void setDefaultValue(java.lang.Object arg1){
  }
  protected boolean persistString(java.lang.String arg1){
    return false;
  }
  protected java.lang.String getPersistedString(java.lang.String arg1){
    return (java.lang.String) null;
  }
  protected boolean persistStringSet(java.util.Set<java.lang.String> arg1){
    return false;
  }
  protected java.util.Set<java.lang.String> getPersistedStringSet(java.util.Set<java.lang.String> arg1){
    return (java.util.Set) null;
  }
  protected boolean persistInt(int arg1){
    return false;
  }
  protected int getPersistedInt(int arg1){
    return 0;
  }
  protected boolean persistFloat(float arg1){
    return false;
  }
  protected float getPersistedFloat(float arg1){
    return 0.0f;
  }
  protected boolean persistLong(long arg1){
    return false;
  }
  protected long getPersistedLong(long arg1){
    return 0l;
  }
}
