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
public class WebChromeClient
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.CustomViewCallBackImplem", superClass = "")
  public static interface CustomViewCallback
  {
    // Methods

    public void onCustomViewHidden();
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public WebChromeClient(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onReceivedIcon(WebView arg1, android.graphics.Bitmap arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onProgressChanged(WebView arg1, int arg2){
  }
  public void setInstallableWebApp(){
  }
  public void getVisitedHistory(ValueCallback<java.lang.String []> arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onShowCustomView(android.view.View arg1, WebChromeClient.CustomViewCallback arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onShowCustomView(android.view.View arg1, int arg2, WebChromeClient.CustomViewCallback arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onHideCustomView(){
  }
  public void openFileChooser(ValueCallback<android.net.Uri> arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onJsAlert(WebView arg1, java.lang.String arg2, java.lang.String arg3, JsResult arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onExceededDatabaseQuota(java.lang.String arg1, java.lang.String arg2, long arg3, long arg4, long arg5, WebStorage.QuotaUpdater arg6){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onReachedMaxAppCacheSize(long arg1, long arg2, WebStorage.QuotaUpdater arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onGeolocationPermissionsShowPrompt(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("callBack") GeolocationPermissions.Callback arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onGeolocationPermissionsHidePrompt(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onJsConfirm(WebView arg1, java.lang.String arg2, java.lang.String arg3, JsResult arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onJsPrompt(WebView arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, JsPromptResult arg5){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onJsBeforeUnload(WebView arg1, java.lang.String arg2, java.lang.String arg3, JsResult arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onJsTimeout(){
    return false;
  }
  public void setupAutoFill(android.os.Message arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onReceivedTitle(WebView arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onReceivedTouchIconUrl(WebView arg1, java.lang.String arg2, boolean arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRequestFocus(WebView arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCloseWindow(WebView arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onCreateWindow(WebView arg1, boolean arg2, boolean arg3, android.os.Message arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onConsoleMessage(java.lang.String arg1, int arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onConsoleMessage(ConsoleMessage arg1){
    return false;
  }
  public android.graphics.Bitmap getDefaultVideoPoster(){
    return (android.graphics.Bitmap) null;
  }
  public android.view.View getVideoLoadingProgressView(){
    return (android.view.View) null;
  }
}
