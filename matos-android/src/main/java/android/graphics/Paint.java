package android.graphics;

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
public class Paint
{
  // Classes

  public static enum Style
  {
    // Enum Constants

    FILL(0)
, STROKE(0)
, FILL_AND_STROKE(0)
;
    // Fields

    // Constructors

    private Style(int arg1){
    }
    // Methods

  }
  public static enum Cap
  {
    // Enum Constants

    BUTT(0)
, ROUND(0)
, SQUARE(0)
;
    // Fields

    // Constructors

    private Cap(int arg1){
    }
    // Methods

  }
  public static enum Join
  {
    // Enum Constants

    MITER(0)
, ROUND(0)
, BEVEL(0)
;
    // Fields

    // Constructors

    private Join(int arg1){
    }
    // Methods

  }
  public static enum Align
  {
    // Enum Constants

    LEFT(0)
, CENTER(0)
, RIGHT(0)
;
    // Fields

    // Constructors

    private Align(int arg1){
    }
    // Methods

  }
  public static class FontMetrics
  {
    // Fields

    public float top;

    public float ascent;

    public float descent;

    public float bottom;

    public float leading;

    // Constructors

    public FontMetrics(){
    }
  }
  public static class FontMetricsInt
  {
    // Fields

    public int top;

    public int ascent;

    public int descent;

    public int bottom;

    public int leading;

    // Constructors

    public FontMetricsInt(){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public int mNativePaint;

  public boolean hasShadow;

  public float shadowDx;

  public float shadowDy;

  public float shadowRadius;

  public int shadowColor;

  public int mBidiFlags;

  public static final int ANTI_ALIAS_FLAG = 1;

  public static final int FILTER_BITMAP_FLAG = 2;

  public static final int DITHER_FLAG = 4;

  public static final int UNDERLINE_TEXT_FLAG = 8;

  public static final int STRIKE_THRU_TEXT_FLAG = 16;

  public static final int FAKE_BOLD_TEXT_FLAG = 32;

  public static final int LINEAR_TEXT_FLAG = 64;

  public static final int SUBPIXEL_TEXT_FLAG = 128;

  public static final int DEV_KERN_TEXT_FLAG = 256;

  public static final int HINTING_OFF = 0;

  public static final int HINTING_ON = 1;

  public static final int BIDI_LTR = 0;

  public static final int BIDI_RTL = 1;

  public static final int BIDI_DEFAULT_LTR = 2;

  public static final int BIDI_DEFAULT_RTL = 3;

  public static final int BIDI_FORCE_LTR = 4;

  public static final int BIDI_FORCE_RTL = 5;

  public static final int DIRECTION_LTR = 0;

  public static final int DIRECTION_RTL = 1;

  public static final int CURSOR_AFTER = 0;

  public static final int CURSOR_AT_OR_AFTER = 1;

  public static final int CURSOR_BEFORE = 2;

  public static final int CURSOR_AT_OR_BEFORE = 3;

  public static final int CURSOR_AT = 4;

  // Constructors

  public Paint(){
  }
  public Paint(int arg1){
  }
  public Paint(Paint arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void set(Paint arg1){
  }
  public void reset(){
  }
  public void setAlpha(int arg1){
  }
  public int getAlpha(){
    return 0;
  }
  public void setColor(int arg1){
  }
  public Typeface setTypeface(Typeface arg1){
    return (Typeface) null;
  }
  public float getTextSize(){
    return 0.0f;
  }
  public void setTextSize(float arg1){
  }
  public float getTextScaleX(){
    return 0.0f;
  }
  public void setTextScaleX(float arg1){
  }
  public Typeface getTypeface(){
    return (Typeface) null;
  }
  public void setShadowLayer(float arg1, float arg2, float arg3, int arg4){
  }
  public void setFlags(int arg1){
  }
  public int getFlags(){
    return 0;
  }
  public void setDither(boolean arg1){
  }
  public ColorFilter setColorFilter(ColorFilter arg1){
    return (ColorFilter) null;
  }
  public void setFilterBitmap(boolean arg1){
  }
  public void setAntiAlias(boolean arg1){
  }
  public int getColor(){
    return 0;
  }
  public float ascent(){
    return 0.0f;
  }
  public float descent(){
    return 0.0f;
  }
  public void setUnderlineText(boolean arg1){
  }
  public Shader setShader(Shader arg1){
    return (Shader) null;
  }
  public void setStyle(Paint.Style arg1){
  }
  public void setStrokeWidth(float arg1){
  }
  public Xfermode setXfermode(Xfermode arg1){
    return (Xfermode) null;
  }
  public void setCompatibilityScaling(float arg1){
  }
  public Paint.Style getStyle(){
    return (Paint.Style) null;
  }
  public void setFakeBoldText(boolean arg1){
  }
  public void setTextSkewX(float arg1){
  }
  public int getFontMetricsInt(Paint.FontMetricsInt arg1){
    return 0;
  }
  public Paint.FontMetricsInt getFontMetricsInt(){
    return (Paint.FontMetricsInt) null;
  }
  public float getStrokeWidth(){
    return 0.0f;
  }
  public float measureText(char [] arg1, int arg2, int arg3){
    return 0.0f;
  }
  public float measureText(java.lang.String arg1, int arg2, int arg3){
    return 0.0f;
  }
  public float measureText(java.lang.String arg1){
    return 0.0f;
  }
  public float measureText(java.lang.CharSequence arg1, int arg2, int arg3){
    return 0.0f;
  }
  public void setStrokeJoin(Paint.Join arg1){
  }
  public void setStrokeCap(Paint.Cap arg1){
  }
  public Shader getShader(){
    return (Shader) null;
  }
  public final boolean isAntiAlias(){
    return false;
  }
  public final boolean isFilterBitmap(){
    return false;
  }
  public final boolean isDither(){
    return false;
  }
  public ColorFilter getColorFilter(){
    return (ColorFilter) null;
  }
  public int breakText(char [] arg1, int arg2, int arg3, float arg4, float [] arg5){
    return 0;
  }
  public int breakText(java.lang.CharSequence arg1, int arg2, int arg3, boolean arg4, float arg5, float [] arg6){
    return 0;
  }
  public int breakText(java.lang.String arg1, boolean arg2, float arg3, float [] arg4){
    return 0;
  }
  public float getTextRunAdvances(char [] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float [] arg7, int arg8){
    return 0.0f;
  }
  public float getTextRunAdvances(char [] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float [] arg7, int arg8, int arg9){
    return 0.0f;
  }
  public float getTextRunAdvances(java.lang.CharSequence arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float [] arg7, int arg8){
    return 0.0f;
  }
  public float getTextRunAdvances(java.lang.CharSequence arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float [] arg7, int arg8, int arg9){
    return 0.0f;
  }
  public float getTextRunAdvances(java.lang.String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float [] arg7, int arg8){
    return 0.0f;
  }
  public float getTextRunAdvances(java.lang.String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float [] arg7, int arg8, int arg9){
    return 0.0f;
  }
  public int getBidiFlags(){
    return 0;
  }
  public void setBidiFlags(int arg1){
  }
  public int getHinting(){
    return 0;
  }
  public void setHinting(int arg1){
  }
  public final boolean isLinearText(){
    return false;
  }
  public void setLinearText(boolean arg1){
  }
  public final boolean isSubpixelText(){
    return false;
  }
  public void setSubpixelText(boolean arg1){
  }
  public final boolean isUnderlineText(){
    return false;
  }
  public final boolean isStrikeThruText(){
    return false;
  }
  public void setStrikeThruText(boolean arg1){
  }
  public final boolean isFakeBoldText(){
    return false;
  }
  public void setARGB(int arg1, int arg2, int arg3, int arg4){
  }
  public float getStrokeMiter(){
    return 0.0f;
  }
  public void setStrokeMiter(float arg1){
  }
  public Paint.Cap getStrokeCap(){
    return (Paint.Cap) null;
  }
  public Paint.Join getStrokeJoin(){
    return (Paint.Join) null;
  }
  public boolean getFillPath(Path arg1, Path arg2){
    return false;
  }
  public Xfermode getXfermode(){
    return (Xfermode) null;
  }
  public PathEffect getPathEffect(){
    return (PathEffect) null;
  }
  public PathEffect setPathEffect(PathEffect arg1){
    return (PathEffect) null;
  }
  public MaskFilter getMaskFilter(){
    return (MaskFilter) null;
  }
  public MaskFilter setMaskFilter(MaskFilter arg1){
    return (MaskFilter) null;
  }
  public Rasterizer getRasterizer(){
    return (Rasterizer) null;
  }
  public Rasterizer setRasterizer(Rasterizer arg1){
    return (Rasterizer) null;
  }
  public void clearShadowLayer(){
  }
  public Paint.Align getTextAlign(){
    return (Paint.Align) null;
  }
  public void setTextAlign(Paint.Align arg1){
  }
  public float getTextSkewX(){
    return 0.0f;
  }
  public float getFontMetrics(Paint.FontMetrics arg1){
    return 0.0f;
  }
  public Paint.FontMetrics getFontMetrics(){
    return (Paint.FontMetrics) null;
  }
  public float getFontSpacing(){
    return 0.0f;
  }
  public int getTextWidths(char [] arg1, int arg2, int arg3, float [] arg4){
    return 0;
  }
  public int getTextWidths(java.lang.CharSequence arg1, int arg2, int arg3, float [] arg4){
    return 0;
  }
  public int getTextWidths(java.lang.String arg1, int arg2, int arg3, float [] arg4){
    return 0;
  }
  public int getTextWidths(java.lang.String arg1, float [] arg2){
    return 0;
  }
  public int getTextGlyphs(java.lang.String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, char [] arg7){
    return 0;
  }
  public int getTextRunCursor(char [] arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
    return 0;
  }
  public int getTextRunCursor(java.lang.CharSequence arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
    return 0;
  }
  public int getTextRunCursor(java.lang.String arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
    return 0;
  }
  public void getTextPath(char [] arg1, int arg2, int arg3, float arg4, float arg5, Path arg6){
  }
  public void getTextPath(java.lang.String arg1, int arg2, int arg3, float arg4, float arg5, Path arg6){
  }
  public void getTextBounds(java.lang.String arg1, int arg2, int arg3, Rect arg4){
  }
  public void getTextBounds(char [] arg1, int arg2, int arg3, Rect arg4){
  }
}
