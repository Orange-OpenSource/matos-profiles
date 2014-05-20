package android.filterfw.geometry;

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


public class Quad
{
  // Fields

  public Point p0;

  public Point p1;

  public Point p2;

  public Point p3;

  // Constructors

  public Quad(){
  }
  public Quad(Point arg1, Point arg2, Point arg3, Point arg4){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean IsInUnitRange(){
    return false;
  }
  public Quad scaled(float arg1){
    return (Quad) null;
  }
  public Quad scaled(float arg1, float arg2){
    return (Quad) null;
  }
  public Quad translated(Point arg1){
    return (Quad) null;
  }
  public Quad translated(float arg1, float arg2){
    return (Quad) null;
  }
  public Rectangle boundingBox(){
    return (Rectangle) null;
  }
  public float getBoundingWidth(){
    return 0.0f;
  }
  public float getBoundingHeight(){
    return 0.0f;
  }
}
