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
public class WebViewClient
{
  // Fields

  public static final int ERROR_UNKNOWN = -1;

  public static final int ERROR_HOST_LOOKUP = -2;

  public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;

  public static final int ERROR_AUTHENTICATION = -4;

  public static final int ERROR_PROXY_AUTHENTICATION = -5;

  public static final int ERROR_CONNECT = -6;

  public static final int ERROR_IO = -7;

  public static final int ERROR_TIMEOUT = -8;

  public static final int ERROR_REDIRECT_LOOP = -9;

  public static final int ERROR_UNSUPPORTED_SCHEME = -10;

  public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;

  public static final int ERROR_BAD_URL = -12;

  public static final int ERROR_FILE = -13;

  public static final int ERROR_FILE_NOT_FOUND = -14;

  public static final int ERROR_TOO_MANY_REQUESTS = -15;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public WebViewClient(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPageStarted(WebView arg1, java.lang.String arg2, android.graphics.Bitmap arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPageFinished(WebView arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onReceivedSslError(WebView arg1, SslErrorHandler arg2, android.net.http.SslError arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onUnhandledKeyEvent(WebView arg1, android.view.KeyEvent arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean shouldOverrideUrlLoading(WebView arg1, java.lang.String arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onLoadResource(WebView arg1, java.lang.String arg2){
  }
  public WebResourceResponse shouldInterceptRequest(WebView arg1, java.lang.String arg2){
    return (WebResourceResponse) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onTooManyRedirects(WebView arg1, android.os.Message arg2, android.os.Message arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onReceivedError(WebView arg1, int arg2, java.lang.String arg3, java.lang.String arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFormResubmission(WebView arg1, android.os.Message arg2, android.os.Message arg3){
  }
  public void doUpdateVisitedHistory(WebView arg1, java.lang.String arg2, boolean arg3){
  }
  public void onProceededAfterSslError(WebView arg1, android.net.http.SslError arg2){
  }
  public void onReceivedClientCertRequest(WebView arg1, ClientCertRequestHandler arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onReceivedHttpAuthRequest(WebView arg1, HttpAuthHandler arg2, java.lang.String arg3, java.lang.String arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean shouldOverrideKeyEvent(WebView arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onScaleChanged(WebView arg1, float arg2, float arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onReceivedLoginRequest(WebView arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
  }
}
