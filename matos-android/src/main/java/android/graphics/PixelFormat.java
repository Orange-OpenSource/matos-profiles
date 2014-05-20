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
public class PixelFormat
{
  // Fields

  public static final int UNKNOWN = 0;

  public static final int TRANSLUCENT = -3;

  public static final int TRANSPARENT = -2;

  public static final int OPAQUE = -1;

  public static final int RGBA_8888 = 1;

  public static final int RGBX_8888 = 2;

  public static final int RGB_888 = 3;

  public static final int RGB_565 = 4;

  public static final int RGBA_5551 = 6;

  public static final int RGBA_4444 = 7;

  public static final int A_8 = 8;

  public static final int L_8 = 9;

  public static final int LA_88 = 10;

  public static final int RGB_332 = 11;

  public static final int YCbCr_422_SP = 16;

  public static final int YCbCr_420_SP = 17;

  public static final int YCbCr_422_I = 20;

  public static final int JPEG = 256;

  public int bytesPerPixel;

  public int bitsPerPixel;

  // Constructors

  public PixelFormat(){
  }
  // Methods

  public static boolean formatHasAlpha(int arg1){
    return false;
  }
  public static void getPixelFormatInfo(int arg1, PixelFormat arg2){
  }
}
