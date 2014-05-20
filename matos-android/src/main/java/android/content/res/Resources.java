package android.content.res;

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
public class Resources
{
  // Classes

  public static class NotFoundException
    extends java.lang.RuntimeException  {
    // Constructors

    public NotFoundException(){
      super();
    }
    public NotFoundException(java.lang.String arg1){
      super();
    }
  }
  public final class Theme
  {
    // Fields

    // Constructors

    Theme(){
    }
    // Methods

    protected void finalize() throws java.lang.Throwable{
    }
    public void dump(int arg1, java.lang.String arg2, java.lang.String arg3){
    }
    public TypedArray obtainStyledAttributes(int [] arg1){
      return (TypedArray) null;
    }
    public TypedArray obtainStyledAttributes(int arg1, int [] arg2) throws Resources.NotFoundException{
      return (TypedArray) null;
    }
    public TypedArray obtainStyledAttributes(android.util.AttributeSet arg1, int [] arg2, int arg3, int arg4){
      return (TypedArray) null;
    }
    public void setTo(Resources.Theme arg1){
    }
    public void applyStyle(int arg1, boolean arg2){
    }
    public boolean resolveAttribute(int arg1, android.util.TypedValue arg2, boolean arg3){
      return false;
    }
  }
  // Constructors

  public Resources(AssetManager arg1, android.util.DisplayMetrics arg2, Configuration arg3){
  }
  public Resources(AssetManager arg1, android.util.DisplayMetrics arg2, Configuration arg3, CompatibilityInfo arg4){
  }
  private Resources(){
  }
  // Methods

  public boolean getBoolean(int arg1) throws Resources.NotFoundException{
    return false;
  }
  public void getValue(int arg1, android.util.TypedValue arg2, boolean arg3) throws Resources.NotFoundException{
  }
  public void getValue(java.lang.String arg1, android.util.TypedValue arg2, boolean arg3) throws Resources.NotFoundException{
  }
  public int getInteger(int arg1) throws Resources.NotFoundException{
    return 0;
  }
  public java.lang.String getString(int arg1) throws Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public java.lang.String getString(int arg1, java.lang.Object [] arg2) throws Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public final AssetManager getAssets(){
    return (AssetManager) null;
  }
  public java.lang.CharSequence getText(int arg1) throws Resources.NotFoundException{
    return (java.lang.CharSequence) null;
  }
  public java.lang.CharSequence getText(int arg1, java.lang.CharSequence arg2){
    return (java.lang.CharSequence) null;
  }
  public XmlResourceParser getAnimation(int arg1) throws Resources.NotFoundException{
    return (XmlResourceParser) null;
  }
  public XmlResourceParser getLayout(int arg1) throws Resources.NotFoundException{
    return (XmlResourceParser) null;
  }
  public android.graphics.drawable.Drawable getDrawable(int arg1) throws Resources.NotFoundException{
    return (android.graphics.drawable.Drawable) null;
  }
  public java.lang.String [] getStringArray(int arg1) throws Resources.NotFoundException{
    return (java.lang.String []) null;
  }
  public int getColor(int arg1) throws Resources.NotFoundException{
    return 0;
  }
  public float getFraction(int arg1, int arg2, int arg3){
    return 0.0f;
  }
  public int getDimensionPixelSize(int arg1) throws Resources.NotFoundException{
    return 0;
  }
  public int getDimensionPixelOffset(int arg1) throws Resources.NotFoundException{
    return 0;
  }
  public float getDimension(int arg1) throws Resources.NotFoundException{
    return 0.0f;
  }
  public java.lang.CharSequence [] getTextArray(int arg1) throws Resources.NotFoundException{
    return (java.lang.CharSequence []) null;
  }
  public ColorStateList getColorStateList(int arg1) throws Resources.NotFoundException{
    return (ColorStateList) null;
  }
  public static Resources getSystem(){
    return (Resources) null;
  }
  public int [] getIntArray(int arg1) throws Resources.NotFoundException{
    return (int []) null;
  }
  public static int selectDefaultTheme(int arg1, int arg2){
    return 0;
  }
  public final Resources.Theme newTheme(){
    return (Resources.Theme) null;
  }
  public static int selectSystemTheme(int arg1, int arg2, int arg3, int arg4, int arg5){
    return 0;
  }
  public android.util.DisplayMetrics getDisplayMetrics(){
    return (android.util.DisplayMetrics) null;
  }
  public TypedArray obtainAttributes(android.util.AttributeSet arg1, int [] arg2){
    return (TypedArray) null;
  }
  public CompatibilityInfo getCompatibilityInfo(){
    return (CompatibilityInfo) null;
  }
  public XmlResourceParser getXml(int arg1) throws Resources.NotFoundException{
    return (XmlResourceParser) null;
  }
  public void parseBundleExtras(XmlResourceParser arg1, android.os.Bundle arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public Configuration getConfiguration(){
    return (Configuration) null;
  }
  public void updateConfiguration(Configuration arg1, android.util.DisplayMetrics arg2){
  }
  public void updateConfiguration(Configuration arg1, android.util.DisplayMetrics arg2, CompatibilityInfo arg3){
  }
  public java.lang.String getResourceEntryName(int arg1) throws Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public int getIdentifier(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
    return 0;
  }
  public java.io.InputStream openRawResource(int arg1) throws Resources.NotFoundException{
    return (java.io.InputStream) null;
  }
  public java.io.InputStream openRawResource(int arg1, android.util.TypedValue arg2) throws Resources.NotFoundException{
    return (java.io.InputStream) null;
  }
  public java.lang.String getQuantityString(int arg1, int arg2, java.lang.Object [] arg3) throws Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public java.lang.String getQuantityString(int arg1, int arg2) throws Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public void parseBundleExtra(java.lang.String arg1, android.util.AttributeSet arg2, android.os.Bundle arg3) throws org.xmlpull.v1.XmlPullParserException{
  }
  public java.lang.CharSequence getQuantityText(int arg1, int arg2) throws Resources.NotFoundException{
    return (java.lang.CharSequence) null;
  }
  public TypedArray obtainTypedArray(int arg1) throws Resources.NotFoundException{
    return (TypedArray) null;
  }
  public android.graphics.drawable.Drawable getDrawableForDensity(int arg1, int arg2) throws Resources.NotFoundException{
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.Movie getMovie(int arg1) throws Resources.NotFoundException{
    return (android.graphics.Movie) null;
  }
  public AssetFileDescriptor openRawResourceFd(int arg1) throws Resources.NotFoundException{
    return (AssetFileDescriptor) null;
  }
  public void getValueForDensity(int arg1, int arg2, android.util.TypedValue arg3, boolean arg4) throws Resources.NotFoundException{
  }
  public static void updateSystemConfiguration(Configuration arg1, android.util.DisplayMetrics arg2, CompatibilityInfo arg3){
  }
  public static void updateSystemConfiguration(Configuration arg1, android.util.DisplayMetrics arg2){
  }
  public void setCompatibilityInfo(CompatibilityInfo arg1){
  }
  public java.lang.String getResourceName(int arg1) throws Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public java.lang.String getResourcePackageName(int arg1) throws Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public java.lang.String getResourceTypeName(int arg1) throws Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public final void flushLayoutCache(){
  }
  public final void startPreloading(){
  }
  public final void finishPreloading(){
  }
}
