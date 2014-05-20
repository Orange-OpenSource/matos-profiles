package android.text.method;

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
public class BaseMovementMethod
  implements MovementMethod
{
  // Constructors
  public BaseMovementMethod(){
  }
  // Methods

  public void initialize(android.widget.TextView arg1, android.text.Spannable arg2){
  }
  protected boolean end(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onKeyDown(android.widget.TextView arg1, android.text.Spannable arg2, int arg3, android.view.KeyEvent arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onKeyUp(android.widget.TextView arg1, android.text.Spannable arg2, int arg3, android.view.KeyEvent arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onTouchEvent(android.widget.TextView arg1, android.text.Spannable arg2, android.view.MotionEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onTrackballEvent(android.widget.TextView arg1, android.text.Spannable arg2, android.view.MotionEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onGenericMotionEvent(android.widget.TextView arg1, android.text.Spannable arg2, android.view.MotionEvent arg3){
    return false;
  }
  protected boolean pageUp(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean pageDown(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean left(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean top(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean right(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean bottom(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onKeyOther(android.widget.TextView arg1, android.text.Spannable arg2, android.view.KeyEvent arg3){
    return false;
  }
  protected boolean down(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean lineStart(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean lineEnd(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean up(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public void onTakeFocus(android.widget.TextView arg1, android.text.Spannable arg2, int arg3){
  }
  public boolean canSelectArbitrarily(){
    return false;
  }
  protected boolean home(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected int getMovementMetaState(android.text.Spannable arg1, android.view.KeyEvent arg2){
    return 0;
  }
  protected boolean handleMovementKey(android.widget.TextView arg1, android.text.Spannable arg2, int arg3, int arg4, android.view.KeyEvent arg5){
    return false;
  }
  protected boolean leftWord(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean rightWord(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean scrollLeft(android.widget.TextView arg1, android.text.Spannable arg2, int arg3){
    return false;
  }
  protected boolean scrollRight(android.widget.TextView arg1, android.text.Spannable arg2, int arg3){
    return false;
  }
  protected boolean scrollUp(android.widget.TextView arg1, android.text.Spannable arg2, int arg3){
    return false;
  }
  protected boolean scrollDown(android.widget.TextView arg1, android.text.Spannable arg2, int arg3){
    return false;
  }
  protected boolean scrollPageUp(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean scrollPageDown(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean scrollTop(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean scrollBottom(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean scrollLineStart(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean scrollLineEnd(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
}
