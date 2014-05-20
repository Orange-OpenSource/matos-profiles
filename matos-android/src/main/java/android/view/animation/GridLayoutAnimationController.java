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
public class GridLayoutAnimationController
  extends LayoutAnimationController{
  // Classes

  public static class AnimationParameters
    extends LayoutAnimationController.AnimationParameters  {
    // Fields

    public int column;

    public int row;

    public int columnsCount;

    public int rowsCount;

    // Constructors

    public AnimationParameters(){
      super();
    }
  }
  // Fields

  public static final int DIRECTION_LEFT_TO_RIGHT = 0;

  public static final int DIRECTION_RIGHT_TO_LEFT = 1;

  public static final int DIRECTION_TOP_TO_BOTTOM = 0;

  public static final int DIRECTION_BOTTOM_TO_TOP = 2;

  public static final int DIRECTION_HORIZONTAL_MASK = 1;

  public static final int DIRECTION_VERTICAL_MASK = 2;

  public static final int PRIORITY_NONE = 0;

  public static final int PRIORITY_COLUMN = 1;

  public static final int PRIORITY_ROW = 2;

  // Constructors

  public GridLayoutAnimationController(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null, (android.util.AttributeSet) null);
  }
  public GridLayoutAnimationController(Animation arg1){
    super((android.content.Context) null, (android.util.AttributeSet) null);
  }
  public GridLayoutAnimationController(Animation arg1, float arg2, float arg3){
    super((android.content.Context) null, (android.util.AttributeSet) null);
  }
  // Methods

  public boolean willOverlap(){
    return false;
  }
  protected long getDelayForView(android.view.View arg1){
    return 0l;
  }
  public int getDirection(){
    return 0;
  }
  public float getColumnDelay(){
    return 0.0f;
  }
  public void setColumnDelay(float arg1){
  }
  public float getRowDelay(){
    return 0.0f;
  }
  public void setRowDelay(float arg1){
  }
  public void setDirection(int arg1){
  }
  public int getDirectionPriority(){
    return 0;
  }
  public void setDirectionPriority(int arg1){
  }
}
