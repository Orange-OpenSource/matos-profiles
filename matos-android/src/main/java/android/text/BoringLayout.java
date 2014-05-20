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
public class BoringLayout
  extends Layout  implements TextUtils.EllipsizeCallback
{
  // Classes

  public static class Metrics
    extends android.graphics.Paint.FontMetricsInt  {
    // Fields

    public int width;

    // Constructors

    public Metrics(){
      super();
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Constructors

  public BoringLayout(java.lang.CharSequence arg1, TextPaint arg2, int arg3, Layout.Alignment arg4, float arg5, float arg6, BoringLayout.Metrics arg7, boolean arg8){
    super((java.lang.CharSequence) null, (TextPaint) null, 0, (Layout.Alignment) null, 0.0f, 0.0f);
  }
  public BoringLayout(java.lang.CharSequence arg1, TextPaint arg2, int arg3, Layout.Alignment arg4, float arg5, float arg6, BoringLayout.Metrics arg7, boolean arg8, TextUtils.TruncateAt arg9, int arg10){
    super((java.lang.CharSequence) null, (TextPaint) null, 0, (Layout.Alignment) null, 0.0f, 0.0f);
  }
  // Methods

  public static BoringLayout make(java.lang.CharSequence arg1, TextPaint arg2, int arg3, Layout.Alignment arg4, float arg5, float arg6, BoringLayout.Metrics arg7, boolean arg8){
    return (BoringLayout) null;
  }
  public static BoringLayout make(java.lang.CharSequence arg1, TextPaint arg2, int arg3, Layout.Alignment arg4, float arg5, float arg6, BoringLayout.Metrics arg7, boolean arg8, TextUtils.TruncateAt arg9, int arg10){
    return (BoringLayout) null;
  }
  public int getHeight(){
    return 0;
  }
  public void draw(android.graphics.Canvas arg1, android.graphics.Path arg2, android.graphics.Paint arg3, int arg4){
  }
  public void ellipsized(int arg1, int arg2){
  }
  public int getLineCount(){
    return 0;
  }
  public int getLineTop(int arg1){
    return 0;
  }
  public int getLineDescent(int arg1){
    return 0;
  }
  public int getEllipsizedWidth(){
    return 0;
  }
  public int getParagraphDirection(int arg1){
    return 0;
  }
  public int getLineStart(int arg1){
    return 0;
  }
  public boolean getLineContainsTab(int arg1){
    return false;
  }
  public final Layout.Directions getLineDirections(int arg1){
    return (Layout.Directions) null;
  }
  public int getTopPadding(){
    return 0;
  }
  public int getBottomPadding(){
    return 0;
  }
  public int getEllipsisCount(int arg1){
    return 0;
  }
  public int getEllipsisStart(int arg1){
    return 0;
  }
  public float getLineMax(int arg1){
    return 0.0f;
  }
  public static BoringLayout.Metrics isBoring(java.lang.CharSequence arg1, TextPaint arg2){
    return (BoringLayout.Metrics) null;
  }
  public static BoringLayout.Metrics isBoring(java.lang.CharSequence arg1, TextPaint arg2, TextDirectionHeuristic arg3){
    return (BoringLayout.Metrics) null;
  }
  public static BoringLayout.Metrics isBoring(java.lang.CharSequence arg1, TextPaint arg2, BoringLayout.Metrics arg3){
    return (BoringLayout.Metrics) null;
  }
  public static BoringLayout.Metrics isBoring(java.lang.CharSequence arg1, TextPaint arg2, TextDirectionHeuristic arg3, BoringLayout.Metrics arg4){
    return (BoringLayout.Metrics) null;
  }
  public BoringLayout replaceOrMake(java.lang.CharSequence arg1, TextPaint arg2, int arg3, Layout.Alignment arg4, float arg5, float arg6, BoringLayout.Metrics arg7, boolean arg8){
    return (BoringLayout) null;
  }
  public BoringLayout replaceOrMake(java.lang.CharSequence arg1, TextPaint arg2, int arg3, Layout.Alignment arg4, float arg5, float arg6, BoringLayout.Metrics arg7, boolean arg8, TextUtils.TruncateAt arg9, int arg10){
    return (BoringLayout) null;
  }
}
