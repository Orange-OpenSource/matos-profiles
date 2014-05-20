package android.widget;

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


public class QuickContactBadge
  extends ImageView  implements android.view.View.OnClickListener
{
  // Fields

  protected java.lang.String [] mExcludeMimes;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public QuickContactBadge(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public QuickContactBadge(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public QuickContactBadge(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  protected void drawableStateChanged(){
  }
  protected void onDraw(android.graphics.Canvas arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onClick(android.view.View arg1){
  }
  public void setMode(int arg1){
  }
  public void setImageToDefault(){
  }
  public void assignContactUri(android.net.Uri arg1){
  }
  public void assignContactFromEmail(java.lang.String arg1, boolean arg2){
  }
  public void assignContactFromPhone(java.lang.String arg1, boolean arg2){
  }
  public void setExcludeMimes(java.lang.String [] arg1){
  }
}
