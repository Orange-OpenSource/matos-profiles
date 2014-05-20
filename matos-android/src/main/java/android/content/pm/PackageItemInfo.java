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
public class PackageItemInfo
{
  // Classes

  public static class DisplayNameComparator
    implements java.util.Comparator<PackageItemInfo>
  {
    // Constructors

    public DisplayNameComparator(PackageManager arg1){
    }
    // Methods

    public final int compare(PackageItemInfo arg1, PackageItemInfo arg2){
      return 0;
    }
  }
  // Fields

  public java.lang.String name;

  public java.lang.String packageName;

  public int labelRes;

  public java.lang.CharSequence nonLocalizedLabel;

  public int icon;

  public int logo;

  public android.os.Bundle metaData;

  // Constructors

  public PackageItemInfo(){
  }
  public PackageItemInfo(PackageItemInfo arg1){
  }
  protected PackageItemInfo(android.os.Parcel arg1){
  }
  // Methods

  protected ApplicationInfo getApplicationInfo(){
    return (ApplicationInfo) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public java.lang.CharSequence loadLabel(PackageManager arg1){
    return (java.lang.CharSequence) null;
  }
  public android.graphics.drawable.Drawable loadIcon(PackageManager arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public android.content.res.XmlResourceParser loadXmlMetaData(PackageManager arg1, java.lang.String arg2){
    return (android.content.res.XmlResourceParser) null;
  }
  protected android.graphics.drawable.Drawable loadDefaultIcon(PackageManager arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.drawable.Drawable loadLogo(PackageManager arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  protected android.graphics.drawable.Drawable loadDefaultLogo(PackageManager arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  protected void dumpFront(android.util.Printer arg1, java.lang.String arg2){
  }
  protected void dumpBack(android.util.Printer arg1, java.lang.String arg2){
  }
}
