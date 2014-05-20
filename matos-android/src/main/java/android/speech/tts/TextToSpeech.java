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


public class TextToSpeech
{
  // Classes

  public static interface OnInitListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onInit")
    public void onInit(int arg1);
  }
  public static interface OnUtteranceCompletedListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onUtteranceCompleted")
    public void onUtteranceCompleted(java.lang.String arg1);
  }
  public class Engine
  {
    // Fields

    public static final int DEFAULT_RATE = 100;

    public static final int DEFAULT_PITCH = 100;

    public static final float DEFAULT_VOLUME = 1.0f;

    public static final float DEFAULT_PAN = 0.0f;

    public static final int USE_DEFAULTS = 0;

    @java.lang.Deprecated
    public static final java.lang.String DEFAULT_ENGINE = "com.svox.pico";

    public static final int DEFAULT_STREAM = 3;

    public static final int CHECK_VOICE_DATA_PASS = 1;

    public static final int CHECK_VOICE_DATA_FAIL = 0;

    public static final int CHECK_VOICE_DATA_BAD_DATA = -1;

    public static final int CHECK_VOICE_DATA_MISSING_DATA = -2;

    public static final int CHECK_VOICE_DATA_MISSING_VOLUME = -3;

    public static final java.lang.String INTENT_ACTION_TTS_SERVICE = "android.intent.action.TTS_SERVICE";

    public static final java.lang.String SERVICE_META_DATA = "android.speech.tts";

    public static final java.lang.String ACTION_INSTALL_TTS_DATA = "android.speech.tts.engine.INSTALL_TTS_DATA";

    public static final java.lang.String ACTION_TTS_DATA_INSTALLED = "android.speech.tts.engine.TTS_DATA_INSTALLED";

    public static final java.lang.String ACTION_CHECK_TTS_DATA = "android.speech.tts.engine.CHECK_TTS_DATA";

    public static final java.lang.String ACTION_GET_SAMPLE_TEXT = "android.speech.tts.engine.GET_SAMPLE_TEXT";

    public static final java.lang.String EXTRA_VOICE_DATA_ROOT_DIRECTORY = "dataRoot";

    public static final java.lang.String EXTRA_VOICE_DATA_FILES = "dataFiles";

    public static final java.lang.String EXTRA_VOICE_DATA_FILES_INFO = "dataFilesInfo";

    public static final java.lang.String EXTRA_AVAILABLE_VOICES = "availableVoices";

    public static final java.lang.String EXTRA_UNAVAILABLE_VOICES = "unavailableVoices";

    public static final java.lang.String EXTRA_CHECK_VOICE_DATA_FOR = "checkVoiceDataFor";

    public static final java.lang.String EXTRA_TTS_DATA_INSTALLED = "dataInstalled";

    public static final java.lang.String KEY_PARAM_RATE = "rate";

    public static final java.lang.String KEY_PARAM_LANGUAGE = "language";

    public static final java.lang.String KEY_PARAM_COUNTRY = "country";

    public static final java.lang.String KEY_PARAM_VARIANT = "variant";

    public static final java.lang.String KEY_PARAM_ENGINE = "engine";

    public static final java.lang.String KEY_PARAM_PITCH = "pitch";

    public static final java.lang.String KEY_PARAM_STREAM = "streamType";

    public static final java.lang.String KEY_PARAM_UTTERANCE_ID = "utteranceId";

    public static final java.lang.String KEY_PARAM_VOLUME = "volume";

    public static final java.lang.String KEY_PARAM_PAN = "pan";

    // Constructors

    public Engine(){
    }
  }
  public static class EngineInfo
  {
    // Fields

    public java.lang.String name;

    public java.lang.String label;

    public int icon;

    public boolean system;

    public int priority;

    // Constructors

    public EngineInfo(){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final int SUCCESS = 0;

  public static final int ERROR = -1;

  public static final int QUEUE_FLUSH = 0;

  public static final int QUEUE_ADD = 1;

  public static final int LANG_COUNTRY_VAR_AVAILABLE = 2;

  public static final int LANG_COUNTRY_AVAILABLE = 1;

  public static final int LANG_AVAILABLE = 0;

  public static final int LANG_MISSING_DATA = -1;

  public static final int LANG_NOT_SUPPORTED = -2;

  public static final java.lang.String ACTION_TTS_QUEUE_PROCESSING_COMPLETED = "android.speech.tts.TTS_QUEUE_PROCESSING_COMPLETED";

  // Constructors

  public TextToSpeech(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.speech.tts.TextToSpeech.OnInitListener.onInit") TextToSpeech.OnInitListener arg2){
  }
  public TextToSpeech(android.content.Context arg1, TextToSpeech.OnInitListener arg2, java.lang.String arg3){
  }
  // Methods

  public void shutdown(){
  }
  public java.util.Locale getLanguage(){
    return (java.util.Locale) null;
  }
  public int stop(){
    return 0;
  }
  public int speak(java.lang.String arg1, int arg2, java.util.HashMap<java.lang.String, java.lang.String> arg3){
    return 0;
  }
  public int synthesizeToFile(java.lang.String arg1, java.util.HashMap<java.lang.String, java.lang.String> arg2, java.lang.String arg3){
    return 0;
  }
  public int playSilence(long arg1, int arg2, java.util.HashMap<java.lang.String, java.lang.String> arg3){
    return 0;
  }
  public boolean isSpeaking(){
    return false;
  }
  public int isLanguageAvailable(java.util.Locale arg1){
    return 0;
  }
  public java.lang.String getDefaultEngine(){
    return (java.lang.String) null;
  }
  public java.util.List<TextToSpeech.EngineInfo> getEngines(){
    return (java.util.List) null;
  }
  public int setLanguage(java.util.Locale arg1){
    return 0;
  }
  public int setSpeechRate(float arg1){
    return 0;
  }
  public int setPitch(float arg1){
    return 0;
  }
  public int playEarcon(java.lang.String arg1, int arg2, java.util.HashMap<java.lang.String, java.lang.String> arg3){
    return 0;
  }
  public int addSpeech(java.lang.String arg1, java.lang.String arg2, int arg3){
    return 0;
  }
  public int addSpeech(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public int addEarcon(java.lang.String arg1, java.lang.String arg2, int arg3){
    return 0;
  }
  public int addEarcon(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public java.lang.String getCurrentEngine(){
    return (java.lang.String) null;
  }
  public int setOnUtteranceCompletedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.speech.tts.TextToSpeech.OnUtteranceCompletedListener.onUtteranceCompleted") TextToSpeech.OnUtteranceCompletedListener arg1){
    return 0;
  }
  public int setEngineByPackageName(java.lang.String arg1){
    return 0;
  }
  public boolean areDefaultsEnforced(){
    return false;
  }
}
