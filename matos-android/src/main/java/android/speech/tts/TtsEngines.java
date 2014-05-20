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


public class TtsEngines
{
  // Constructors

  public TtsEngines(android.content.Context arg1){
  }
  // Methods

  public java.lang.String getDefaultEngine(){
    return (java.lang.String) null;
  }
  public java.lang.String getHighestRankedEngineName(){
    return (java.lang.String) null;
  }
  public TextToSpeech.EngineInfo getEngineInfo(java.lang.String arg1){
    return (TextToSpeech.EngineInfo) null;
  }
  public java.util.List<TextToSpeech.EngineInfo> getEngines(){
    return (java.util.List) null;
  }
  public boolean isEngineInstalled(java.lang.String arg1){
    return false;
  }
  public android.content.Intent getSettingsIntent(java.lang.String arg1){
    return (android.content.Intent) null;
  }
  public java.lang.String getLocalePrefForEngine(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String [] parseLocalePref(java.lang.String arg1){
    return (java.lang.String []) null;
  }
  public synchronized void updateLocalePrefForEngine(java.lang.String arg1, java.lang.String arg2){
  }
}
