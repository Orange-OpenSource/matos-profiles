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


public class CamcorderProfile
{
  // Fields

  public static final int QUALITY_LOW = 0;

  public static final int QUALITY_HIGH = 1;

  public static final int QUALITY_QCIF = 2;

  public static final int QUALITY_CIF = 3;

  public static final int QUALITY_480P = 4;

  public static final int QUALITY_720P = 5;

  public static final int QUALITY_1080P = 6;

  public static final int QUALITY_QVGA = 7;

  public static final int QUALITY_TIME_LAPSE_LOW = 1000;

  public static final int QUALITY_TIME_LAPSE_HIGH = 1001;

  public static final int QUALITY_TIME_LAPSE_QCIF = 1002;

  public static final int QUALITY_TIME_LAPSE_CIF = 1003;

  public static final int QUALITY_TIME_LAPSE_480P = 1004;

  public static final int QUALITY_TIME_LAPSE_720P = 1005;

  public static final int QUALITY_TIME_LAPSE_1080P = 1006;

  public static final int QUALITY_TIME_LAPSE_QVGA = 1007;

  public int duration;

  public int quality;

  public int fileFormat;

  public int videoCodec;

  public int videoBitRate;

  public int videoFrameRate;

  public int videoFrameWidth;

  public int videoFrameHeight;

  public int audioCodec;

  public int audioBitRate;

  public int audioSampleRate;

  public int audioChannels;

  // Constructors

  private CamcorderProfile(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12){
  }
  // Methods

  public static CamcorderProfile get(int arg1){
    return (CamcorderProfile) null;
  }
  public static CamcorderProfile get(int arg1, int arg2){
    return (CamcorderProfile) null;
  }
  public static boolean hasProfile(int arg1){
    return false;
  }
  public static boolean hasProfile(int arg1, int arg2){
    return false;
  }
}
