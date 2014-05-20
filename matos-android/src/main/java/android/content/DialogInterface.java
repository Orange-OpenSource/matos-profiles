package android.content;

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
public interface DialogInterface
{
  // Classes

  public static interface OnCancelListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCancel")
    public void onCancel(DialogInterface arg1);
  }
  public static interface OnDismissListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onDismiss")
    public void onDismiss(DialogInterface arg1);
  }
  public static interface OnShowListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onShow")
    public void onShow(DialogInterface arg1);
  }
  public static interface OnClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("OnClick")
    public void onClick(DialogInterface arg1, int arg2);
  }
  public static interface OnMultiChoiceClickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("OnMultiChoiceClick")
    public void onClick(DialogInterface arg1, int arg2, boolean arg3);
  }
  public static interface OnKeyListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("OnKey")
    public boolean onKey(DialogInterface arg1, int arg2, android.view.KeyEvent arg3);
  }
  // Fields

  public static final int BUTTON_POSITIVE = -1;

  public static final int BUTTON_NEGATIVE = -2;

  public static final int BUTTON_NEUTRAL = -3;

  public static final int BUTTON1 = -1;

  public static final int BUTTON2 = -2;

  public static final int BUTTON3 = -3;

  // Methods

  public void cancel();
  public void dismiss();
}
