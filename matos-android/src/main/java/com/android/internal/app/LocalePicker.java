package com.android.internal.app;

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
public class LocalePicker
  extends android.app.ListFragment{
  // Classes

  public static interface LocaleSelectionListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("LocaleSelectionListener")
    public void onLocaleSelected(java.util.Locale arg1);
  }
  public static class LocaleInfo
    implements java.lang.Comparable<LocalePicker.LocaleInfo>
  {
    // Constructors

    public LocaleInfo(@com.francetelecom.rd.stubs.annotation.FieldSet("mLabel") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mLocale") java.util.Locale arg2){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public int compareTo(LocalePicker.LocaleInfo arg1){
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mLocale")
    public java.util.Locale getLocale(){
      return (java.util.Locale) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mLabel")
    public java.lang.String getLabel(){
      return (java.lang.String) null;
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public LocalePicker(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onResume(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActivityCreated(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onListItemClick(android.widget.ListView arg1, android.view.View arg2, int arg3, long arg4){
  }
  public static android.widget.ArrayAdapter<LocalePicker.LocaleInfo> constructAdapter(android.content.Context arg1){
    return (android.widget.ArrayAdapter) null;
  }
  public static android.widget.ArrayAdapter<LocalePicker.LocaleInfo> constructAdapter(android.content.Context arg1, int arg2, int arg3){
    return (android.widget.ArrayAdapter) null;
  }
  public void setLocaleSelectionListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("LocaleSelectionListener") LocalePicker.LocaleSelectionListener arg1){
  }
  public static void updateLocale(java.util.Locale arg1){
  }
}
