package android.inputmethodservice;

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
public abstract class AbstractInputMethodService
  extends android.app.Service  implements android.view.KeyEvent.Callback
{
  // Classes

  public abstract class AbstractInputMethodImpl
    implements android.view.inputmethod.InputMethod
  {
    // Fields

    // Constructors

    public AbstractInputMethodImpl(){
    }
    // Methods

    public void createSession(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.inputmethod.InputMethod.SessionCallback.sessionCreate") android.view.inputmethod.InputMethod.SessionCallback arg1){
    }
    public void setSessionEnabled(android.view.inputmethod.InputMethodSession arg1, boolean arg2){
    }
    public void revokeSession(android.view.inputmethod.InputMethodSession arg1){
    }
  }
  public abstract class AbstractInputMethodSessionImpl
    implements android.view.inputmethod.InputMethodSession
  {
    // Fields

    // Constructors

    public AbstractInputMethodSessionImpl(){
    }
    // Methods

    public void dispatchKeyEvent(int arg1, android.view.KeyEvent arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("EventCallback") android.view.inputmethod.InputMethodSession.EventCallback arg3){
    }
    public void dispatchTrackballEvent(int arg1, android.view.MotionEvent arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("EventCallback") android.view.inputmethod.InputMethodSession.EventCallback arg3){
    }
    public boolean isEnabled(){
      return false;
    }
    public void setEnabled(boolean arg1){
    }
    public boolean isRevoked(){
      return false;
    }
    public void revokeSelf(){
    }
  }
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AbstractInputMethodService(){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  public android.view.KeyEvent.DispatcherState getKeyDispatcherState(){
    return (android.view.KeyEvent.DispatcherState) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface();
}
