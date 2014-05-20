package android.test.mock;

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
public class MockResources
  extends android.content.res.Resources{
  // Constructors

  public MockResources(){
    super((android.content.res.AssetManager) null, (android.util.DisplayMetrics) null, (android.content.res.Configuration) null);
  }
  // Methods

  public void getValue(int arg1, android.util.TypedValue arg2, boolean arg3) throws android.content.res.Resources.NotFoundException{
  }
  public void getValue(java.lang.String arg1, android.util.TypedValue arg2, boolean arg3) throws android.content.res.Resources.NotFoundException{
  }
  public int getInteger(int arg1) throws android.content.res.Resources.NotFoundException{
    return 0;
  }
  public java.lang.String getString(int arg1) throws android.content.res.Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public java.lang.String getString(int arg1, java.lang.Object [] arg2) throws android.content.res.Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public java.lang.CharSequence getText(int arg1) throws android.content.res.Resources.NotFoundException{
    return (java.lang.CharSequence) null;
  }
  public java.lang.CharSequence getText(int arg1, java.lang.CharSequence arg2){
    return (java.lang.CharSequence) null;
  }
  public android.content.res.XmlResourceParser getAnimation(int arg1) throws android.content.res.Resources.NotFoundException{
    return (android.content.res.XmlResourceParser) null;
  }
  public android.content.res.XmlResourceParser getLayout(int arg1) throws android.content.res.Resources.NotFoundException{
    return (android.content.res.XmlResourceParser) null;
  }
  public android.graphics.drawable.Drawable getDrawable(int arg1) throws android.content.res.Resources.NotFoundException{
    return (android.graphics.drawable.Drawable) null;
  }
  public java.lang.String [] getStringArray(int arg1) throws android.content.res.Resources.NotFoundException{
    return (java.lang.String []) null;
  }
  public int getColor(int arg1) throws android.content.res.Resources.NotFoundException{
    return 0;
  }
  public int getDimensionPixelSize(int arg1) throws android.content.res.Resources.NotFoundException{
    return 0;
  }
  public int getDimensionPixelOffset(int arg1) throws android.content.res.Resources.NotFoundException{
    return 0;
  }
  public float getDimension(int arg1) throws android.content.res.Resources.NotFoundException{
    return 0.0f;
  }
  public java.lang.CharSequence [] getTextArray(int arg1) throws android.content.res.Resources.NotFoundException{
    return (java.lang.CharSequence []) null;
  }
  public android.content.res.ColorStateList getColorStateList(int arg1) throws android.content.res.Resources.NotFoundException{
    return (android.content.res.ColorStateList) null;
  }
  public int [] getIntArray(int arg1) throws android.content.res.Resources.NotFoundException{
    return (int []) null;
  }
  public android.util.DisplayMetrics getDisplayMetrics(){
    return (android.util.DisplayMetrics) null;
  }
  public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet arg1, int [] arg2){
    return (android.content.res.TypedArray) null;
  }
  public android.content.res.XmlResourceParser getXml(int arg1) throws android.content.res.Resources.NotFoundException{
    return (android.content.res.XmlResourceParser) null;
  }
  public android.content.res.Configuration getConfiguration(){
    return (android.content.res.Configuration) null;
  }
  public void updateConfiguration(android.content.res.Configuration arg1, android.util.DisplayMetrics arg2){
  }
  public java.lang.String getResourceEntryName(int arg1) throws android.content.res.Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public int getIdentifier(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
    return 0;
  }
  public java.io.InputStream openRawResource(int arg1) throws android.content.res.Resources.NotFoundException{
    return (java.io.InputStream) null;
  }
  public java.lang.String getQuantityString(int arg1, int arg2, java.lang.Object [] arg3) throws android.content.res.Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public java.lang.String getQuantityString(int arg1, int arg2) throws android.content.res.Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public java.lang.CharSequence getQuantityText(int arg1, int arg2) throws android.content.res.Resources.NotFoundException{
    return (java.lang.CharSequence) null;
  }
  public android.content.res.TypedArray obtainTypedArray(int arg1) throws android.content.res.Resources.NotFoundException{
    return (android.content.res.TypedArray) null;
  }
  public android.graphics.Movie getMovie(int arg1) throws android.content.res.Resources.NotFoundException{
    return (android.graphics.Movie) null;
  }
  public android.content.res.AssetFileDescriptor openRawResourceFd(int arg1) throws android.content.res.Resources.NotFoundException{
    return (android.content.res.AssetFileDescriptor) null;
  }
  public java.lang.String getResourceName(int arg1) throws android.content.res.Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public java.lang.String getResourcePackageName(int arg1) throws android.content.res.Resources.NotFoundException{
    return (java.lang.String) null;
  }
  public java.lang.String getResourceTypeName(int arg1) throws android.content.res.Resources.NotFoundException{
    return (java.lang.String) null;
  }
}
