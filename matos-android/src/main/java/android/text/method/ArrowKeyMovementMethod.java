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
public class ArrowKeyMovementMethod
  extends BaseMovementMethod  implements MovementMethod
{
  // Constructors

  public ArrowKeyMovementMethod(){
    super();
  }
  // Methods

  public static MovementMethod getInstance(){
    return (MovementMethod) null;
  }
  public void initialize(android.widget.TextView arg1, android.text.Spannable arg2){
  }
  protected boolean end(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onTouchEvent(android.widget.TextView arg1, android.text.Spannable arg2, android.view.MotionEvent arg3){
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
  protected boolean handleMovementKey(android.widget.TextView arg1, android.text.Spannable arg2, int arg3, int arg4, android.view.KeyEvent arg5){
    return false;
  }
  protected boolean leftWord(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
  protected boolean rightWord(android.widget.TextView arg1, android.text.Spannable arg2){
    return false;
  }
}
