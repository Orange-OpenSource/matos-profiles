package android.view.inputmethod;

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
public final class InputMethodInfo
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<InputMethodInfo> CREATOR = null;

  // Constructors

  public InputMethodInfo(android.content.Context arg1, android.content.pm.ResolveInfo arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public InputMethodInfo(android.content.Context arg1, android.content.pm.ResolveInfo arg2, java.util.Map<java.lang.String, java.util.List<InputMethodSubtype>> arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  InputMethodInfo(android.os.Parcel arg1){
  }
  public InputMethodInfo(java.lang.String arg1, java.lang.String arg2, java.lang.CharSequence arg3, java.lang.String arg4){
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
  public java.lang.String getId(){
    return (java.lang.String) null;
  }
  public java.lang.String getPackageName(){
    return (java.lang.String) null;
  }
  public void dump(android.util.Printer arg1, java.lang.String arg2){
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
  public java.lang.String getServiceName(){
    return (java.lang.String) null;
  }
  public java.lang.String getSettingsActivity(){
    return (java.lang.String) null;
  }
  public int getSubtypeCount(){
    return 0;
  }
  public InputMethodSubtype getSubtypeAt(int arg1){
    return (InputMethodSubtype) null;
  }
  public int getIsDefaultResourceId(){
    return 0;
  }
  public boolean isAuxiliaryIme(){
    return false;
  }
}
