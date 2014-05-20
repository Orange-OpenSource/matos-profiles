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


public class EncoderCapabilities
{
  // Classes

  public static class VideoEncoderCap
  {
    // Fields

    public final int mCodec = 0;

    public final int mMinBitRate = 0;

    public final int mMaxBitRate = 0;

    public final int mMinFrameRate = 0;

    public final int mMaxFrameRate = 0;

    public final int mMinFrameWidth = 0;

    public final int mMaxFrameWidth = 0;

    public final int mMinFrameHeight = 0;

    public final int mMaxFrameHeight = 0;

    // Constructors

    private VideoEncoderCap(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9){
    }
  }
  public static class AudioEncoderCap
  {
    // Fields

    public final int mCodec = 0;

    public final int mMinChannels = 0;

    public final int mMaxChannels = 0;

    public final int mMinSampleRate = 0;

    public final int mMaxSampleRate = 0;

    public final int mMinBitRate = 0;

    public final int mMaxBitRate = 0;

    // Constructors

    private AudioEncoderCap(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7){
    }
  }
  // Constructors

  private EncoderCapabilities(){
  }
  // Methods

  public static int [] getOutputFileFormats(){
    return (int []) null;
  }
  public static java.util.List<EncoderCapabilities.VideoEncoderCap> getVideoEncoders(){
    return (java.util.List) null;
  }
  public static java.util.List<EncoderCapabilities.AudioEncoderCap> getAudioEncoders(){
    return (java.util.List) null;
  }
}
