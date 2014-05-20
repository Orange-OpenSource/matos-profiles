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
public class MultiTapKeyListener
  extends BaseKeyListener  implements android.text.SpanWatcher
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public MultiTapKeyListener(TextKeyListener.Capitalize arg1, boolean arg2){
    super();
  }
  // Methods

  public static MultiTapKeyListener getInstance(boolean arg1, TextKeyListener.Capitalize arg2){
    return (MultiTapKeyListener) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(android.view.View arg1, android.text.Editable arg2, int arg3, android.view.KeyEvent arg4){
    return false;
  }
  public int getInputType(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSpanAdded(android.text.Spannable arg1, java.lang.Object arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSpanRemoved(android.text.Spannable arg1, java.lang.Object arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSpanChanged(android.text.Spannable arg1, java.lang.Object arg2, int arg3, int arg4, int arg5, int arg6){
  }
}
