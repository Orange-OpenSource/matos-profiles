package android.text;

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
public class AndroidCharacter
{
  // Fields

  public static final int EAST_ASIAN_WIDTH_NEUTRAL = 0;

  public static final int EAST_ASIAN_WIDTH_AMBIGUOUS = 1;

  public static final int EAST_ASIAN_WIDTH_HALF_WIDTH = 2;

  public static final int EAST_ASIAN_WIDTH_FULL_WIDTH = 3;

  public static final int EAST_ASIAN_WIDTH_NARROW = 4;

  public static final int EAST_ASIAN_WIDTH_WIDE = 5;

  // Constructors

  public AndroidCharacter(){
  }
  // Methods

  public static boolean mirror(char [] arg1, int arg2, int arg3){
    return false;
  }
  public static void getDirectionalities(char [] arg1, byte [] arg2, int arg3){
  }
  public static int getEastAsianWidth(char arg1){
    return 0;
  }
  public static void getEastAsianWidths(char [] arg1, int arg2, int arg3, byte [] arg4){
  }
  public static char getMirror(char arg1){
    return '\u0000';
  }
}
