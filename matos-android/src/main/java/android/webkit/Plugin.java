package android.webkit;

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
public class Plugin
{
  // Classes

  public static interface PreferencesClickHandler
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("handleClickEvent")
    public void handleClickEvent(android.content.Context arg1);
  }
  // Constructors

  public Plugin(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void setName(java.lang.String arg1){
  }
  public java.lang.String getFileName(){
    return (java.lang.String) null;
  }
  public java.lang.String getPath(){
    return (java.lang.String) null;
  }
  public void setPath(java.lang.String arg1){
  }
  public java.lang.String getDescription(){
    return (java.lang.String) null;
  }
  public void setFileName(java.lang.String arg1){
  }
  public void setDescription(java.lang.String arg1){
  }
  public void setClickHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.webkit.Plugin.PreferencesClickHandler.handleClickEvent") Plugin.PreferencesClickHandler arg1){
  }
  public void dispatchClickEvent(android.content.Context arg1){
  }
}
