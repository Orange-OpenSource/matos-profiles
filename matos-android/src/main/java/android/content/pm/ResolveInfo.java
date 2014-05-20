package android.content.pm;

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
public class ResolveInfo
  implements android.os.Parcelable
{
  // Classes

  public static class DisplayNameComparator
    implements java.util.Comparator<ResolveInfo>
  {
    // Constructors

    public DisplayNameComparator(PackageManager arg1){
    }
    // Methods

    public final int compare(ResolveInfo arg1, ResolveInfo arg2){
      return 0;
    }
  }
  // Fields

  public ActivityInfo activityInfo;

  public ServiceInfo serviceInfo;

  public android.content.IntentFilter filter;

  public int priority;

  public int preferredOrder;

  public int match;

  public int specificIndex;

  public boolean isDefault;

  public int labelRes;

  public java.lang.CharSequence nonLocalizedLabel;

  public int icon;

  public java.lang.String resolvePackageName;

  public boolean system;

  public static final android.os.Parcelable.Creator<ResolveInfo> CREATOR = null;

  // Constructors

  public ResolveInfo(){
  }
  private ResolveInfo(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void dump(android.util.Printer arg1, java.lang.String arg2){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public java.lang.CharSequence loadLabel(PackageManager arg1){
    return (java.lang.CharSequence) null;
  }
  public android.graphics.drawable.Drawable loadIcon(PackageManager arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public final int getIconResource(){
    return 0;
  }
}
