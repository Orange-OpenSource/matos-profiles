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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Toast
{
  // Fields

  public static final int LENGTH_SHORT = 0;

  public static final int LENGTH_LONG = 1;

  // Constructors

  public Toast(android.content.Context arg1){
  }
  // Methods

  public void cancel(){
  }
  public int getDuration(){
    return 0;
  }
  public android.view.View getView(){
    return (android.view.View) null;
  }
  public void show(){
  }
  public void setGravity(int arg1, int arg2, int arg3){
  }
  public void setText(int arg1){
  }
  public void setText(java.lang.CharSequence arg1){
  }
  public void setDuration(int arg1){
  }
  public int getGravity(){
    return 0;
  }
  public void setView(android.view.View arg1){
  }
  public static Toast makeText(android.content.Context arg1, java.lang.CharSequence arg2, int arg3){
    return (Toast) null;
  }
  public static Toast makeText(android.content.Context arg1, int arg2, int arg3) throws android.content.res.Resources.NotFoundException{
    return (Toast) null;
  }
  public void setMargin(float arg1, float arg2){
  }
  public float getHorizontalMargin(){
    return 0.0f;
  }
  public float getVerticalMargin(){
    return 0.0f;
  }
  public int getXOffset(){
    return 0;
  }
  public int getYOffset(){
    return 0;
  }
}
