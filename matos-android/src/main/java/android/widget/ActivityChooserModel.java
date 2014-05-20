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
public class ActivityChooserModel
  extends android.database.DataSetObservable{
  // Classes

  public static interface ActivityChooserModelClient
  {
    // Methods

    public void setActivityChooserModel(ActivityChooserModel arg1);
  }
  public static interface ActivitySorter
  {
    // Methods

    public void sort(android.content.Intent arg1, java.util.List<ActivityChooserModel.ActivityResolveInfo> arg2, java.util.List<ActivityChooserModel.HistoricalRecord> arg3);
  }
  public static interface OnChooseActivityListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnChooseActivityListener")
    public boolean onChooseActivity(ActivityChooserModel arg1, android.content.Intent arg2);
  }
  public static final class HistoricalRecord
  {
    // Fields

    public final android.content.ComponentName activity = (android.content.ComponentName) null;

    public final long time = 0l;

    public final float weight = 0.0f;

    // Constructors

    public HistoricalRecord(java.lang.String arg1, long arg2, float arg3){
    }
    public HistoricalRecord(android.content.ComponentName arg1, long arg2, float arg3){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public int hashCode(){
      return 0;
    }
  }
  public final class ActivityResolveInfo
    implements java.lang.Comparable<ActivityChooserModel.ActivityResolveInfo>
  {
    // Fields

    public final android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) null;

    public float weight;

    // Constructors

    public ActivityResolveInfo(android.content.pm.ResolveInfo arg1){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public int hashCode(){
      return 0;
    }
    public int compareTo(ActivityChooserModel.ActivityResolveInfo arg1){
      return 0;
    }
  }
  // Fields

  public static final java.lang.String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";

  public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;

  // Constructors

  private ActivityChooserModel(android.content.Context arg1, java.lang.String arg2){
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public static ActivityChooserModel get(android.content.Context arg1, java.lang.String arg2){
    return (ActivityChooserModel) null;
  }
  public android.content.Intent getIntent(){
    return (android.content.Intent) null;
  }
  public void setIntent(android.content.Intent arg1){
  }
  public android.content.pm.ResolveInfo getActivity(int arg1){
    return (android.content.pm.ResolveInfo) null;
  }
  public int getHistorySize(){
    return 0;
  }
  public android.content.Intent chooseActivity(int arg1){
    return (android.content.Intent) null;
  }
  public int getActivityCount(){
    return 0;
  }
  public android.content.pm.ResolveInfo getDefaultActivity(){
    return (android.content.pm.ResolveInfo) null;
  }
  public void setOnChooseActivityListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnChooseActivityListener") ActivityChooserModel.OnChooseActivityListener arg1){
  }
  public void setDefaultActivity(int arg1){
  }
  public int getActivityIndex(android.content.pm.ResolveInfo arg1){
    return 0;
  }
  public void setActivitySorter(ActivityChooserModel.ActivitySorter arg1){
  }
  public void setHistoryMaxSize(int arg1){
  }
  public int getHistoryMaxSize(){
    return 0;
  }
}
