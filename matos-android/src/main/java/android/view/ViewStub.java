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
public final class ViewStub
  extends View{
  // Classes

  public static interface OnInflateListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onInflate")
    public void onInflate(ViewStub arg1, View arg2);
  }
  // Constructors

  public ViewStub(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public ViewStub(android.content.Context arg1, int arg2){
    super((android.content.Context) null);
  }
  public ViewStub(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  public ViewStub(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public View inflate(){
    return (View) null;
  }
  protected void onMeasure(int arg1, int arg2){
  }
  public void setVisibility(int arg1){
  }
  protected void dispatchDraw(android.graphics.Canvas arg1){
  }
  public void draw(android.graphics.Canvas arg1){
  }
  public void setLayoutResource(int arg1){
  }
  public int getLayoutResource(){
    return 0;
  }
  public int getInflatedId(){
    return 0;
  }
  public void setInflatedId(int arg1){
  }
  public void setOnInflateListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.ViewStub.OnInflateListener.onInflate") ViewStub.OnInflateListener arg1){
  }
}
