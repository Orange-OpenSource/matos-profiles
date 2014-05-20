package javax.microedition.khronos.egl;

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


public interface EGL10
  extends EGL
{
  // Fields

  public static final int EGL_SUCCESS = 12288;

  public static final int EGL_NOT_INITIALIZED = 12289;

  public static final int EGL_BAD_ACCESS = 12290;

  public static final int EGL_BAD_ALLOC = 12291;

  public static final int EGL_BAD_ATTRIBUTE = 12292;

  public static final int EGL_BAD_CONFIG = 12293;

  public static final int EGL_BAD_CONTEXT = 12294;

  public static final int EGL_BAD_CURRENT_SURFACE = 12295;

  public static final int EGL_BAD_DISPLAY = 12296;

  public static final int EGL_BAD_MATCH = 12297;

  public static final int EGL_BAD_NATIVE_PIXMAP = 12298;

  public static final int EGL_BAD_NATIVE_WINDOW = 12299;

  public static final int EGL_BAD_PARAMETER = 12300;

  public static final int EGL_BAD_SURFACE = 12301;

  public static final int EGL_BUFFER_SIZE = 12320;

  public static final int EGL_ALPHA_SIZE = 12321;

  public static final int EGL_BLUE_SIZE = 12322;

  public static final int EGL_GREEN_SIZE = 12323;

  public static final int EGL_RED_SIZE = 12324;

  public static final int EGL_DEPTH_SIZE = 12325;

  public static final int EGL_STENCIL_SIZE = 12326;

  public static final int EGL_CONFIG_CAVEAT = 12327;

  public static final int EGL_CONFIG_ID = 12328;

  public static final int EGL_LEVEL = 12329;

  public static final int EGL_MAX_PBUFFER_HEIGHT = 12330;

  public static final int EGL_MAX_PBUFFER_PIXELS = 12331;

  public static final int EGL_MAX_PBUFFER_WIDTH = 12332;

  public static final int EGL_NATIVE_RENDERABLE = 12333;

  public static final int EGL_NATIVE_VISUAL_ID = 12334;

  public static final int EGL_NATIVE_VISUAL_TYPE = 12335;

  public static final int EGL_SAMPLES = 12337;

  public static final int EGL_SAMPLE_BUFFERS = 12338;

  public static final int EGL_SURFACE_TYPE = 12339;

  public static final int EGL_TRANSPARENT_TYPE = 12340;

  public static final int EGL_TRANSPARENT_BLUE_VALUE = 12341;

  public static final int EGL_TRANSPARENT_GREEN_VALUE = 12342;

  public static final int EGL_TRANSPARENT_RED_VALUE = 12343;

  public static final int EGL_NONE = 12344;

  public static final int EGL_LUMINANCE_SIZE = 12349;

  public static final int EGL_ALPHA_MASK_SIZE = 12350;

  public static final int EGL_COLOR_BUFFER_TYPE = 12351;

  public static final int EGL_RENDERABLE_TYPE = 12352;

  public static final int EGL_SLOW_CONFIG = 12368;

  public static final int EGL_NON_CONFORMANT_CONFIG = 12369;

  public static final int EGL_TRANSPARENT_RGB = 12370;

  public static final int EGL_RGB_BUFFER = 12430;

  public static final int EGL_LUMINANCE_BUFFER = 12431;

  public static final int EGL_VENDOR = 12371;

  public static final int EGL_VERSION = 12372;

  public static final int EGL_EXTENSIONS = 12373;

  public static final int EGL_HEIGHT = 12374;

  public static final int EGL_WIDTH = 12375;

  public static final int EGL_LARGEST_PBUFFER = 12376;

  public static final int EGL_RENDER_BUFFER = 12422;

  public static final int EGL_COLORSPACE = 12423;

  public static final int EGL_ALPHA_FORMAT = 12424;

  public static final int EGL_HORIZONTAL_RESOLUTION = 12432;

  public static final int EGL_VERTICAL_RESOLUTION = 12433;

  public static final int EGL_PIXEL_ASPECT_RATIO = 12434;

  public static final int EGL_SINGLE_BUFFER = 12421;

  public static final int EGL_CORE_NATIVE_ENGINE = 12379;

  public static final int EGL_DRAW = 12377;

  public static final int EGL_READ = 12378;

  public static final int EGL_DONT_CARE = -1;

  public static final int EGL_PBUFFER_BIT = 1;

  public static final int EGL_PIXMAP_BIT = 2;

  public static final int EGL_WINDOW_BIT = 4;

  public static final java.lang.Object EGL_DEFAULT_DISPLAY = null;

  public static final EGLDisplay EGL_NO_DISPLAY = null;

  public static final EGLContext EGL_NO_CONTEXT = null;

  public static final EGLSurface EGL_NO_SURFACE = null;

  // Methods

  public EGLContext eglCreateContext(EGLDisplay arg1, EGLConfig arg2, EGLContext arg3, int [] arg4);
  public boolean eglDestroyContext(EGLDisplay arg1, EGLContext arg2);
  public int eglGetError();
  public boolean eglChooseConfig(EGLDisplay arg1, int [] arg2, EGLConfig [] arg3, int arg4, int [] arg5);
  public boolean eglCopyBuffers(EGLDisplay arg1, EGLSurface arg2, java.lang.Object arg3);
  public EGLSurface eglCreatePbufferSurface(EGLDisplay arg1, EGLConfig arg2, int [] arg3);
  public EGLSurface eglCreatePixmapSurface(EGLDisplay arg1, EGLConfig arg2, java.lang.Object arg3, int [] arg4);
  public EGLSurface eglCreateWindowSurface(EGLDisplay arg1, EGLConfig arg2, java.lang.Object arg3, int [] arg4);
  public boolean eglDestroySurface(EGLDisplay arg1, EGLSurface arg2);
  public boolean eglGetConfigAttrib(EGLDisplay arg1, EGLConfig arg2, int arg3, int [] arg4);
  public boolean eglGetConfigs(EGLDisplay arg1, EGLConfig [] arg2, int arg3, int [] arg4);
  public EGLContext eglGetCurrentContext();
  public EGLDisplay eglGetCurrentDisplay();
  public EGLSurface eglGetCurrentSurface(int arg1);
  public EGLDisplay eglGetDisplay(java.lang.Object arg1);
  public boolean eglInitialize(EGLDisplay arg1, int [] arg2);
  public boolean eglMakeCurrent(EGLDisplay arg1, EGLSurface arg2, EGLSurface arg3, EGLContext arg4);
  public boolean eglQueryContext(EGLDisplay arg1, EGLContext arg2, int arg3, int [] arg4);
  public java.lang.String eglQueryString(EGLDisplay arg1, int arg2);
  public boolean eglQuerySurface(EGLDisplay arg1, EGLSurface arg2, int arg3, int [] arg4);
  public boolean eglSwapBuffers(EGLDisplay arg1, EGLSurface arg2);
  public boolean eglTerminate(EGLDisplay arg1);
  public boolean eglWaitGL();
  public boolean eglWaitNative(int arg1, java.lang.Object arg2);
}
