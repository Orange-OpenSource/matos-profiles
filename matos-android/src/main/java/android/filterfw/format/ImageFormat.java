package android.filterfw.format;

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

  public static final java.lang.String COLORSPACE_KEY = "colorspace";

  public static final int COLORSPACE_GRAY = 1;

  public static final int COLORSPACE_RGB = 2;

  public static final int COLORSPACE_RGBA = 3;

  public static final int COLORSPACE_YUV = 4;

  // Constructors

  public ImageFormat(){
  }
  // Methods

  public static android.filterfw.core.MutableFrameFormat create(int arg1, int arg2, int arg3, int arg4, int arg5){
    return (android.filterfw.core.MutableFrameFormat) null;
  }
  public static android.filterfw.core.MutableFrameFormat create(int arg1, int arg2, int arg3, int arg4){
    return (android.filterfw.core.MutableFrameFormat) null;
  }
  public static android.filterfw.core.MutableFrameFormat create(int arg1, int arg2){
    return (android.filterfw.core.MutableFrameFormat) null;
  }
  public static android.filterfw.core.MutableFrameFormat create(int arg1){
    return (android.filterfw.core.MutableFrameFormat) null;
  }
  public static int bytesPerSampleForColorspace(int arg1){
    return 0;
  }
}
