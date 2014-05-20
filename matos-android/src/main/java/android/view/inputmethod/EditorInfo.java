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
public class EditorInfo
  implements android.os.Parcelable, android.text.InputType
{
  // Fields

  public int inputType;

  public static final int IME_MASK_ACTION = 255;

  public static final int IME_ACTION_UNSPECIFIED = 0;

  public static final int IME_ACTION_NONE = 1;

  public static final int IME_ACTION_GO = 2;

  public static final int IME_ACTION_SEARCH = 3;

  public static final int IME_ACTION_SEND = 4;

  public static final int IME_ACTION_NEXT = 5;

  public static final int IME_ACTION_DONE = 6;

  public static final int IME_ACTION_PREVIOUS = 7;

  public static final int IME_FLAG_NO_FULLSCREEN = 33554432;

  public static final int IME_FLAG_NAVIGATE_PREVIOUS = 67108864;

  public static final int IME_FLAG_NAVIGATE_NEXT = 134217728;

  public static final int IME_FLAG_NO_EXTRACT_UI = 268435456;

  public static final int IME_FLAG_NO_ACCESSORY_ACTION = 536870912;

  public static final int IME_FLAG_NO_ENTER_ACTION = 1073741824;

  public static final int IME_NULL = 0;

  public int imeOptions;

  public java.lang.String privateImeOptions;

  public java.lang.CharSequence actionLabel;

  public int actionId;

  public int initialSelStart;

  public int initialSelEnd;

  public int initialCapsMode;

  public java.lang.CharSequence hintText;

  public java.lang.CharSequence label;

  public java.lang.String packageName;

  public int fieldId;

  public java.lang.String fieldName;

  public android.os.Bundle extras;

  public static final android.os.Parcelable.Creator<EditorInfo> CREATOR = null;

  // Constructors

  public EditorInfo(){
  }
  // Methods

  public void dump(android.util.Printer arg1, java.lang.String arg2){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public final void makeCompatible(int arg1){
  }
}
