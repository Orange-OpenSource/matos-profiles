package java.text;

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


public final class Bidi
{
  // Fields

  public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT = -2;

  public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT = -1;

  public static final int DIRECTION_LEFT_TO_RIGHT = 0;

  public static final int DIRECTION_RIGHT_TO_LEFT = 1;

  // Constructors

  public Bidi(AttributedCharacterIterator arg1){
  }
  public Bidi(char [] arg1, int arg2, byte [] arg3, int arg4, int arg5, int arg6){
  }
  public Bidi(java.lang.String arg1, int arg2){
  }
  private Bidi(long arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int getLength(){
    return 0;
  }
  public int getRunStart(int arg1){
    return 0;
  }
  public int getRunLimit(int arg1){
    return 0;
  }
  public boolean baseIsLeftToRight(){
    return false;
  }
  public Bidi createLineBidi(int arg1, int arg2){
    return (Bidi) null;
  }
  public int getBaseLevel(){
    return 0;
  }
  public int getLevelAt(int arg1){
    return 0;
  }
  public int getRunCount(){
    return 0;
  }
  public int getRunLevel(int arg1){
    return 0;
  }
  public boolean isLeftToRight(){
    return false;
  }
  public boolean isMixed(){
    return false;
  }
  public boolean isRightToLeft(){
    return false;
  }
  public static void reorderVisually(byte [] arg1, int arg2, java.lang.Object [] arg3, int arg4, int arg5){
  }
  public static boolean requiresBidi(char [] arg1, int arg2, int arg3){
    return false;
  }
}
