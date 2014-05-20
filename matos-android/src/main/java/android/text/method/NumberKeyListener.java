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
public abstract class NumberKeyListener
  extends BaseKeyListener  implements android.text.InputFilter
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public NumberKeyListener(){
    super();
  }
  // Methods

  protected int lookup(android.view.KeyEvent arg1, android.text.Spannable arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(android.view.View arg1, android.text.Editable arg2, int arg3, android.view.KeyEvent arg4){
    return false;
  }
  public java.lang.CharSequence filter(java.lang.CharSequence arg1, int arg2, int arg3, android.text.Spanned arg4, int arg5, int arg6){
    return (java.lang.CharSequence) null;
  }
  protected abstract char [] getAcceptedChars();
  protected static boolean ok(char [] arg1, char arg2){
    return false;
  }
}
