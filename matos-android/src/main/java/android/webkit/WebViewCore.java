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
public final class WebViewCore
{
  // Classes

  public class EventHub
  {
    // Fields

    public static final int MESSAGE_RELAY = 125;

    // Constructors

    private EventHub(){
    }
  }
  // Constructors

  public WebViewCore(){
  }
  // Methods

  public void sendMessage(android.os.Message arg1){
  }
  public static void pauseTimers(){
  }
  public static void resumeTimers(){
  }
  public WebSettings getSettings(){
    return (WebSettings) null;
  }
  public void setMockDeviceOrientation(boolean arg1, double arg2, boolean arg3, double arg4, boolean arg5, double arg6){
  }
  protected void addMessageToConsole(java.lang.String arg1, int arg2, java.lang.String arg3, int arg4){
  }
  protected void jsAlert(java.lang.String arg1, java.lang.String arg2){
  }
  protected void exceededDatabaseQuota(java.lang.String arg1, java.lang.String arg2, long arg3, long arg4){
  }
  protected void reachedMaxAppCacheSize(long arg1){
  }
  protected void populateVisitedLinks(){
  }
  protected void geolocationPermissionsShowPrompt(java.lang.String arg1){
  }
  protected void geolocationPermissionsHidePrompt(){
  }
  protected boolean jsConfirm(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  protected java.lang.String jsPrompt(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
    return (java.lang.String) null;
  }
  protected boolean jsUnload(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  protected boolean jsInterrupt(){
    return false;
  }
  protected void setInstallableWebApp(){
  }
  protected void enterFullscreenForVideoLayer(int arg1, java.lang.String arg2){
  }
}
