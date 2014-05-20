package android.os;

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
public class PatternMatcher
  implements Parcelable
{
  // Fields

  public static final int PATTERN_LITERAL = 0;

  public static final int PATTERN_PREFIX = 1;

  public static final int PATTERN_SIMPLE_GLOB = 2;

  public static final Parcelable.Creator<PatternMatcher> CREATOR = null;

  // Constructors

  public PatternMatcher(java.lang.String arg1, int arg2){
  }
  public PatternMatcher(Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final int getType(){
    return 0;
  }
  public final java.lang.String getPath(){
    return (java.lang.String) null;
  }
  public boolean match(java.lang.String arg1){
    return false;
  }
  public void writeToParcel(Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
}
