package android.filterfw.core;

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


public class ShaderProgram
  extends Program{
  // Constructors

  private ShaderProgram(){
    super();
  }
  private ShaderProgram(NativeAllocatorTag arg1){
    super();
  }
  public ShaderProgram(FilterContext arg1, java.lang.String arg2){
    super();
  }
  public ShaderProgram(FilterContext arg1, java.lang.String arg2, java.lang.String arg3){
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void process(Frame [] arg1, Frame arg2){
  }
  public GLEnvironment getGLEnvironment(){
    return (GLEnvironment) null;
  }
  public void setBlendFunc(int arg1, int arg2){
  }
  public void setHostValue(java.lang.String arg1, java.lang.Object arg2){
  }
  public java.lang.Object getHostValue(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public static ShaderProgram createIdentity(FilterContext arg1){
    return (ShaderProgram) null;
  }
  public void setSourceRect(float arg1, float arg2, float arg3, float arg4){
  }
  public void setClearColor(float arg1, float arg2, float arg3){
  }
  public void setClearsOutput(boolean arg1){
  }
  public void setTargetRect(float arg1, float arg2, float arg3, float arg4){
  }
  public void setSourceRegion(android.filterfw.geometry.Quad arg1){
  }
  public boolean setSourceRegion(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8){
    return false;
  }
  public void setTargetRegion(android.filterfw.geometry.Quad arg1){
  }
  public void setMaximumTileSize(int arg1){
  }
  public void setAttributeValues(java.lang.String arg1, float [] arg2, int arg3){
  }
  public void setAttributeValues(java.lang.String arg1, VertexFrame arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7){
  }
  public void setVertexCount(int arg1){
  }
  public void beginDrawing(){
  }
  public void setBlendEnabled(boolean arg1){
  }
  public void setDrawMode(int arg1){
  }
}
