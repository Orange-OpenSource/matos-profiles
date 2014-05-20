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
public class Gravity
{
  // Fields

  public static final int NO_GRAVITY = 0;

  public static final int AXIS_SPECIFIED = 1;

  public static final int AXIS_PULL_BEFORE = 2;

  public static final int AXIS_PULL_AFTER = 4;

  public static final int AXIS_CLIP = 8;

  public static final int AXIS_X_SHIFT = 0;

  public static final int AXIS_Y_SHIFT = 4;

  public static final int TOP = 48;

  public static final int BOTTOM = 80;

  public static final int LEFT = 3;

  public static final int RIGHT = 5;

  public static final int CENTER_VERTICAL = 16;

  public static final int FILL_VERTICAL = 112;

  public static final int CENTER_HORIZONTAL = 1;

  public static final int FILL_HORIZONTAL = 7;

  public static final int CENTER = 17;

  public static final int FILL = 119;

  public static final int CLIP_VERTICAL = 128;

  public static final int CLIP_HORIZONTAL = 8;

  public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;

  public static final int HORIZONTAL_GRAVITY_MASK = 7;

  public static final int VERTICAL_GRAVITY_MASK = 112;

  public static final int DISPLAY_CLIP_VERTICAL = 268435456;

  public static final int DISPLAY_CLIP_HORIZONTAL = 16777216;

  public static final int START = 8388611;

  public static final int END = 8388613;

  public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;

  // Constructors

  public Gravity(){
  }
  // Methods

  public static void apply(int arg1, int arg2, int arg3, android.graphics.Rect arg4, android.graphics.Rect arg5){
  }
  public static void apply(int arg1, int arg2, int arg3, android.graphics.Rect arg4, android.graphics.Rect arg5, int arg6){
  }
  public static void apply(int arg1, int arg2, int arg3, android.graphics.Rect arg4, int arg5, int arg6, android.graphics.Rect arg7){
  }
  public static int getAbsoluteGravity(int arg1, int arg2){
    return 0;
  }
  public static void applyDisplay(int arg1, android.graphics.Rect arg2, android.graphics.Rect arg3){
  }
  public static boolean isVertical(int arg1){
    return false;
  }
  public static boolean isHorizontal(int arg1){
    return false;
  }
}
