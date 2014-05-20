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
public class BitmapFactory
{
  // Classes

  public static class Options
  {
    // Fields

    public Bitmap inBitmap;

    public boolean inMutable;

    public boolean inJustDecodeBounds;

    public int inSampleSize;

    public Bitmap.Config inPreferredConfig;

    public boolean inDither;

    public int inDensity;

    public int inTargetDensity;

    public int inScreenDensity;

    public boolean inScaled;

    public boolean inPurgeable;

    public boolean inInputShareable;

    public boolean inPreferQualityOverSpeed;

    public int outWidth;

    public int outHeight;

    public java.lang.String outMimeType;

    public byte [] inTempStorage;

    public boolean mCancel;

    // Constructors

    public Options(){
    }
    // Methods

    public void requestCancelDecode(){
    }
  }
  // Constructors

  public BitmapFactory(){
  }
  // Methods

  public static Bitmap decodeResourceStream(android.content.res.Resources arg1, android.util.TypedValue arg2, java.io.InputStream arg3, Rect arg4, BitmapFactory.Options arg5){
    return (Bitmap) null;
  }
  public static Bitmap decodeFile(java.lang.String arg1, BitmapFactory.Options arg2){
    return (Bitmap) null;
  }
  public static Bitmap decodeFile(java.lang.String arg1){
    return (Bitmap) null;
  }
  public static Bitmap decodeResource(android.content.res.Resources arg1, int arg2, BitmapFactory.Options arg3){
    return (Bitmap) null;
  }
  public static Bitmap decodeResource(android.content.res.Resources arg1, int arg2){
    return (Bitmap) null;
  }
  public static Bitmap decodeStream(java.io.InputStream arg1, Rect arg2, BitmapFactory.Options arg3){
    return (Bitmap) null;
  }
  public static Bitmap decodeStream(java.io.InputStream arg1){
    return (Bitmap) null;
  }
  public static Bitmap decodeFileDescriptor(java.io.FileDescriptor arg1, Rect arg2, BitmapFactory.Options arg3){
    return (Bitmap) null;
  }
  public static Bitmap decodeFileDescriptor(java.io.FileDescriptor arg1){
    return (Bitmap) null;
  }
  public static Bitmap decodeByteArray(byte [] arg1, int arg2, int arg3, BitmapFactory.Options arg4){
    return (Bitmap) null;
  }
  public static Bitmap decodeByteArray(byte [] arg1, int arg2, int arg3){
    return (Bitmap) null;
  }
  public static void setDefaultConfig(Bitmap.Config arg1){
  }
}
