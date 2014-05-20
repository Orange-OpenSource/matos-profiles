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
public abstract class Layout
{
  // Classes

  public static class Directions
  {
    // Constructors

    Directions(int [] arg1){
    }
  }
  public static enum Alignment
  {
    // Enum Constants

    ALIGN_NORMAL()
, ALIGN_OPPOSITE()
, ALIGN_CENTER()
, ALIGN_LEFT()
, ALIGN_RIGHT()
;
    // Fields

    // Constructors

    private Alignment(){
    }
    // Methods

  }
  // Fields

  public static final int DIR_LEFT_TO_RIGHT = 1;

  public static final int DIR_RIGHT_TO_LEFT = -1;

  // Constructors

  protected Layout(java.lang.CharSequence arg1, TextPaint arg2, int arg3, Layout.Alignment arg4, float arg5, float arg6){
  }
  protected Layout(java.lang.CharSequence arg1, TextPaint arg2, int arg3, Layout.Alignment arg4, TextDirectionHeuristic arg5, float arg6, float arg7){
  }
  // Methods

  public final java.lang.CharSequence getText(){
    return (java.lang.CharSequence) null;
  }
  public final int getWidth(){
    return 0;
  }
  public int getHeight(){
    return 0;
  }
  public void draw(android.graphics.Canvas arg1){
  }
  public void draw(android.graphics.Canvas arg1, android.graphics.Path arg2, android.graphics.Paint arg3, int arg4){
  }
  public final TextPaint getPaint(){
    return (TextPaint) null;
  }
  public abstract int getLineCount();
  public int getLineBounds(int arg1, android.graphics.Rect arg2){
    return 0;
  }
  public final Layout.Alignment getAlignment(){
    return (Layout.Alignment) null;
  }
  public abstract int getLineTop(int arg1);
  public abstract int getLineDescent(int arg1);
  public int getEllipsizedWidth(){
    return 0;
  }
  public abstract int getParagraphDirection(int arg1);
  public int getLineForVertical(int arg1){
    return 0;
  }
  public abstract int getLineStart(int arg1);
  public abstract boolean getLineContainsTab(int arg1);
  public abstract Layout.Directions getLineDirections(int arg1);
  public abstract int getTopPadding();
  public abstract int getBottomPadding();
  public abstract int getEllipsisCount(int arg1);
  public abstract int getEllipsisStart(int arg1);
  public int getLineForOffset(int arg1){
    return 0;
  }
  public float getLineWidth(int arg1){
    return 0.0f;
  }
  public float getLineRight(int arg1){
    return 0.0f;
  }
  public void getCursorPath(int arg1, android.graphics.Path arg2, java.lang.CharSequence arg3){
  }
  public void getSelectionPath(int arg1, int arg2, android.graphics.Path arg3){
  }
  public boolean isLevelBoundary(int arg1){
    return false;
  }
  public float getPrimaryHorizontal(int arg1){
    return 0.0f;
  }
  public float getSecondaryHorizontal(int arg1){
    return 0.0f;
  }
  public final int getLineBottom(int arg1){
    return 0;
  }
  public final int getLineBaseline(int arg1){
    return 0;
  }
  public final int getLineEnd(int arg1){
    return 0;
  }
  public static float getDesiredWidth(java.lang.CharSequence arg1, TextPaint arg2){
    return 0.0f;
  }
  public static float getDesiredWidth(java.lang.CharSequence arg1, int arg2, int arg3, TextPaint arg4){
    return 0.0f;
  }
  public final void increaseWidthTo(int arg1){
  }
  public final Layout.Alignment getParagraphAlignment(int arg1){
    return (Layout.Alignment) null;
  }
  public float getLineLeft(int arg1){
    return 0.0f;
  }
  public int getOffsetForHorizontal(int arg1, float arg2){
    return 0;
  }
  public boolean isRtlCharAt(int arg1){
    return false;
  }
  public final float getSpacingMultiplier(){
    return 0.0f;
  }
  public final float getSpacingAdd(){
    return 0.0f;
  }
  public final TextDirectionHeuristic getTextDirectionHeuristic(){
    return (TextDirectionHeuristic) null;
  }
  public float getLineMax(int arg1){
    return 0.0f;
  }
  public int getLineVisibleEnd(int arg1){
    return 0;
  }
  public final int getLineAscent(int arg1){
    return 0;
  }
  public int getOffsetToLeftOf(int arg1){
    return 0;
  }
  public int getOffsetToRightOf(int arg1){
    return 0;
  }
  public final int getParagraphLeft(int arg1){
    return 0;
  }
  public final int getParagraphRight(int arg1){
    return 0;
  }
  protected final boolean isSpanned(){
    return false;
  }
}
