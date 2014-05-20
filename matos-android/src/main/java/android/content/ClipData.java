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


public class ClipData
  implements android.os.Parcelable
{
  // Classes

  public static class Item
  {
    // Constructors

    public Item(java.lang.CharSequence arg1){
    }
    public Item(Intent arg1){
    }
    public Item(android.net.Uri arg1){
    }
    public Item(java.lang.CharSequence arg1, Intent arg2, android.net.Uri arg3){
    }
    // Methods

    public Intent getIntent(){
      return (Intent) null;
    }
    public java.lang.CharSequence getText(){
      return (java.lang.CharSequence) null;
    }
    public android.net.Uri getUri(){
      return (android.net.Uri) null;
    }
    public java.lang.CharSequence coerceToText(Context arg1){
      return (java.lang.CharSequence) null;
    }
  }
  // Fields

  public static final android.os.Parcelable.Creator<ClipData> CREATOR = null;

  // Constructors

  public ClipData(java.lang.CharSequence arg1, java.lang.String [] arg2, ClipData.Item arg3){
  }
  public ClipData(ClipDescription arg1, ClipData.Item arg2){
  }
  ClipData(android.os.Parcel arg1){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public android.graphics.Bitmap getIcon(){
    return (android.graphics.Bitmap) null;
  }
  public int getItemCount(){
    return 0;
  }
  public ClipDescription getDescription(){
    return (ClipDescription) null;
  }
  public static ClipData newIntent(java.lang.CharSequence arg1, Intent arg2){
    return (ClipData) null;
  }
  public static ClipData newRawUri(java.lang.CharSequence arg1, android.net.Uri arg2){
    return (ClipData) null;
  }
  public void addItem(ClipData.Item arg1){
  }
  public static ClipData newPlainText(java.lang.CharSequence arg1, java.lang.CharSequence arg2){
    return (ClipData) null;
  }
  public ClipData.Item getItemAt(int arg1){
    return (ClipData.Item) null;
  }
  public static ClipData newUri(ContentResolver arg1, java.lang.CharSequence arg2, android.net.Uri arg3){
    return (ClipData) null;
  }
}
