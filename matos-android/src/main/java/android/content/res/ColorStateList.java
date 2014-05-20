package android.content.res;

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
public class ColorStateList
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<ColorStateList> CREATOR = null;

  // Constructors

  private ColorStateList(){
  }
  public ColorStateList(int [] [] arg1, int [] arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static ColorStateList valueOf(int arg1){
    return (ColorStateList) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean isStateful(){
    return false;
  }
  public static ColorStateList createFromXml(Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (ColorStateList) null;
  }
  public int getColorForState(int [] arg1, int arg2){
    return 0;
  }
  public int getDefaultColor(){
    return 0;
  }
  public ColorStateList withAlpha(int arg1){
    return (ColorStateList) null;
  }
}
