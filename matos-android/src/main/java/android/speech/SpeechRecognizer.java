package android.speech;

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


public class SpeechRecognizer
{
  // Fields

  public static final java.lang.String RESULTS_RECOGNITION = "results_recognition";

  public static final java.lang.String CONFIDENCE_SCORES = "confidence_scores";

  public static final int ERROR_NETWORK_TIMEOUT = 1;

  public static final int ERROR_NETWORK = 2;

  public static final int ERROR_AUDIO = 3;

  public static final int ERROR_SERVER = 4;

  public static final int ERROR_CLIENT = 5;

  public static final int ERROR_SPEECH_TIMEOUT = 6;

  public static final int ERROR_NO_MATCH = 7;

  public static final int ERROR_RECOGNIZER_BUSY = 8;

  public static final int ERROR_INSUFFICIENT_PERMISSIONS = 9;

  // Constructors

  private SpeechRecognizer(android.content.Context arg1, android.content.ComponentName arg2){
  }
  // Methods

  public void destroy(){
  }
  public void cancel(){
  }
  public void startListening(android.content.Intent arg1){
  }
  public void stopListening(){
  }
  public static boolean isRecognitionAvailable(android.content.Context arg1){
    return false;
  }
  public static SpeechRecognizer createSpeechRecognizer(android.content.Context arg1){
    return (SpeechRecognizer) null;
  }
  public static SpeechRecognizer createSpeechRecognizer(android.content.Context arg1, android.content.ComponentName arg2){
    return (SpeechRecognizer) null;
  }
  public void setRecognitionListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("RecognitionListener") RecognitionListener arg1){
  }
}
