package android.inputmethodservice;

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
public class Keyboard
{
  // Classes

  public static class Row
  {
    // Fields

    public int defaultWidth;

    public int defaultHeight;

    public int defaultHorizontalGap;

    public int verticalGap;

    public int rowEdgeFlags;

    public int mode;

    // Constructors

    public Row(Keyboard arg1){
    }
    public Row(android.content.res.Resources arg1, Keyboard arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") android.content.res.XmlResourceParser arg3){
    }
  }
  public static class Key
  {
    // Fields

    public int [] codes;

    public java.lang.CharSequence label;

    public android.graphics.drawable.Drawable icon;

    public android.graphics.drawable.Drawable iconPreview;

    public int width;

    public int height;

    public int gap;

    public boolean sticky;

    public int x;

    public int y;

    public boolean pressed;

    public boolean on;

    public java.lang.CharSequence text;

    public java.lang.CharSequence popupCharacters;

    public int edgeFlags;

    public boolean modifier;

    public int popupResId;

    public boolean repeatable;

    // Constructors

    @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public Key(Keyboard.Row arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public Key(android.content.res.Resources arg1, Keyboard.Row arg2, int arg3, int arg4, android.content.res.XmlResourceParser arg5){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onReleased(boolean arg1){
    }
    public int squaredDistanceFrom(int arg1, int arg2){
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onPressed(){
    }
    public boolean isInside(int arg1, int arg2){
      return false;
    }
    public int [] getCurrentDrawableState(){
      return (int []) null;
    }
  }
  // Fields

  public static final int EDGE_LEFT = 1;

  public static final int EDGE_RIGHT = 2;

  public static final int EDGE_TOP = 4;

  public static final int EDGE_BOTTOM = 8;

  public static final int KEYCODE_SHIFT = -1;

  public static final int KEYCODE_MODE_CHANGE = -2;

  public static final int KEYCODE_CANCEL = -3;

  public static final int KEYCODE_DONE = -4;

  public static final int KEYCODE_DELETE = -5;

  public static final int KEYCODE_ALT = -6;

  // Constructors

  public Keyboard(android.content.Context arg1, int arg2){
  }
  public Keyboard(android.content.Context arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public Keyboard(android.content.Context arg1, int arg2, int arg3){
  }
  public Keyboard(android.content.Context arg1, int arg2, java.lang.CharSequence arg3, int arg4, int arg5){
  }
  // Methods

  public int getHeight(){
    return 0;
  }
  public java.util.List<Keyboard.Key> getKeys(){
    return (java.util.List) null;
  }
  public java.util.List<Keyboard.Key> getModifierKeys(){
    return (java.util.List) null;
  }
  protected int getHorizontalGap(){
    return 0;
  }
  protected void setHorizontalGap(int arg1){
  }
  protected int getVerticalGap(){
    return 0;
  }
  protected void setVerticalGap(int arg1){
  }
  protected int getKeyHeight(){
    return 0;
  }
  protected void setKeyHeight(int arg1){
  }
  protected int getKeyWidth(){
    return 0;
  }
  protected void setKeyWidth(int arg1){
  }
  public int getMinWidth(){
    return 0;
  }
  public boolean setShifted(boolean arg1){
    return false;
  }
  public boolean isShifted(){
    return false;
  }
  public int [] getShiftKeyIndices(){
    return (int []) null;
  }
  public int getShiftKeyIndex(){
    return 0;
  }
  public int [] getNearestKeys(int arg1, int arg2){
    return (int []) null;
  }
  protected Keyboard.Row createRowFromXml(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") android.content.res.XmlResourceParser arg2){
    return (Keyboard.Row) null;
  }
  protected Keyboard.Key createKeyFromXml(android.content.res.Resources arg1, Keyboard.Row arg2, int arg3, int arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") android.content.res.XmlResourceParser arg5){
    return (Keyboard.Key) null;
  }
}
