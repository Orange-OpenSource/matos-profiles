package android.view;

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
public class TextureView
  extends View{
  // Classes

  public static interface SurfaceTextureListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("SurfaceTextureListener") 
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("SurfaceTextureListener") 
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture arg1, int arg2, int arg3);
	@com.francetelecom.rd.stubs.annotation.CallBack("SurfaceTextureListener") 
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture arg1, int arg2, int arg3);
	@com.francetelecom.rd.stubs.annotation.CallBack("SurfaceTextureListener") 
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture arg1);
  }
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TextureView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TextureView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TextureView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public boolean isOpaque(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDetachedFromWindow(){
  }
  public int getLayerType(){
    return 0;
  }
  public final void draw(android.graphics.Canvas arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onVisibilityChanged(View arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected final void onDraw(android.graphics.Canvas arg1){
  }
  public void setLayerType(int arg1, android.graphics.Paint arg2){
  }
  public void buildLayer(){
  }
  public boolean isAvailable(){
    return false;
  }
  public void setOpaque(boolean arg1){
  }
  public android.graphics.SurfaceTexture getSurfaceTexture(){
    return (android.graphics.SurfaceTexture) null;
  }
  public android.graphics.Canvas lockCanvas(){
    return (android.graphics.Canvas) null;
  }
  public android.graphics.Canvas lockCanvas(android.graphics.Rect arg1){
    return (android.graphics.Canvas) null;
  }
  public void unlockCanvasAndPost(android.graphics.Canvas arg1){
  }
  public void setTransform(android.graphics.Matrix arg1){
  }
  public android.graphics.Matrix getTransform(android.graphics.Matrix arg1){
    return (android.graphics.Matrix) null;
  }
  public android.graphics.Bitmap getBitmap(){
    return (android.graphics.Bitmap) null;
  }
  public android.graphics.Bitmap getBitmap(int arg1, int arg2){
    return (android.graphics.Bitmap) null;
  }
  public android.graphics.Bitmap getBitmap(android.graphics.Bitmap arg1){
    return (android.graphics.Bitmap) null;
  }
  public TextureView.SurfaceTextureListener getSurfaceTextureListener(){
    return (TextureView.SurfaceTextureListener) null;
  }
  public void setSurfaceTextureListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SurfaceTextureListener") TextureView.SurfaceTextureListener arg1){
  }
}

