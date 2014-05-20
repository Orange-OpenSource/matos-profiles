package android.renderscript;

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
public class Allocation
  extends BaseObj{
  // Classes

  public static enum MipmapControl
  {
    // Enum Constants

    MIPMAP_NONE(0)
, MIPMAP_FULL(0)
, MIPMAP_ON_SYNC_TO_TEXTURE(0)
;
    // Fields

    // Constructors

    private MipmapControl(int arg1){
    }
    // Methods

  }
  // Fields

  public static final int USAGE_SCRIPT = 1;

  public static final int USAGE_GRAPHICS_TEXTURE = 2;

  public static final int USAGE_GRAPHICS_VERTEX = 4;

  public static final int USAGE_GRAPHICS_CONSTANTS = 8;

  public static final int USAGE_GRAPHICS_RENDER_TARGET = 16;

  // Constructors

  Allocation(int arg1, RenderScript arg2, Type arg3, int arg4){
    super(0, (RenderScript) null);
  }
  // Methods

  public Type getType(){
    return (Type) null;
  }
  public synchronized void resize(int arg1){
  }
  public void copyFrom(BaseObj [] arg1){
  }
  public void copyFrom(int [] arg1){
  }
  public void copyFrom(short [] arg1){
  }
  public void copyFrom(byte [] arg1){
  }
  public void copyFrom(float [] arg1){
  }
  public void copyFrom(android.graphics.Bitmap arg1){
  }
  public void copy1DRangeFromUnchecked(int arg1, int arg2, int [] arg3){
  }
  public void copy1DRangeFromUnchecked(int arg1, int arg2, short [] arg3){
  }
  public void copy1DRangeFromUnchecked(int arg1, int arg2, byte [] arg3){
  }
  public void copy1DRangeFromUnchecked(int arg1, int arg2, float [] arg3){
  }
  public void syncAll(int arg1){
  }
  public void setFromFieldPacker(int arg1, FieldPacker arg2){
  }
  public void setFromFieldPacker(int arg1, int arg2, FieldPacker arg3){
  }
  public void copy1DRangeFrom(int arg1, int arg2, int [] arg3){
  }
  public void copy1DRangeFrom(int arg1, int arg2, short [] arg3){
  }
  public void copy1DRangeFrom(int arg1, int arg2, byte [] arg3){
  }
  public void copy1DRangeFrom(int arg1, int arg2, float [] arg3){
  }
  public void copy1DRangeFrom(int arg1, int arg2, Allocation arg3, int arg4){
  }
  public void copy2DRangeFrom(int arg1, int arg2, int arg3, int arg4, byte [] arg5){
  }
  public void copy2DRangeFrom(int arg1, int arg2, int arg3, int arg4, short [] arg5){
  }
  public void copy2DRangeFrom(int arg1, int arg2, int arg3, int arg4, int [] arg5){
  }
  public void copy2DRangeFrom(int arg1, int arg2, int arg3, int arg4, float [] arg5){
  }
  public void copy2DRangeFrom(int arg1, int arg2, int arg3, int arg4, Allocation arg5, int arg6, int arg7){
  }
  public void copy2DRangeFrom(int arg1, int arg2, android.graphics.Bitmap arg3){
  }
  public void copyTo(android.graphics.Bitmap arg1){
  }
  public void copyTo(byte [] arg1){
  }
  public void copyTo(short [] arg1){
  }
  public void copyTo(int [] arg1){
  }
  public void copyTo(float [] arg1){
  }
  public void copyFromUnchecked(int [] arg1){
  }
  public void copyFromUnchecked(short [] arg1){
  }
  public void copyFromUnchecked(byte [] arg1){
  }
  public void copyFromUnchecked(float [] arg1){
  }
  public void generateMipmaps(){
  }
  public static Allocation createTyped(RenderScript arg1, Type arg2, Allocation.MipmapControl arg3, int arg4){
    return (Allocation) null;
  }
  public static Allocation createTyped(RenderScript arg1, Type arg2, int arg3){
    return (Allocation) null;
  }
  public static Allocation createTyped(RenderScript arg1, Type arg2){
    return (Allocation) null;
  }
  public static Allocation createSized(RenderScript arg1, Element arg2, int arg3, int arg4){
    return (Allocation) null;
  }
  public static Allocation createSized(RenderScript arg1, Element arg2, int arg3){
    return (Allocation) null;
  }
  public static Allocation createFromBitmap(RenderScript arg1, android.graphics.Bitmap arg2, Allocation.MipmapControl arg3, int arg4){
    return (Allocation) null;
  }
  public static Allocation createFromBitmap(RenderScript arg1, android.graphics.Bitmap arg2){
    return (Allocation) null;
  }
  public static Allocation createCubemapFromBitmap(RenderScript arg1, android.graphics.Bitmap arg2, Allocation.MipmapControl arg3, int arg4){
    return (Allocation) null;
  }
  public static Allocation createCubemapFromBitmap(RenderScript arg1, android.graphics.Bitmap arg2){
    return (Allocation) null;
  }
  public static Allocation createCubemapFromCubeFaces(RenderScript arg1, android.graphics.Bitmap arg2, android.graphics.Bitmap arg3, android.graphics.Bitmap arg4, android.graphics.Bitmap arg5, android.graphics.Bitmap arg6, android.graphics.Bitmap arg7, Allocation.MipmapControl arg8, int arg9){
    return (Allocation) null;
  }
  public static Allocation createCubemapFromCubeFaces(RenderScript arg1, android.graphics.Bitmap arg2, android.graphics.Bitmap arg3, android.graphics.Bitmap arg4, android.graphics.Bitmap arg5, android.graphics.Bitmap arg6, android.graphics.Bitmap arg7){
    return (Allocation) null;
  }
  public static Allocation createFromBitmapResource(RenderScript arg1, android.content.res.Resources arg2, int arg3, Allocation.MipmapControl arg4, int arg5){
    return (Allocation) null;
  }
  public static Allocation createFromBitmapResource(RenderScript arg1, android.content.res.Resources arg2, int arg3){
    return (Allocation) null;
  }
  public static Allocation createFromString(RenderScript arg1, java.lang.String arg2, int arg3){
    return (Allocation) null;
  }
}
