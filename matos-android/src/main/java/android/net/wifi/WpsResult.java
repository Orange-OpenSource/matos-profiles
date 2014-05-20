package android.net.wifi;

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


public class WpsResult
  implements android.os.Parcelable
{
  // Classes

  public static enum Status
  {
    // Enum Constants

    SUCCESS()
, FAILURE()
, IN_PROGRESS()
;
    // Fields

    // Constructors

    private Status(){
    }
    // Methods

  }
  // Fields

  public WpsResult.Status status;

  public java.lang.String pin;

  public static final android.os.Parcelable.Creator<WpsResult> CREATOR = null;

  // Constructors

  public WpsResult(){
  }
  public WpsResult(WpsResult.Status arg1){
  }
  public WpsResult(WpsResult arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
}
