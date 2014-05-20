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
public class Selection
{
  // Classes

  public static interface PositionIterator
  {
    // Fields

    public static final int DONE = -1;

    // Methods

    public int preceding(int arg1);
    public int following(int arg1);
  }
  // Fields

  public static final java.lang.Object SELECTION_START = null;

  public static final java.lang.Object SELECTION_END = null;

  // Constructors

  private Selection(){
  }
  // Methods

  public static final void selectAll(Spannable arg1){
  }
  public static void setSelection(Spannable arg1, int arg2, int arg3){
  }
  public static final void setSelection(Spannable arg1, int arg2){
  }
  public static final void extendSelection(Spannable arg1, int arg2){
  }
  public static final int getSelectionStart(java.lang.CharSequence arg1){
    return 0;
  }
  public static final int getSelectionEnd(java.lang.CharSequence arg1){
    return 0;
  }
  public static boolean extendLeft(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean moveLeft(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean extendRight(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean moveRight(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean extendUp(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean moveUp(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean extendDown(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean moveDown(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean extendToLeftEdge(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean moveToLeftEdge(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean extendToRightEdge(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean moveToRightEdge(Spannable arg1, Layout arg2){
    return false;
  }
  public static boolean moveToPreceding(Spannable arg1, Selection.PositionIterator arg2, boolean arg3){
    return false;
  }
  public static boolean moveToFollowing(Spannable arg1, Selection.PositionIterator arg2, boolean arg3){
    return false;
  }
  public static final void removeSelection(Spannable arg1){
  }
}
