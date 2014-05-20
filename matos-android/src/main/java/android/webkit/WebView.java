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
public class WebView
  extends android.widget.AbsoluteLayout  implements android.view.ViewGroup.OnHierarchyChangeListener, android.view.ViewTreeObserver.OnGlobalFocusChangeListener
{
  // Classes

  public class WebViewTransport
  {
    // Fields

    // Constructors

    public WebViewTransport(){
    }
    // Methods

    public synchronized void setWebView(@com.francetelecom.rd.stubs.annotation.FieldSet("view") WebView arg1){
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("view")
    public synchronized WebView getWebView(){
      return (WebView) null;
    }
  }
  public static interface PictureListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onNewPicture")
    public void onNewPicture(WebView arg1, android.graphics.Picture arg2);
  }
  public class HitTestResult
  {
    // Fields

    public static final int UNKNOWN_TYPE = 0;

    public static final int ANCHOR_TYPE = 1;

    public static final int PHONE_TYPE = 2;

    public static final int GEO_TYPE = 3;

    public static final int EMAIL_TYPE = 4;

    public static final int IMAGE_TYPE = 5;

    public static final int IMAGE_ANCHOR_TYPE = 6;

    public static final int SRC_ANCHOR_TYPE = 7;

    public static final int SRC_IMAGE_ANCHOR_TYPE = 8;

    public static final int EDIT_TEXT_TYPE = 9;

    // Constructors

    HitTestResult(){
    }
    // Methods

    public int getType(){
      return 0;
    }
    public java.lang.String getExtra(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final java.lang.String SCHEME_TEL = "tel:";

  public static final java.lang.String SCHEME_MAILTO = "mailto:";

  public static final java.lang.String SCHEME_GEO = "geo:0,0?q=";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public WebView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public WebView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public WebView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public WebView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3, boolean arg4){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected WebView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3, java.util.Map<java.lang.String, java.lang.Object> arg4, boolean arg5){
    super((android.content.Context) null);
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void destroy(){
  }
  public void freeMemory(){
  }
  public android.net.http.SslCertificate getCertificate(){
    return (android.net.http.SslCertificate) null;
  }
  public void debugDump(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onResume(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPause(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyMultiple(int arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onGenericMotionEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onWindowFocusChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDetachedFromWindow(){
  }
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  public java.lang.String getTitle(){
    return (java.lang.String) null;
  }
  protected boolean setFrame(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  public boolean shouldDelayChildPressedState(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  public int getContentHeight(){
    return 0;
  }
  public boolean requestChildRectangleOnScreen(android.view.View arg1, android.graphics.Rect arg2, boolean arg3){
    return false;
  }
  public boolean requestFocus(int arg1, android.graphics.Rect arg2){
    return false;
  }
  protected boolean drawChild(android.graphics.Canvas arg1, android.view.View arg2, long arg3){
    return false;
  }
  public void computeScroll(){
  }
  public void setLayoutParams(android.view.ViewGroup.LayoutParams arg1){
  }
  public boolean performLongClick(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFocusChanged(boolean arg1, int arg2, android.graphics.Rect arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onVisibilityChanged(android.view.View arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo arg1){
    return (android.view.inputmethod.InputConnection) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onHoverEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onScrollChanged(int arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  public void setScrollBarStyle(int arg1){
  }
  protected int computeHorizontalScrollRange(){
    return 0;
  }
  protected int computeHorizontalScrollOffset(){
    return 0;
  }
  protected int computeVerticalScrollRange(){
    return 0;
  }
  protected int computeVerticalScrollOffset(){
    return 0;
  }
  protected int computeVerticalScrollExtent(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDrawVerticalScrollBar(android.graphics.Canvas arg1, android.graphics.drawable.Drawable arg2, int arg3, int arg4, int arg5, int arg6){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDraw(android.graphics.Canvas arg1){
  }
  public void setBackgroundColor(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onOverScrolled(int arg1, int arg2, boolean arg3, boolean arg4){
  }
  public void setOverScrollMode(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onChildViewAdded(android.view.View arg1, android.view.View arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onChildViewRemoved(android.view.View arg1, android.view.View arg2){
  }
  public int getProgress(){
    return 0;
  }
  public int getContentWidth(){
    return 0;
  }
  protected int getTitleHeight(){
    return 0;
  }
  public boolean isPrivateBrowsingEnabled(){
    return false;
  }
  public void reload(){
  }
  public java.lang.String getUrl(){
    return (java.lang.String) null;
  }
  public void clearCache(boolean arg1){
  }
  public void setHorizontalScrollbarOverlay(boolean arg1){
  }
  public void setVerticalScrollbarOverlay(boolean arg1){
  }
  public boolean overlayHorizontalScrollbar(){
    return false;
  }
  public boolean overlayVerticalScrollbar(){
    return false;
  }
  public int getVisibleTitleHeight(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WebView.setCertificate", report = "-")
  public void setCertificate(android.net.http.SslCertificate arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WebView.savePassword", pos = {1, 2, 3}, report = "-")
  public void savePassword(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WebView.setHttpAuthUsernamePassword", pos = {1, 2, 3, 4}, report = "-")
  public void setHttpAuthUsernamePassword(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WebView.getHttpAuthUsernamePassword", pos = {1, 2}, report = "-")
  public java.lang.String [] getHttpAuthUsernamePassword(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String []) null;
  }
  public static void enablePlatformNotifications(){
  }
  public static void disablePlatformNotifications(){
  }
  public void setJsFlags(java.lang.String arg1){
  }
  public void setNetworkAvailable(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WebView.setNetworkType", pos = {1, 2}, report = "-")
  public void setNetworkType(java.lang.String arg1, java.lang.String arg2){
  }
  public WebBackForwardList saveState(android.os.Bundle arg1){
    return (WebBackForwardList) null;
  }
  public boolean savePicture(android.os.Bundle arg1, java.io.File arg2){
    return false;
  }
  public boolean restorePicture(android.os.Bundle arg1, java.io.File arg2){
    return false;
  }
  public boolean saveViewState(java.io.OutputStream arg1){
    return false;
  }
  public boolean loadViewState(java.io.InputStream arg1){
    return false;
  }
  public void clearViewState(){
  }
  public WebBackForwardList restoreState(android.os.Bundle arg1){
    return (WebBackForwardList) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WebView.loadUrl-2", pos = 1, report = "-")
  public void loadUrl(java.lang.String arg1, java.util.Map<java.lang.String, java.lang.String> arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WebView.loadUrl", pos = 1, report = "-")
  public void loadUrl(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WebView.postUrl", pos = 1, report = "-")
  public void postUrl(java.lang.String arg1, byte [] arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WebView.loadData", pos = 1, report = "-")
  public void loadData(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WebView.loadDataWithBaseURL", pos = 1, report = "-")
  public void loadDataWithBaseURL(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5){
  }
  public void saveWebArchive(java.lang.String arg1){
  }
  public void saveWebArchive(java.lang.String arg1, boolean arg2, ValueCallback<java.lang.String> arg3){
  }
  public void stopLoading(){
  }
  public boolean canGoBack(){
    return false;
  }
  public void goBack(){
  }
  public boolean canGoForward(){
    return false;
  }
  public void goForward(){
  }
  public boolean canGoBackOrForward(int arg1){
    return false;
  }
  public void goBackOrForward(int arg1){
  }
  public boolean pageUp(boolean arg1){
    return false;
  }
  public boolean pageDown(boolean arg1){
    return false;
  }
  public void clearView(){
  }
  public android.graphics.Picture capturePicture(){
    return (android.graphics.Picture) null;
  }
  public float getScale(){
    return 0.0f;
  }
  public void setInitialScale(int arg1){
  }
  public void invokeZoomPicker(){
  }
  public WebView.HitTestResult getHitTestResult(){
    return (WebView.HitTestResult) null;
  }
  public void requestFocusNodeHref(android.os.Message arg1){
  }
  public void requestImageRef(android.os.Message arg1){
  }
  public void setEmbeddedTitleBar(android.view.View arg1){
  }
  public void setTitleBarGravity(int arg1){
  }
  public java.lang.String getOriginalUrl(){
    return (java.lang.String) null;
  }
  public android.graphics.Bitmap getFavicon(){
    return (android.graphics.Bitmap) null;
  }
  public java.lang.String getTouchIconUrl(){
    return (java.lang.String) null;
  }
  public int getPageBackgroundColor(){
    return 0;
  }
  public void pauseTimers(){
  }
  public void resumeTimers(){
  }
  public boolean isPaused(){
    return false;
  }
  public void clearFormData(){
  }
  public void clearHistory(){
  }
  public void clearSslPreferences(){
  }
  public WebBackForwardList copyBackForwardList(){
    return (WebBackForwardList) null;
  }
  public void findNext(boolean arg1){
  }
  public int findAll(java.lang.String arg1){
    return 0;
  }
  public boolean showFindDialog(java.lang.String arg1, boolean arg2){
    return false;
  }
  public static java.lang.String findAddress(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String findAddress(java.lang.String arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public void clearMatches(){
  }
  public void documentHasImages(android.os.Message arg1){
  }
  public void stopScroll(){
  }
  public void setWebViewClient(@com.francetelecom.rd.stubs.annotation.FieldSet("mWebViewClient") WebViewClient arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mWebViewClient")
  public WebViewClient getWebViewClient(){
    return (WebViewClient) null;
  }
  public void setDownloadListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onStart") DownloadListener arg1){
  }
  public void setWebChromeClient(@com.francetelecom.rd.stubs.annotation.FieldSet("mWebChromeClient")WebChromeClient arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mWebChromeClient")
  public WebChromeClient getWebChromeClient(){
    return (WebChromeClient) null;
  }
  public void setWebBackForwardListClient(@com.francetelecom.rd.stubs.annotation.CallBackRegister("WebBackForwardListClient") WebBackForwardListClient arg1){
  }
  public WebBackForwardListClient getWebBackForwardListClient(){
    return (WebBackForwardListClient) null;
  }
  public void setPictureListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.webkit.WebView.PictureListener.onNewPicture") WebView.PictureListener arg1){
  }
  public void externalRepresentation(android.os.Message arg1){
  }
  public void documentAsText(android.os.Message arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WebView.addJavaScriptInterface", pos = {1, 2}, report = "-")
  public void addJavascriptInterface(java.lang.Object arg1, java.lang.String arg2){
  }
  public void removeJavascriptInterface(java.lang.String arg1){
  }
  public WebSettings getSettings(){
    return (WebSettings) null;
  }
  public static synchronized PluginList getPluginList(){
    return (PluginList) null;
  }
  public void refreshPlugins(boolean arg1){
  }
  public boolean selectText(){
    return false;
  }
  protected void registerPageSwapCallback(){
  }
  public void dumpDisplayTree(){
  }
  public void dumpDomTree(boolean arg1){
  }
  public void dumpRenderTree(boolean arg1){
  }
  public void useMockDeviceOrientation(){
  }
  public void setMockDeviceOrientation(boolean arg1, double arg2, boolean arg3, double arg4, boolean arg5, double arg6){
  }
  public void dumpV8Counters(){
  }
  public void emulateShiftHeld(){
  }
  public void selectAll(){
  }
  public boolean copySelection(){
    return false;
  }
  public SearchBox getSearchBox(){
    return (SearchBox) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public void onGlobalFocusChanged(android.view.View arg1, android.view.View arg2){
  }
  public void setMapTrackballToArrowKeys(boolean arg1){
  }
  public void flingScroll(int arg1, int arg2){
  }
  public android.view.View getZoomControls(){
    return (android.view.View) null;
  }
  public boolean canZoomIn(){
    return false;
  }
  public boolean canZoomOut(){
    return false;
  }
  public boolean zoomIn(){
    return false;
  }
  public boolean zoomOut(){
    return false;
  }
  public synchronized WebViewCore getWebViewCore(){
    return (WebViewCore) null;
  }
  protected void pageSwapCallback(){
  }
  public void drawPage(android.graphics.Canvas arg1){
  }
  public void setTouchInterval(int arg1){
  }
  protected void updateCachedTextfield(java.lang.String arg1){
  }
  protected void contentInvalidateAll(){
  }
  public void tileProfilingStart(){
  }
  public float tileProfilingStop(){
    return 0.0f;
  }
  public void tileProfilingClear(){
  }
  public int tileProfilingNumFrames(){
    return 0;
  }
  public int tileProfilingNumTilesInFrame(int arg1){
    return 0;
  }
  public int tileProfilingGetInt(int arg1, int arg2, java.lang.String arg3){
    return 0;
  }
  public float tileProfilingGetFloat(int arg1, int arg2, java.lang.String arg3){
    return 0.0f;
  }
}
