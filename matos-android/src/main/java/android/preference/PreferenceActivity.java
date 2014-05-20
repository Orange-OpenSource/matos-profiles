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
public abstract class PreferenceActivity
  extends android.app.ListActivity  implements PreferenceFragment.OnPreferenceStartFragmentCallback
{
  // Classes

  public static final class Header
    implements android.os.Parcelable
  {
    // Fields

    public long id;

    public int titleRes;

    public java.lang.CharSequence title;

    public int summaryRes;

    public java.lang.CharSequence summary;

    public int breadCrumbTitleRes;

    public java.lang.CharSequence breadCrumbTitle;

    public int breadCrumbShortTitleRes;

    public java.lang.CharSequence breadCrumbShortTitle;

    public int iconRes;

    public java.lang.String fragment;

    public android.os.Bundle fragmentArguments;

    public android.content.Intent intent;

    public android.os.Bundle extras;

    public static final android.os.Parcelable.Creator<PreferenceActivity.Header> CREATOR = null;

    // Constructors

    public Header(){
    }
    Header(android.os.Parcel arg1){
    }
    // Methods

    public java.lang.CharSequence getTitle(android.content.res.Resources arg1){
      return (java.lang.CharSequence) null;
    }
    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public java.lang.CharSequence getSummary(android.content.res.Resources arg1){
      return (java.lang.CharSequence) null;
    }
    public void readFromParcel(android.os.Parcel arg1){
    }
    public java.lang.CharSequence getBreadCrumbTitle(android.content.res.Resources arg1){
      return (java.lang.CharSequence) null;
    }
    public java.lang.CharSequence getBreadCrumbShortTitle(android.content.res.Resources arg1){
      return (java.lang.CharSequence) null;
    }
  }
  // Fields

  public static final java.lang.String EXTRA_SHOW_FRAGMENT = ":android:show_fragment";

  public static final java.lang.String EXTRA_SHOW_FRAGMENT_ARGUMENTS = ":android:show_fragment_args";

  public static final java.lang.String EXTRA_SHOW_FRAGMENT_TITLE = ":android:show_fragment_title";

  public static final java.lang.String EXTRA_SHOW_FRAGMENT_SHORT_TITLE = ":android:show_fragment_short_title";

  public static final java.lang.String EXTRA_NO_HEADERS = ":android:no_headers";

  public static final long HEADER_ID_UNDEFINED = -1l;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public PreferenceActivity(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onNewIntent(android.content.Intent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDestroy(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSaveInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onStop(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onContentChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onActivityResult(int arg1, int arg2, android.content.Intent arg3){
  }
  public PreferenceManager getPreferenceManager(){
    return (PreferenceManager) null;
  }
  public Preference findPreference(java.lang.CharSequence arg1){
    return (Preference) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onListItemClick(android.widget.ListView arg1, android.view.View arg2, int arg3, long arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onPreferenceTreeClick(PreferenceScreen arg1, Preference arg2){
    return false;
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
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onPreferenceStartFragment(PreferenceFragment arg1, Preference arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onBuildHeaders(java.util.List<PreferenceActivity.Header> arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public PreferenceActivity.Header onGetNewHeader(){
    return (PreferenceActivity.Header) null;
  }
  public void switchToHeader(java.lang.String arg1, android.os.Bundle arg2){
  }
  public void switchToHeader(PreferenceActivity.Header arg1){
  }
  public boolean hasHeaders(){
    return false;
  }
  public boolean isMultiPane(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onIsMultiPane(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onIsHidingHeaders(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public PreferenceActivity.Header onGetInitialHeader(){
    return (PreferenceActivity.Header) null;
  }
  public void invalidateHeaders(){
  }
  public void loadHeadersFromResource(int arg1, java.util.List<PreferenceActivity.Header> arg2){
  }
  public void setListFooter(android.view.View arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onHeaderClick(PreferenceActivity.Header arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.content.Intent onBuildStartFragmentIntent(java.lang.String arg1, android.os.Bundle arg2, int arg3, int arg4){
    return (android.content.Intent) null;
  }
  public void startWithFragment(java.lang.String arg1, android.os.Bundle arg2, android.app.Fragment arg3, int arg4){
  }
  public void startWithFragment(java.lang.String arg1, android.os.Bundle arg2, android.app.Fragment arg3, int arg4, int arg5, int arg6){
  }
  public void showBreadCrumbs(java.lang.CharSequence arg1, java.lang.CharSequence arg2){
  }
  public void setParentTitle(java.lang.CharSequence arg1, java.lang.CharSequence arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onClick") android.view.View.OnClickListener arg3){
  }
  public void startPreferenceFragment(android.app.Fragment arg1, boolean arg2){
  }
  public void startPreferencePanel(java.lang.String arg1, android.os.Bundle arg2, int arg3, java.lang.CharSequence arg4, android.app.Fragment arg5, int arg6){
  }
  public void finishPreferencePanel(android.app.Fragment arg1, int arg2, android.content.Intent arg3){
  }
  protected boolean hasNextButton(){
    return false;
  }
  protected android.widget.Button getNextButton(){
    return (android.widget.Button) null;
  }
}
