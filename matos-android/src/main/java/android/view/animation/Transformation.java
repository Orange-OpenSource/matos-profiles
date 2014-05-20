package android.view.animation;

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
public class Transformation
{
  // Fields

  public static int TYPE_IDENTITY;

  public static int TYPE_ALPHA;

  public static int TYPE_MATRIX;

  public static int TYPE_BOTH;

  protected android.graphics.Matrix mMatrix;

  protected float mAlpha;

  protected int mTransformationType;

  // Constructors

  public Transformation(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void clear(){
  }
  public void set(Transformation arg1){
  }
  public void setAlpha(float arg1){
  }
  public float getAlpha(){
    return 0.0f;
  }
  public android.graphics.Matrix getMatrix(){
    return (android.graphics.Matrix) null;
  }
  public void compose(Transformation arg1){
  }
  public java.lang.String toShortString(){
    return (java.lang.String) null;
  }
  public void toShortString(java.lang.StringBuilder arg1){
  }
  public void printShortString(java.io.PrintWriter arg1){
  }
  public int getTransformationType(){
    return 0;
  }
  public void setTransformationType(int arg1){
  }
}
