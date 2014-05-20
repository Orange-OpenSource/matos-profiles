package android.graphics.drawable.shapes;

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


public abstract class Shape
  implements java.lang.Cloneable
{
  // Constructors

  public Shape(){
  }
  // Methods

  public Shape clone() throws java.lang.CloneNotSupportedException{
    return (Shape) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onResize")
  public final void resize(float arg1, float arg2){
  }
  public final float getWidth(){
    return 0.0f;
  }
  public final float getHeight(){
    return 0.0f;
  }
  public abstract void draw(android.graphics.Canvas arg1, android.graphics.Paint arg2);
  public boolean hasAlpha(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onResize")
  protected void onResize(float arg1, float arg2){
  }
}
