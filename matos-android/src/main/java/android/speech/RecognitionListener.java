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


public interface RecognitionListener
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionListener")
  public void onReadyForSpeech(android.os.Bundle arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionListener")
  public void onBeginningOfSpeech();
  @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionListener")
  public void onRmsChanged(float arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionListener")
  public void onBufferReceived(byte [] arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionListener")
  public void onEndOfSpeech();
  @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionListener")
  public void onError(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionListener")
  public void onResults(android.os.Bundle arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionListener")
  public void onPartialResults(android.os.Bundle arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionListener")
  public void onEvent(int arg1, android.os.Bundle arg2);
}
