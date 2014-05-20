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
public abstract class BaseKeyListener
  extends MetaKeyKeyListener  implements KeyListener
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public BaseKeyListener(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public boolean onKeyDown(android.view.View arg1, android.text.Editable arg2, int arg3, android.view.KeyEvent arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public boolean onKeyOther(android.view.View arg1, android.text.Editable arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public boolean backspace(android.view.View arg1, android.text.Editable arg2, int arg3, android.view.KeyEvent arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public boolean forwardDelete(android.view.View arg1, android.text.Editable arg2, int arg3, android.view.KeyEvent arg4){
    return false;
  }
}
