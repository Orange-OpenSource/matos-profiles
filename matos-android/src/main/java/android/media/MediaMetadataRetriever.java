package android.media;

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
public class MediaMetadataRetriever
{
  // Fields

  public static final int OPTION_PREVIOUS_SYNC = 0;

  public static final int OPTION_NEXT_SYNC = 1;

  public static final int OPTION_CLOSEST_SYNC = 2;

  public static final int OPTION_CLOSEST = 3;

  public static final int METADATA_KEY_CD_TRACK_NUMBER = 0;

  public static final int METADATA_KEY_ALBUM = 1;

  public static final int METADATA_KEY_ARTIST = 2;

  public static final int METADATA_KEY_AUTHOR = 3;

  public static final int METADATA_KEY_COMPOSER = 4;

  public static final int METADATA_KEY_DATE = 5;

  public static final int METADATA_KEY_GENRE = 6;

  public static final int METADATA_KEY_TITLE = 7;

  public static final int METADATA_KEY_YEAR = 8;

  public static final int METADATA_KEY_DURATION = 9;

  public static final int METADATA_KEY_NUM_TRACKS = 10;

  public static final int METADATA_KEY_WRITER = 11;

  public static final int METADATA_KEY_MIMETYPE = 12;

  public static final int METADATA_KEY_ALBUMARTIST = 13;

  public static final int METADATA_KEY_DISC_NUMBER = 14;

  public static final int METADATA_KEY_COMPILATION = 15;

  public static final int METADATA_KEY_HAS_AUDIO = 16;

  public static final int METADATA_KEY_HAS_VIDEO = 17;

  public static final int METADATA_KEY_VIDEO_WIDTH = 18;

  public static final int METADATA_KEY_VIDEO_HEIGHT = 19;

  public static final int METADATA_KEY_BITRATE = 20;

  public static final int METADATA_KEY_TIMED_TEXT_LANGUAGES = 21;

  public static final int METADATA_KEY_IS_DRM = 22;

  // Constructors

  public MediaMetadataRetriever(){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void release(){
  }
  public void setDataSource(java.lang.String arg1) throws java.lang.IllegalArgumentException{
  }
  public void setDataSource(java.lang.String arg1, java.util.Map<java.lang.String, java.lang.String> arg2) throws java.lang.IllegalArgumentException{
  }
  public void setDataSource(java.io.FileDescriptor arg1, long arg2, long arg3) throws java.lang.IllegalArgumentException{
  }
  public void setDataSource(java.io.FileDescriptor arg1) throws java.lang.IllegalArgumentException{
  }
  public void setDataSource(android.content.Context arg1, android.net.Uri arg2) throws java.lang.IllegalArgumentException, java.lang.SecurityException{
  }
  public android.graphics.Bitmap getFrameAtTime(long arg1, int arg2){
    return (android.graphics.Bitmap) null;
  }
  public android.graphics.Bitmap getFrameAtTime(long arg1){
    return (android.graphics.Bitmap) null;
  }
  public android.graphics.Bitmap getFrameAtTime(){
    return (android.graphics.Bitmap) null;
  }
  public java.lang.String extractMetadata(int arg1){
    return (java.lang.String) null;
  }
  public byte [] getEmbeddedPicture(){
    return (byte []) null;
  }
}
