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
public final class Bitmap
  implements android.os.Parcelable
{
  // Classes

  public static enum Config
  {
    // Enum Constants

    ALPHA_8(0)
, RGB_565(0)
, ARGB_4444(0)
, ARGB_8888(0)
;
    // Fields

    // Constructors

    private Config(int arg1){
    }
    // Methods

  }
  public static enum CompressFormat
  {
    // Enum Constants

    JPEG(0)
, PNG(0)
, WEBP(0)
;
    // Fields

    // Constructors

    private CompressFormat(int arg1){
    }
    // Methods

  }
  // Fields

  public static final int DENSITY_NONE = 0;

  public final int mNativeBitmap = 0;

  public byte [] mBuffer;

  public static final android.os.Parcelable.Creator<Bitmap> CREATOR = null;

  // Constructors

  Bitmap(int arg1, byte [] arg2, boolean arg3, byte [] arg4, int arg5){
  }
  // Methods

  public Bitmap copy(Bitmap.Config arg1, boolean arg2){
    return (Bitmap) null;
  }
  public final boolean isMutable(){
    return false;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public final int getWidth(){
    return 0;
  }
  public final int getHeight(){
    return 0;
  }
  public final boolean hasAlpha(){
    return false;
  }
  public void recycle(){
  }
  public final int getByteCount(){
    return 0;
  }
  public void setDensity(int arg1){
  }
  public int getDensity(){
    return 0;
  }
  public final boolean isRecycled(){
    return false;
  }
  public int getGenerationId(){
    return 0;
  }
  public static Bitmap createBitmap(Bitmap arg1){
    return (Bitmap) null;
  }
  public static Bitmap createBitmap(Bitmap arg1, int arg2, int arg3, int arg4, int arg5){
    return (Bitmap) null;
  }
  public static Bitmap createBitmap(Bitmap arg1, int arg2, int arg3, int arg4, int arg5, Matrix arg6, boolean arg7){
    return (Bitmap) null;
  }
  public static Bitmap createBitmap(int arg1, int arg2, Bitmap.Config arg3){
    return (Bitmap) null;
  }
  public static Bitmap createBitmap(int [] arg1, int arg2, int arg3, int arg4, int arg5, Bitmap.Config arg6){
    return (Bitmap) null;
  }
  public static Bitmap createBitmap(int [] arg1, int arg2, int arg3, Bitmap.Config arg4){
    return (Bitmap) null;
  }
  public void setHasAlpha(boolean arg1){
  }
  public void eraseColor(int arg1){
  }
  public byte [] getNinePatchChunk(){
    return (byte []) null;
  }
  public final Bitmap.Config getConfig(){
    return (Bitmap.Config) null;
  }
  public void getPixels(int [] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7){
  }
  public int getScaledWidth(Canvas arg1){
    return 0;
  }
  public int getScaledWidth(android.util.DisplayMetrics arg1){
    return 0;
  }
  public int getScaledWidth(int arg1){
    return 0;
  }
  public int getScaledHeight(Canvas arg1){
    return 0;
  }
  public int getScaledHeight(android.util.DisplayMetrics arg1){
    return 0;
  }
  public int getScaledHeight(int arg1){
    return 0;
  }
  public boolean compress(Bitmap.CompressFormat arg1, int arg2, java.io.OutputStream arg3){
    return false;
  }
  public static Bitmap createScaledBitmap(Bitmap arg1, int arg2, int arg3, boolean arg4){
    return (Bitmap) null;
  }
  public Bitmap extractAlpha(){
    return (Bitmap) null;
  }
  public Bitmap extractAlpha(Paint arg1, int [] arg2){
    return (Bitmap) null;
  }
  public static void setDefaultDensity(int arg1){
  }
  public void setNinePatchChunk(byte [] arg1){
  }
  public void copyPixelsToBuffer(java.nio.Buffer arg1){
  }
  public void copyPixelsFromBuffer(java.nio.Buffer arg1){
  }
  public static int scaleFromDensity(int arg1, int arg2, int arg3){
    return 0;
  }
  public final int getRowBytes(){
    return 0;
  }
  public int getPixel(int arg1, int arg2){
    return 0;
  }
  public void setPixel(int arg1, int arg2, int arg3){
  }
  public void setPixels(int [] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7){
  }
  public boolean sameAs(Bitmap arg1){
    return false;
  }
  public void prepareToDraw(){
  }
}
