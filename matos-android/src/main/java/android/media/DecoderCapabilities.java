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


public class DecoderCapabilities
{
  // Classes

  public static enum VideoDecoder
  {
    // Enum Constants

    VIDEO_DECODER_WMV()
;
    // Fields

    // Constructors

    private VideoDecoder(){
    }
    // Methods

  }
  public static enum AudioDecoder
  {
    // Enum Constants

    AUDIO_DECODER_WMA()
;
    // Fields

    // Constructors

    private AudioDecoder(){
    }
    // Methods

  }
  // Constructors

  private DecoderCapabilities(){
  }
  // Methods

  public static java.util.List<DecoderCapabilities.VideoDecoder> getVideoDecoders(){
    return (java.util.List) null;
  }
  public static java.util.List<DecoderCapabilities.AudioDecoder> getAudioDecoders(){
    return (java.util.List) null;
  }
}
