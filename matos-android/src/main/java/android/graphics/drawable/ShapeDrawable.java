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
public class ShapeDrawable
  extends Drawable{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ShaderFactoryImplem", superClass = "")
  public abstract static class ShaderFactory
  {
    // Constructors

    public ShaderFactory(){
    }
    // Methods

    public abstract android.graphics.Shader resize(int arg1, int arg2);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ShapeDrawable(){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ShapeDrawable(android.graphics.drawable.shapes.Shape arg1){
    super();
  }
  // Methods

  public void inflate(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2, android.util.AttributeSet arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public int getChangingConfigurations(){
    return 0;
  }
  public void setPadding(int arg1, int arg2, int arg3, int arg4){
  }
  public void setPadding(android.graphics.Rect arg1){
  }
  public void setAlpha(int arg1){
  }
  public void draw(android.graphics.Canvas arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDraw(android.graphics.drawable.shapes.Shape arg1, android.graphics.Canvas arg2, android.graphics.Paint arg3){
  }
  public android.graphics.Paint getPaint(){
    return (android.graphics.Paint) null;
  }
  public int getOpacity(){
    return 0;
  }
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
  public void setColorFilter(android.graphics.ColorFilter arg1){
  }
  protected void onBoundsChange(android.graphics.Rect arg1){
  }
  public Drawable mutate(){
    return (Drawable) null;
  }
  public boolean getPadding(android.graphics.Rect arg1){
    return false;
  }
  protected boolean inflateTag(java.lang.String arg1, android.content.res.Resources arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg3, android.util.AttributeSet arg4){
    return false;
  }
  public void setIntrinsicWidth(int arg1){
  }
  public void setIntrinsicHeight(int arg1){
  }
  public android.graphics.drawable.shapes.Shape getShape(){
    return (android.graphics.drawable.shapes.Shape) null;
  }
  public void setShape(android.graphics.drawable.shapes.Shape arg1){
  }
  public void setShaderFactory(ShapeDrawable.ShaderFactory arg1){
  }
  public ShapeDrawable.ShaderFactory getShaderFactory(){
    return (ShapeDrawable.ShaderFactory) null;
  }
}
