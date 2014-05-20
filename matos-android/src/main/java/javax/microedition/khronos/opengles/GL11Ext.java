package javax.microedition.khronos.opengles;

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


public interface GL11Ext
  extends GL
{
  // Fields

  public static final int GL_MATRIX_INDEX_ARRAY_BUFFER_BINDING_OES = 35742;

  public static final int GL_MATRIX_INDEX_ARRAY_OES = 34884;

  public static final int GL_MATRIX_INDEX_ARRAY_POINTER_OES = 34889;

  public static final int GL_MATRIX_INDEX_ARRAY_SIZE_OES = 34886;

  public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_OES = 34888;

  public static final int GL_MATRIX_INDEX_ARRAY_TYPE_OES = 34887;

  public static final int GL_MATRIX_PALETTE_OES = 34880;

  public static final int GL_MAX_PALETTE_MATRICES_OES = 34882;

  public static final int GL_MAX_VERTEX_UNITS_OES = 34468;

  public static final int GL_TEXTURE_CROP_RECT_OES = 35741;

  public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING_OES = 34974;

  public static final int GL_WEIGHT_ARRAY_OES = 34477;

  public static final int GL_WEIGHT_ARRAY_POINTER_OES = 34476;

  public static final int GL_WEIGHT_ARRAY_SIZE_OES = 34475;

  public static final int GL_WEIGHT_ARRAY_STRIDE_OES = 34474;

  public static final int GL_WEIGHT_ARRAY_TYPE_OES = 34473;

  // Methods

  public void glEnable(int arg1);
  public void glEnableClientState(int arg1);
  public void glTexParameterfv(int arg1, int arg2, float [] arg3, int arg4);
  public void glDrawTexfOES(float arg1, float arg2, float arg3, float arg4, float arg5);
  public void glDrawTexfvOES(float [] arg1, int arg2);
  public void glDrawTexfvOES(java.nio.FloatBuffer arg1);
  public void glDrawTexiOES(int arg1, int arg2, int arg3, int arg4, int arg5);
  public void glDrawTexivOES(int [] arg1, int arg2);
  public void glDrawTexivOES(java.nio.IntBuffer arg1);
  public void glDrawTexsOES(short arg1, short arg2, short arg3, short arg4, short arg5);
  public void glDrawTexsvOES(short [] arg1, int arg2);
  public void glDrawTexsvOES(java.nio.ShortBuffer arg1);
  public void glDrawTexxOES(int arg1, int arg2, int arg3, int arg4, int arg5);
  public void glDrawTexxvOES(int [] arg1, int arg2);
  public void glDrawTexxvOES(java.nio.IntBuffer arg1);
  public void glCurrentPaletteMatrixOES(int arg1);
  public void glLoadPaletteFromModelViewMatrixOES();
  public void glMatrixIndexPointerOES(int arg1, int arg2, int arg3, java.nio.Buffer arg4);
  public void glMatrixIndexPointerOES(int arg1, int arg2, int arg3, int arg4);
  public void glWeightPointerOES(int arg1, int arg2, int arg3, java.nio.Buffer arg4);
  public void glWeightPointerOES(int arg1, int arg2, int arg3, int arg4);
}
