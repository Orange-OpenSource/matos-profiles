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
public class Metadata
{
  // Fields

  public static final int ANY = 0;

  public static final int PAUSE_AVAILABLE = 1;

  public static final int SEEK_BACKWARD_AVAILABLE = 2;

  public static final int SEEK_FORWARD_AVAILABLE = 3;

  public static final int SEEK_AVAILABLE = 4;

  public static final int TITLE = 5;

  public static final int COMMENT = 6;

  public static final int COPYRIGHT = 7;

  public static final int ALBUM = 8;

  public static final int ARTIST = 9;

  public static final int AUTHOR = 10;

  public static final int COMPOSER = 11;

  public static final int GENRE = 12;

  public static final int DATE = 13;

  public static final int DURATION = 14;

  public static final int CD_TRACK_NUM = 15;

  public static final int CD_TRACK_MAX = 16;

  public static final int RATING = 17;

  public static final int ALBUM_ART = 18;

  public static final int VIDEO_FRAME = 19;

  public static final int BIT_RATE = 20;

  public static final int AUDIO_BIT_RATE = 21;

  public static final int VIDEO_BIT_RATE = 22;

  public static final int AUDIO_SAMPLE_RATE = 23;

  public static final int VIDEO_FRAME_RATE = 24;

  public static final int MIME_TYPE = 25;

  public static final int AUDIO_CODEC = 26;

  public static final int VIDEO_CODEC = 27;

  public static final int VIDEO_HEIGHT = 28;

  public static final int VIDEO_WIDTH = 29;

  public static final int NUM_TRACKS = 30;

  public static final int DRM_CRIPPLED = 31;

  public static final java.util.Set<java.lang.Integer> MATCH_NONE = null;

  public static final java.util.Set<java.lang.Integer> MATCH_ALL = null;

  public static final int STRING_VAL = 1;

  public static final int INTEGER_VAL = 2;

  public static final int BOOLEAN_VAL = 3;

  public static final int LONG_VAL = 4;

  public static final int DOUBLE_VAL = 5;

  public static final int DATE_VAL = 6;

  public static final int BYTE_ARRAY_VAL = 7;

  // Constructors

  public Metadata(){
  }
  // Methods

  public boolean getBoolean(int arg1){
    return false;
  }
  public int getInt(int arg1){
    return 0;
  }
  public long getLong(int arg1){
    return 0l;
  }
  public double getDouble(int arg1){
    return 0.0d;
  }
  public java.util.Set<java.lang.Integer> keySet(){
    return (java.util.Set) null;
  }
  public boolean parse(android.os.Parcel arg1){
    return false;
  }
  public java.lang.String getString(int arg1){
    return (java.lang.String) null;
  }
  public java.util.Date getDate(int arg1){
    return (java.util.Date) null;
  }
  public boolean has(int arg1){
    return false;
  }
  public static int lastType(){
    return 0;
  }
  public byte [] getByteArray(int arg1){
    return (byte []) null;
  }
  public static int lastSytemId(){
    return 0;
  }
  public static int firstCustomId(){
    return 0;
  }
}
