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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class TextToSpeechService
  extends android.app.Service{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public TextToSpeechService(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroy(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onStop();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onSynthesizeText(SynthesisRequest arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SynthesisCallback") SynthesisCallback arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract java.lang.String [] onGetLanguage();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract int onIsLanguageAvailable(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract int onLoadLanguage(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3);
}
