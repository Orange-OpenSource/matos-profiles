package com.google.android.gles_jni;

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


public class GLImpl
  implements javax.microedition.khronos.opengles.GL11Ext, javax.microedition.khronos.opengles.GL11ExtensionPack, javax.microedition.khronos.opengles.GL10Ext, javax.microedition.khronos.opengles.GL10, javax.microedition.khronos.opengles.GL11
{
  // Constructors

  public GLImpl(){
  }
  // Methods

  public void glActiveTexture(int arg1){
  }
  public void glAlphaFunc(int arg1, float arg2){
  }
  public void glAlphaFuncx(int arg1, int arg2){
  }
  public void glBindTexture(int arg1, int arg2){
  }
  public void glBlendFunc(int arg1, int arg2){
  }
  public void glClear(int arg1){
  }
  public void glClearColor(float arg1, float arg2, float arg3, float arg4){
  }
  public void glClearColorx(int arg1, int arg2, int arg3, int arg4){
  }
  public void glClearDepthf(float arg1){
  }
  public void glClearDepthx(int arg1){
  }
  public void glClearStencil(int arg1){
  }
  public void glClientActiveTexture(int arg1){
  }
  public void glColor4f(float arg1, float arg2, float arg3, float arg4){
  }
  public void glColor4x(int arg1, int arg2, int arg3, int arg4){
  }
  public void glColorMask(boolean arg1, boolean arg2, boolean arg3, boolean arg4){
  }
  public void glColorPointer(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public void glColorPointer(int arg1, int arg2, int arg3, int arg4){
  }
  public void glCompressedTexImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, java.nio.Buffer arg8){
  }
  public void glCompressedTexSubImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, java.nio.Buffer arg9){
  }
  public void glCopyTexImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8){
  }
  public void glCopyTexSubImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8){
  }
  public void glCullFace(int arg1){
  }
  public void glDeleteTextures(int arg1, int [] arg2, int arg3){
  }
  public void glDeleteTextures(int arg1, java.nio.IntBuffer arg2){
  }
  public void glDepthFunc(int arg1){
  }
  public void glDepthMask(boolean arg1){
  }
  public void glDepthRangef(float arg1, float arg2){
  }
  public void glDepthRangex(int arg1, int arg2){
  }
  public void glDisable(int arg1){
  }
  public void glDisableClientState(int arg1){
  }
  public void glDrawArrays(int arg1, int arg2, int arg3){
  }
  public void glDrawElements(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public void glDrawElements(int arg1, int arg2, int arg3, int arg4){
  }
  public void glEnable(int arg1){
  }
  public void glEnableClientState(int arg1){
  }
  public void glFinish(){
  }
  public void glFlush(){
  }
  public void glFogf(int arg1, float arg2){
  }
  public void glFogfv(int arg1, float [] arg2, int arg3){
  }
  public void glFogfv(int arg1, java.nio.FloatBuffer arg2){
  }
  public void glFogx(int arg1, int arg2){
  }
  public void glFogxv(int arg1, int [] arg2, int arg3){
  }
  public void glFogxv(int arg1, java.nio.IntBuffer arg2){
  }
  public void glFrontFace(int arg1){
  }
  public void glFrustumf(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6){
  }
  public void glFrustumx(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public void glGenTextures(int arg1, int [] arg2, int arg3){
  }
  public void glGenTextures(int arg1, java.nio.IntBuffer arg2){
  }
  public int glGetError(){
    return 0;
  }
  public void glGetIntegerv(int arg1, int [] arg2, int arg3){
  }
  public void glGetIntegerv(int arg1, java.nio.IntBuffer arg2){
  }
  public java.lang.String glGetString(int arg1){
    return (java.lang.String) null;
  }
  public void glHint(int arg1, int arg2){
  }
  public void glLightModelf(int arg1, float arg2){
  }
  public void glLightModelfv(int arg1, float [] arg2, int arg3){
  }
  public void glLightModelfv(int arg1, java.nio.FloatBuffer arg2){
  }
  public void glLightModelx(int arg1, int arg2){
  }
  public void glLightModelxv(int arg1, int [] arg2, int arg3){
  }
  public void glLightModelxv(int arg1, java.nio.IntBuffer arg2){
  }
  public void glLightf(int arg1, int arg2, float arg3){
  }
  public void glLightfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public void glLightfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public void glLightx(int arg1, int arg2, int arg3){
  }
  public void glLightxv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glLightxv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glLineWidth(float arg1){
  }
  public void glLineWidthx(int arg1){
  }
  public void glLoadIdentity(){
  }
  public void glLoadMatrixf(float [] arg1, int arg2){
  }
  public void glLoadMatrixf(java.nio.FloatBuffer arg1){
  }
  public void glLoadMatrixx(int [] arg1, int arg2){
  }
  public void glLoadMatrixx(java.nio.IntBuffer arg1){
  }
  public void glLogicOp(int arg1){
  }
  public void glMaterialf(int arg1, int arg2, float arg3){
  }
  public void glMaterialfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public void glMaterialfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public void glMaterialx(int arg1, int arg2, int arg3){
  }
  public void glMaterialxv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glMaterialxv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glMatrixMode(int arg1){
  }
  public void glMultMatrixf(float [] arg1, int arg2){
  }
  public void glMultMatrixf(java.nio.FloatBuffer arg1){
  }
  public void glMultMatrixx(int [] arg1, int arg2){
  }
  public void glMultMatrixx(java.nio.IntBuffer arg1){
  }
  public void glMultiTexCoord4f(int arg1, float arg2, float arg3, float arg4, float arg5){
  }
  public void glMultiTexCoord4x(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void glNormal3f(float arg1, float arg2, float arg3){
  }
  public void glNormal3x(int arg1, int arg2, int arg3){
  }
  public void glNormalPointer(int arg1, int arg2, java.nio.Buffer arg3){
  }
  public void glNormalPointer(int arg1, int arg2, int arg3){
  }
  public void glOrthof(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6){
  }
  public void glOrthox(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public void glPixelStorei(int arg1, int arg2){
  }
  public void glPointSize(float arg1){
  }
  public void glPointSizex(int arg1){
  }
  public void glPolygonOffset(float arg1, float arg2){
  }
  public void glPolygonOffsetx(int arg1, int arg2){
  }
  public void glPopMatrix(){
  }
  public void glPushMatrix(){
  }
  public void glReadPixels(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.nio.Buffer arg7){
  }
  public void glRotatef(float arg1, float arg2, float arg3, float arg4){
  }
  public void glRotatex(int arg1, int arg2, int arg3, int arg4){
  }
  public void glSampleCoverage(float arg1, boolean arg2){
  }
  public void glSampleCoveragex(int arg1, boolean arg2){
  }
  public void glScalef(float arg1, float arg2, float arg3){
  }
  public void glScalex(int arg1, int arg2, int arg3){
  }
  public void glScissor(int arg1, int arg2, int arg3, int arg4){
  }
  public void glShadeModel(int arg1){
  }
  public void glStencilFunc(int arg1, int arg2, int arg3){
  }
  public void glStencilMask(int arg1){
  }
  public void glStencilOp(int arg1, int arg2, int arg3){
  }
  public void glTexCoordPointer(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public void glTexCoordPointer(int arg1, int arg2, int arg3, int arg4){
  }
  public void glTexEnvf(int arg1, int arg2, float arg3){
  }
  public void glTexEnvfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public void glTexEnvfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public void glTexEnvx(int arg1, int arg2, int arg3){
  }
  public void glTexEnvxv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glTexEnvxv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glTexImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, java.nio.Buffer arg9){
  }
  public void glTexParameterf(int arg1, int arg2, float arg3){
  }
  public void glTexParameterx(int arg1, int arg2, int arg3){
  }
  public void glTexSubImage2D(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, java.nio.Buffer arg9){
  }
  public void glTranslatef(float arg1, float arg2, float arg3){
  }
  public void glTranslatex(int arg1, int arg2, int arg3){
  }
  public void glVertexPointer(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public void glVertexPointer(int arg1, int arg2, int arg3, int arg4){
  }
  public void glViewport(int arg1, int arg2, int arg3, int arg4){
  }
  public void glGetPointerv(int arg1, java.nio.Buffer [] arg2){
  }
  public void glBindBuffer(int arg1, int arg2){
  }
  public void glBufferData(int arg1, int arg2, java.nio.Buffer arg3, int arg4){
  }
  public void glBufferSubData(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public void glClipPlanef(int arg1, float [] arg2, int arg3){
  }
  public void glClipPlanef(int arg1, java.nio.FloatBuffer arg2){
  }
  public void glClipPlanex(int arg1, int [] arg2, int arg3){
  }
  public void glClipPlanex(int arg1, java.nio.IntBuffer arg2){
  }
  public void glColor4ub(byte arg1, byte arg2, byte arg3, byte arg4){
  }
  public void glDeleteBuffers(int arg1, int [] arg2, int arg3){
  }
  public void glDeleteBuffers(int arg1, java.nio.IntBuffer arg2){
  }
  public void glGenBuffers(int arg1, int [] arg2, int arg3){
  }
  public void glGenBuffers(int arg1, java.nio.IntBuffer arg2){
  }
  public void glGetBooleanv(int arg1, boolean [] arg2, int arg3){
  }
  public void glGetBooleanv(int arg1, java.nio.IntBuffer arg2){
  }
  public void glGetBufferParameteriv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glGetBufferParameteriv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glGetClipPlanef(int arg1, float [] arg2, int arg3){
  }
  public void glGetClipPlanef(int arg1, java.nio.FloatBuffer arg2){
  }
  public void glGetClipPlanex(int arg1, int [] arg2, int arg3){
  }
  public void glGetClipPlanex(int arg1, java.nio.IntBuffer arg2){
  }
  public void glGetFixedv(int arg1, int [] arg2, int arg3){
  }
  public void glGetFixedv(int arg1, java.nio.IntBuffer arg2){
  }
  public void glGetFloatv(int arg1, float [] arg2, int arg3){
  }
  public void glGetFloatv(int arg1, java.nio.FloatBuffer arg2){
  }
  public void glGetLightfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public void glGetLightfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public void glGetLightxv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glGetLightxv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glGetMaterialfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public void glGetMaterialfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public void glGetMaterialxv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glGetMaterialxv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glGetTexEnviv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glGetTexEnviv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glGetTexEnvxv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glGetTexEnvxv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glGetTexParameterfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public void glGetTexParameterfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public void glGetTexParameteriv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glGetTexParameteriv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glGetTexParameterxv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glGetTexParameterxv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public boolean glIsBuffer(int arg1){
    return false;
  }
  public boolean glIsEnabled(int arg1){
    return false;
  }
  public boolean glIsTexture(int arg1){
    return false;
  }
  public void glPointParameterf(int arg1, float arg2){
  }
  public void glPointParameterfv(int arg1, float [] arg2, int arg3){
  }
  public void glPointParameterfv(int arg1, java.nio.FloatBuffer arg2){
  }
  public void glPointParameterx(int arg1, int arg2){
  }
  public void glPointParameterxv(int arg1, int [] arg2, int arg3){
  }
  public void glPointParameterxv(int arg1, java.nio.IntBuffer arg2){
  }
  public void glPointSizePointerOES(int arg1, int arg2, java.nio.Buffer arg3){
  }
  public void glTexEnvi(int arg1, int arg2, int arg3){
  }
  public void glTexEnviv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glTexEnviv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glTexParameterfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public void glTexParameterfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public void glTexParameteri(int arg1, int arg2, int arg3){
  }
  public void glTexParameteriv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glTexParameteriv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glTexParameterxv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glTexParameterxv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glDrawTexfOES(float arg1, float arg2, float arg3, float arg4, float arg5){
  }
  public void glDrawTexfvOES(float [] arg1, int arg2){
  }
  public void glDrawTexfvOES(java.nio.FloatBuffer arg1){
  }
  public void glDrawTexiOES(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void glDrawTexivOES(int [] arg1, int arg2){
  }
  public void glDrawTexivOES(java.nio.IntBuffer arg1){
  }
  public void glDrawTexsOES(short arg1, short arg2, short arg3, short arg4, short arg5){
  }
  public void glDrawTexsvOES(short [] arg1, int arg2){
  }
  public void glDrawTexsvOES(java.nio.ShortBuffer arg1){
  }
  public void glDrawTexxOES(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void glDrawTexxvOES(int [] arg1, int arg2){
  }
  public void glDrawTexxvOES(java.nio.IntBuffer arg1){
  }
  public void glCurrentPaletteMatrixOES(int arg1){
  }
  public void glLoadPaletteFromModelViewMatrixOES(){
  }
  public void glMatrixIndexPointerOES(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public void glMatrixIndexPointerOES(int arg1, int arg2, int arg3, int arg4){
  }
  public void glWeightPointerOES(int arg1, int arg2, int arg3, java.nio.Buffer arg4){
  }
  public void glWeightPointerOES(int arg1, int arg2, int arg3, int arg4){
  }
  public int glQueryMatrixxOES(int [] arg1, int arg2, int [] arg3, int arg4){
    return 0;
  }
  public int glQueryMatrixxOES(java.nio.IntBuffer arg1, java.nio.IntBuffer arg2){
    return 0;
  }
  public void glBindFramebufferOES(int arg1, int arg2){
  }
  public void glBindRenderbufferOES(int arg1, int arg2){
  }
  public void glBlendEquation(int arg1){
  }
  public void glBlendEquationSeparate(int arg1, int arg2){
  }
  public void glBlendFuncSeparate(int arg1, int arg2, int arg3, int arg4){
  }
  public int glCheckFramebufferStatusOES(int arg1){
    return 0;
  }
  public void glDeleteFramebuffersOES(int arg1, int [] arg2, int arg3){
  }
  public void glDeleteFramebuffersOES(int arg1, java.nio.IntBuffer arg2){
  }
  public void glDeleteRenderbuffersOES(int arg1, int [] arg2, int arg3){
  }
  public void glDeleteRenderbuffersOES(int arg1, java.nio.IntBuffer arg2){
  }
  public void glFramebufferRenderbufferOES(int arg1, int arg2, int arg3, int arg4){
  }
  public void glFramebufferTexture2DOES(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void glGenerateMipmapOES(int arg1){
  }
  public void glGenFramebuffersOES(int arg1, int [] arg2, int arg3){
  }
  public void glGenFramebuffersOES(int arg1, java.nio.IntBuffer arg2){
  }
  public void glGenRenderbuffersOES(int arg1, int [] arg2, int arg3){
  }
  public void glGenRenderbuffersOES(int arg1, java.nio.IntBuffer arg2){
  }
  public void glGetFramebufferAttachmentParameterivOES(int arg1, int arg2, int arg3, int [] arg4, int arg5){
  }
  public void glGetFramebufferAttachmentParameterivOES(int arg1, int arg2, int arg3, java.nio.IntBuffer arg4){
  }
  public void glGetRenderbufferParameterivOES(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glGetRenderbufferParameterivOES(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glGetTexGenfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public void glGetTexGenfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public void glGetTexGeniv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glGetTexGeniv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glGetTexGenxv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glGetTexGenxv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public boolean glIsFramebufferOES(int arg1){
    return false;
  }
  public boolean glIsRenderbufferOES(int arg1){
    return false;
  }
  public void glRenderbufferStorageOES(int arg1, int arg2, int arg3, int arg4){
  }
  public void glTexGenf(int arg1, int arg2, float arg3){
  }
  public void glTexGenfv(int arg1, int arg2, float [] arg3, int arg4){
  }
  public void glTexGenfv(int arg1, int arg2, java.nio.FloatBuffer arg3){
  }
  public void glTexGeni(int arg1, int arg2, int arg3){
  }
  public void glTexGeniv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glTexGeniv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public void glTexGenx(int arg1, int arg2, int arg3){
  }
  public void glTexGenxv(int arg1, int arg2, int [] arg3, int arg4){
  }
  public void glTexGenxv(int arg1, int arg2, java.nio.IntBuffer arg3){
  }
  public java.lang.String _glGetString(int arg1){
    return (java.lang.String) null;
  }
}
