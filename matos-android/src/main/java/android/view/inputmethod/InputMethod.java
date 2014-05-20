package android.view.inputmethod;

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
public interface InputMethod
{
  // Classes

  public static interface SessionCallback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("sessionCreate")
    public void sessionCreated(InputMethodSession arg1);
  }
  // Fields

  public static final java.lang.String SERVICE_INTERFACE = "android.view.InputMethod";

  public static final java.lang.String SERVICE_META_DATA = "android.view.im";

  public static final int SHOW_EXPLICIT = 1;

  public static final int SHOW_FORCED = 2;

  // Methods

  public void showSoftInput(int arg1, android.os.ResultReceiver arg2);
  public void restartInput(InputConnection arg1, EditorInfo arg2);
  public void attachToken(android.os.IBinder arg1);
  public void bindInput(InputBinding arg1);
  public void unbindInput();
  public void startInput(InputConnection arg1, EditorInfo arg2);
  public void createSession(InputMethod.SessionCallback arg1);
  public void setSessionEnabled(InputMethodSession arg1, boolean arg2);
  public void revokeSession(InputMethodSession arg1);
  public void hideSoftInput(int arg1, android.os.ResultReceiver arg2);
  public void changeInputMethodSubtype(InputMethodSubtype arg1);
}
