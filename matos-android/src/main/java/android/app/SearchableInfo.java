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


public final class SearchableInfo
  implements android.os.Parcelable
{
  // Classes

  public static class ActionKeyInfo
    implements android.os.Parcelable
  {
    // Constructors

    ActionKeyInfo(android.content.Context arg1, android.util.AttributeSet arg2){
    }
    private ActionKeyInfo(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public int getKeyCode(){
      return 0;
    }
    public java.lang.String getQueryActionMsg(){
      return (java.lang.String) null;
    }
    public java.lang.String getSuggestActionMsg(){
      return (java.lang.String) null;
    }
    public java.lang.String getSuggestActionMsgColumn(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final android.os.Parcelable.Creator<SearchableInfo> CREATOR = null;

  // Constructors

  private SearchableInfo(android.content.Context arg1, android.util.AttributeSet arg2, android.content.ComponentName arg3){
  }
  SearchableInfo(android.os.Parcel arg1){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public int getInputType(){
    return 0;
  }
  public int getImeOptions(){
    return 0;
  }
  public boolean autoUrlDetect(){
    return false;
  }
  public boolean queryAfterZeroResults(){
    return false;
  }
  public boolean getVoiceSearchEnabled(){
    return false;
  }
  public boolean getVoiceSearchLaunchWebSearch(){
    return false;
  }
  public boolean getVoiceSearchLaunchRecognizer(){
    return false;
  }
  public SearchableInfo.ActionKeyInfo findActionKey(int arg1){
    return (SearchableInfo.ActionKeyInfo) null;
  }
  public int getHintId(){
    return 0;
  }
  public int getSuggestThreshold(){
    return 0;
  }
  public java.lang.String getSuggestAuthority(){
    return (java.lang.String) null;
  }
  public android.content.ComponentName getSearchActivity(){
    return (android.content.ComponentName) null;
  }
  public int getVoiceLanguageModeId(){
    return 0;
  }
  public int getVoicePromptTextId(){
    return 0;
  }
  public int getVoiceLanguageId(){
    return 0;
  }
  public int getVoiceMaxResults(){
    return 0;
  }
  public java.lang.String getSuggestIntentAction(){
    return (java.lang.String) null;
  }
  public java.lang.String getSuggestIntentData(){
    return (java.lang.String) null;
  }
  public java.lang.String getSuggestPackage(){
    return (java.lang.String) null;
  }
  public boolean useBadgeLabel(){
    return false;
  }
  public boolean useBadgeIcon(){
    return false;
  }
  public boolean shouldRewriteQueryFromData(){
    return false;
  }
  public boolean shouldRewriteQueryFromText(){
    return false;
  }
  public int getSettingsDescriptionId(){
    return 0;
  }
  public java.lang.String getSuggestPath(){
    return (java.lang.String) null;
  }
  public java.lang.String getSuggestSelection(){
    return (java.lang.String) null;
  }
  public android.content.Context getActivityContext(android.content.Context arg1){
    return (android.content.Context) null;
  }
  public android.content.Context getProviderContext(android.content.Context arg1, android.content.Context arg2){
    return (android.content.Context) null;
  }
  public static SearchableInfo getActivityMetaData(android.content.Context arg1, android.content.pm.ActivityInfo arg2){
    return (SearchableInfo) null;
  }
  public int getLabelId(){
    return 0;
  }
  public int getIconId(){
    return 0;
  }
  public int getSearchButtonText(){
    return 0;
  }
  public boolean shouldIncludeInGlobalSearch(){
    return false;
  }
}
