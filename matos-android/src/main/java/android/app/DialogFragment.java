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
public class DialogFragment
  extends Fragment  implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener
{
  // Fields

  public static final int STYLE_NORMAL = 0;

  public static final int STYLE_NO_TITLE = 1;

  public static final int STYLE_NO_FRAME = 2;

  public static final int STYLE_NO_INPUT = 3;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public DialogFragment(){
    super();
  }
  // Methods

  public void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSaveInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStop(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public Dialog onCreateDialog(android.os.Bundle arg1){
    return (Dialog) null;
  }
  public android.view.LayoutInflater getLayoutInflater(android.os.Bundle arg1){
    return (android.view.LayoutInflater) null;
  }
  public int getTheme(){
    return 0;
  }
  public void show(FragmentManager arg1, java.lang.String arg2){
  }
  public int show(FragmentTransaction arg1, java.lang.String arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDismiss(android.content.DialogInterface arg1){
  }
  public void dismiss(){
  }
  public Dialog getDialog(){
    return (Dialog) null;
  }
  public boolean isCancelable(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActivityCreated(android.os.Bundle arg1){
  }
  public void setCancelable(boolean arg1){
  }
  public void setStyle(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCancel(android.content.DialogInterface arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroyView(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAttach(Activity arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDetach(){
  }
  public void dismissAllowingStateLoss(){
  }
  public void setShowsDialog(boolean arg1){
  }
  public boolean getShowsDialog(){
    return false;
  }
}
