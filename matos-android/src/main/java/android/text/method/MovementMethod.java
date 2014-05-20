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
public interface MovementMethod
{
  // Methods

  public void initialize(android.widget.TextView arg1, android.text.Spannable arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onKeyDown(android.widget.TextView arg1, android.text.Spannable arg2, int arg3, android.view.KeyEvent arg4);
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onKeyUp(android.widget.TextView arg1, android.text.Spannable arg2, int arg3, android.view.KeyEvent arg4);
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onTouchEvent(android.widget.TextView arg1, android.text.Spannable arg2, android.view.MotionEvent arg3);
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onTrackballEvent(android.widget.TextView arg1, android.text.Spannable arg2, android.view.MotionEvent arg3);
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onGenericMotionEvent(android.widget.TextView arg1, android.text.Spannable arg2, android.view.MotionEvent arg3);
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public boolean onKeyOther(android.widget.TextView arg1, android.text.Spannable arg2, android.view.KeyEvent arg3);
  @com.francetelecom.rd.stubs.annotation.CallBack("MovementMethod")
  public void onTakeFocus(android.widget.TextView arg1, android.text.Spannable arg2, int arg3);
  public boolean canSelectArbitrarily();
}
