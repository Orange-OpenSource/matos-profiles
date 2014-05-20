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
public interface VideoEditor
{
  // Classes

  public static interface PreviewProgressListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("PreviewProgressListener")
    public void onStart(VideoEditor arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("PreviewProgressListener")
    public void onStop(VideoEditor arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("PreviewProgressListener")
    public void onProgress(VideoEditor arg1, long arg2, VideoEditor.OverlayData arg3);
  }
  public static interface ExportProgressListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("ExportProgressListener")
    public void onProgress(VideoEditor arg1, java.lang.String arg2, int arg3);
  }
  public static interface MediaProcessingProgressListener
  {
    // Fields

    public static final int ACTION_ENCODE = 1;

    public static final int ACTION_DECODE = 2;

    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("MediaProcessingProgressListener")
    public void onProgress(java.lang.Object arg1, int arg2, int arg3);
  }
  public static final class OverlayData
  {
    // Constructors

    public OverlayData(){
    }
    // Methods

    public void release(){
    }
    public boolean needsRendering(){
      return false;
    }
    public void renderOverlay(android.graphics.Bitmap arg1){
    }
  }
  // Fields

  public static final java.lang.String THUMBNAIL_FILENAME = "thumbnail.jpg";

  public static final int DURATION_OF_STORYBOARD = -1;

  public static final long MAX_SUPPORTED_FILE_SIZE = 2147483648l;

  // Methods

  public void save() throws java.io.IOException;
  public java.lang.String getPath();
  public void release();
  public long getDuration();
  public MediaItem getMediaItem(java.lang.String arg1);
  public int getAspectRatio();
  public void startPreview(android.view.SurfaceHolder arg1, long arg2, long arg3, boolean arg4, int arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("PreviewProgressListener") VideoEditor.PreviewProgressListener arg6);
  public long stopPreview();
  public void generatePreview(@com.francetelecom.rd.stubs.annotation.CallBackRegister("MediaProcessingProgressListener") VideoEditor.MediaProcessingProgressListener arg1);
  public void export(java.lang.String arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ExportProgressListener") VideoEditor.ExportProgressListener arg4) throws java.io.IOException;
  public void export(java.lang.String arg1, int arg2, int arg3, int arg4, int arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ExportProgressListener") VideoEditor.ExportProgressListener arg6) throws java.io.IOException;
  public void cancelExport(java.lang.String arg1);
  public void addMediaItem(MediaItem arg1);
  public void insertMediaItem(MediaItem arg1, java.lang.String arg2);
  public void moveMediaItem(java.lang.String arg1, java.lang.String arg2);
  public MediaItem removeMediaItem(java.lang.String arg1);
  public void removeAllMediaItems();
  public java.util.List<MediaItem> getAllMediaItems();
  public void addTransition(Transition arg1);
  public Transition removeTransition(java.lang.String arg1);
  public java.util.List<Transition> getAllTransitions();
  public Transition getTransition(java.lang.String arg1);
  public void addAudioTrack(AudioTrack arg1);
  public void insertAudioTrack(AudioTrack arg1, java.lang.String arg2);
  public void moveAudioTrack(java.lang.String arg1, java.lang.String arg2);
  public AudioTrack removeAudioTrack(java.lang.String arg1);
  public java.util.List<AudioTrack> getAllAudioTracks();
  public AudioTrack getAudioTrack(java.lang.String arg1);
  public void setAspectRatio(int arg1);
  public long renderPreviewFrame(android.view.SurfaceHolder arg1, long arg2, VideoEditor.OverlayData arg3);
  public void clearSurface(android.view.SurfaceHolder arg1);
}
