package android.opengl;

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
public class GLES11Ext
{
  // Fields

  public static final int GL_BLEND_EQUATION_RGB_OES = 32777;

  public static final int GL_BLEND_EQUATION_ALPHA_OES = 34877;

  public static final int GL_BLEND_DST_RGB_OES = 32968;

  public static final int GL_BLEND_SRC_RGB_OES = 32969;

  public static final int GL_BLEND_DST_ALPHA_OES = 32970;

  public static final int GL_BLEND_SRC_ALPHA_OES = 32971;

  public static final int GL_BLEND_EQUATION_OES = 32777;

  public static final int GL_FUNC_ADD_OES = 32774;

  public static final int GL_FUNC_SUBTRACT_OES = 32778;

  public static final int GL_FUNC_REVERSE_SUBTRACT_OES = 32779;

  public static final int GL_ETC1_RGB8_OES = 36196;

  public static final int GL_DEPTH_COMPONENT24_OES = 33190;

  public static final int GL_DEPTH_COMPONENT32_OES = 33191;

  public static final int GL_TEXTURE_CROP_RECT_OES = 35741;

  public static final int GL_FIXED_OES = 5132;

  public static final int GL_NONE_OES = 0;

  public static final int GL_FRAMEBUFFER_OES = 36160;

  public static final int GL_RENDERBUFFER_OES = 36161;

  public static final int GL_RGBA4_OES = 32854;

  public static final int GL_RGB5_A1_OES = 32855;

  public static final int GL_RGB565_OES = 36194;

  public static final int GL_DEPTH_COMPONENT16_OES = 33189;

  public static final int GL_RENDERBUFFER_WIDTH_OES = 36162;

  public static final int GL_RENDERBUFFER_HEIGHT_OES = 36163;

  public static final int GL_RENDERBUFFER_INTERNAL_FORMAT_OES = 36164;

  public static final int GL_RENDERBUFFER_RED_SIZE_OES = 36176;

  public static final int GL_RENDERBUFFER_GREEN_SIZE_OES = 36177;

  public static final int GL_RENDERBUFFER_BLUE_SIZE_OES = 36178;

  public static final int GL_RENDERBUFFER_ALPHA_SIZE_OES = 36179;

  public static final int GL_RENDERBUFFER_DEPTH_SIZE_OES = 36180;

  public static final int GL_RENDERBUFFER_STENCIL_SIZE_OES = 36181;

  public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_OES = 36048;

  public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_OES = 36049;

  public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_OES = 36050;

  public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_OES = 36051;

  public static final int GL_COLOR_ATTACHMENT0_OES = 36064;

  public static final int GL_DEPTH_ATTACHMENT_OES = 36096;

  public static final int GL_STENCIL_ATTACHMENT_OES = 36128;

  public static final int GL_FRAMEBUFFER_COMPLETE_OES = 36053;

  public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_OES = 36054;

  public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_OES = 36055;

  public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_OES = 36057;

  public static final int GL_FRAMEBUFFER_INCOMPLETE_FORMATS_OES = 36058;

  public static final int GL_FRAMEBUFFER_UNSUPPORTED_OES = 36061;

  public static final int GL_FRAMEBUFFER_BINDING_OES = 36006;

  public static final int GL_RENDERBUFFER_BINDING_OES = 36007;

  public static final int GL_MAX_RENDERBUFFER_SIZE_OES = 34024;

  public static final int GL_INVALID_FRAMEBUFFER_OPERATION_OES = 1286;

  public static final int GL_WRITE_ONLY_OES = 35001;

  public static final int GL_BUFFER_ACCESS_OES = 35003;

  public static final int GL_BUFFER_MAPPED_OES = 35004;

  public static final int GL_BUFFER_MAP_POINTER_OES = 35005;

  public static final int GL_MODELVIEW_MATRIX_FLOAT_AS_INT_BITS_OES = 35213;

  public static final int GL_PROJECTION_MATRIX_FLOAT_AS_INT_BITS_OES = 35214;

  public static final int GL_TEXTURE_MATRIX_FLOAT_AS_INT_BITS_OES = 35215;

  public static final int GL_MAX_VERTEX_UNITS_OES = 34468;

  public static final int GL_MAX_PALETTE_MATRICES_OES = 34882;

  public static final int GL_MATRIX_PALETTE_OES = 34880;

  public static final int GL_MATRIX_INDEX_ARRAY_OES = 34884;

  public static final int GL_WEIGHT_ARRAY_OES = 34477;

  public static final int GL_CURRENT_PALETTE_MATRIX_OES = 34883;

  public static final int GL_MATRIX_INDEX_ARRAY_SIZE_OES = 34886;

  public static final int GL_MATRIX_INDEX_ARRAY_TYPE_OES = 34887;

  public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_OES = 34888;

  public static final int GL_MATRIX_INDEX_ARRAY_POINTER_OES = 34889;

  public static final int GL_MATRIX_INDEX_ARRAY_BUFFER_BINDING_OES = 35742;

  public static final int GL_WEIGHT_ARRAY_SIZE_OES = 34475;

  public static final int GL_WEIGHT_ARRAY_TYPE_OES = 34473;

  public static final int GL_WEIGHT_ARRAY_STRIDE_OES = 34474;

  public static final int GL_WEIGHT_ARRAY_POINTER_OES = 34476;

  public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING_OES = 34974;

  public static final int GL_DEPTH_STENCIL_OES = 34041;

  public static final int GL_UNSIGNED_INT_24_8_OES = 34042;

  public static final int GL_DEPTH24_STENCIL8_OES = 35056;

  public static final int GL_RGB8_OES = 32849;

  public static final int GL_RGBA8_OES = 32856;

  public static final int GL_STENCIL_INDEX1_OES = 36166;

  public static final int GL_STENCIL_INDEX4_OES = 36167;

  public static final int GL_STENCIL_INDEX8_OES = 36168;

  public static final int GL_INCR_WRAP_OES = 34055;

  public static final int GL_DECR_WRAP_OES = 34056;

  public static final int GL_NORMAL_MAP_OES = 34065;

  public static final int GL_REFLECTION_MAP_OES = 34066;

  public static final int GL_TEXTURE_CUBE_MAP_OES = 34067;

  public static final int GL_TEXTURE_BINDING_CUBE_MAP_OES = 34068;

  public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X_OES = 34069;

  public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X_OES = 34070;

  public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y_OES = 34071;

  public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_OES = 34072;

  public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z_OES = 34073;

  public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_OES = 34074;

  public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE_OES = 34076;

  public static final int GL_TEXTURE_GEN_MODE_OES = 9472;

  public static final int GL_TEXTURE_GEN_STR_OES = 36192;

  public static final int GL_MIRRORED_REPEAT_OES = 33648;

  public static final int GL_3DC_X_AMD = 34809;

  public static final int GL_3DC_XY_AMD = 34810;

  public static final int GL_ATC_RGB_AMD = 35986;

  public static final int GL_ATC_RGBA_EXPLICIT_ALPHA_AMD = 35987;

  public static final int GL_ATC_RGBA_INTERPOLATED_ALPHA_AMD = 34798;

  public static final int GL_TEXTURE_MAX_ANISOTROPY_EXT = 34046;

  public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = 34047;

  public static final int GL_BGRA = 32993;

  // Constructors

  public GLES11Ext(){
  }
  // Methods

  public static void glDrawTexfOES(float arg1, float arg2, float arg3, float arg4, float arg5){
  }
  public static void glDrawTexfvOES(float [] arg1, int arg2){
  }
  public static void glDrawTexfvOES(java.nio.FloatBuffer arg1){
  }
  public static void glDrawTexiOES(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public static void glDrawTexivOES(int [] arg1, int arg2){
  }
  public static void glDrawTexivOES(java.nio.IntBuffer arg1){
  }
  public static void glDrawTexsOES(short arg1, short arg2, short arg3, short arg4, short arg5){
  }
  public static void glDrawTexsvOES(short [] arg1, int arg2){
  }
  public static void glDrawTexsvOES(java.nio.ShortBuffer arg1){
  }
  public static void glDrawTexxOES(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public static void glDrawTexxvOES(int [] arg1, int arg2){
  }
  public static void glDrawTexxvOES(java.nio.IntBuffer arg1){
  }
  public static void glCurrentPaletteMatrixOES(int arg1){
  }
  public static void glLoadPaletteFromModelViewMatrixOES(){
  }
  public static void glMatrixIndexPointerOES(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public static void glWeightPointerOES(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public static void glBindFramebufferOES(int arg1, int arg2){
  }
  public static void glBindRenderbufferOES(int arg1, int arg2){
  }
  public static int glCheckFramebufferStatusOES(int arg1){
    return 0;
  }
  public static void glDeleteFramebuffersOES(int arg1, int [] arg2, int arg3){
  }
  public static void glDeleteFramebuffersOES(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glDeleteRenderbuffersOES(int arg1, int [] arg2, int arg3){
  }
  public static void glDeleteRenderbuffersOES(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glFramebufferRenderbufferOES(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glFramebufferTexture2DOES(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public static void glGenerateMipmapOES(int arg1){
  }
  public static void glGenFramebuffersOES(int arg1, int [] arg2, int arg3){
  }
  public static void glGenFramebuffersOES(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glGenRenderbuffersOES(int arg1, int [] arg2, int arg3){
  }
  public static void glGenRenderbuffersOES(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glGetFramebufferAttachmentParameterivOES(int arg1, int arg2, int arg3, int [] arg4, int arg5){
  }
  public static void glGetFramebufferAttachmentParameterivOES(int arg1, int arg2, int arg3, java.nio.IntBuffer arg4){
  }
  public static void glGetRenderbufferParameterivOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetRenderbufferParameterivOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static boolean glIsFramebufferOES(int arg1){
    return false;
  }
  public static boolean glIsRenderbufferOES(int arg1){
    return false;
  }
  public static void glRenderbufferStorageOES(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glBlendEquationSeparateOES(int arg1, int arg2){
  }
  public static void glBlendFuncSeparateOES(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glBlendEquationOES(int arg1){
  }
  public static void glEGLImageTargetTexture2DOES(int arg1, java.nio.Buffer arg2){
  }
  public static void glEGLImageTargetRenderbufferStorageOES(int arg1, java.nio.Buffer arg2){
  }
  public static void glAlphaFuncxOES(int arg1, int arg2){
  }
  public static void glClearColorxOES(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glClearDepthxOES(int arg1){
  }
  public static void glClipPlanexOES(int arg1, int [] arg2, int arg3){
  }
  public static void glClipPlanexOES(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glColor4xOES(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glDepthRangexOES(int arg1, int arg2){
  }
  public static void glFogxOES(int arg1, int arg2){
  }
  public static void glFogxvOES(int arg1, int [] arg2, int arg3){
  }
  public static void glFogxvOES(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glFrustumxOES(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public static void glGetClipPlanexOES(int arg1, int [] arg2, int arg3){
  }
  public static void glGetClipPlanexOES(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glGetFixedvOES(int arg1, int [] arg2, int arg3){
  }
  public static void glGetFixedvOES(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glGetLightxvOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetLightxvOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glGetMaterialxvOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetMaterialxvOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glGetTexEnvxvOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetTexEnvxvOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glGetTexParameterxvOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetTexParameterxvOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glLightModelxOES(int arg1, int arg2){
  }
  public static void glLightModelxvOES(int arg1, int [] arg2, int arg3){
  }
  public static void glLightModelxvOES(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glLightxOES(int arg1, int arg2, int arg3){
  }
  public static void glLightxvOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glLightxvOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glLineWidthxOES(int arg1){
  }
  public static void glLoadMatrixxOES(int [] arg1, int arg2){
  }
  public static void glLoadMatrixxOES(java.nio.IntBuffer arg1){
  }
  public static void glMaterialxOES(int arg1, int arg2, int arg3){
  }
  public static void glMaterialxvOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glMaterialxvOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glMultMatrixxOES(int [] arg1, int arg2){
  }
  public static void glMultMatrixxOES(java.nio.IntBuffer arg1){
  }
  public static void glMultiTexCoord4xOES(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public static void glNormal3xOES(int arg1, int arg2, int arg3){
  }
  public static void glOrthoxOES(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public static void glPointParameterxOES(int arg1, int arg2){
  }
  public static void glPointParameterxvOES(int arg1, int [] arg2, int arg3){
  }
  public static void glPointParameterxvOES(int arg1, java.nio.IntBuffer arg2){
  }
  public static void glPointSizexOES(int arg1){
  }
  public static void glPolygonOffsetxOES(int arg1, int arg2){
  }
  public static void glRotatexOES(int arg1, int arg2, int arg3, int arg4){
  }
  public static void glSampleCoveragexOES(int arg1, boolean arg2){
  }
  public static void glScalexOES(int arg1, int arg2, int arg3){
  }
  public static void glTexEnvxOES(int arg1, int arg2, int arg3){
  }
  public static void glTexEnvxvOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glTexEnvxvOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glTexParameterxOES(int arg1, int arg2, int arg3){
  }
  public static void glTexParameterxvOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glTexParameterxvOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glTranslatexOES(int arg1, int arg2, int arg3){
  }
  public static void glDepthRangefOES(float arg1, float arg2){
  }
  public static void glFrustumfOES(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6){
  }
  public static void glOrthofOES(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6){
  }
  public static void glClipPlanefOES(int arg1, float [] arg2, int arg3){
  }
  public static void glClipPlanefOES(int arg1, java.nio.FloatBuffer arg2){
  }
  public static void glGetClipPlanefOES(int arg1, float [] arg2, int arg3){
  }
  public static void glGetClipPlanefOES(int arg1, java.nio.FloatBuffer arg2){
  }
  public static void glClearDepthfOES(float arg1){
  }
  public static void glTexGenfOES(int arg1, int arg2, float arg3){
  }
  public static void glTexGenfvOES(int arg1, int arg2, float [] arg3, int arg4){
  }
  public static void glTexGenfvOES(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public static void glTexGeniOES(int arg1, int arg2, int arg3){
  }
  public static void glTexGenivOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glTexGenivOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glTexGenxOES(int arg1, int arg2, int arg3){
  }
  public static void glTexGenxvOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glTexGenxvOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glGetTexGenfvOES(int arg1, int arg2, float [] arg3, int arg4){
  }
  public static void glGetTexGenfvOES(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public static void glGetTexGenivOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetTexGenivOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public static void glGetTexGenxvOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public static void glGetTexGenxvOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
}
