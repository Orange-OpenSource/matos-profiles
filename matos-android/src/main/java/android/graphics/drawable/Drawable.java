package android.graphics.drawable;

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
public abstract class Drawable
{
  // Classes

  public static interface Callback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("call")
    public void invalidateDrawable(Drawable arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("call")
    public void scheduleDrawable(Drawable arg1, java.lang.Runnable arg2, long arg3);
    @com.francetelecom.rd.stubs.annotation.CallBack("call")
    public void unscheduleDrawable(Drawable arg1, java.lang.Runnable arg2);
  }
  public static interface Callback2
    extends Drawable.Callback
  {
    // Methods

    public int getResolvedLayoutDirection(Drawable arg1);
  }
  public abstract static class ConstantState
  {
    // Constructors

    public ConstantState(){
    }
    // Methods

    public abstract int getChangingConfigurations();
    public abstract Drawable newDrawable();
    public Drawable newDrawable(android.content.res.Resources arg1){
      return (Drawable) null;
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateDrawable")
  public Drawable(){
  }
  // Methods

  public int [] getState(){
    return (int []) null;
  }
  public boolean setState(int [] arg1){
    return false;
  }
  public void inflate(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2, android.util.AttributeSet arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public final android.graphics.Rect getBounds(){
    return (android.graphics.Rect) null;
  }
  public final boolean isVisible(){
    return false;
  }
  public int getChangingConfigurations(){
    return 0;
  }
  public boolean setVisible(boolean arg1, boolean arg2){
    return false;
  }
  public final int getLevel(){
    return 0;
  }
  public final boolean setLevel(int arg1){
    return false;
  }
  public abstract void setAlpha(int arg1);
  public abstract void draw(android.graphics.Canvas arg1);
  @com.francetelecom.rd.stubs.annotation.Code({"arg1.invalidateDrawable(this);", "arg1.unscheduleDrawable(this, runnable);", "arg1.scheduleDrawable(this, runnable, com.francetelecom.rd.stubs.Generator.longValue());"})
  public final void setCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("call") Drawable.Callback arg1){
  }
  public abstract int getOpacity();
  public Drawable.ConstantState getConstantState(){
    return (Drawable.ConstantState) null;
  }
  public int getIntrinsicWidth(){
    return 0;
  }
  public int getIntrinsicHeight(){
    return 0;
  }
  public void setDither(boolean arg1){
  }
  public abstract void setColorFilter(android.graphics.ColorFilter arg1);
  public void setColorFilter(int arg1, android.graphics.PorterDuff.Mode arg2){
  }
  public void setFilterBitmap(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDrawable")
  protected void onBoundsChange(android.graphics.Rect arg1){
  }
  public Drawable mutate(){
    return (Drawable) null;
  }
  public boolean isStateful(){
    return false;
  }
  public boolean getPadding(android.graphics.Rect arg1){
    return false;
  }
  public int getMinimumWidth(){
    return 0;
  }
  public int getMinimumHeight(){
    return 0;
  }
  public static int resolveOpacity(int arg1, int arg2){
    return 0;
  }
  public void setBounds(int arg1, int arg2, int arg3, int arg4){
  }
  public void setBounds(android.graphics.Rect arg1){
  }
  public void jumpToCurrentState(){
  }
  public int getResolvedLayoutDirectionSelf(){
    return 0;
  }
  public android.graphics.Region getTransparentRegion(){
    return (android.graphics.Region) null;
  }
  public final void copyBounds(android.graphics.Rect arg1){
  }
  public final android.graphics.Rect copyBounds(){
    return (android.graphics.Rect) null;
  }
  public void setChangingConfigurations(int arg1){
  }
  public Drawable.Callback getCallback(){
    return (Drawable.Callback) null;
  }
  public void invalidateSelf(){
  }
  public void scheduleSelf(@com.francetelecom.rd.stubs.annotation.FieldSet("runnable") java.lang.Runnable arg1, long arg2){
  }
  public void unscheduleSelf(@com.francetelecom.rd.stubs.annotation.FieldSet("runnable") java.lang.Runnable arg1){
  }
  public void clearColorFilter(){
  }
  public Drawable getCurrent(){
    return (Drawable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDrawable")
  protected boolean onStateChange(int [] arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateDrawable")
  protected boolean onLevelChange(int arg1){
    return false;
  }
  public static Drawable createFromStream(java.io.InputStream arg1, java.lang.String arg2){
    return (Drawable) null;
  }
  public static Drawable createFromResourceStream(android.content.res.Resources arg1, android.util.TypedValue arg2, java.io.InputStream arg3, java.lang.String arg4){
    return (Drawable) null;
  }
  public static Drawable createFromResourceStream(android.content.res.Resources arg1, android.util.TypedValue arg2, java.io.InputStream arg3, java.lang.String arg4, android.graphics.BitmapFactory.Options arg5){
    return (Drawable) null;
  }
  public static Drawable createFromXml(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (Drawable) null;
  }
  public static Drawable createFromXmlInner(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2, android.util.AttributeSet arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (Drawable) null;
  }
  public static Drawable createFromPath(java.lang.String arg1){
    return (Drawable) null;
  }
}
