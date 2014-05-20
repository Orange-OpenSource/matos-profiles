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
public class WebSettings
{
  // Classes

  public static enum LayoutAlgorithm
  {
    // Enum Constants

    NORMAL()
, SINGLE_COLUMN()
, NARROW_COLUMNS()
;
    // Fields

    // Constructors

    private LayoutAlgorithm(){
    }
    // Methods

  }
  public static enum TextSize
  {
    // Enum Constants

    SMALLEST(0)
, SMALLER(0)
, NORMAL(0)
, LARGER(0)
, LARGEST(0)
;
    // Fields

    // Constructors

    private TextSize(int arg1){
    }
    // Methods

  }
  public static enum ZoomDensity
  {
    // Enum Constants

    FAR(0)
, MEDIUM(0)
, CLOSE(0)
;
    // Fields

    // Constructors

    private ZoomDensity(int arg1){
    }
    // Methods

  }
  public static enum RenderPriority
  {
    // Enum Constants

    NORMAL()
, HIGH()
, LOW()
;
    // Fields

    // Constructors

    private RenderPriority(){
    }
    // Methods

  }
  public static enum PluginState
  {
    // Enum Constants

    ON()
, ON_DEMAND()
, OFF()
;
    // Fields

    // Constructors

    private PluginState(){
    }
    // Methods

  }
  public static class AutoFillProfile
  {
    // Constructors
    public AutoFillProfile(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mFullName") java.lang.String arg2,
    									@com.francetelecom.rd.stubs.annotation.FieldSet("mEmail") java.lang.String arg3,
    									@com.francetelecom.rd.stubs.annotation.FieldSet("mCompanyName") java.lang.String arg4,
    									@com.francetelecom.rd.stubs.annotation.FieldSet("mAddressLine1") java.lang.String arg5,
    									@com.francetelecom.rd.stubs.annotation.FieldSet("mAddressLine2") java.lang.String arg6,
    									@com.francetelecom.rd.stubs.annotation.FieldSet("mCity") java.lang.String arg7,
    									@com.francetelecom.rd.stubs.annotation.FieldSet("mState") java.lang.String arg8,
    									@com.francetelecom.rd.stubs.annotation.FieldSet("mZipCode") java.lang.String arg9, 
    									@com.francetelecom.rd.stubs.annotation.FieldSet("mCountry") java.lang.String arg10, 
    									@com.francetelecom.rd.stubs.annotation.FieldSet("mPhoneNumber") java.lang.String arg11){
    }
    // Methods
    @com.francetelecom.rd.stubs.annotation.FieldGet("mState")
    public java.lang.String getState(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mCountry")
    public java.lang.String getCountry(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPhoneNumber")
    public java.lang.String getPhoneNumber(){
      return (java.lang.String) null;
    }
    public int getUniqueId(){
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mFullName")
    public java.lang.String getFullName(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mEmail")
    public java.lang.String getEmailAddress(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mCompanyName")
    public java.lang.String getCompanyName(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mAddressLine1")
    public java.lang.String getAddressLine1(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mAddressLine2")
    public java.lang.String getAddressLine2(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mCity")
    public java.lang.String getCity(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mZipCode")
    public java.lang.String getZipCode(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final int LOAD_DEFAULT = -1;

  public static final int LOAD_NORMAL = 0;

  public static final int LOAD_CACHE_ELSE_NETWORK = 1;

  public static final int LOAD_NO_CACHE = 2;

  public static final int LOAD_CACHE_ONLY = 3;

  // Constructors

  WebSettings(android.content.Context arg1, WebView arg2){
  }
  // Methods

  public void setProperty(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String getProperty(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public synchronized java.lang.String getDatabasePath(){
    return (java.lang.String) null;
  }
  public synchronized WebSettings.TextSize getTextSize(){
    return (WebSettings.TextSize) null;
  }
  public synchronized void setTextSize(WebSettings.TextSize arg1){
  }
  public synchronized void setUserAgent(int arg1){
  }
  public void setBuiltInZoomControls(boolean arg1){
  }
  public synchronized boolean getJavaScriptEnabled(){
    return false;
  }
  public boolean supportZoom(){
    return false;
  }
  public boolean getUseWebViewBackgroundForOverscrollBackground(){
    return false;
  }
  public boolean getNavDump(){
    return false;
  }
  public synchronized boolean getHardwareAccelSkiaEnabled(){
    return false;
  }
  public boolean getSaveFormData(){
    return false;
  }
  public boolean enableSmoothTransition(){
    return false;
  }
  public synchronized boolean getShowVisualIndicator(){
    return false;
  }
  public synchronized int getUserAgent(){
    return 0;
  }
  public synchronized boolean getUseWideViewPort(){
    return false;
  }
  public boolean forceUserScalable(){
    return false;
  }
  public boolean getLoadWithOverviewMode(){
    return false;
  }
  public synchronized boolean getAutoFillEnabled(){
    return false;
  }
  public synchronized WebSettings.AutoFillProfile getAutoFillProfile(){
    return (WebSettings.AutoFillProfile) null;
  }
  public int getDoubleTapZoom(){
    return 0;
  }
  public boolean getBuiltInZoomControls(){
    return false;
  }
  public boolean getDisplayZoomControls(){
    return false;
  }
  public synchronized java.lang.String getUserAgentString(){
    return (java.lang.String) null;
  }
  public boolean getSavePassword(){
    return false;
  }
  public boolean getAllowContentAccess(){
    return false;
  }
  public int getCacheMode(){
    return 0;
  }
  public void setCacheMode(int arg1){
  }
  public void setNavDump(boolean arg1){
  }
  public void setSupportZoom(boolean arg1){
  }
  public void setDisplayZoomControls(boolean arg1){
  }
  public void setAllowFileAccess(boolean arg1){
  }
  public boolean getAllowFileAccess(){
    return false;
  }
  public void setAllowContentAccess(boolean arg1){
  }
  public void setLoadWithOverviewMode(boolean arg1){
  }
  public void setEnableSmoothTransition(boolean arg1){
  }
  public void setUseWebViewBackgroundForOverscrollBackground(boolean arg1){
  }
  public void setSaveFormData(boolean arg1){
  }
  public void setSavePassword(boolean arg1){
  }
  public synchronized void setTextZoom(int arg1){
  }
  public synchronized int getTextZoom(){
    return 0;
  }
  public void setDoubleTapZoom(int arg1){
  }
  public void setDefaultZoom(WebSettings.ZoomDensity arg1){
  }
  public WebSettings.ZoomDensity getDefaultZoom(){
    return (WebSettings.ZoomDensity) null;
  }
  public void setLightTouchEnabled(boolean arg1){
  }
  public boolean getLightTouchEnabled(){
    return false;
  }
  public synchronized void setUseDoubleTree(boolean arg1){
  }
  public synchronized boolean getUseDoubleTree(){
    return false;
  }
  public synchronized void setUseWideViewPort(boolean arg1){
  }
  public synchronized void setSupportMultipleWindows(boolean arg1){
  }
  public synchronized boolean supportMultipleWindows(){
    return false;
  }
  public synchronized void setLayoutAlgorithm(WebSettings.LayoutAlgorithm arg1){
  }
  public synchronized WebSettings.LayoutAlgorithm getLayoutAlgorithm(){
    return (WebSettings.LayoutAlgorithm) null;
  }
  public synchronized void setStandardFontFamily(java.lang.String arg1){
  }
  public synchronized java.lang.String getStandardFontFamily(){
    return (java.lang.String) null;
  }
  public synchronized void setFixedFontFamily(java.lang.String arg1){
  }
  public synchronized java.lang.String getFixedFontFamily(){
    return (java.lang.String) null;
  }
  public synchronized void setSansSerifFontFamily(java.lang.String arg1){
  }
  public synchronized java.lang.String getSansSerifFontFamily(){
    return (java.lang.String) null;
  }
  public synchronized void setSerifFontFamily(java.lang.String arg1){
  }
  public synchronized java.lang.String getSerifFontFamily(){
    return (java.lang.String) null;
  }
  public synchronized void setCursiveFontFamily(java.lang.String arg1){
  }
  public synchronized java.lang.String getCursiveFontFamily(){
    return (java.lang.String) null;
  }
  public synchronized void setFantasyFontFamily(java.lang.String arg1){
  }
  public synchronized java.lang.String getFantasyFontFamily(){
    return (java.lang.String) null;
  }
  public synchronized void setMinimumFontSize(int arg1){
  }
  public synchronized int getMinimumFontSize(){
    return 0;
  }
  public synchronized void setMinimumLogicalFontSize(int arg1){
  }
  public synchronized int getMinimumLogicalFontSize(){
    return 0;
  }
  public synchronized void setDefaultFontSize(int arg1){
  }
  public synchronized int getDefaultFontSize(){
    return 0;
  }
  public synchronized void setDefaultFixedFontSize(int arg1){
  }
  public synchronized int getDefaultFixedFontSize(){
    return 0;
  }
  public synchronized void setPageCacheCapacity(int arg1){
  }
  public synchronized void setLoadsImagesAutomatically(boolean arg1){
  }
  public synchronized boolean getLoadsImagesAutomatically(){
    return false;
  }
  public synchronized void setBlockNetworkImage(boolean arg1){
  }
  public synchronized boolean getBlockNetworkImage(){
    return false;
  }
  public synchronized void setBlockNetworkLoads(boolean arg1){
  }
  public synchronized boolean getBlockNetworkLoads(){
    return false;
  }
  public synchronized void setJavaScriptEnabled(boolean arg1){
  }
  public synchronized void setHardwareAccelSkiaEnabled(boolean arg1){
  }
  public synchronized void setShowVisualIndicator(boolean arg1){
  }
  public synchronized void setPluginsEnabled(boolean arg1){
  }
  public synchronized void setPluginState(WebSettings.PluginState arg1){
  }
  public synchronized void setPluginsPath(java.lang.String arg1){
  }
  public synchronized void setDatabasePath(java.lang.String arg1){
  }
  public synchronized void setGeolocationDatabasePath(java.lang.String arg1){
  }
  public synchronized void setAppCacheEnabled(boolean arg1){
  }
  public synchronized void setAppCachePath(java.lang.String arg1){
  }
  public synchronized void setAppCacheMaxSize(long arg1){
  }
  public synchronized void setDatabaseEnabled(boolean arg1){
  }
  public synchronized void setDomStorageEnabled(boolean arg1){
  }
  public synchronized boolean getDomStorageEnabled(){
    return false;
  }
  public synchronized boolean getDatabaseEnabled(){
    return false;
  }
  public synchronized void setWorkersEnabled(boolean arg1){
  }
  public synchronized void setGeolocationEnabled(boolean arg1){
  }
  public synchronized void setXSSAuditorEnabled(boolean arg1){
  }
  public synchronized boolean getPluginsEnabled(){
    return false;
  }
  public synchronized WebSettings.PluginState getPluginState(){
    return (WebSettings.PluginState) null;
  }
  public synchronized java.lang.String getPluginsPath(){
    return (java.lang.String) null;
  }
  public synchronized void setJavaScriptCanOpenWindowsAutomatically(boolean arg1){
  }
  public synchronized boolean getJavaScriptCanOpenWindowsAutomatically(){
    return false;
  }
  public synchronized void setDefaultTextEncodingName(java.lang.String arg1){
  }
  public synchronized java.lang.String getDefaultTextEncodingName(){
    return (java.lang.String) null;
  }
  public synchronized void setUserAgentString(java.lang.String arg1){
  }
  public void setNeedInitialFocus(boolean arg1){
  }
  public synchronized void setRenderPriority(WebSettings.RenderPriority arg1){
  }
  public void setShrinksStandaloneImagesToFit(boolean arg1){
  }
  public void setMaximumDecodedImageSize(long arg1){
  }
  public synchronized void setForceUserScalable(boolean arg1){
  }
  public synchronized void setAutoFillEnabled(boolean arg1){
  }
  public synchronized void setAutoFillProfile(WebSettings.AutoFillProfile arg1){
  }
}
