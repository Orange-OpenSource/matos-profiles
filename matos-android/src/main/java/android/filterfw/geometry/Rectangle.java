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


public class Rectangle
  extends Quad{
  // Constructors

  public Rectangle(){
    super();
  }
  public Rectangle(float arg1, float arg2, float arg3, float arg4){
    super();
  }
  public Rectangle(Point arg1, Point arg2){
    super();
  }
  private Rectangle(Point arg1, Point arg2, Point arg3, Point arg4){
    super();
  }
  // Methods

  public float getWidth(){
    return 0.0f;
  }
  public float getHeight(){
    return 0.0f;
  }
  public Rectangle scaled(float arg1){
    return (Rectangle) null;
  }
  public Rectangle scaled(float arg1, float arg2){
    return (Rectangle) null;
  }
  public Point center(){
    return (Point) null;
  }
  public static Rectangle fromRotatedRect(Point arg1, Point arg2, float arg3){
    return (Rectangle) null;
  }
  public static Rectangle fromCenterVerticalAxis(Point arg1, Point arg2, Point arg3){
    return (Rectangle) null;
  }
}
