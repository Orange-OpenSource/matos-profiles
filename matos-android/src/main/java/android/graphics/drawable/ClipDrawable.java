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
public class ClipDrawable
  extends Drawable  implements Drawable.Callback
{
  // Fields

  public static final int HORIZONTAL = 1;

  public static final int VERTICAL = 2;

  // Constructors

  ClipDrawable(){
    super();
  }
  public ClipDrawable(Drawable arg1, int arg2, int arg3){
    super();
  }
  // Methods

  public void inflate(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2, android.util.AttributeSet arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public int getChangingConfigurations(){
    return 0;
  }
  public boolean setVisible(boolean arg1, boolean arg2){
    return false;
  }
  public void setAlpha(int arg1){
  }
  public void draw(android.graphics.Canvas arg1){
  }
  public void invalidateDrawable(Drawable arg1){
  }
  public void scheduleDrawable(Drawable arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("java.lang.Runnable.run") java.lang.Runnable arg2, long arg3){
  }
  public void unscheduleDrawable(Drawable arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("java.lang.Runnable.run") java.lang.Runnable arg2){
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
  public void setColorFilter(android.graphics.ColorFilter arg1){
  }
  protected void onBoundsChange(android.graphics.Rect arg1){
  }
  public boolean isStateful(){
    return false;
  }
  public boolean getPadding(android.graphics.Rect arg1){
    return false;
  }
  protected boolean onStateChange(int [] arg1){
    return false;
  }
  protected boolean onLevelChange(int arg1){
    return false;
  }
}
