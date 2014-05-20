package android.widget;

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
public abstract class AbsSeekBar
  extends ProgressBar{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsSeekBar(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsSeekBar(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbsSeekBar(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected synchronized void onMeasure(int arg1, int arg2){
  }
  protected void drawableStateChanged(){
  }
  public void jumpDrawablesToCurrentState(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected synchronized void onDraw(android.graphics.Canvas arg1){
  }
  protected boolean verifyDrawable(android.graphics.drawable.Drawable arg1){
    return false;
  }
  public synchronized void setMax(int arg1){
  }
  public void setThumb(android.graphics.drawable.Drawable arg1){
  }
  public int getThumbOffset(){
    return 0;
  }
  public void setThumbOffset(int arg1){
  }
  public void setKeyProgressIncrement(int arg1){
  }
  public int getKeyProgressIncrement(){
    return 0;
  }
}
