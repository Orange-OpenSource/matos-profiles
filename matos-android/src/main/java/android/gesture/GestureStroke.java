package android.gesture;

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
public class GestureStroke
{
  // Fields

  public final android.graphics.RectF boundingBox = (android.graphics.RectF) null;

  public final float length = 0.0f;

  public final float [] points = (float []) null;

  // Constructors

  public GestureStroke(java.util.ArrayList<GesturePoint> arg1){
  }
  private GestureStroke(android.graphics.RectF arg1, float arg2, float [] arg3, long [] arg4){
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public android.graphics.Path getPath(){
    return (android.graphics.Path) null;
  }
  public android.graphics.Path toPath(float arg1, float arg2, int arg3){
    return (android.graphics.Path) null;
  }
  public OrientedBoundingBox computeOrientedBoundingBox(){
    return (OrientedBoundingBox) null;
  }
  public void clearPath(){
  }
}
