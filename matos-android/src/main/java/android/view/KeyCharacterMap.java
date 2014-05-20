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
public class KeyCharacterMap
{
  // Classes

  public static class KeyData
  {
    // Fields

    public static final int META_LENGTH = 4;

    public char displayLabel;

    public char number;

    public char [] meta;

    // Constructors

    public KeyData(){
    }
  }
  public static class UnavailableException
    extends android.util.AndroidRuntimeException  {
    // Constructors

    public UnavailableException(java.lang.String arg1){
      super();
    }
  }
  public static final class FallbackAction
  {
    // Fields

    public int keyCode;

    public int metaState;

    // Constructors

    public FallbackAction(){
    }
  }
  // Fields

  public static final int BUILT_IN_KEYBOARD = 0;

  public static final int VIRTUAL_KEYBOARD = -1;

  public static final int NUMERIC = 1;

  public static final int PREDICTIVE = 2;

  public static final int ALPHA = 3;

  public static final int FULL = 4;

  public static final int SPECIAL_FUNCTION = 5;

  public static final char HEX_INPUT = '\uef00';

  public static final char PICKER_DIALOG_INPUT = '\uef01';

  public static final int MODIFIER_BEHAVIOR_CHORDED = 0;

  public static final int MODIFIER_BEHAVIOR_CHORDED_OR_TOGGLED = 1;

  public static final int COMBINING_ACCENT = -2147483648;

  public static final int COMBINING_ACCENT_MASK = 2147483647;

  // Constructors

  private KeyCharacterMap(int arg1, int arg2){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public int get(int arg1, int arg2){
    return 0;
  }
  public static KeyCharacterMap load(int arg1){
    return (KeyCharacterMap) null;
  }
  public char getNumber(int arg1){
    return '\u0000';
  }
  public char getDisplayLabel(int arg1){
    return '\u0000';
  }
  public KeyEvent [] getEvents(char [] arg1){
    return (KeyEvent []) null;
  }
  public int getModifierBehavior(){
    return 0;
  }
  public boolean getFallbackAction(int arg1, int arg2, KeyCharacterMap.FallbackAction arg3){
    return false;
  }
  public char getMatch(int arg1, char [] arg2){
    return '\u0000';
  }
  public char getMatch(int arg1, char [] arg2, int arg3){
    return '\u0000';
  }
  public static int getDeadChar(int arg1, int arg2){
    return 0;
  }
  public boolean getKeyData(int arg1, KeyCharacterMap.KeyData arg2){
    return false;
  }
  public boolean isPrintingKey(int arg1){
    return false;
  }
  public int getKeyboardType(){
    return 0;
  }
  public static boolean deviceHasKey(int arg1){
    return false;
  }
  public static boolean [] deviceHasKeys(int [] arg1){
    return (boolean []) null;
  }
}
