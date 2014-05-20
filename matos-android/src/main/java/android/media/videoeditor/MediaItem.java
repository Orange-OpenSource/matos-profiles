package android.media.videoeditor;

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
public abstract class MediaItem
{
  // Classes

  public static interface GetThumbnailListCallback
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("GetThumbnailListCallback")
    public void onThumbnail(android.graphics.Bitmap arg1, int arg2);
  }
  // Fields

  public static final int END_OF_FILE = -1;

  public static final int RENDERING_MODE_BLACK_BORDER = 0;

  public static final int RENDERING_MODE_STRETCH = 1;

  public static final int RENDERING_MODE_CROPPING = 2;

  protected final java.lang.String mFilename = (java.lang.String) null;

  protected Transition mBeginTransition;

  protected Transition mEndTransition;

  protected java.lang.String mGeneratedImageClip;

  protected boolean mRegenerateClip;

  // Constructors

  protected MediaItem(VideoEditor arg1, java.lang.String arg2, java.lang.String arg3, int arg4) throws java.io.IOException{
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.String getId(){
    return (java.lang.String) null;
  }
  public abstract android.graphics.Bitmap getThumbnail(int arg1, int arg2, long arg3) throws java.io.IOException;
  public java.lang.String getFilename(){
    return (java.lang.String) null;
  }
  public abstract long getDuration();
  public abstract long getTimelineDuration();
  public abstract int getWidth();
  public abstract int getHeight();
  public abstract int getFileType();
  public java.util.List<Overlay> getAllOverlays(){
    return (java.util.List) null;
  }
  public java.util.List<Effect> getAllEffects(){
    return (java.util.List) null;
  }
  public void setRenderingMode(int arg1){
  }
  public int getRenderingMode(){
    return 0;
  }
  public Transition getBeginTransition(){
    return (Transition) null;
  }
  public Transition getEndTransition(){
    return (Transition) null;
  }
  public abstract int getAspectRatio();
  public void addEffect(Effect arg1){
  }
  public Effect removeEffect(java.lang.String arg1){
    return (Effect) null;
  }
  public Effect getEffect(java.lang.String arg1){
    return (Effect) null;
  }
  public void addOverlay(Overlay arg1) throws java.io.FileNotFoundException, java.io.IOException{
  }
  public Overlay removeOverlay(java.lang.String arg1){
    return (Overlay) null;
  }
  public Overlay getOverlay(java.lang.String arg1){
    return (Overlay) null;
  }
  public abstract void getThumbnailList(int arg1, int arg2, long arg3, long arg4, int arg5, int [] arg6, @com.francetelecom.rd.stubs.annotation.CallBackRegister("GetThumbnailListCallback") MediaItem.GetThumbnailListCallback arg7) throws java.io.IOException;
  public android.graphics.Bitmap [] getThumbnailList(int arg1, int arg2, long arg3, long arg4, int arg5) throws java.io.IOException{
    return (android.graphics.Bitmap []) null;
  }
  protected boolean isOverlapping(long arg1, long arg2, long arg3, long arg4){
    return false;
  }
  protected void adjustTransitions(){
  }
}
