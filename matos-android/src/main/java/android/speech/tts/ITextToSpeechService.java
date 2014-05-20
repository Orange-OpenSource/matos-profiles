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


public interface ITextToSpeechService
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ITtsImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements ITextToSpeechService
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static ITextToSpeechService asInterface(android.os.IBinder arg1){
      return (ITextToSpeechService) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public java.lang.String [] getLanguage() throws android.os.RemoteException;
  public int stop(java.lang.String arg1) throws android.os.RemoteException;
  public void setCallback(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ITtsCallback") ITextToSpeechCallback arg2) throws android.os.RemoteException;
  public int speak(java.lang.String arg1, java.lang.String arg2, int arg3, android.os.Bundle arg4) throws android.os.RemoteException;
  public int synthesizeToFile(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Bundle arg4) throws android.os.RemoteException;
  public int playAudio(java.lang.String arg1, android.net.Uri arg2, int arg3, android.os.Bundle arg4) throws android.os.RemoteException;
  public int playSilence(java.lang.String arg1, long arg2, int arg3, android.os.Bundle arg4) throws android.os.RemoteException;
  public boolean isSpeaking() throws android.os.RemoteException;
  public int isLanguageAvailable(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws android.os.RemoteException;
  public int loadLanguage(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws android.os.RemoteException;
}
