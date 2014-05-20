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
public class MediaFile
{
  // Classes

  public static class MediaFileType
  {
    // Fields

    public final int fileType = 0;

    public final java.lang.String mimeType = (java.lang.String) null;

    // Constructors

    MediaFileType(int arg1, java.lang.String arg2){
    }
  }
  // Fields

  public static final int FILE_TYPE_MP3 = 1;

  public static final int FILE_TYPE_M4A = 2;

  public static final int FILE_TYPE_WAV = 3;

  public static final int FILE_TYPE_AMR = 4;

  public static final int FILE_TYPE_AWB = 5;

  public static final int FILE_TYPE_WMA = 6;

  public static final int FILE_TYPE_OGG = 7;

  public static final int FILE_TYPE_AAC = 8;

  public static final int FILE_TYPE_MKA = 9;

  public static final int FILE_TYPE_FLAC = 10;

  public static final int FILE_TYPE_MID = 11;

  public static final int FILE_TYPE_SMF = 12;

  public static final int FILE_TYPE_IMY = 13;

  public static final int FILE_TYPE_MP4 = 21;

  public static final int FILE_TYPE_M4V = 22;

  public static final int FILE_TYPE_3GPP = 23;

  public static final int FILE_TYPE_3GPP2 = 24;

  public static final int FILE_TYPE_WMV = 25;

  public static final int FILE_TYPE_ASF = 26;

  public static final int FILE_TYPE_MKV = 27;

  public static final int FILE_TYPE_MP2TS = 28;

  public static final int FILE_TYPE_AVI = 29;

  public static final int FILE_TYPE_WEBM = 30;

  public static final int FILE_TYPE_JPEG = 31;

  public static final int FILE_TYPE_GIF = 32;

  public static final int FILE_TYPE_PNG = 33;

  public static final int FILE_TYPE_BMP = 34;

  public static final int FILE_TYPE_WBMP = 35;

  public static final int FILE_TYPE_WEBP = 36;

  public static final int FILE_TYPE_M3U = 41;

  public static final int FILE_TYPE_PLS = 42;

  public static final int FILE_TYPE_WPL = 43;

  public static final int FILE_TYPE_HTTPLIVE = 44;

  public static final int FILE_TYPE_FL = 51;

  public static final int FILE_TYPE_TEXT = 100;

  public static final int FILE_TYPE_HTML = 101;

  public static final int FILE_TYPE_PDF = 102;

  public static final int FILE_TYPE_XML = 103;

  public static final int FILE_TYPE_MS_WORD = 104;

  public static final int FILE_TYPE_MS_EXCEL = 105;

  public static final int FILE_TYPE_MS_POWERPOINT = 106;

  public static final int FILE_TYPE_ZIP = 107;

  // Constructors

  public MediaFile(){
  }
  // Methods

  public static MediaFile.MediaFileType getFileType(java.lang.String arg1){
    return (MediaFile.MediaFileType) null;
  }
  public static int getFileTypeForMimeType(java.lang.String arg1){
    return 0;
  }
  public static boolean isAudioFileType(int arg1){
    return false;
  }
  public static boolean isVideoFileType(int arg1){
    return false;
  }
  public static boolean isPlayListFileType(int arg1){
    return false;
  }
  public static boolean isImageFileType(int arg1){
    return false;
  }
  public static boolean isDrmFileType(int arg1){
    return false;
  }
  public static java.lang.String getFileTitle(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static int getFormatCode(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public static boolean isMimeTypeMedia(java.lang.String arg1){
    return false;
  }
  public static java.lang.String getMimeTypeForFile(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String getMimeTypeForFormatCode(int arg1){
    return (java.lang.String) null;
  }
}
