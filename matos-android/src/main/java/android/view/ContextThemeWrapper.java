package android.view;

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
public class ContextThemeWrapper
  extends android.content.ContextWrapper{
  // Constructors
  
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ContextThemeWrapper(){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ContextThemeWrapper(android.content.Context arg1, int arg2){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public java.lang.Object getSystemService(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  protected void onApplyThemeResource(android.content.res.Resources.Theme arg1, int arg2, boolean arg3){
  }
  public android.content.res.Resources.Theme getTheme(){
    return (android.content.res.Resources.Theme) null;
  }
  protected void attachBaseContext(android.content.Context arg1){
  }
  public void setTheme(int arg1){
  }
  public int getThemeResId(){
    return 0;
  }
}
