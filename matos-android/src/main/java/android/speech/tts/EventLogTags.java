package android.speech.tts;

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


public class EventLogTags
{
  // Fields

  public static final int TTS_SPEAK_SUCCESS = 76001;

  public static final int TTS_SPEAK_FAILURE = 76002;

  // Constructors

  private EventLogTags(){
  }
  // Methods

  public static void writeTtsSpeakSuccess(java.lang.String arg1, java.lang.String arg2, int arg3, java.lang.String arg4, int arg5, int arg6, long arg7, long arg8, long arg9){
  }
  public static void writeTtsSpeakFailure(java.lang.String arg1, java.lang.String arg2, int arg3, java.lang.String arg4, int arg5, int arg6){
  }
}
