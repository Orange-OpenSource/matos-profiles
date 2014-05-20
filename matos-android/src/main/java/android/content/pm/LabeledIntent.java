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
public class LabeledIntent
  extends android.content.Intent{
  // Fields

  public static final android.os.Parcelable.Creator<LabeledIntent> CREATOR = null;

  // Constructors

  public LabeledIntent(android.content.Intent arg1, java.lang.String arg2, int arg3, int arg4){
    super();
  }
  public LabeledIntent(android.content.Intent arg1, java.lang.String arg2, java.lang.CharSequence arg3, int arg4){
    super();
  }
  public LabeledIntent(java.lang.String arg1, int arg2, int arg3){
    super();
  }
  public LabeledIntent(java.lang.String arg1, java.lang.CharSequence arg2, int arg3){
    super();
  }
  protected LabeledIntent(android.os.Parcel arg1){
    super();
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public void readFromParcel(android.os.Parcel arg1){
  }
  public java.lang.CharSequence loadLabel(PackageManager arg1){
    return (java.lang.CharSequence) null;
  }
  public android.graphics.drawable.Drawable loadIcon(PackageManager arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public int getIconResource(){
    return 0;
  }
  public java.lang.String getSourcePackage(){
    return (java.lang.String) null;
  }
  public int getLabelResource(){
    return 0;
  }
  public java.lang.CharSequence getNonLocalizedLabel(){
    return (java.lang.CharSequence) null;
  }
}
