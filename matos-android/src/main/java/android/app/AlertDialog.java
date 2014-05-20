package android.app;

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
public class AlertDialog
  extends Dialog  implements android.content.DialogInterface
{
  // Classes

  public static class Builder
  {
    // Constructors

    public Builder(android.content.Context arg1){
    }
    public Builder(android.content.Context arg1, int arg2){
    }
    // Methods

    public android.content.Context getContext(){
      return (android.content.Context) null;
    }
    public AlertDialog create(){
      return (AlertDialog) null;
    }
    public AlertDialog.Builder setTitle(int arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setTitle(java.lang.CharSequence arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setItems(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setItems(java.lang.CharSequence [] arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog show(){
      return (AlertDialog) null;
    }
    public AlertDialog.Builder setOnKeyListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnKey") android.content.DialogInterface.OnKeyListener arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setIcon(int arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setIcon(android.graphics.drawable.Drawable arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setAdapter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("adapter") android.widget.ListAdapter arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("OnClick") android.content.DialogInterface.OnClickListener arg2){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setOnItemSelectedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onItemSelected") android.widget.AdapterView.OnItemSelectedListener arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setView(android.view.View arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setView(android.view.View arg1, int arg2, int arg3, int arg4, int arg5){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setMessage(int arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setMessage(java.lang.CharSequence arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setCustomTitle(android.view.View arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setIconAttribute(int arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setInverseBackgroundForced(boolean arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setOnCancelListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCancel") android.content.DialogInterface.OnCancelListener arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setCancelable(boolean arg1){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setCursor(android.database.Cursor arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2, java.lang.String arg3){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setPositiveButton(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setPositiveButton(java.lang.CharSequence arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setNegativeButton(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setNegativeButton(java.lang.CharSequence arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setNeutralButton(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setNeutralButton(java.lang.CharSequence arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setMultiChoiceItems(int arg1, boolean [] arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnMultiChoiceClick") android.content.DialogInterface.OnMultiChoiceClickListener arg3){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setMultiChoiceItems(java.lang.CharSequence [] arg1, boolean [] arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnMultiChoiceClick") android.content.DialogInterface.OnMultiChoiceClickListener arg3){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setMultiChoiceItems(android.database.Cursor arg1, java.lang.String arg2, java.lang.String arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnMultiChoiceClick") android.content.DialogInterface.OnMultiChoiceClickListener arg4){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setSingleChoiceItems(int arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg3){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setSingleChoiceItems(android.database.Cursor arg1, int arg2, java.lang.String arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg4){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setSingleChoiceItems(java.lang.CharSequence [] arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg3){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setSingleChoiceItems(android.widget.ListAdapter arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg3){
      return (AlertDialog.Builder) null;
    }
    public AlertDialog.Builder setRecycleOnMeasureEnabled(boolean arg1){
      return (AlertDialog.Builder) null;
    }
  }
  // Fields

  public static final int THEME_TRADITIONAL = 1;

  public static final int THEME_HOLO_DARK = 2;

  public static final int THEME_HOLO_LIGHT = 3;

  public static final int THEME_DEVICE_DEFAULT_DARK = 4;

  public static final int THEME_DEVICE_DEFAULT_LIGHT = 5;

  // Constructors

  protected AlertDialog(android.content.Context arg1){
    super((android.content.Context) null);
  }
  protected AlertDialog(android.content.Context arg1, int arg2){
    super((android.content.Context) null);
  }
  AlertDialog(android.content.Context arg1, int arg2, boolean arg3){
    super((android.content.Context) null);
  }
  protected AlertDialog(android.content.Context arg1, boolean arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCancel") android.content.DialogInterface.OnCancelListener arg3){
    super((android.content.Context) null);
  }
  // Methods

  protected void onCreate(android.os.Bundle arg1){
  }
  public void setTitle(java.lang.CharSequence arg1){
  }
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public void setIcon(int arg1){
  }
  public void setIcon(android.graphics.drawable.Drawable arg1){
  }
  public void setView(android.view.View arg1){
  }
  public void setView(android.view.View arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void setMessage(java.lang.CharSequence arg1){
  }
  public android.widget.ListView getListView(){
    return (android.widget.ListView) null;
  }
  public void setCustomTitle(android.view.View arg1){
  }
  public void setButton(int arg1, java.lang.CharSequence arg2, android.os.Message arg3){
  }
  public void setButton(int arg1, java.lang.CharSequence arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg3){
  }
  public void setButton(java.lang.CharSequence arg1, android.os.Message arg2){
  }
  public void setButton(java.lang.CharSequence arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
  }
  public void setIconAttribute(int arg1){
  }
  public android.widget.Button getButton(int arg1){
    return (android.widget.Button) null;
  }
  public void setButton2(java.lang.CharSequence arg1, android.os.Message arg2){
  }
  public void setButton2(java.lang.CharSequence arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
  }
  public void setButton3(java.lang.CharSequence arg1, android.os.Message arg2){
  }
  public void setButton3(java.lang.CharSequence arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnClick") android.content.DialogInterface.OnClickListener arg2){
  }
  public void setInverseBackgroundForced(boolean arg1){
  }
}
