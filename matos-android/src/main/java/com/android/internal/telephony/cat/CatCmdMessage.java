package com.android.internal.telephony.cat;

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
public class CatCmdMessage
  implements android.os.Parcelable
{
  // Classes

  public class BrowserSettings
  {
    // Fields

    public java.lang.String url;

    public LaunchBrowserMode mode;

    // Constructors

    public BrowserSettings(){
    }
  }
  public class CallSettings
  {
    // Fields

    public TextMessage confirmMsg;

    public TextMessage callMsg;

    // Constructors

    public CallSettings(){
    }
  }
  // Fields

  public static final android.os.Parcelable.Creator<CatCmdMessage> CREATOR = null;

  // Constructors

  public CatCmdMessage(android.os.Parcel arg1){
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public Menu getMenu(){
    return (Menu) null;
  }
  public AppInterface.CommandType getCmdType(){
    return (AppInterface.CommandType) null;
  }
  public Input geInput(){
    return (Input) null;
  }
  public TextMessage geTextMessage(){
    return (TextMessage) null;
  }
  public CatCmdMessage.BrowserSettings getBrowserSettings(){
    return (CatCmdMessage.BrowserSettings) null;
  }
  public ToneSettings getToneSettings(){
    return (ToneSettings) null;
  }
  public CatCmdMessage.CallSettings getCallSettings(){
    return (CatCmdMessage.CallSettings) null;
  }
}
