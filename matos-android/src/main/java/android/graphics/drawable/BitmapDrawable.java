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
public class BitmapDrawable
  extends Drawable{
  // Constructors

  public BitmapDrawable(){
    super();
  }
  public BitmapDrawable(android.content.res.Resources arg1){
    super();
  }
  public BitmapDrawable(android.graphics.Bitmap arg1){
    super();
  }
  public BitmapDrawable(android.content.res.Resources arg1, android.graphics.Bitmap arg2){
    super();
  }
  public BitmapDrawable(java.lang.String arg1){
    super();
  }
  public BitmapDrawable(android.content.res.Resources arg1, java.lang.String arg2){
    super();
  }
  public BitmapDrawable(java.io.InputStream arg1){
    super();
  }
  public BitmapDrawable(android.content.res.Resources arg1, java.io.InputStream arg2){
    super();
  }
  // Methods

  public void inflate(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2, android.util.AttributeSet arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public int getChangingConfigurations(){
    return 0;
  }
  public void setAlpha(int arg1){
  }
  public void draw(android.graphics.Canvas arg1){
  }
  public void setGravity(int arg1){
  }
  public int getGravity(){
    return 0;
  }
  public final android.graphics.Paint getPaint(){
    return (android.graphics.Paint) null;
  }
  public final android.graphics.Bitmap getBitmap(){
    return (android.graphics.Bitmap) null;
  }
  public int getOpacity(){
    return 0;
  }
  public final Drawable.ConstantState getConstantState(){
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
  public void setColorFilter(android.graphics.ColorFilter arg1){
  }
  public void setFilterBitmap(boolean arg1){
  }
  protected void onBoundsChange(android.graphics.Rect arg1){
  }
  public Drawable mutate(){
    return (Drawable) null;
  }
  public void setTargetDensity(android.graphics.Canvas arg1){
  }
  public void setTargetDensity(android.util.DisplayMetrics arg1){
  }
  public void setTargetDensity(int arg1){
  }
  public void setAntiAlias(boolean arg1){
  }
  public android.graphics.Shader.TileMode getTileModeX(){
    return (android.graphics.Shader.TileMode) null;
  }
  public android.graphics.Shader.TileMode getTileModeY(){
    return (android.graphics.Shader.TileMode) null;
  }
  public void setTileModeX(android.graphics.Shader.TileMode arg1){
  }
  public final void setTileModeY(android.graphics.Shader.TileMode arg1){
  }
  public void setTileModeXY(android.graphics.Shader.TileMode arg1, android.graphics.Shader.TileMode arg2){
  }
}
