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


public class RSTextureView
  extends android.view.TextureView  implements android.view.TextureView.SurfaceTextureListener
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public RSTextureView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public RSTextureView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  public void resume(){
  }
  public void pause(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture arg1, int arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture arg1, int arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture arg1){
  }
  public RenderScriptGL createRenderScriptGL(RenderScriptGL.SurfaceConfig arg1){
    return (RenderScriptGL) null;
  }
  public void destroyRenderScriptGL(){
  }
  public void setRenderScriptGL(RenderScriptGL arg1){
  }
  public RenderScriptGL getRenderScriptGL(){
    return (RenderScriptGL) null;
  }
}
