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
public final class WebIconDatabase
{
  // Classes

  public static interface IconListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onReceivedIcon")
    public void onReceivedIcon(java.lang.String arg1, android.graphics.Bitmap arg2);
  }
  // Constructors

  private WebIconDatabase(){
  }
  // Methods

  public static WebIconDatabase getInstance(){
    return (WebIconDatabase) null;
  }
  public void close(){
  }
  public void open(java.lang.String arg1){
  }
  public void releaseIconForPageUrl(java.lang.String arg1){
  }
  public void bulkRequestIconForPageUrl(android.content.ContentResolver arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onReceivedIcon") WebIconDatabase.IconListener arg3){
  }
  public void removeAllIcons(){
  }
  public void requestIconForPageUrl(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onReceivedIcon") WebIconDatabase.IconListener arg2){
  }
  public void retainIconForPageUrl(java.lang.String arg1){
  }
}
