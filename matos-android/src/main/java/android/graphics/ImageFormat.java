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


public class ImageFormat
{
  // Fields

  public static final int UNKNOWN = 0;

  public static final int RGB_565 = 4;

  public static final int YV12 = 842094169;

  public static final int NV16 = 16;

  public static final int NV21 = 17;

  public static final int YUY2 = 20;

  public static final int JPEG = 256;

  public static final int BAYER_RGGB = 512;

  // Constructors

  public ImageFormat(){
  }
  // Methods

  public static int getBitsPerPixel(int arg1){
    return 0;
  }
}
