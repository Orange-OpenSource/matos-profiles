package android.view.textservice;

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
public final class SpellCheckerInfo
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<SpellCheckerInfo> CREATOR = null;

  // Constructors

  public SpellCheckerInfo(android.content.Context arg1, android.content.pm.ResolveInfo arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public SpellCheckerInfo(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String getId(){
    return (java.lang.String) null;
  }
  public java.lang.String getPackageName(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public android.content.ComponentName getComponent(){
    return (android.content.ComponentName) null;
  }
  public java.lang.CharSequence loadLabel(android.content.pm.PackageManager arg1){
    return (java.lang.CharSequence) null;
  }
  public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public android.content.pm.ServiceInfo getServiceInfo(){
    return (android.content.pm.ServiceInfo) null;
  }
  public java.lang.String getSettingsActivity(){
    return (java.lang.String) null;
  }
  public int getSubtypeCount(){
    return 0;
  }
  public SpellCheckerSubtype getSubtypeAt(int arg1){
    return (SpellCheckerSubtype) null;
  }
}
