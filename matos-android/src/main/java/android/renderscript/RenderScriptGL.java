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


public class RenderScriptGL
  extends RenderScript{
  // Classes

  public static class SurfaceConfig
  {
    // Constructors

    public SurfaceConfig(){
    }
    public SurfaceConfig(RenderScriptGL.SurfaceConfig arg1){
    }
    // Methods

    public void setAlpha(int arg1, int arg2){
    }
    public void setColor(int arg1, int arg2){
    }
    public void setDepth(int arg1, int arg2){
    }
    public void setSamples(int arg1, int arg2, float arg3){
    }
  }
  // Constructors

  public RenderScriptGL(android.content.Context arg1, RenderScriptGL.SurfaceConfig arg2){
    super((android.content.Context) null);
  }
  // Methods

  public void resume(){
  }
  public int getWidth(){
    return 0;
  }
  public int getHeight(){
    return 0;
  }
  public void pause(){
  }
  public void setSurface(android.view.SurfaceHolder arg1, int arg2, int arg3){
  }
  public void setSurfaceTexture(android.graphics.SurfaceTexture arg1, int arg2, int arg3){
  }
  public void bindRootScript(Script arg1){
  }
  public void bindProgramStore(ProgramStore arg1){
  }
  public void bindProgramFragment(ProgramFragment arg1){
  }
  public void bindProgramRaster(ProgramRaster arg1){
  }
  public void bindProgramVertex(ProgramVertex arg1){
  }
}
