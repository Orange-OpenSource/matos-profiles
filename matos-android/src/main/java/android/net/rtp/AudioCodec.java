package android.net.rtp;

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


public class AudioCodec
{
  // Fields

  public final int type = 0;

  public final java.lang.String rtpmap = (java.lang.String) null;

  public final java.lang.String fmtp = (java.lang.String) null;

  public static final AudioCodec PCMU = null;

  public static final AudioCodec PCMA = null;

  public static final AudioCodec GSM = null;

  public static final AudioCodec GSM_EFR = null;

  public static final AudioCodec AMR = null;

  // Constructors

  private AudioCodec(int arg1, java.lang.String arg2, java.lang.String arg3){
  }
  // Methods

  public static AudioCodec getCodec(int arg1, java.lang.String arg2, java.lang.String arg3){
    return (AudioCodec) null;
  }
  public static AudioCodec [] getCodecs(){
    return (AudioCodec []) null;
  }
}
