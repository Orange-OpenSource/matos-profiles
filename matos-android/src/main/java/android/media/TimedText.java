package android.media;

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


public class TimedText
{
  // Classes

  public class Text
  {
    // Fields

    public int textLen;

    public byte [] text;

    // Constructors

    public Text(){
    }
  }
  public class CharPos
  {
    // Fields

    public int startChar;

    public int endChar;

    // Constructors

    public CharPos(){
    }
  }
  public class TextPos
  {
    // Fields

    public int top;

    public int left;

    public int bottom;

    public int right;

    // Constructors

    public TextPos(){
    }
  }
  public class Justification
  {
    // Fields

    public int horizontalJustification;

    public int verticalJustification;

    // Constructors

    public Justification(){
    }
  }
  public class Style
  {
    // Fields

    public int startChar;

    public int endChar;

    public int fontID;

    public boolean isBold;

    public boolean isItalic;

    public boolean isUnderlined;

    public int fontSize;

    public int colorRGBA;

    // Constructors

    public Style(){
    }
  }
  public class Font
  {
    // Fields

    public int ID;

    public java.lang.String name;

    // Constructors

    public Font(){
    }
  }
  public class Karaoke
  {
    // Fields

    public int startTimeMs;

    public int endTimeMs;

    public int startChar;

    public int endChar;

    // Constructors

    public Karaoke(){
    }
  }
  public class HyperText
  {
    // Fields

    public int startChar;

    public int endChar;

    public java.lang.String URL;

    public java.lang.String altString;

    // Constructors

    public HyperText(){
    }
  }
  // Fields

  public static final int KEY_DISPLAY_FLAGS = 1;

  public static final int KEY_STYLE_FLAGS = 2;

  public static final int KEY_BACKGROUND_COLOR_RGBA = 3;

  public static final int KEY_HIGHLIGHT_COLOR_RGBA = 4;

  public static final int KEY_SCROLL_DELAY = 5;

  public static final int KEY_WRAP_TEXT = 6;

  public static final int KEY_START_TIME = 7;

  public static final int KEY_STRUCT_BLINKING_TEXT_LIST = 8;

  public static final int KEY_STRUCT_FONT_LIST = 9;

  public static final int KEY_STRUCT_HIGHLIGHT_LIST = 10;

  public static final int KEY_STRUCT_HYPER_TEXT_LIST = 11;

  public static final int KEY_STRUCT_KARAOKE_LIST = 12;

  public static final int KEY_STRUCT_STYLE_LIST = 13;

  public static final int KEY_STRUCT_TEXT_POS = 14;

  public static final int KEY_STRUCT_JUSTIFICATION = 15;

  public static final int KEY_STRUCT_TEXT = 16;

  // Constructors

  public TimedText(byte [] arg1){
  }
  // Methods

  public java.lang.Object getObject(int arg1){
    return (java.lang.Object) null;
  }
  public java.util.Set keySet(){
    return (java.util.Set) null;
  }
  public boolean containsKey(int arg1){
    return false;
  }
  public boolean isValidKey(int arg1){
    return false;
  }
}
