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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class RecognizerIntent
{
  // Fields

  public static final java.lang.String EXTRA_CALLING_PACKAGE = "calling_package";

  public static final java.lang.String ACTION_RECOGNIZE_SPEECH = "android.speech.action.RECOGNIZE_SPEECH";

  public static final java.lang.String ACTION_WEB_SEARCH = "android.speech.action.WEB_SEARCH";

  public static final java.lang.String EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS = "android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS";

  public static final java.lang.String EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS = "android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS";

  public static final java.lang.String EXTRA_SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS = "android.speech.extras.SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS";

  public static final java.lang.String EXTRA_LANGUAGE_MODEL = "android.speech.extra.LANGUAGE_MODEL";

  public static final java.lang.String LANGUAGE_MODEL_FREE_FORM = "free_form";

  public static final java.lang.String LANGUAGE_MODEL_WEB_SEARCH = "web_search";

  public static final java.lang.String EXTRA_PROMPT = "android.speech.extra.PROMPT";

  public static final java.lang.String EXTRA_LANGUAGE = "android.speech.extra.LANGUAGE";

  public static final java.lang.String EXTRA_ORIGIN = "android.speech.extra.ORIGIN";

  public static final java.lang.String EXTRA_MAX_RESULTS = "android.speech.extra.MAX_RESULTS";

  public static final java.lang.String EXTRA_WEB_SEARCH_ONLY = "android.speech.extra.WEB_SEARCH_ONLY";

  public static final java.lang.String EXTRA_PARTIAL_RESULTS = "android.speech.extra.PARTIAL_RESULTS";

  public static final java.lang.String EXTRA_RESULTS_PENDINGINTENT = "android.speech.extra.RESULTS_PENDINGINTENT";

  public static final java.lang.String EXTRA_RESULTS_PENDINGINTENT_BUNDLE = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE";

  public static final int RESULT_NO_MATCH = 1;

  public static final int RESULT_CLIENT_ERROR = 2;

  public static final int RESULT_SERVER_ERROR = 3;

  public static final int RESULT_NETWORK_ERROR = 4;

  public static final int RESULT_AUDIO_ERROR = 5;

  public static final java.lang.String EXTRA_RESULTS = "android.speech.extra.RESULTS";

  public static final java.lang.String EXTRA_CONFIDENCE_SCORES = "android.speech.extra.CONFIDENCE_SCORES";

  public static final java.lang.String DETAILS_META_DATA = "android.speech.DETAILS";

  public static final java.lang.String ACTION_GET_LANGUAGE_DETAILS = "android.speech.action.GET_LANGUAGE_DETAILS";

  public static final java.lang.String EXTRA_ONLY_RETURN_LANGUAGE_PREFERENCE = "android.speech.extra.ONLY_RETURN_LANGUAGE_PREFERENCE";

  public static final java.lang.String EXTRA_LANGUAGE_PREFERENCE = "android.speech.extra.LANGUAGE_PREFERENCE";

  public static final java.lang.String EXTRA_SUPPORTED_LANGUAGES = "android.speech.extra.SUPPORTED_LANGUAGES";

  // Constructors

  private RecognizerIntent(){
  }
  // Methods

  public static final android.content.Intent getVoiceDetailsIntent(android.content.Context arg1){
    return (android.content.Intent) null;
  }
}
