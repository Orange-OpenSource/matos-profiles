package android.speech.srec;

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
public final class Recognizer
{
  // Classes

  public class Grammar
  {
    // Fields

    // Constructors

    public Grammar(java.lang.String arg1) throws java.io.IOException{
    }
    // Methods

    protected void finalize(){
    }
    public void compile(){
    }
    public void destroy(){
    }
    public void save(java.lang.String arg1) throws java.io.IOException{
    }
    public void resetAllSlots(){
    }
    public void addWordToSlot(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4, java.lang.String arg5){
    }
    public void setupRecognizer(){
    }
  }
  // Fields

  public static final java.lang.String KEY_CONFIDENCE = "conf";

  public static final java.lang.String KEY_LITERAL = "literal";

  public static final java.lang.String KEY_MEANING = "meaning";

  public static final int EVENT_INVALID = 0;

  public static final int EVENT_NO_MATCH = 1;

  public static final int EVENT_INCOMPLETE = 2;

  public static final int EVENT_STARTED = 3;

  public static final int EVENT_STOPPED = 4;

  public static final int EVENT_START_OF_VOICING = 5;

  public static final int EVENT_END_OF_VOICING = 6;

  public static final int EVENT_SPOKE_TOO_SOON = 7;

  public static final int EVENT_RECOGNITION_RESULT = 8;

  public static final int EVENT_START_OF_UTTERANCE_TIMEOUT = 9;

  public static final int EVENT_RECOGNITION_TIMEOUT = 10;

  public static final int EVENT_NEED_MORE_AUDIO = 11;

  public static final int EVENT_MAX_SPEECH = 12;

  // Constructors

  public Recognizer(java.lang.String arg1) throws java.io.IOException{
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void start(){
  }
  public void destroy(){
  }
  public void stop(){
  }
  public java.lang.String getResult(int arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public int advance(){
    return 0;
  }
  public static java.lang.String getConfigDir(java.util.Locale arg1){
    return (java.lang.String) null;
  }
  public int putAudio(byte [] arg1, int arg2, int arg3, boolean arg4){
    return 0;
  }
  public void putAudio(java.io.InputStream arg1) throws java.io.IOException{
  }
  public int getResultCount(){
    return 0;
  }
  public java.lang.String [] getResultKeys(int arg1){
    return (java.lang.String []) null;
  }
  public void resetAcousticState(){
  }
  public void setAcousticState(java.lang.String arg1){
  }
  public java.lang.String getAcousticState(){
    return (java.lang.String) null;
  }
  public static java.lang.String eventToString(int arg1){
    return (java.lang.String) null;
  }
}
